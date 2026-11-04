package ii;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k1 implements Predicate {
    public final int f15045a;
    public final Object f15046b;

    public k1(Object obj, int i3) {
        this.f15045a = i3;
        this.f15046b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i3 = this.f15045a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f15045a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i3 = this.f15045a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.f15045a) {
            case 0:
                contains = ((HashSet) this.f15046b).contains(Long.valueOf(((m1) obj).f15074b));
                break;
            case 1:
                contains = ((HashSet) this.f15046b).contains(Long.valueOf(((m1) obj).f15074b));
                break;
            default:
                ai.b3 b3Var = (ai.b3) this.f15046b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = b3Var.T1.disallow_unique_stargifts;
                } else {
                    b3Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = b3Var.T1;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z10 = b3Var.T1.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
