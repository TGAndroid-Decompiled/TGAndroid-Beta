package mh;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m1 implements Predicate {
    public final int f17983a;
    public final Object f17984b;

    public m1(Object obj, int i9) {
        this.f17983a = i9;
        this.f17984b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i9 = this.f17983a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f17983a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i9 = this.f17983a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.f17983a) {
            case 0:
                contains = ((HashSet) this.f17984b).contains(Long.valueOf(((o1) obj).f18013b));
                break;
            case 1:
                contains = ((HashSet) this.f17984b).contains(Long.valueOf(((o1) obj).f18013b));
                break;
            default:
                fh.p2 p2Var = (fh.p2) this.f17984b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = p2Var.X.disallow_unique_stargifts;
                } else {
                    p2Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = p2Var.X;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z10 = p2Var.X.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
