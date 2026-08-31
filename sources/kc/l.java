package kc;

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
    public volatile ServerSocket f11089a;
    public Thread f11090b;
    public f2.c f11091c;

    static {
        Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
        Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
        Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
        d = Logger.getLogger(l.class.getName());
    }

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e6) {
            d.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e6);
            return null;
        }
    }

    public static i c(h hVar, String str, String str2) {
        String str3;
        byte[] bArr;
        b bVar = new b(str);
        if (str2 == null) {
            return new i(hVar, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        String str4 = "US-ASCII";
        String str5 = bVar.f11053c;
        if (str5 == null) {
            str3 = "US-ASCII";
        } else {
            str3 = str5;
        }
        try {
            if (!Charset.forName(str3).newEncoder().canEncode(str2) && str5 == null) {
                bVar = new b(str + "; charset=UTF-8");
            }
            String str6 = bVar.f11053c;
            if (str6 != null) {
                str4 = str6;
            }
            bArr = str2.getBytes(str4);
        } catch (UnsupportedEncodingException e6) {
            d.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e6);
            bArr = new byte[0];
        }
        return new i(hVar, bVar.f11051a, new ByteArrayInputStream(bArr), bArr.length);
    }

    public static final void d(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else if (obj instanceof ServerSocket) {
                    ((ServerSocket) obj).close();
                } else {
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e6) {
                d.log(Level.SEVERE, "Could not close", (Throwable) e6);
            }
        }
    }

    public static boolean g(i iVar) {
        String str = iVar.f11078b;
        if (str != null) {
            if (str.toLowerCase().contains("text/") || str.toLowerCase().contains("/json")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public abstract i e(e eVar);

    public final void f() {
        this.f11089a = new ServerSocket();
        this.f11089a.setReuseAddress(true);
        k kVar = new k(this);
        Thread thread = new Thread(kVar);
        this.f11090b = thread;
        thread.setDaemon(true);
        this.f11090b.setName("NanoHttpd Main Listener");
        this.f11090b.start();
        while (!kVar.f11087b && ((IOException) kVar.f11088c) == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        IOException iOException = (IOException) kVar.f11088c;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }
}
