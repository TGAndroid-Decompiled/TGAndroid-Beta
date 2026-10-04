package lf;

import java.nio.charset.Charset;
public enum b {
    ISO_8859_1(Charset.forName("ISO-8859-1"), 1),
    UTF_16(Charset.forName("UTF-16"), 2),
    UTF_16BE(Charset.forName("UTF-16BE"), 2),
    UTF_8(Charset.forName("UTF-8"), 1);
    
    public final Charset f15474a;
    public final int f15475b;

    b(Charset charset, int i10) {
        this.f15474a = charset;
        this.f15475b = i10;
    }
}
