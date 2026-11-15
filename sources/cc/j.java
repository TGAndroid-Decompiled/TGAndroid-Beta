package cc;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
public abstract class j {
    public static final Charset f4902a = Charset.defaultCharset();
    public static final Charset f4903b;
    public static final Charset f4904c;
    public static final boolean d;

    static {
        Charset charset;
        Charset charset2;
        boolean z10;
        Charset charset3 = null;
        try {
            charset = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        f4903b = charset;
        try {
            charset2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charset2 = null;
        }
        f4904c = charset2;
        try {
            charset3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset4 = f4903b;
        if ((charset4 != null && charset4.equals(f4902a)) || (charset3 != null && charset3.equals(f4902a))) {
            z10 = true;
        } else {
            z10 = false;
        }
        d = z10;
    }
}
