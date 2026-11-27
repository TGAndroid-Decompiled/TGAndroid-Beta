package defpackage;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
public final class q55 implements fd, ncc {
    public final byte a;
    public final r55 b;

    public q55(r55 r55Var, byte b) {
        this.a = b;
        this.b = r55Var;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b8c b8cVar = (b8c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        r55 r55Var = this.b;
        if (!r55Var.c.h(b8cVar)) {
            int i = b8cVar.d;
            if (i != 2 && b8cVar.a != 17) {
                if (i == 1) {
                    r55Var.r = !r55Var.r;
                    r55Var.b.g3.O(true);
                    r55Var.Y(true);
                    return;
                } else if (i == 3) {
                    u41 u41Var = r55Var.c;
                    r55Var.s = true;
                    u41Var.h = true;
                    r55Var.b.g3.O(true);
                    r55Var.Y(true);
                    return;
                } else if (i == 4) {
                    u41 u41Var2 = r55Var.c;
                    r55Var.s = false;
                    u41Var2.h = false;
                    r55Var.b.g3.O(true);
                    r55Var.Y(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", r55Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            r55Var.presentFragment(new zu1(bundle));
        }
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        r55 r55Var = this.b;
        switch (b) {
            case 0:
                r55Var.b0();
                return;
            default:
                r55Var.finishFragment();
                return;
        }
    }
}
