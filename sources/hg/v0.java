package hg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w51;
import org.telegram.ui.zn;
public final class v0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f10448a;
    public final w0 f10449b;

    public v0(w0 w0Var, int i10) {
        this.f10448a = i10;
        this.f10449b = w0Var;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f10448a) {
            case 0:
                this.f10449b.X();
                return;
            default:
                this.f10449b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w51 w51Var = (w51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w0 w0Var = this.f10449b;
        if (!w0Var.d.h(w51Var)) {
            int i10 = w51Var.d;
            if (i10 != 2 && w51Var.f15704a != 17) {
                if (i10 == 1) {
                    w0Var.f10466s = !w0Var.f10466s;
                    w0Var.f10462c.Y2.N(true);
                    w0Var.V(true);
                    return;
                } else if (i10 == 3) {
                    a0 a0Var = w0Var.d;
                    w0Var.v = true;
                    a0Var.h = true;
                    w0Var.f10462c.Y2.N(true);
                    w0Var.V(true);
                    return;
                } else if (i10 == 4) {
                    a0 a0Var2 = w0Var.d;
                    w0Var.v = false;
                    a0Var2.h = false;
                    w0Var.f10462c.Y2.N(true);
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
            w0Var.presentFragment(new zn(bundle));
        }
    }
}
