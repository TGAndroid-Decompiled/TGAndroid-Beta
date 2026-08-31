package fg;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class n {
    public final TLRPC.TL_premiumGiftOption f6404a;
    public final TLRPC.TL_premiumGiftCodeOption f6405b;
    public final TLRPC.TL_premiumGiftOption f6406c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int f6407e;
    public long f6408f;
    public long f6409g;
    public p2.m h;

    public n(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.f6404a = tL_premiumGiftOption;
        this.f6405b = null;
        this.f6406c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f6404a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.currency;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f6405b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        }
        p2.m mVar = this.h;
        if (mVar == null) {
            return "";
        }
        return mVar.a().f44150c;
    }

    public final int b() {
        if (this.f6407e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.f6409g != 0) {
                int f10 = (int) ((1.0d - (f() / this.f6409g)) * 100.0d);
                this.f6407e = f10;
                if (f10 == 0) {
                    this.f6407e = -1;
                }
            }
        }
        return this.f6407e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (!BuildVars.useInvoiceBilling() && (((tL_premiumGiftOption = this.f6404a) == null || tL_premiumGiftOption.store_product != null) && ((tL_premiumGiftCodeOption = this.f6405b) == null || tL_premiumGiftCodeOption.store_product != null))) {
            if (this.h == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(e(), a(), 6);
        }
        return BillingController.getInstance().formatCurrency(e(), a());
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f6404a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f6405b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f6404a;
        if (tL_premiumGiftOption != null) {
            if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.amount;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f6405b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        }
        p2.m mVar = this.h;
        if (mVar == null) {
            return 0L;
        }
        return mVar.a().f44149b;
    }

    public final long f() {
        if (this.f6408f == 0) {
            long e6 = e();
            if (e6 != 0) {
                this.f6408f = e6 / d();
            }
        }
        return this.f6408f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f6406c;
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
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.f6404a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.f6405b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public n(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.f6404a = null;
        this.f6405b = tL_premiumGiftCodeOption;
        this.f6406c = null;
        this.d = e2.c.s(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
