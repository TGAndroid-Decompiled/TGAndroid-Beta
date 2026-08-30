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
    public final h f10309a;
    public final String f10310b;
    public final InputStream f10311c;
    public final long d;
    public final f e = new f(this, 0);
    public final HashMap f10312f = new HashMap();
    public int h;
    public boolean f10313n;
    public boolean f10314r;
    public boolean f10315s;

    public i(h hVar, String str, InputStream inputStream, long j10) {
        boolean z4;
        this.f10309a = hVar;
        this.f10310b = str;
        this.f10311c = inputStream;
        this.d = j10;
        if (j10 < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f10313n = z4;
        this.f10315s = true;
    }

    public static void c(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String a(String str) {
        return (String) this.f10312f.get(str.toLowerCase());
    }

    public final boolean b() {
        return "close".equals(a("connection"));
    }

    @Override
    public final void close() {
        InputStream inputStream = this.f10311c;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void d(OutputStream outputStream) {
        long j10;
        String str;
        String str2 = this.f10310b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        h hVar = this.f10309a;
        try {
            if (hVar != null) {
                String str3 = new b(str2).f10287c;
                if (str3 == null) {
                    str3 = "US-ASCII";
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str3)), false);
                PrintWriter append = printWriter.append((CharSequence) "HTTP/1.1 ");
                append.append((CharSequence) ("" + hVar.f10307a + " " + hVar.f10308b)).append((CharSequence) " \r\n");
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
                    if (this.f10315s) {
                        str = "keep-alive";
                    } else {
                        str = "close";
                    }
                    c(printWriter, "Connection", str);
                }
                if (a("content-length") != null) {
                    this.f10314r = false;
                }
                if (this.f10314r) {
                    c(printWriter, "Content-Encoding", "gzip");
                    this.f10313n = true;
                }
                InputStream inputStream = this.f10311c;
                if (inputStream != null) {
                    j10 = this.d;
                } else {
                    j10 = 0;
                }
                if (this.h != 5 && this.f10313n) {
                    c(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.f10314r) {
                    j10 = f(printWriter, j10);
                }
                printWriter.append((CharSequence) "\r\n");
                printWriter.flush();
                if (this.h != 5 && this.f10313n) {
                    ?? filterOutputStream = new FilterOutputStream(outputStream);
                    if (this.f10314r) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(filterOutputStream);
                        e(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        e(filterOutputStream, -1L);
                    }
                    filterOutputStream.a();
                } else if (this.f10314r) {
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
        } catch (IOException e) {
            l.d.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
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
                int read = this.f10311c.read(bArr, 0, (int) min);
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
        this.f10314r = z4;
    }

    public final void h(boolean z4) {
        this.f10315s = z4;
    }

    public final void i(int i10) {
        this.h = i10;
    }
}
