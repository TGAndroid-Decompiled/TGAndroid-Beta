package defpackage;

import android.content.Context;
public final class v71 extends y61 {
    public final w71 f0;

    public v71(w71 w71Var, Context context) {
        super(context, 11, y61.a0, 0, y61.b0);
        this.f0 = w71Var;
    }

    @Override
    public final void c(int i, boolean z) {
        y71 y71Var = (y71) this.f0.f;
        if (!z) {
            y71Var.b.m1();
            return;
        }
        int i2 = -1;
        if (i == 8) {
            i = -1;
        }
        int i3 = 0;
        while (true) {
            if (i3 < y71Var.g0.size()) {
                u71 u71Var = (u71) y71Var.g0.get(i3);
                if (u71Var != null && u71Var.a == 11 && u71Var.f == i) {
                    i2 = i3;
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        if (i2 >= 0) {
            y71Var.b.f1(new pg(i2, (byte) 2), 0, true);
        } else {
            y71Var.b.m1();
        }
    }
}
