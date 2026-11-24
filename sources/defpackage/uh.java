package defpackage;

import j$.time.YearMonth;
public final class uh implements Runnable {
    public final lp7 a;
    public final int b;
    public final lp7 c;
    public final lp7 d;
    public final int e;
    public final int f;
    public final int h;

    public uh(lp7 lp7Var, int i, lp7 lp7Var2, lp7 lp7Var3, int i2, int i3, int i4) {
        this.a = lp7Var;
        this.b = i;
        this.c = lp7Var2;
        this.d = lp7Var3;
        this.e = i2;
        this.f = i3;
        this.h = i4;
    }

    @Override
    public final void run() {
        lp7 lp7Var = this.a;
        int value = lp7Var.getValue();
        int i = this.b;
        lp7 lp7Var2 = this.c;
        lp7 lp7Var3 = this.d;
        if (value == i) {
            lp7Var2.setMinValue(1);
            try {
                lp7Var2.setMaxValue(YearMonth.of(2024, lp7Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                fc4.g(e, true);
                lp7Var2.setMaxValue(31);
            }
            lp7Var3.setMinValue(0);
            lp7Var3.setMaxValue(11);
        } else if (lp7Var.getValue() == this.e) {
            lp7Var3.setMinValue(0);
            int i2 = this.f;
            lp7Var3.setMaxValue(i2);
            if (lp7Var3.getValue() == i2) {
                lp7Var2.setMinValue(1);
                lp7Var2.setMaxValue(this.h);
                return;
            }
            lp7Var2.setMinValue(1);
            try {
                lp7Var2.setMaxValue(YearMonth.of(lp7Var.getValue(), lp7Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e2) {
                fc4.g(e2, true);
                lp7Var2.setMaxValue(31);
            }
        } else {
            lp7Var2.setMinValue(1);
            try {
                lp7Var2.setMaxValue(YearMonth.of(lp7Var.getValue(), lp7Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e3) {
                fc4.g(e3, true);
                lp7Var2.setMaxValue(31);
            }
            lp7Var3.setMinValue(0);
            lp7Var3.setMaxValue(11);
        }
    }
}
