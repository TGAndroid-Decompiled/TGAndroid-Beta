package defpackage;

import org.telegram.tgnet.tl.TL_iv;
public final class jm9 {
    public final TL_iv.PageBlock a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public jm9(TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        this.a = pageBlock;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public jm9(TL_iv.PageBlock pageBlock, int i, int i2) {
        this(pageBlock, i, i2, false, false);
    }
}
