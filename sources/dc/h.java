package dc;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
public abstract class h {
    public static final Charset f6717a = Charset.defaultCharset();
    public static final Charset f6718b;
    public static final Charset f6719c;
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
        f6718b = charset;
        try {
            charset2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charset2 = null;
        }
        f6719c = charset2;
        try {
            charset3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset4 = f6718b;
        if ((charset4 != null && charset4.equals(f6717a)) || (charset3 != null && charset3.equals(f6717a))) {
            z10 = true;
        } else {
            z10 = false;
        }
        d = z10;
    }
}
