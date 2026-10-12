package nf;

import java.nio.charset.Charset;
public enum b {
    ISO_8859_1(Charset.forName("ISO-8859-1"), 1),
    UTF_16(Charset.forName("UTF-16"), 2),
    UTF_16BE(Charset.forName("UTF-16BE"), 2),
    UTF_8(Charset.forName("UTF-8"), 1);
    
    public final Charset f16324a;
    public final int f16325b;

    b(Charset charset, int i10) {
        this.f16324a = charset;
        this.f16325b = i10;
    }
}
