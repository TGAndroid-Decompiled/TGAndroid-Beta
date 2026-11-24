package defpackage;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
public final class m55 implements ee, oac {
    public final byte a;
    public final n55 b;

    public m55(n55 n55Var, byte b) {
        this.a = b;
        this.b = n55Var;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c6c c6cVar = (c6c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        n55 n55Var = this.b;
        if (!n55Var.c.h(c6cVar)) {
            int i = c6cVar.d;
            if (i != 2 && c6cVar.a != 17) {
                if (i == 1) {
                    n55Var.r = !n55Var.r;
                    n55Var.b.g3.O(true);
                    n55Var.Z(true);
                    return;
                } else if (i == 3) {
                    t51 t51Var = n55Var.c;
                    n55Var.s = true;
                    t51Var.h = true;
                    n55Var.b.g3.O(true);
                    n55Var.Z(true);
                    return;
                } else if (i == 4) {
                    t51 t51Var2 = n55Var.c;
                    n55Var.s = false;
                    t51Var2.h = false;
                    n55Var.b.g3.O(true);
                    n55Var.Z(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", n55Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            n55Var.presentFragment(new yv1(bundle));
        }
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        n55 n55Var = this.b;
        switch (b) {
            case 0:
                n55Var.c0();
                return;
            default:
                n55Var.finishFragment();
                return;
        }
    }
}
