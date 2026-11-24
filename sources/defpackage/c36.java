package defpackage;

import android.content.Context;
public final class c36 extends zu8 {
    public final f36 t1;

    public c36(f36 f36Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.t1 = f36Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.t1.F = null;
    }
}
