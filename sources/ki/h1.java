package ki;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h1 implements Predicate {
    public final int f18729a;
    public final Object f18730b;

    public h1(Object obj, int i7) {
        this.f18729a = i7;
        this.f18730b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i7 = this.f18729a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f18729a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i7 = this.f18729a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.f18729a) {
            case 0:
                contains = ((HashSet) this.f18730b).contains(Long.valueOf(((j1) obj).f18762b));
                break;
            case 1:
                contains = ((HashSet) this.f18730b).contains(Long.valueOf(((j1) obj).f18762b));
                break;
            default:
                bi.n3 n3Var = (bi.n3) this.f18730b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = n3Var.W1.disallow_unique_stargifts;
                } else {
                    n3Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = n3Var.W1;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z10 = n3Var.W1.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
