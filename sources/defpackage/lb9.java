package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class lb9 extends zt3 {
    public final mb9 F;

    public lb9(mb9 mb9Var, Context context, vnb vnbVar) {
        super(context, "", true, false, 1024, vnbVar);
        this.F = mb9Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z;
        mb9 mb9Var = this.F;
        c51 c51Var = mb9Var.s;
        if (c51Var != null) {
            if (!mb9Var.d.optional && TextUtils.isEmpty(mb9Var.n.getText())) {
                z = false;
            } else {
                z = true;
            }
            c51Var.setEnabled(z);
        }
    }
}
