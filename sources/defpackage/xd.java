package defpackage;

import j$.time.YearMonth;
public final class xd implements Runnable {
    public final hq7 a;
    public final int b;
    public final hq7 c;
    public final hq7 d;
    public final int e;
    public final int f;
    public final int h;

    public xd(hq7 hq7Var, int i, hq7 hq7Var2, hq7 hq7Var3, int i2, int i3, int i4) {
        this.a = hq7Var;
        this.b = i;
        this.c = hq7Var2;
        this.d = hq7Var3;
        this.e = i2;
        this.f = i3;
        this.h = i4;
    }

    @Override
    public final void run() {
        hq7 hq7Var = this.a;
        int value = hq7Var.getValue();
        int i = this.b;
        hq7 hq7Var2 = this.c;
        hq7 hq7Var3 = this.d;
        if (value == i) {
            hq7Var2.setMinValue(1);
            try {
                hq7Var2.setMaxValue(YearMonth.of(2024, hq7Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                cc4.g(e, true);
                hq7Var2.setMaxValue(31);
            }
            hq7Var3.setMinValue(0);
            hq7Var3.setMaxValue(11);
        } else if (hq7Var.getValue() == this.e) {
            hq7Var3.setMinValue(0);
            int i2 = this.f;
            hq7Var3.setMaxValue(i2);
            if (hq7Var3.getValue() == i2) {
                hq7Var2.setMinValue(1);
                hq7Var2.setMaxValue(this.h);
                return;
            }
            hq7Var2.setMinValue(1);
            try {
                hq7Var2.setMaxValue(YearMonth.of(hq7Var.getValue(), hq7Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e2) {
                cc4.g(e2, true);
                hq7Var2.setMaxValue(31);
            }
        } else {
            hq7Var2.setMinValue(1);
            try {
                hq7Var2.setMaxValue(YearMonth.of(hq7Var.getValue(), hq7Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e3) {
                cc4.g(e3, true);
                hq7Var2.setMaxValue(31);
            }
            hq7Var3.setMinValue(0);
            hq7Var3.setMaxValue(11);
        }
    }
}
