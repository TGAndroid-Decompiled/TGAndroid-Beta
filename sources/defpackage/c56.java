package defpackage;

import android.content.Context;
public final class c56 extends ax8 {
    public final f56 t1;

    public c56(f56 f56Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.t1 = f56Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.t1.F = null;
    }
}
