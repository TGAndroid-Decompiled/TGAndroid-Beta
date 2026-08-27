package nh;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class l1 implements Predicate {

    public final int f18799a;

    public final Object f18800b;

    public l1(Object obj, int i10) {
        this.f18799a = i10;
        this.f18800b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f18799a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f18799a) {
            case 0:
                break;
            case 1:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f18799a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean zContains;
        boolean z10;
        switch (this.f18799a) {
            case 0:
                zContains = ((HashSet) this.f18800b).contains(Long.valueOf(((n1) obj).f18833b));
                break;
            case 1:
                zContains = ((HashSet) this.f18800b).contains(Long.valueOf(((n1) obj).f18833b));
                break;
            default:
                gh.k2 k2Var = (gh.k2) this.f18800b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = k2Var.X.disallow_unique_stargifts;
                } else {
                    k2Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = k2Var.X;
                        if (disallowedGiftsSettings.disallow_limited_stargifts) {
                            return starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts;
                        }
                        return true;
                    }
                    z10 = k2Var.X.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !zContains;
    }
}
