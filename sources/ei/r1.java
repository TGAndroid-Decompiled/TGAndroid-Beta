package ei;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r1 implements Predicate {
    public final int f9297a;
    public final Object f9298b;

    public r1(Object obj, int i10) {
        this.f9297a = i10;
        this.f9298b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f9297a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f9297a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f9297a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.f9297a) {
            case 0:
                contains = ((HashSet) this.f9298b).contains(Long.valueOf(((t1) obj).f9343b));
                break;
            case 1:
                contains = ((HashSet) this.f9298b).contains(Long.valueOf(((t1) obj).f9343b));
                break;
            default:
                xh.q1 q1Var = (xh.q1) this.f9298b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = q1Var.f50180b0.disallow_unique_stargifts;
                } else {
                    q1Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = q1Var.f50180b0;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z10 = q1Var.f50180b0.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
