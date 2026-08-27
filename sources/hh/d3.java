package hh;

import org.telegram.tgnet.tl.TL_stars;

public final class d3 implements org.telegram.ui.ActionBar.a2 {

    public final int f9119a;

    public final i5 f9120b;

    public final TL_stars.TL_starGiftUnique f9121c;

    public d3(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f9119a = i10;
        this.f9120b = i5Var;
        this.f9121c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f9119a) {
            case 0:
                i5.N0(this.f9120b, this.f9121c, b2Var);
                break;
            default:
                we.e.u(this.f9120b.getContext(), "https://fragment.com/gift/" + this.f9121c.slug);
                break;
        }
    }
}
