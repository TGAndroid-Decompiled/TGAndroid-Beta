package lg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.r31;
import org.telegram.ui.wm;
public final class s0 implements org.telegram.ui.ActionBar.p1, s10 {
    public final int f18454a;
    public final t0 f18455b;

    public s0(t0 t0Var, int i3) {
        this.f18454a = i3;
        this.f18455b = t0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f18454a) {
            case 0:
                this.f18455b.c0();
                return;
            default:
                this.f18455b.finishFragment();
                return;
        }
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        r31 r31Var = (r31) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        t0 t0Var = this.f18455b;
        if (!t0Var.f18466c.h(r31Var)) {
            int i3 = r31Var.d;
            if (i3 != 2 && r31Var.f54715a != 17) {
                if (i3 == 1) {
                    t0Var.f18470r = !t0Var.f18470r;
                    t0Var.f18465b.f35594g3.O(true);
                    t0Var.a0(true);
                    return;
                } else if (i3 == 3) {
                    b0 b0Var = t0Var.f18466c;
                    t0Var.f18471s = true;
                    b0Var.h = true;
                    t0Var.f18465b.f35594g3.O(true);
                    t0Var.a0(true);
                    return;
                } else if (i3 == 4) {
                    b0 b0Var2 = t0Var.f18466c;
                    t0Var.f18471s = false;
                    b0Var2.h = false;
                    t0Var.f18465b.f35594g3.O(true);
                    t0Var.a0(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", t0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            t0Var.presentFragment(new wm(bundle));
        }
    }
}
