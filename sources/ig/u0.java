package ig;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h61;
import org.telegram.ui.qn;
public final class u0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f13046a;
    public final v0 f13047b;

    public u0(v0 v0Var, int i10) {
        this.f13046a = i10;
        this.f13047b = v0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f13046a) {
            case 0:
                this.f13047b.X();
                return;
            default:
                this.f13047b.finishFragment();
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h61 h61Var = (h61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        v0 v0Var = this.f13047b;
        if (!v0Var.d.h(h61Var)) {
            int i10 = h61Var.d;
            if (i10 != 2 && h61Var.f44296a != 17) {
                if (i10 == 1) {
                    v0Var.f13061s = !v0Var.f13061s;
                    v0Var.f13057c.W2.N(true);
                    v0Var.V(true);
                    return;
                } else if (i10 == 3) {
                    a0 a0Var = v0Var.d;
                    v0Var.v = true;
                    a0Var.h = true;
                    v0Var.f13057c.W2.N(true);
                    v0Var.V(true);
                    return;
                } else if (i10 == 4) {
                    a0 a0Var2 = v0Var.d;
                    v0Var.v = false;
                    a0Var2.h = false;
                    v0Var.f13057c.W2.N(true);
                    v0Var.V(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", v0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            v0Var.presentFragment(new qn(bundle));
        }
    }
}
