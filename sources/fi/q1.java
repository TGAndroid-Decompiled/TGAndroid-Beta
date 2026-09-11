package fi;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q1 implements Predicate {
    public final int f9893a;
    public final Object f9894b;

    public q1(Object obj, int i10) {
        this.f9893a = i10;
        this.f9894b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f9893a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f9893a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f9893a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.f9893a) {
            case 0:
                contains = ((HashSet) this.f9894b).contains(Long.valueOf(((s1) obj).f9950b));
                break;
            case 1:
                contains = ((HashSet) this.f9894b).contains(Long.valueOf(((s1) obj).f9950b));
                break;
            default:
                yh.p1 p1Var = (yh.p1) this.f9894b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = p1Var.f50484b0.disallow_unique_stargifts;
                } else {
                    p1Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = p1Var.f50484b0;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z10 = p1Var.f50484b0.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
