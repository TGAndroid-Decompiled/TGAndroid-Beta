package ag;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;

public final class p {

    public final TLRPC.TL_premiumGiftOption f585a;

    public final TLRPC.TL_premiumGiftCodeOption f586b;

    public final TLRPC.TL_premiumGiftOption f587c;
    public final TLRPC.TL_premiumGiftCodeOption d;

    public int f588e;

    public long f589f;

    public long f590g;
    public n2.l h;

    public p(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.f585a = tL_premiumGiftOption;
        this.f586b = null;
        this.f587c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f585a;
        if (tL_premiumGiftOption == null) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f586b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        } else if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
            return tL_premiumGiftOption.currency;
        }
        n2.l lVar = this.h;
        return lVar == null ? "" : lVar.a().f18152c;
    }

    public final int b() {
        if (this.f588e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.f590g != 0) {
                int iF = (int) ((1.0d - (f() / this.f590g)) * 100.0d);
                this.f588e = iF;
                if (iF == 0) {
                    this.f588e = -1;
                }
            }
        }
        return this.f588e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (BuildVars.useInvoiceBilling() || (((tL_premiumGiftOption = this.f585a) != null && tL_premiumGiftOption.store_product == null) || ((tL_premiumGiftCodeOption = this.f586b) != null && tL_premiumGiftCodeOption.store_product == null))) {
            return BillingController.getInstance().formatCurrency(e(), a());
        }
        return this.h == null ? "" : BillingController.getInstance().formatCurrency(e(), a(), 6);
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f585a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f586b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f585a;
        if (tL_premiumGiftOption == null) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f586b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        } else if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
            return tL_premiumGiftOption.amount;
        }
        n2.l lVar = this.h;
        if (lVar == null) {
            return 0L;
        }
        return lVar.a().f18151b;
    }

    public final long f() {
        if (this.f589f == 0) {
            long jE = e();
            if (jE != 0) {
                this.f589f = jE / ((long) d());
            }
        }
        return this.f589f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f587c;
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
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f585a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f586b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public p(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.f585a = null;
        this.f586b = tL_premiumGiftCodeOption;
        this.f587c = null;
        this.d = com.google.android.recaptcha.internal.a.u(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
