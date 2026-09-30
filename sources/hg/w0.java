package hg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.y51;
import org.telegram.ui.wn;
public final class w0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f10453a;
    public final x0 f10454b;

    public w0(x0 x0Var, int i10) {
        this.f10453a = i10;
        this.f10454b = x0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f10453a) {
            case 0:
                this.f10454b.X();
                return;
            default:
                this.f10454b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        y51 y51Var = (y51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        x0 x0Var = this.f10454b;
        if (!x0Var.d.h(y51Var)) {
            int i10 = y51Var.d;
            if (i10 != 2 && y51Var.f15731a != 17) {
                if (i10 == 1) {
                    x0Var.f10468s = !x0Var.f10468s;
                    x0Var.f10464c.f28778f3.N(true);
                    x0Var.V(true);
                    return;
                } else if (i10 == 3) {
                    c0 c0Var = x0Var.d;
                    x0Var.v = true;
                    c0Var.h = true;
                    x0Var.f10464c.f28778f3.N(true);
                    x0Var.V(true);
                    return;
                } else if (i10 == 4) {
                    c0 c0Var2 = x0Var.d;
                    x0Var.v = false;
                    c0Var2.h = false;
                    x0Var.f10464c.f28778f3.N(true);
                    x0Var.V(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", x0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            x0Var.presentFragment(new wn(bundle));
        }
    }
}
