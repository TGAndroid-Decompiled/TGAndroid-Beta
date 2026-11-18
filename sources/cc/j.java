package cc;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
public abstract class j {
    public static final Charset f5185a = Charset.defaultCharset();
    public static final Charset f5186b;
    public static final Charset f5187c;
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
        f5186b = charset;
        try {
            charset2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charset2 = null;
        }
        f5187c = charset2;
        try {
            charset3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset4 = f5186b;
        if ((charset4 != null && charset4.equals(f5185a)) || (charset3 != null && charset3.equals(f5185a))) {
            z10 = true;
        } else {
            z10 = false;
        }
        d = z10;
    }
}
