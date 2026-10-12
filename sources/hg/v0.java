package hg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u61;
import org.telegram.ui.eo;
public final class v0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f11411a;
    public final w0 f11412b;

    public v0(w0 w0Var, int i10) {
        this.f11411a = i10;
        this.f11412b = w0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f11411a) {
            case 0:
                this.f11412b.X();
                return;
            default:
                this.f11412b.finishFragment();
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        u61 u61Var = (u61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w0 w0Var = this.f11412b;
        if (!w0Var.d.h(u61Var)) {
            int i10 = u61Var.d;
            if (i10 != 2 && u61Var.f16876a != 17) {
                if (i10 == 1) {
                    w0Var.f11426s = !w0Var.f11426s;
                    w0Var.f11421c.W2.N(true);
                    w0Var.V(true);
                    return;
                } else if (i10 == 3) {
                    b0 b0Var = w0Var.d;
                    w0Var.v = true;
                    b0Var.h = true;
                    w0Var.f11421c.W2.N(true);
                    w0Var.V(true);
                    return;
                } else if (i10 == 4) {
                    b0 b0Var2 = w0Var.d;
                    w0Var.v = false;
                    b0Var2.h = false;
                    w0Var.f11421c.W2.N(true);
                    w0Var.V(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", w0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            w0Var.presentFragment(new eo(bundle));
        }
    }
}
