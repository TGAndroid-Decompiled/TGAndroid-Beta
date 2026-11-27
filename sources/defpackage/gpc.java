package defpackage;

import android.text.TextUtils;
public final class gpc implements pcc {
    public final byte a;
    public final c51 b;
    public final nx0 c;
    public final vnb d;

    public gpc(c51 c51Var, nx0 nx0Var, vnb vnbVar, byte b) {
        this.a = b;
        this.b = c51Var;
        this.c = nx0Var;
        this.d = vnbVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        vnb vnbVar = this.d;
        nx0 nx0Var = this.c;
        c51 c51Var = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                c51Var.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    new d31(nx0Var.F, vnbVar).f0(str, false);
                    return;
                } else {
                    nx0Var.dismiss();
                    return;
                }
            default:
                c51Var.setLoading(false);
                if (str != null) {
                    new d31(nx0Var.F, vnbVar).f0(str, false);
                    return;
                } else {
                    nx0Var.dismiss();
                    return;
                }
        }
    }
}
