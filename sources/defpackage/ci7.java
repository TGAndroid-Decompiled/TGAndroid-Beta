package defpackage;

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
public final class ci7 implements Closeable {
    public final int a;
    public final String b;
    public final InputStream c;
    public final long d;
    public final ny1 e = new ny1(this, (byte) 1);
    public final HashMap f = new HashMap();
    public int h;
    public boolean n;
    public boolean r;
    public boolean s;

    public ci7(int i, String str, InputStream inputStream, long j) {
        boolean z;
        this.a = i;
        this.b = str;
        this.c = inputStream;
        this.d = j;
        if (j < 0) {
            z = true;
        } else {
            z = false;
        }
        this.n = z;
        this.s = true;
    }

    public static void c(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String a(String str) {
        return (String) this.f.get(str.toLowerCase());
    }

    public final boolean b() {
        return "close".equals(a("connection"));
    }

    @Override
    public final void close() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void d(OutputStream outputStream) {
        int i;
        long j;
        String str;
        String str2 = this.b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        int i2 = this.a;
        try {
            if (i2 != 0) {
                String str3 = new yh7(str2).b;
                if (str3 == null) {
                    str3 = "US-ASCII";
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str3)), false);
                PrintWriter append = printWriter.append((CharSequence) "HTTP/1.1 ");
                StringBuilder sb = new StringBuilder("");
                switch (i2) {
                    case 1:
                        i = 101;
                        break;
                    case 2:
                        i = 200;
                        break;
                    case 3:
                        i = 201;
                        break;
                    case 4:
                        i = 202;
                        break;
                    case 5:
                        i = 204;
                        break;
                    case 6:
                        i = 206;
                        break;
                    case 7:
                        i = 207;
                        break;
                    case 8:
                        i = 301;
                        break;
                    case 9:
                        i = 302;
                        break;
                    case 10:
                        i = 303;
                        break;
                    case 11:
                        i = 304;
                        break;
                    case 12:
                        i = 307;
                        break;
                    case 13:
                        i = 400;
                        break;
                    case 14:
                        i = 401;
                        break;
                    case 15:
                        i = 403;
                        break;
                    case 16:
                        i = 404;
                        break;
                    case 17:
                        i = 405;
                        break;
                    case 18:
                        i = 406;
                        break;
                    case 19:
                        i = 408;
                        break;
                    case 20:
                        i = 409;
                        break;
                    case 21:
                        i = 410;
                        break;
                    case 22:
                        i = 411;
                        break;
                    case 23:
                        i = 412;
                        break;
                    case 24:
                        i = 413;
                        break;
                    case 25:
                        i = 415;
                        break;
                    case 26:
                        i = 416;
                        break;
                    case 27:
                        i = 417;
                        break;
                    case 28:
                        i = 429;
                        break;
                    case 29:
                        i = 500;
                        break;
                    case 30:
                        i = 501;
                        break;
                    case 31:
                        i = 503;
                        break;
                    case 32:
                        i = 505;
                        break;
                    default:
                        throw null;
                }
                sb.append(i);
                sb.append(" ");
                sb.append(ls6.b(i2));
                append.append((CharSequence) sb.toString()).append((CharSequence) " \r\n");
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
                    if (this.s) {
                        str = "keep-alive";
                    } else {
                        str = "close";
                    }
                    c(printWriter, "Connection", str);
                }
                if (a("content-length") != null) {
                    this.r = false;
                }
                if (this.r) {
                    c(printWriter, "Content-Encoding", "gzip");
                    this.n = true;
                }
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    j = this.d;
                } else {
                    j = 0;
                }
                if (this.h != 5 && this.n) {
                    c(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.r) {
                    j = f(printWriter, j);
                }
                printWriter.append((CharSequence) "\r\n");
                printWriter.flush();
                if (this.h != 5 && this.n) {
                    ?? filterOutputStream = new FilterOutputStream(outputStream);
                    if (this.r) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(filterOutputStream);
                        e(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        e(filterOutputStream, -1L);
                    }
                    filterOutputStream.a();
                } else if (this.r) {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                    e(gZIPOutputStream2, -1L);
                    gZIPOutputStream2.finish();
                } else {
                    e(outputStream, j);
                }
                outputStream.flush();
                ei7.c(inputStream);
                return;
            }
            throw new Error("sendResponse(): Status can't be null.");
        } catch (IOException e) {
            ei7.d.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        }
    }

    public final void e(OutputStream outputStream, long j) {
        boolean z;
        byte[] bArr = new byte[16384];
        if (j == -1) {
            z = true;
        } else {
            z = false;
        }
        while (true) {
            if (j > 0 || z) {
                long j2 = 16384;
                if (!z) {
                    j2 = Math.min(j, 16384L);
                }
                int read = this.c.read(bArr, 0, (int) j2);
                if (read <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, read);
                if (!z) {
                    j -= read;
                }
            } else {
                return;
            }
        }
    }

    public final long f(PrintWriter printWriter, long j) {
        String a = a("content-length");
        if (a != null) {
            try {
                j = Long.parseLong(a);
            } catch (NumberFormatException unused) {
                ei7.d.severe("content-length was no number ".concat(a));
            }
        }
        printWriter.print("Content-Length: " + j + "\r\n");
        return j;
    }
}
