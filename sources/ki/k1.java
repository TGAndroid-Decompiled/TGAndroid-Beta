package ki;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k1 implements Predicate {
    public final int f18389a;
    public final Object f18390b;

    public k1(Object obj, int i7) {
        this.f18389a = i7;
        this.f18390b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i7 = this.f18389a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f18389a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i7 = this.f18389a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.f18389a) {
            case 0:
                contains = ((HashSet) this.f18390b).contains(Long.valueOf(((m1) obj).f18448b));
                break;
            case 1:
                contains = ((HashSet) this.f18390b).contains(Long.valueOf(((m1) obj).f18448b));
                break;
            default:
                bi.s2 s2Var = (bi.s2) this.f18390b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = s2Var.W1.disallow_unique_stargifts;
                } else {
                    s2Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = s2Var.W1;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z10 = s2Var.W1.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
