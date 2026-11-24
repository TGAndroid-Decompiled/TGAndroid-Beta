package defpackage;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
public final class m35 implements ed, n8c {
    public final byte a;
    public final o35 b;

    public m35(o35 o35Var, byte b) {
        this.a = b;
        this.b = o35Var;
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c4c c4cVar = (c4c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        o35 o35Var = this.b;
        if (!o35Var.c.h(c4cVar)) {
            int i = c4cVar.d;
            if (i != 2 && c4cVar.a != 17) {
                if (i == 1) {
                    o35Var.r = !o35Var.r;
                    o35Var.b.g3.O(true);
                    o35Var.Y(true);
                    return;
                } else if (i == 3) {
                    m41 m41Var = o35Var.c;
                    o35Var.s = true;
                    m41Var.h = true;
                    o35Var.b.g3.O(true);
                    o35Var.Y(true);
                    return;
                } else if (i == 4) {
                    m41 m41Var2 = o35Var.c;
                    o35Var.s = false;
                    m41Var2.h = false;
                    o35Var.b.g3.O(true);
                    o35Var.Y(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", o35Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            o35Var.presentFragment(new mu1(bundle));
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        o35 o35Var = this.b;
        switch (b) {
            case 0:
                o35Var.b0();
                return;
            default:
                o35Var.finishFragment();
                return;
        }
    }
}
