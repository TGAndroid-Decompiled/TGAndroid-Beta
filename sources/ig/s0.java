package ig;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f61;
import org.telegram.ui.sn;
public final class s0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f13027a;
    public final t0 f13028b;

    public s0(t0 t0Var, int i10) {
        this.f13027a = i10;
        this.f13028b = t0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f13027a) {
            case 0:
                this.f13028b.X();
                return;
            default:
                this.f13028b.finishFragment();
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        f61 f61Var = (f61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        t0 t0Var = this.f13028b;
        if (!t0Var.d.h(f61Var)) {
            int i10 = f61Var.d;
            if (i10 != 2 && f61Var.f44314a != 17) {
                if (i10 == 1) {
                    t0Var.f13046s = !t0Var.f13046s;
                    t0Var.f13042c.W2.N(true);
                    t0Var.V(true);
                    return;
                } else if (i10 == 3) {
                    a0 a0Var = t0Var.d;
                    t0Var.v = true;
                    a0Var.h = true;
                    t0Var.f13042c.W2.N(true);
                    t0Var.V(true);
                    return;
                } else if (i10 == 4) {
                    a0 a0Var2 = t0Var.d;
                    t0Var.v = false;
                    a0Var2.h = false;
                    t0Var.f13042c.W2.N(true);
                    t0Var.V(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", t0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            t0Var.presentFragment(new sn(bundle));
        }
    }
}
