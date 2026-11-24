package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class ik8 {
    public final TLRPC.TL_premiumSubscriptionOption a;
    public int b;
    public long c;
    public long d;
    public long e;
    public ln8 f;
    public kn8 g;
    public int h;

    public ik8(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        ln8 ln8Var = this.f;
        if (ln8Var != null && this.g == null) {
            ArrayList arrayList = ln8Var.h;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                kn8 kn8Var = (kn8) obj;
                String str = ((jn8) kn8Var.b.a.get(0)).d;
                int i2 = this.a.months;
                if (i2 == 12) {
                    if (str.equals("P1Y")) {
                        this.g = kn8Var;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i2 + "M")) {
                        this.g = kn8Var;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean b = e21.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.a;
        if (!b && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f != null) {
                a();
                kn8 kn8Var = this.g;
                if (kn8Var == null) {
                    return "";
                }
                return ((jn8) kn8Var.b.a.get(0)).c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.b = i;
                if (i == 0) {
                    this.b = -1;
                }
            }
        }
        return this.b;
    }

    public final String d() {
        if (!e21.b() && this.a.store_product != null) {
            if (this.f == null) {
                return "";
            }
            cj0.h();
            return cj0.f(b(), 6, g(), false);
        }
        return cj0.h().e(g(), b());
    }

    public final String e() {
        if (!e21.b() && this.a.store_product != null) {
            if (this.f == null) {
                return "";
            }
            cj0.h();
            return cj0.f(b(), 6, h(), false);
        }
        return cj0.h().e(h(), b());
    }

    public final String f() {
        if (!e21.b() && this.a.store_product != null) {
            if (this.f == null) {
                return "";
            }
            cj0.h();
            return cj0.f(b(), 6, i(), false);
        }
        return cj0.h().e(i(), b());
    }

    public final long g() {
        boolean b = e21.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.a;
        if (!b && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f != null) {
                a();
                kn8 kn8Var = this.g;
                if (kn8Var == null) {
                    return 0L;
                }
                return ((jn8) kn8Var.b.a.get(0)).b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.c == 0) {
            long g = g();
            if (g != 0) {
                this.c = g / this.a.months;
            }
        }
        return this.c;
    }

    public final long i() {
        if (this.d == 0) {
            long g = g();
            if (g != 0) {
                this.d = (long) ((g / this.a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
