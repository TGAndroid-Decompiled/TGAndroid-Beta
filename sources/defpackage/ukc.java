package defpackage;

import android.text.TextUtils;
public final class ukc implements p8c {
    public final byte a;
    public final u41 b;
    public final fx0 c;
    public final wjb d;

    public ukc(u41 u41Var, fx0 fx0Var, wjb wjbVar, byte b) {
        this.a = b;
        this.b = u41Var;
        this.c = fx0Var;
        this.d = wjbVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        wjb wjbVar = this.d;
        fx0 fx0Var = this.c;
        u41 u41Var = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                u41Var.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    new u21(fx0Var.F, wjbVar).f0(str, false);
                    return;
                } else {
                    fx0Var.dismiss();
                    return;
                }
            default:
                u41Var.setLoading(false);
                if (str != null) {
                    new u21(fx0Var.F, wjbVar).f0(str, false);
                    return;
                } else {
                    fx0Var.dismiss();
                    return;
                }
        }
    }
}
