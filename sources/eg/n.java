package eg;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class n {
    public final TLRPC.TL_premiumGiftOption f5362a;
    public final TLRPC.TL_premiumGiftCodeOption f5363b;
    public final TLRPC.TL_premiumGiftOption f5364c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int e;
    public long f5365f;
    public long f5366g;
    public p2.n h;

    public n(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.f5362a = tL_premiumGiftOption;
        this.f5363b = null;
        this.f5364c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f5362a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.currency;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f5363b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        }
        p2.n nVar = this.h;
        if (nVar == null) {
            return "";
        }
        return nVar.a().f40999c;
    }

    public final int b() {
        if (this.e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.f5366g != 0) {
                int f10 = (int) ((1.0d - (f() / this.f5366g)) * 100.0d);
                this.e = f10;
                if (f10 == 0) {
                    this.e = -1;
                }
            }
        }
        return this.e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (!BuildVars.useInvoiceBilling() && (((tL_premiumGiftOption = this.f5362a) == null || tL_premiumGiftOption.store_product != null) && ((tL_premiumGiftCodeOption = this.f5363b) == null || tL_premiumGiftCodeOption.store_product != null))) {
            if (this.h == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(e(), a(), 6);
        }
        return BillingController.getInstance().formatCurrency(e(), a());
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f5362a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f5363b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f5362a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.amount;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f5363b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        }
        p2.n nVar = this.h;
        if (nVar == null) {
            return 0L;
        }
        return nVar.a().f40998b;
    }

    public final long f() {
        if (this.f5365f == 0) {
            long e = e();
            if (e != 0) {
                this.f5365f = e / d();
            }
        }
        return this.f5365f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f5364c;
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
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f5362a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f5363b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public n(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.f5362a = null;
        this.f5363b = tL_premiumGiftCodeOption;
        this.f5364c = null;
        this.d = e2.c.s(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
