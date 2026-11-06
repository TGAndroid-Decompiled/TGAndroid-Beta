package cc;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
public abstract class j {
    public static final Charset f6074a = Charset.defaultCharset();
    public static final Charset f6075b;
    public static final Charset f6076c;
    public static final boolean d;

    static {
        Charset charset;
        Charset charset2;
        boolean z9;
        Charset charset3 = null;
        try {
            charset = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        f6075b = charset;
        try {
            charset2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charset2 = null;
        }
        f6076c = charset2;
        try {
            charset3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset4 = f6075b;
        if ((charset4 != null && charset4.equals(f6074a)) || (charset3 != null && charset3.equals(f6074a))) {
            z9 = true;
        } else {
            z9 = false;
        }
        d = z9;
    }
}
