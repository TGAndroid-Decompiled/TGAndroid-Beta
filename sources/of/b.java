package of;

import java.nio.charset.Charset;
public enum b {
    ISO_8859_1(Charset.forName("ISO-8859-1"), 1),
    UTF_16(Charset.forName("UTF-16"), 2),
    UTF_16BE(Charset.forName("UTF-16BE"), 2),
    UTF_8(Charset.forName("UTF-8"), 1);
    
    public final Charset f19359a;
    public final int f19360b;

    b(Charset charset, int i10) {
        this.f19359a = charset;
        this.f19360b = i10;
    }
}
