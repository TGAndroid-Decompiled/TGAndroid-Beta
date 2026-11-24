package defpackage;

import java.nio.charset.Charset;
public enum bh5 {
    ISO_8859_1(Charset.forName("ISO-8859-1"), 1),
    UTF_16(Charset.forName("UTF-16"), 2),
    UTF_16BE(Charset.forName("UTF-16BE"), 2),
    UTF_8(Charset.forName("UTF-8"), 1);
    
    public final Charset a;
    public final byte b;

    bh5(Charset charset, int i) {
        this.a = charset;
        this.b = i;
    }
}
