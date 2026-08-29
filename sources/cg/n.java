package cg;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class n {
    public final TLRPC.TL_premiumGiftOption f3218a;
    public final TLRPC.TL_premiumGiftCodeOption f3219b;
    public final TLRPC.TL_premiumGiftOption f3220c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int f3221e;
    public long f3222f;
    public long f3223g;
    public p2.l h;

    public n(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.f3218a = tL_premiumGiftOption;
        this.f3219b = null;
        this.f3220c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f3218a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.currency;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f3219b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        }
        p2.l lVar = this.h;
        if (lVar == null) {
            return "";
        }
        return lVar.a().f45462c;
    }

    public final int b() {
        if (this.f3221e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.f3223g != 0) {
                int f9 = (int) ((1.0d - (f() / this.f3223g)) * 100.0d);
                this.f3221e = f9;
                if (f9 == 0) {
                    this.f3221e = -1;
                }
            }
        }
        return this.f3221e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (!BuildVars.useInvoiceBilling() && (((tL_premiumGiftOption = this.f3218a) == null || tL_premiumGiftOption.store_product != null) && ((tL_premiumGiftCodeOption = this.f3219b) == null || tL_premiumGiftCodeOption.store_product != null))) {
            if (this.h == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(e(), a(), 6);
        }
        return BillingController.getInstance().formatCurrency(e(), a());
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f3218a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f3219b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f3218a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.amount;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f3219b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        }
        p2.l lVar = this.h;
        if (lVar == null) {
            return 0L;
        }
        return lVar.a().f45461b;
    }

    public final long f() {
        if (this.f3222f == 0) {
            long e10 = e();
            if (e10 != 0) {
                this.f3222f = e10 / d();
            }
        }
        return this.f3222f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f3220c;
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
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f3218a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f3219b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public n(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.f3218a = null;
        this.f3219b = tL_premiumGiftCodeOption;
        this.f3220c = null;
        this.d = com.google.android.recaptcha.internal.a.u(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
