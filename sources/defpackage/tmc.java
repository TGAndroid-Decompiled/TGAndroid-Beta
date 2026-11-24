package defpackage;

import android.text.TextUtils;
public final class tmc implements qac {
    public final byte a;
    public final b61 b;
    public final my0 c;
    public final ylb d;

    public tmc(b61 b61Var, my0 my0Var, ylb ylbVar, byte b) {
        this.a = b;
        this.b = b61Var;
        this.c = my0Var;
        this.d = ylbVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        ylb ylbVar = this.d;
        my0 my0Var = this.c;
        b61 b61Var = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                b61Var.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    new c41(my0Var.F, ylbVar).f0(str, false);
                    return;
                } else {
                    my0Var.dismiss();
                    return;
                }
            default:
                b61Var.setLoading(false);
                if (str != null) {
                    new c41(my0Var.F, ylbVar).f0(str, false);
                    return;
                } else {
                    my0Var.dismiss();
                    return;
                }
        }
    }
}
