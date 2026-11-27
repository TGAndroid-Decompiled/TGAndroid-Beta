package defpackage;

import android.content.Context;
public final class f56 extends ky8 {
    public final i56 t1;

    public f56(i56 i56Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.t1 = i56Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.t1.F = null;
    }
}
