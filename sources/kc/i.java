package kc;

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
public final class i implements Closeable {
    public final h f11077a;
    public final String f11078b;
    public final InputStream f11079c;
    public final long d;
    public final f f11080e = new f(this, 0);
    public final HashMap f11081f = new HashMap();
    public int h;
    public boolean f11082n;
    public boolean f11083r;
    public boolean f11084s;

    public i(h hVar, String str, InputStream inputStream, long j10) {
        boolean z4;
        this.f11077a = hVar;
        this.f11078b = str;
        this.f11079c = inputStream;
        this.d = j10;
        if (j10 < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f11082n = z4;
        this.f11084s = true;
    }

    public static void c(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String a(String str) {
        return (String) this.f11081f.get(str.toLowerCase());
    }

    public final boolean b() {
        return "close".equals(a("connection"));
    }

    @Override
    public final void close() {
        InputStream inputStream = this.f11079c;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void d(OutputStream outputStream) {
        long j10;
        String str;
        String str2 = this.f11078b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        h hVar = this.f11077a;
        try {
            if (hVar != null) {
                String str3 = new b(str2).f11053c;
                if (str3 == null) {
                    str3 = "US-ASCII";
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str3)), false);
                PrintWriter append = printWriter.append((CharSequence) "HTTP/1.1 ");
                append.append((CharSequence) ("" + hVar.f11075a + " " + hVar.f11076b)).append((CharSequence) " \r\n");
                if (str2 != null) {
                    c(printWriter, "Content-Type", str2);
                }
                if (a("date") == null) {
                    c(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry entry : this.f11080e.entrySet()) {
                    c(printWriter, (String) entry.getKey(), (String) entry.getValue());
                }
                if (a("connection") == null) {
                    if (this.f11084s) {
                        str = "keep-alive";
                    } else {
                        str = "close";
                    }
                    c(printWriter, "Connection", str);
                }
                if (a("content-length") != null) {
                    this.f11083r = false;
                }
                if (this.f11083r) {
                    c(printWriter, "Content-Encoding", "gzip");
                    this.f11082n = true;
                }
                InputStream inputStream = this.f11079c;
                if (inputStream != null) {
                    j10 = this.d;
                } else {
                    j10 = 0;
                }
                if (this.h != 5 && this.f11082n) {
                    c(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.f11083r) {
                    j10 = f(printWriter, j10);
                }
                printWriter.append((CharSequence) "\r\n");
                printWriter.flush();
                if (this.h != 5 && this.f11082n) {
                    ?? filterOutputStream = new FilterOutputStream(outputStream);
                    if (this.f11083r) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(filterOutputStream);
                        e(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        e(filterOutputStream, -1L);
                    }
                    filterOutputStream.a();
                } else if (this.f11083r) {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                    e(gZIPOutputStream2, -1L);
                    gZIPOutputStream2.finish();
                } else {
                    e(outputStream, j10);
                }
                outputStream.flush();
                l.d(inputStream);
                return;
            }
            throw new Error("sendResponse(): Status can't be null.");
        } catch (IOException e6) {
            l.d.log(Level.SEVERE, "Could not send response to the client", (Throwable) e6);
        }
    }

    public final void e(OutputStream outputStream, long j10) {
        boolean z4;
        long min;
        byte[] bArr = new byte[(int) 16384];
        if (j10 == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        while (true) {
            if (j10 > 0 || z4) {
                if (z4) {
                    min = 16384;
                } else {
                    min = Math.min(j10, 16384L);
                }
                int read = this.f11079c.read(bArr, 0, (int) min);
                if (read <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, read);
                if (!z4) {
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
                l.d.severe("content-length was no number ".concat(a2));
            }
        }
        printWriter.print("Content-Length: " + j10 + "\r\n");
        return j10;
    }

    public final void g(boolean z4) {
        this.f11083r = z4;
    }

    public final void h(boolean z4) {
        this.f11084s = z4;
    }

    public final void i(int i10) {
        this.h = i10;
    }
}
