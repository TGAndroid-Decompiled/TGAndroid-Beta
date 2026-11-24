package defpackage;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class rh1 extends ja {
    public final String c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f;
    public final int g;

    public rh1(TL_stories.Boost boost, boolean z, int i) {
        super(5, true);
        this.d = boost;
        this.f = z;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z = this.f;
        if (this != obj) {
            if (obj != null && rh1.class == obj.getClass()) {
                rh1 rh1Var = (rh1) obj;
                TL_stories.Boost boost = rh1Var.d;
                boolean z2 = rh1Var.f;
                TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
                if (prepaidGiveaway2 != null && (prepaidGiveaway = rh1Var.e) != null) {
                    if (prepaidGiveaway2.id == prepaidGiveaway.id && z == z2) {
                        return true;
                    }
                    return false;
                }
                TL_stories.Boost boost2 = this.d;
                if (boost2 != null && boost != null) {
                    if (boost2.id.hashCode() == boost.id.hashCode() && z == z2 && this.g == rh1Var.g) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g));
    }

    public rh1(int i, String str) {
        super(i, false);
        this.c = str;
    }
}
