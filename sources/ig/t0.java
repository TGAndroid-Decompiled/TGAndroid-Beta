package ig;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.m61;
import org.telegram.ui.sn;
public final class t0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f13075a;
    public final u0 f13076b;

    public t0(u0 u0Var, int i10) {
        this.f13075a = i10;
        this.f13076b = u0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f13075a) {
            case 0:
                this.f13076b.X();
                return;
            default:
                this.f13076b.finishFragment();
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m61 m61Var = (m61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        u0 u0Var = this.f13076b;
        if (!u0Var.e.h(m61Var)) {
            int i10 = m61Var.d;
            if (i10 != 2 && m61Var.f44713a != 17) {
                if (i10 == 1) {
                    u0Var.v = !u0Var.v;
                    u0Var.d.Z2.N(true);
                    u0Var.V(true);
                    return;
                } else if (i10 == 3) {
                    a0 a0Var = u0Var.e;
                    u0Var.f13092w = true;
                    a0Var.h = true;
                    u0Var.d.Z2.N(true);
                    u0Var.V(true);
                    return;
                } else if (i10 == 4) {
                    a0 a0Var2 = u0Var.e;
                    u0Var.f13092w = false;
                    a0Var2.h = false;
                    u0Var.d.Z2.N(true);
                    u0Var.V(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", u0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            u0Var.presentFragment(new sn(bundle));
        }
    }
}
