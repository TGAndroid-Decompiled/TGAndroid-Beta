package gi;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m1 implements Predicate {
    public final int f11336a;
    public final Object f11337b;

    public m1(Object obj, int i10) {
        this.f11336a = i10;
        this.f11337b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f11336a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f11336a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f11336a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.f11336a) {
            case 0:
                contains = ((HashSet) this.f11337b).contains(Long.valueOf(((o1) obj).f11369b));
                break;
            case 1:
                contains = ((HashSet) this.f11337b).contains(Long.valueOf(((o1) obj).f11369b));
                break;
            default:
                yh.o1 o1Var = (yh.o1) this.f11337b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = o1Var.f50422b0.disallow_unique_stargifts;
                } else {
                    o1Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = o1Var.f50422b0;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z10 = o1Var.f50422b0.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
