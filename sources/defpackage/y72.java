package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class y72 extends q59 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final a82 f;

    public y72(a82 a82Var, Context context) {
        this.f = a82Var;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 0) {
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
    public final void t(defpackage.u69 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y72.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View kz8Var;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                kz8Var = new View(context);
                kz8Var.setTag(-33024);
            } else {
                kz8Var = new View(context);
                kz8Var.setLayoutParams(new g69(-1, gm.L(56.0f)));
                kz8Var.setTag(-33024);
            }
        } else {
            kz8Var = new kz8(this.f.a, context, false);
        }
        return new u69(kz8Var);
    }
}
