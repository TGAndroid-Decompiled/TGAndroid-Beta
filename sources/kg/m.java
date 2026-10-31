package kg;

import org.telegram.messenger.v2;
import org.telegram.tgnet.TLRPC;
public final class m {
    public final TLRPC.TL_premiumGiftOption f11178a;
    public final TLRPC.TL_premiumGiftCodeOption f11179b;
    public final TLRPC.TL_premiumGiftOption f11180c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int e;
    public long f11181f;
    public long f11182g;
    public c5.m h;

    public m(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.f11178a = tL_premiumGiftOption;
        this.f11179b = null;
        this.f11180c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f11178a;
        if (tL_premiumGiftOption != null) {
            if (v2.b() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.currency;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f11179b;
            if (tL_premiumGiftCodeOption != null && (v2.b() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        }
        c5.m mVar = this.h;
        if (mVar == null) {
            return "";
        }
        return mVar.a().f3790c;
    }

    public final int b() {
        if (this.e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.f11182g != 0) {
                int f7 = (int) ((1.0d - (f() / this.f11182g)) * 100.0d);
                this.e = f7;
                if (f7 == 0) {
                    this.e = -1;
                }
            }
        }
        return this.e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (!v2.b() && (((tL_premiumGiftOption = this.f11178a) == null || tL_premiumGiftOption.store_product != null) && ((tL_premiumGiftCodeOption = this.f11179b) == null || tL_premiumGiftCodeOption.store_product != null))) {
            if (this.h == null) {
                return "";
            }
            org.telegram.messenger.u1 i10 = org.telegram.messenger.u1.i();
            long e = e();
            String a2 = a();
            i10.getClass();
            return org.telegram.messenger.u1.g(a2, 6, e, false);
        }
        return org.telegram.messenger.u1.i().f(e(), a());
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f11178a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f11179b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f11178a;
        if (tL_premiumGiftOption != null) {
            if (v2.b() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.amount;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f11179b;
            if (tL_premiumGiftCodeOption != null && (v2.b() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        }
        c5.m mVar = this.h;
        if (mVar == null) {
            return 0L;
        }
        return mVar.a().f3789b;
    }

    public final long f() {
        if (this.f11181f == 0) {
            long e = e();
            if (e != 0) {
                this.f11181f = e / d();
            }
        }
        return this.f11181f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f11180c;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.amount;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.d;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.amount;
        }
        return 0L;
    }

    public final String h() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f11178a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f11179b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public m(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.f11178a = null;
        this.f11179b = tL_premiumGiftCodeOption;
        this.f11180c = null;
        this.d = c3.i0.t(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
