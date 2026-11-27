package defpackage;

import java.io.UnsupportedEncodingException;
public abstract class h2f {
    public static byte[] a(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        return null;
    }

    public static int b(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8").length;
            } catch (UnsupportedEncodingException unused) {
                throw new RuntimeException();
            }
        }
        return 0;
    }
}
