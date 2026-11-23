package ki;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h1 implements Predicate {
    public final int f18799a;
    public final Object f18800b;

    public h1(Object obj, int i7) {
        this.f18799a = i7;
        this.f18800b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i7 = this.f18799a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f18799a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i7 = this.f18799a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.f18799a) {
            case 0:
                contains = ((HashSet) this.f18800b).contains(Long.valueOf(((j1) obj).f18827b));
                break;
            case 1:
                contains = ((HashSet) this.f18800b).contains(Long.valueOf(((j1) obj).f18827b));
                break;
            default:
                bi.p3 p3Var = (bi.p3) this.f18800b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = p3Var.W1.disallow_unique_stargifts;
                } else {
                    p3Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = p3Var.W1;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z10 = p3Var.W1.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
