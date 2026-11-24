package defpackage;

import org.telegram.tgnet.TLRPC;
public final class nw4 {
    public final TLRPC.TL_premiumGiftOption a;
    public final TLRPC.TL_premiumGiftCodeOption b;
    public final TLRPC.TL_premiumGiftOption c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int e;
    public long f;
    public long g;
    public ln8 h;

    public nw4(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.a = null;
        this.b = tL_premiumGiftCodeOption;
        this.c = null;
        this.d = wi8.A(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.a;
        if (tL_premiumGiftOption != null) {
            if (e21.b() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.currency;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.b;
            if (tL_premiumGiftCodeOption != null && (e21.b() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        }
        ln8 ln8Var = this.h;
        if (ln8Var == null) {
            return "";
        }
        return ln8Var.a().c;
    }

    public final int b() {
        if (this.e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.g != 0) {
                int f = (int) ((1.0d - (f() / this.g)) * 100.0d);
                this.e = f;
                if (f == 0) {
                    this.e = -1;
                }
            }
        }
        return this.e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (!e21.b() && (((tL_premiumGiftOption = this.a) == null || tL_premiumGiftOption.store_product != null) && ((tL_premiumGiftCodeOption = this.b) == null || tL_premiumGiftCodeOption.store_product != null))) {
            if (this.h == null) {
                return "";
            }
            cj0.h();
            return cj0.f(a(), 6, e(), false);
        }
        return cj0.h().e(e(), a());
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.a;
        if (tL_premiumGiftOption != null) {
            if (e21.b() || tL_premiumGiftOption.store_product == null) {
                return tL_premiumGiftOption.amount;
            }
        } else {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.b;
            if (tL_premiumGiftCodeOption != null && (e21.b() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        }
        ln8 ln8Var = this.h;
        if (ln8Var == null) {
            return 0L;
        }
        return ln8Var.a().b;
    }

    public final long f() {
        if (this.f == 0) {
            long e = e();
            if (e != 0) {
                this.f = e / d();
            }
        }
        return this.f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.c;
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
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public nw4(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.a = tL_premiumGiftOption;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
