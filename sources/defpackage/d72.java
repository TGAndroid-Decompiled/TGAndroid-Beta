package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d72 extends c79 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final f72 f;

    public d72(f72 f72Var, Context context) {
        this.f = f72Var;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.size() + 2;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == b() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void f() {
        super.f();
        this.f.P();
    }

    @Override
    public final void t(defpackage.f89 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d72.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View v09Var;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                v09Var = new View(context);
                v09Var.setTag(-33024);
            } else {
                v09Var = new View(context);
                v09Var.setLayoutParams(new r79(-1, hl.L(56.0f)));
                v09Var.setTag(-33024);
            }
        } else {
            v09Var = new v09(this.f.a, context, false);
        }
        return new f89(v09Var);
    }
}
