package dc;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
public abstract class h {
    public static final Charset f6744a = Charset.defaultCharset();
    public static final Charset f6745b;
    public static final Charset f6746c;
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
        f6745b = charset;
        try {
            charset2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charset2 = null;
        }
        f6746c = charset2;
        try {
            charset3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset4 = f6745b;
        if ((charset4 != null && charset4.equals(f6744a)) || (charset3 != null && charset3.equals(f6744a))) {
            z10 = true;
        } else {
            z10 = false;
        }
        d = z10;
    }
}
