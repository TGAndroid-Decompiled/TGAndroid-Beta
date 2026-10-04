package hg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g61;
import org.telegram.ui.yn;
public final class v0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f11366a;
    public final w0 f11367b;

    public v0(w0 w0Var, int i10) {
        this.f11366a = i10;
        this.f11367b = w0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f11366a) {
            case 0:
                this.f11367b.W();
                return;
            default:
                this.f11367b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        g61 g61Var = (g61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w0 w0Var = this.f11367b;
        if (!w0Var.d.h(g61Var)) {
            int i10 = g61Var.d;
            if (i10 != 2 && g61Var.f17187a != 17) {
                if (i10 == 1) {
                    w0Var.f11384s = !w0Var.f11384s;
                    w0Var.f11379c.f25250f3.N(true);
                    w0Var.T(true);
                    return;
                } else if (i10 == 3) {
                    b0 b0Var = w0Var.d;
                    w0Var.v = true;
                    b0Var.h = true;
                    w0Var.f11379c.f25250f3.N(true);
                    w0Var.T(true);
                    return;
                } else if (i10 == 4) {
                    b0 b0Var2 = w0Var.d;
                    w0Var.v = false;
                    b0Var2.h = false;
                    w0Var.f11379c.f25250f3.N(true);
                    w0Var.T(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", w0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            w0Var.presentFragment(new yn(bundle));
        }
    }
}
