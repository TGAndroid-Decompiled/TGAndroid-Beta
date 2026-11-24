package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class n62 extends n39 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final p62 f;

    public n62(p62 p62Var, Context context) {
        this.f = p62Var;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 0) {
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
        this.f.Q();
    }

    @Override
    public final void t(defpackage.s49 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n62.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View jx8Var;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                jx8Var = new View(context);
                jx8Var.setTag(-33024);
            } else {
                jx8Var = new View(context);
                jx8Var.setLayoutParams(new e49(-1, gl.L(56.0f)));
                jx8Var.setTag(-33024);
            }
        } else {
            jx8Var = new jx8(this.f.a, context, false);
        }
        return new s49(jx8Var);
    }
}
