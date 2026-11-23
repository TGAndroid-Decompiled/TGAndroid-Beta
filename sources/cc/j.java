package cc;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
public abstract class j {
    public static final Charset f5217a = Charset.defaultCharset();
    public static final Charset f5218b;
    public static final Charset f5219c;
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
        f5218b = charset;
        try {
            charset2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charset2 = null;
        }
        f5219c = charset2;
        try {
            charset3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset4 = f5218b;
        if ((charset4 != null && charset4.equals(f5217a)) || (charset3 != null && charset3.equals(f5217a))) {
            z10 = true;
        } else {
            z10 = false;
        }
        d = z10;
    }
}
