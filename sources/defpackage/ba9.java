package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class ba9 extends su3 {
    public final ca9 F;

    public ba9(ca9 ca9Var, Context context, ylb ylbVar) {
        super(context, "", true, false, 1024, ylbVar);
        this.F = ca9Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z;
        ca9 ca9Var = this.F;
        b61 b61Var = ca9Var.s;
        if (b61Var != null) {
            if (!ca9Var.d.optional && TextUtils.isEmpty(ca9Var.n.getText())) {
                z = false;
            } else {
                z = true;
            }
            b61Var.setEnabled(z);
        }
    }
}
