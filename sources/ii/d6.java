package ii;

import org.telegram.tgnet.tl.TL_iv;
public final class d6 {
    public final TL_iv.PageBlock f11300a;
    public final int f11301b;
    public final int f11302c;
    public final boolean d;
    public final boolean e;

    public d6(TL_iv.PageBlock pageBlock, int i10, int i11) {
        this(pageBlock, i10, i11, false, false);
    }

    public d6(TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        this.f11300a = pageBlock;
        this.f11301b = i10;
        this.f11302c = i11;
        this.d = z10;
        this.e = z11;
    }
}
