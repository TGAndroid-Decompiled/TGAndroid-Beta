package hi;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j1 implements Predicate {
    public final int f14737a;
    public final Object f14738b;

    public j1(Object obj, int i7) {
        this.f14737a = i7;
        this.f14738b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i7 = this.f14737a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f14737a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i7 = this.f14737a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z9;
        switch (this.f14737a) {
            case 0:
                contains = ((HashSet) this.f14738b).contains(Long.valueOf(((l1) obj).f14779b));
                break;
            case 1:
                contains = ((HashSet) this.f14738b).contains(Long.valueOf(((l1) obj).f14779b));
                break;
            default:
                zh.g1 g1Var = (zh.g1) this.f14738b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z9 = g1Var.S1.disallow_unique_stargifts;
                } else {
                    g1Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = g1Var.S1;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z9 = g1Var.S1.disallow_unlimited_stargifts;
                }
                return true ^ z9;
        }
        return !contains;
    }
}
