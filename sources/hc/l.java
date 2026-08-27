package hc;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public abstract class l {
    public static final Logger d;

    public volatile ServerSocket f8905a;

    public Thread f8906b;

    public f2.c f8907c;

    static {
        Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
        Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
        Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
        d = Logger.getLogger(l.class.getName());
    }

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e9) {
            d.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e9);
            return null;
        }
    }

    public static i c(h hVar, String str, String str2) {
        byte[] bytes;
        b bVar = new b(str);
        if (str2 == null) {
            return new i(hVar, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        String str3 = "US-ASCII";
        String str4 = bVar.f8869c;
        try {
            if (!Charset.forName(str4 == null ? "US-ASCII" : str4).newEncoder().canEncode(str2) && str4 == null) {
                bVar = new b(str + "; charset=UTF-8");
            }
            String str5 = bVar.f8869c;
            if (str5 != null) {
                str3 = str5;
            }
            bytes = str2.getBytes(str3);
        } catch (UnsupportedEncodingException e9) {
            d.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e9);
            bytes = new byte[0];
        }
        return new i(hVar, bVar.f8867a, new ByteArrayInputStream(bytes), bytes.length);
    }

    public static final void d(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (!(obj instanceof ServerSocket)) {
                        throw new IllegalArgumentException("Unknown object to close");
                    }
                    ((ServerSocket) obj).close();
                }
            } catch (IOException e9) {
                d.log(Level.SEVERE, "Could not close", (Throwable) e9);
            }
        }
    }

    public static boolean g(i iVar) {
        String str = iVar.f8894b;
        if (str != null) {
            return str.toLowerCase().contains("text/") || str.toLowerCase().contains("/json");
        }
        return false;
    }

    public abstract i e(e eVar);

    public final void f() throws IOException {
        this.f8905a = new ServerSocket();
        this.f8905a.setReuseAddress(true);
        k kVar = new k(this);
        Thread thread = new Thread(kVar);
        this.f8906b = thread;
        thread.setDaemon(true);
        this.f8906b.setName("NanoHttpd Main Listener");
        this.f8906b.start();
        while (!kVar.f8903b && ((IOException) kVar.f8904c) == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        IOException iOException = (IOException) kVar.f8904c;
        if (iOException != null) {
            throw iOException;
        }
    }
}
