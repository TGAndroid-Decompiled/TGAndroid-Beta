package hg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
import org.telegram.ui.xn;
public final class w0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f10439a;
    public final x0 f10440b;

    public w0(x0 x0Var, int i10) {
        this.f10439a = i10;
        this.f10440b = x0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f10439a) {
            case 0:
                this.f10440b.X();
                return;
            default:
                this.f10440b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        x0 x0Var = this.f10440b;
        if (!x0Var.d.h(h51Var)) {
            int i10 = h51Var.d;
            if (i10 != 2 && h51Var.f15508a != 17) {
                if (i10 == 1) {
                    x0Var.f10454s = !x0Var.f10454s;
                    x0Var.f10450c.Y2.N(true);
                    x0Var.V(true);
                    return;
                } else if (i10 == 3) {
                    c0 c0Var = x0Var.d;
                    x0Var.v = true;
                    c0Var.h = true;
                    x0Var.f10450c.Y2.N(true);
                    x0Var.V(true);
                    return;
                } else if (i10 == 4) {
                    c0 c0Var2 = x0Var.d;
                    x0Var.v = false;
                    c0Var2.h = false;
                    x0Var.f10450c.Y2.N(true);
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
            x0Var.presentFragment(new xn(bundle));
        }
    }
}
