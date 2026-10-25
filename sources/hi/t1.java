package hi;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t1 implements Predicate {
    public final int f13284a;
    public final Object f13285b;

    public t1(Object obj, int i10) {
        this.f13284a = i10;
        this.f13285b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f13284a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f13284a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f13284a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.f13284a) {
            case 0:
                contains = ((HashSet) this.f13285b).contains(Long.valueOf(((v1) obj).f13334b));
                break;
            case 1:
                contains = ((HashSet) this.f13285b).contains(Long.valueOf(((v1) obj).f13334b));
                break;
            default:
                zh.p1 p1Var = (zh.p1) this.f13285b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = p1Var.f53187b0.disallow_unique_stargifts;
                } else {
                    p1Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = p1Var.f53187b0;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z10 = p1Var.f53187b0.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
