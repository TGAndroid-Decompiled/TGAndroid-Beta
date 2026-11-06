package hi;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j1 implements Predicate {
    public final int f14734a;
    public final Object f14735b;

    public j1(Object obj, int i7) {
        this.f14734a = i7;
        this.f14735b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i7 = this.f14734a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f14734a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i7 = this.f14734a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z9;
        switch (this.f14734a) {
            case 0:
                contains = ((HashSet) this.f14735b).contains(Long.valueOf(((l1) obj).f14776b));
                break;
            case 1:
                contains = ((HashSet) this.f14735b).contains(Long.valueOf(((l1) obj).f14776b));
                break;
            default:
                zh.h1 h1Var = (zh.h1) this.f14735b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z9 = h1Var.S1.disallow_unique_stargifts;
                } else {
                    h1Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = h1Var.S1;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z9 = h1Var.S1.disallow_unlimited_stargifts;
                }
                return true ^ z9;
        }
        return !contains;
    }
}
