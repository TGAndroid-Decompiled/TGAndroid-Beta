package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class z79 extends it3 {
    public final a89 F;

    public z79(a89 a89Var, Context context, wjb wjbVar) {
        super(context, "", true, false, 1024, wjbVar);
        this.F = a89Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z;
        a89 a89Var = this.F;
        u41 u41Var = a89Var.s;
        if (u41Var != null) {
            if (!a89Var.d.optional && TextUtils.isEmpty(a89Var.n.getText())) {
                z = false;
            } else {
                z = true;
            }
            u41Var.setEnabled(z);
        }
    }
}
