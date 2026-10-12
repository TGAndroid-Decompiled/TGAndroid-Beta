package fi;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p1 implements Predicate {
    public final int f9462a;
    public final Object f9463b;

    public p1(Object obj, int i10) {
        this.f9462a = i10;
        this.f9463b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f9462a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f9462a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f9462a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.f9462a) {
            case 0:
                contains = ((HashSet) this.f9463b).contains(Long.valueOf(((r1) obj).f9514b));
                break;
            case 1:
                contains = ((HashSet) this.f9463b).contains(Long.valueOf(((r1) obj).f9514b));
                break;
            default:
                yh.p1 p1Var = (yh.p1) this.f9463b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = p1Var.f49058b0.disallow_unique_stargifts;
                } else {
                    p1Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = p1Var.f49058b0;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z10 = p1Var.f49058b0.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
