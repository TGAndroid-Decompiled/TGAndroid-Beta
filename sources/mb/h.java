package mb;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public abstract class h {

    public static final Charset f17945a = Charset.defaultCharset();

    public static final Charset f17946b;

    public static final Charset f17947c;
    public static final boolean d;

    static {
        Charset charsetForName;
        Charset charsetForName2;
        Charset charsetForName3 = null;
        try {
            charsetForName = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        f17946b = charsetForName;
        try {
            charsetForName2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charsetForName2 = null;
        }
        f17947c = charsetForName2;
        try {
            charsetForName3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset = f17946b;
        d = (charset != null && charset.equals(f17945a)) || (charsetForName3 != null && charsetForName3.equals(f17945a));
    }
}
