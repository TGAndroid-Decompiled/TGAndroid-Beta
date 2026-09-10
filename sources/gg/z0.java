package gg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.v51;
import org.telegram.ui.eo;
public final class z0 implements org.telegram.ui.ActionBar.c2, Utilities.Callback5 {
    public final int f9103a;
    public final a1 f9104b;

    public z0(a1 a1Var, int i10) {
        this.f9103a = i10;
        this.f9104b = a1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f9103a) {
            case 0:
                this.f9104b.X();
                return;
            default:
                this.f9104b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v51 v51Var = (v51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        a1 a1Var = this.f9104b;
        if (!a1Var.d.h(v51Var)) {
            int i10 = v51Var.d;
            if (i10 != 2 && v51Var.f14046a != 17) {
                if (i10 == 1) {
                    a1Var.f8808s = !a1Var.f8808s;
                    a1Var.f8804c.Y2.N(true);
                    a1Var.V(true);
                    return;
                } else if (i10 == 3) {
                    e0 e0Var = a1Var.d;
                    a1Var.v = true;
                    e0Var.h = true;
                    a1Var.f8804c.Y2.N(true);
                    a1Var.V(true);
                    return;
                } else if (i10 == 4) {
                    e0 e0Var2 = a1Var.d;
                    a1Var.v = false;
                    e0Var2.h = false;
                    a1Var.f8804c.Y2.N(true);
                    a1Var.V(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", a1Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            a1Var.presentFragment(new eo(bundle));
        }
    }
}
