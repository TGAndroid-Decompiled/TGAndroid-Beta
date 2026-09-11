package ig;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
import org.telegram.ui.co;
public final class v0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f12244a;
    public final w0 f12245b;

    public v0(w0 w0Var, int i10) {
        this.f12244a = i10;
        this.f12245b = w0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f12244a) {
            case 0:
                this.f12245b.X();
                return;
            default:
                this.f12245b.finishFragment();
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
        w0 w0Var = this.f12245b;
        if (!w0Var.d.h(h51Var)) {
            int i10 = h51Var.d;
            if (i10 != 2 && h51Var.f44071a != 17) {
                if (i10 == 1) {
                    w0Var.f12264s = !w0Var.f12264s;
                    w0Var.f12259c.Y2.N(true);
                    w0Var.V(true);
                    return;
                } else if (i10 == 3) {
                    a0 a0Var = w0Var.d;
                    w0Var.v = true;
                    a0Var.h = true;
                    w0Var.f12259c.Y2.N(true);
                    w0Var.V(true);
                    return;
                } else if (i10 == 4) {
                    a0 a0Var2 = w0Var.d;
                    w0Var.v = false;
                    a0Var2.h = false;
                    w0Var.f12259c.Y2.N(true);
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
            w0Var.presentFragment(new co(bundle));
        }
    }
}
