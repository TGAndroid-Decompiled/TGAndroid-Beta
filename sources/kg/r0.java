package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.b41;
import org.telegram.ui.an;
public final class r0 implements org.telegram.ui.ActionBar.q1, x10 {
    public final int f18079a;
    public final s0 f18080b;

    public r0(s0 s0Var, int i7) {
        this.f18079a = i7;
        this.f18080b = s0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18079a) {
            case 0:
                this.f18080b.c0();
                return;
            default:
                this.f18080b.finishFragment();
                return;
        }
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b41 b41Var = (b41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        s0 s0Var = this.f18080b;
        if (!s0Var.f18088c.h(b41Var)) {
            int i7 = b41Var.d;
            if (i7 != 2 && b41Var.f56015a != 17) {
                if (i7 == 1) {
                    s0Var.f18092r = !s0Var.f18092r;
                    s0Var.f18087b.f39895g3.O(true);
                    s0Var.a0(true);
                    return;
                } else if (i7 == 3) {
                    a0 a0Var = s0Var.f18088c;
                    s0Var.f18093s = true;
                    a0Var.h = true;
                    s0Var.f18087b.f39895g3.O(true);
                    s0Var.a0(true);
                    return;
                } else if (i7 == 4) {
                    a0 a0Var2 = s0Var.f18088c;
                    s0Var.f18093s = false;
                    a0Var2.h = false;
                    s0Var.f18087b.f39895g3.O(true);
                    s0Var.a0(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", s0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            s0Var.presentFragment(new an(bundle));
        }
    }
}
