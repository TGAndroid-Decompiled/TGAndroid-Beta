package ad;

import j$.util.DesugarTimeZone;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;
public final class j implements Closeable {
    public final i f526a;
    public final String f527b;
    public final InputStream f528c;
    public final long d;
    public final g e = new g(this, 0);
    public final HashMap f529f = new HashMap();
    public int h;
    public boolean f530n;
    public boolean f531r;
    public boolean f532s;

    public j(i iVar, String str, InputStream inputStream, long j10) {
        boolean z10;
        this.f526a = iVar;
        this.f527b = str;
        this.f528c = inputStream;
        this.d = j10;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f530n = z10;
        this.f532s = true;
    }

    public static void c(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String a(String str) {
        return (String) this.f529f.get(str.toLowerCase());
    }

    public final boolean b() {
        return "close".equals(a("connection"));
    }

    @Override
    public final void close() {
        InputStream inputStream = this.f528c;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void d(OutputStream outputStream) {
        long j10;
        String str;
        String str2 = this.f527b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        i iVar = this.f526a;
        try {
            if (iVar != null) {
                String str3 = new b(str2).f501c;
                if (str3 == null) {
                    str3 = "US-ASCII";
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str3)), false);
                PrintWriter append = printWriter.append((CharSequence) "HTTP/1.1 ");
                append.append((CharSequence) ("" + iVar.f524a + " " + iVar.f525b)).append((CharSequence) " \r\n");
                if (str2 != null) {
                    c(printWriter, "Content-Type", str2);
                }
                if (a("date") == null) {
                    c(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry entry : this.e.entrySet()) {
                    c(printWriter, (String) entry.getKey(), (String) entry.getValue());
                }
                if (a("connection") == null) {
                    if (this.f532s) {
                        str = "keep-alive";
                    } else {
                        str = "close";
                    }
                    c(printWriter, "Connection", str);
                }
                if (a("content-length") != null) {
                    this.f531r = false;
                }
                if (this.f531r) {
                    c(printWriter, "Content-Encoding", "gzip");
                    this.f530n = true;
                }
                InputStream inputStream = this.f528c;
                if (inputStream != null) {
                    j10 = this.d;
                } else {
                    j10 = 0;
                }
                if (this.h != 5 && this.f530n) {
                    c(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.f531r) {
                    j10 = f(printWriter, j10);
                }
                printWriter.append((CharSequence) "\r\n");
                printWriter.flush();
                if (this.h != 5 && this.f530n) {
                    ?? filterOutputStream = new FilterOutputStream(outputStream);
                    if (this.f531r) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(filterOutputStream);
                        e(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        e(filterOutputStream, -1L);
                    }
                    filterOutputStream.a();
                } else if (this.f531r) {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                    e(gZIPOutputStream2, -1L);
                    gZIPOutputStream2.finish();
                } else {
                    e(outputStream, j10);
                }
                outputStream.flush();
                m.d(inputStream);
                return;
            }
            throw new Error("sendResponse(): Status can't be null.");
        } catch (IOException e) {
            m.d.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        }
    }

    public final void e(OutputStream outputStream, long j10) {
        boolean z10;
        long min;
        byte[] bArr = new byte[(int) 16384];
        if (j10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        while (true) {
            if (j10 > 0 || z10) {
                if (z10) {
                    min = 16384;
                } else {
                    min = Math.min(j10, 16384L);
                }
                int read = this.f528c.read(bArr, 0, (int) min);
                if (read <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, read);
                if (!z10) {
                    j10 -= read;
                }
            } else {
                return;
            }
        }
    }

    public final long f(PrintWriter printWriter, long j10) {
        String a2 = a("content-length");
        if (a2 != null) {
            try {
                j10 = Long.parseLong(a2);
            } catch (NumberFormatException unused) {
                m.d.severe("content-length was no number ".concat(a2));
            }
        }
        printWriter.print("Content-Length: " + j10 + "\r\n");
        return j10;
    }

    public final void g(boolean z10) {
        this.f531r = z10;
    }

    public final void h(boolean z10) {
        this.f532s = z10;
    }

    public final void i(int i10) {
        this.h = i10;
    }
}
