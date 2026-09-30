package ii;

import org.telegram.tgnet.tl.TL_iv;
public final class d6 {
    public final TL_iv.PageBlock f11311a;
    public final int f11312b;
    public final int f11313c;
    public final boolean d;
    public final boolean e;

    public d6(TL_iv.PageBlock pageBlock, int i10, int i11) {
        this(pageBlock, i10, i11, false, false);
    }

    public d6(TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        this.f11311a = pageBlock;
        this.f11312b = i10;
        this.f11313c = i11;
        this.d = z10;
        this.e = z11;
    }
}
