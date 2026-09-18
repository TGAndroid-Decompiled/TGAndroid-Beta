package ei;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q1 implements Predicate {
    public final int f8561a;
    public final Object f8562b;

    public q1(Object obj, int i10) {
        this.f8561a = i10;
        this.f8562b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f8561a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f8561a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f8561a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.f8561a) {
            case 0:
                contains = ((HashSet) this.f8562b).contains(Long.valueOf(((s1) obj).f8604b));
                break;
            case 1:
                contains = ((HashSet) this.f8562b).contains(Long.valueOf(((s1) obj).f8604b));
                break;
            default:
                xh.r1 r1Var = (xh.r1) this.f8562b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = r1Var.f46341b0.disallow_unique_stargifts;
                } else {
                    r1Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = r1Var.f46341b0;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z10 = r1Var.f46341b0.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
