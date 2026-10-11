package dc;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
public abstract class h {
    public static final Charset f8297a = Charset.defaultCharset();
    public static final Charset f8298b;
    public static final Charset f8299c;
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
        f8298b = charset;
        try {
            charset2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charset2 = null;
        }
        f8299c = charset2;
        try {
            charset3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset4 = f8298b;
        if ((charset4 != null && charset4.equals(f8297a)) || (charset3 != null && charset3.equals(f8297a))) {
            z10 = true;
        } else {
            z10 = false;
        }
        d = z10;
    }
}
