package hg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.x51;
import org.telegram.ui.xn;
public final class v0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final int f10435a;
    public final w0 f10436b;

    public v0(w0 w0Var, int i10) {
        this.f10435a = i10;
        this.f10436b = w0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f10435a) {
            case 0:
                this.f10436b.X();
                return;
            default:
                this.f10436b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x51 x51Var = (x51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w0 w0Var = this.f10436b;
        if (!w0Var.d.h(x51Var)) {
            int i10 = x51Var.d;
            if (i10 != 2 && x51Var.f15754a != 17) {
                if (i10 == 1) {
                    w0Var.f10453s = !w0Var.f10453s;
                    w0Var.f10449c.Y2.N(true);
                    w0Var.V(true);
                    return;
                } else if (i10 == 3) {
                    a0 a0Var = w0Var.d;
                    w0Var.v = true;
                    a0Var.h = true;
                    w0Var.f10449c.Y2.N(true);
                    w0Var.V(true);
                    return;
                } else if (i10 == 4) {
                    a0 a0Var2 = w0Var.d;
                    w0Var.v = false;
                    a0Var2.h = false;
                    w0Var.f10449c.Y2.N(true);
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
            w0Var.presentFragment(new xn(bundle));
        }
    }
}
