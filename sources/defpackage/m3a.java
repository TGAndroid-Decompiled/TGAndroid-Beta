package defpackage;

import android.content.Context;
import android.text.TextUtils;
public final class m3a extends cw9 {
    public dn9 f;
    public final z3a h;

    public m3a(z3a z3aVar, Context context, x53 x53Var) {
        super(context, 13.0f, x53Var);
        this.h = z3aVar;
    }

    @Override
    public final void a(String str) {
        dn9 dn9Var = this.f;
        if (dn9Var != null) {
            hl.r(dn9Var);
        }
        this.f = new dn9(this, str, (byte) 22);
        boolean isEmpty = TextUtils.isEmpty(str);
        dn9 dn9Var2 = this.f;
        if (!isEmpty) {
            hl.d3(dn9Var2, 300L);
        } else {
            dn9Var2.run();
        }
        if (this.f != null) {
            z3a z3aVar = this.h;
            if (!z3aVar.R) {
                z3aVar.R = true;
                z3aVar.x.E();
                z3aVar.y.g1(0, -z3aVar.r.getPaddingTop());
            }
        }
    }
}
