package hc;

import j$.util.DesugarTimeZone;
import java.io.BufferedWriter;
import java.io.Closeable;
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

    public final h f8893a;

    public final String f8894b;

    public final InputStream f8895c;
    public final long d;

    public final f f8896e = new f(this, 0);

    public final HashMap f8897f = new HashMap();
    public int h;

    public boolean f8898n;

    public boolean f8899r;

    public boolean f8900s;

    public i(h hVar, String str, InputStream inputStream, long j10) {
        this.f8893a = hVar;
        this.f8894b = str;
        this.f8895c = inputStream;
        this.d = j10;
        this.f8898n = j10 < 0;
        this.f8900s = true;
    }

    public static void c(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String a(String str) {
        return (String) this.f8897f.get(str.toLowerCase());
    }

    public final boolean b() {
        return "close".equals(a("connection"));
    }

    @Override
    public final void close() throws IOException {
        InputStream inputStream = this.f8895c;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void d(OutputStream outputStream) {
        String str = this.f8894b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        h hVar = this.f8893a;
        try {
            if (hVar == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            String str2 = new b(str).f8869c;
            if (str2 == null) {
                str2 = "US-ASCII";
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str2)), false);
            printWriter.append("HTTP/1.1 ").append("" + hVar.f8891a + " " + hVar.f8892b).append(" \r\n");
            if (str != null) {
                c(printWriter, "Content-Type", str);
            }
            if (a("date") == null) {
                c(printWriter, "Date", simpleDateFormat.format(new Date()));
            }
            for (Map.Entry entry : this.f8896e.entrySet()) {
                c(printWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            if (a("connection") == null) {
                c(printWriter, "Connection", this.f8900s ? "keep-alive" : "close");
            }
            if (a("content-length") != null) {
                this.f8899r = false;
            }
            if (this.f8899r) {
                c(printWriter, "Content-Encoding", "gzip");
                this.f8898n = true;
            }
            InputStream inputStream = this.f8895c;
            long jF = inputStream != null ? this.d : 0L;
            if (this.h != 5 && this.f8898n) {
                c(printWriter, "Transfer-Encoding", "chunked");
            } else if (!this.f8899r) {
                jF = f(printWriter, jF);
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (this.h != 5 && this.f8898n) {
                g gVar = new g(outputStream);
                if (this.f8899r) {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(gVar);
                    e(gZIPOutputStream, -1L);
                    gZIPOutputStream.finish();
                } else {
                    e(gVar, -1L);
                }
                gVar.a();
            } else if (this.f8899r) {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                e(gZIPOutputStream2, -1L);
                gZIPOutputStream2.finish();
            } else {
                e(outputStream, jF);
            }
            outputStream.flush();
            l.d(inputStream);
        } catch (IOException e9) {
            l.d.log(Level.SEVERE, "Could not send response to the client", (Throwable) e9);
        }
    }

    public final void e(OutputStream outputStream, long j10) throws IOException {
        byte[] bArr = new byte[(int) 16384];
        boolean z10 = j10 == -1;
        while (true) {
            if (j10 <= 0 && !z10) {
                return;
            }
            int i10 = this.f8895c.read(bArr, 0, (int) (z10 ? 16384L : Math.min(j10, 16384L)));
            if (i10 <= 0) {
                return;
            }
            outputStream.write(bArr, 0, i10);
            if (!z10) {
                j10 -= (long) i10;
            }
        }
    }

    public final long f(PrintWriter printWriter, long j10) {
        String strA = a("content-length");
        if (strA != null) {
            try {
                j10 = Long.parseLong(strA);
            } catch (NumberFormatException unused) {
                l.d.severe("content-length was no number ".concat(strA));
            }
        }
        printWriter.print("Content-Length: " + j10 + "\r\n");
        return j10;
    }

    public final void g(boolean z10) {
        this.f8899r = z10;
    }

    public final void h(boolean z10) {
        this.f8900s = z10;
    }

    public final void i(int i10) {
        this.h = i10;
    }
}
