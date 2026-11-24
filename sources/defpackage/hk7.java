package defpackage;

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
public abstract class hk7 {
    public static final Logger d;
    public volatile ServerSocket a;
    public Thread b;
    public vh2 c;

    static {
        Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
        Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
        Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
        d = Logger.getLogger(hk7.class.getName());
    }

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            d.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e);
            return null;
        }
    }

    public static fk7 b(int i, String str, String str2) {
        String str3;
        byte[] bArr;
        bk7 bk7Var = new bk7(str);
        if (str2 == null) {
            return new fk7(i, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        String str4 = "US-ASCII";
        String str5 = bk7Var.b;
        if (str5 == null) {
            str3 = "US-ASCII";
        } else {
            str3 = str5;
        }
        try {
            if (!Charset.forName(str3).newEncoder().canEncode(str2) && str5 == null) {
                bk7Var = new bk7(str + "; charset=UTF-8");
            }
            String str6 = bk7Var.b;
            if (str6 != null) {
                str4 = str6;
            }
            bArr = str2.getBytes(str4);
        } catch (UnsupportedEncodingException e) {
            d.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bArr = new byte[0];
        }
        return new fk7(i, bk7Var.a, new ByteArrayInputStream(bArr), bArr.length);
    }

    public static final void c(Object obj) {
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
            } catch (IOException e) {
                d.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    public static boolean f(fk7 fk7Var) {
        String str = fk7Var.b;
        if (str != null) {
            if (str.toLowerCase().contains("text/") || str.toLowerCase().contains("/json")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public abstract fk7 d(dk7 dk7Var);

    public final void e() {
        this.a = new ServerSocket();
        this.a.setReuseAddress(true);
        p6 p6Var = new p6(this);
        Thread thread = new Thread(p6Var);
        this.b = thread;
        thread.setDaemon(true);
        this.b.setName("NanoHttpd Main Listener");
        this.b.start();
        while (!p6Var.b && ((IOException) p6Var.c) == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        IOException iOException = (IOException) p6Var.c;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }
}
