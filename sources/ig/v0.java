package ig;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l61;
import org.telegram.ui.fo;
public final class v0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f11662a;
    public final w0 f11663b;

    public v0(w0 w0Var, int i10) {
        this.f11662a = i10;
        this.f11663b = w0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f11662a) {
            case 0:
                this.f11663b.X();
                return;
            default:
                this.f11663b.finishFragment();
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        l61 l61Var = (l61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w0 w0Var = this.f11663b;
        if (!w0Var.d.h(l61Var)) {
            int i10 = l61Var.d;
            if (i10 != 2 && l61Var.f43203a != 17) {
                if (i10 == 1) {
                    w0Var.f11680s = !w0Var.f11680s;
                    w0Var.f11676c.W2.N(true);
                    w0Var.V(true);
                    return;
                } else if (i10 == 3) {
                    a0 a0Var = w0Var.d;
                    w0Var.v = true;
                    a0Var.h = true;
                    w0Var.f11676c.W2.N(true);
                    w0Var.V(true);
                    return;
                } else if (i10 == 4) {
                    a0 a0Var2 = w0Var.d;
                    w0Var.v = false;
                    a0Var2.h = false;
                    w0Var.f11676c.W2.N(true);
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
            w0Var.presentFragment(new fo(bundle));
        }
    }
}
