package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.n41;
import org.telegram.ui.bn;
public final class t0 implements org.telegram.ui.ActionBar.q1, u10 {
    public final int f18577a;
    public final u0 f18578b;

    public t0(u0 u0Var, int i7) {
        this.f18577a = i7;
        this.f18578b = u0Var;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18577a) {
            case 0:
                this.f18578b.c0();
                return;
            default:
                this.f18578b.finishFragment();
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        n41 n41Var = (n41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        u0 u0Var = this.f18578b;
        if (!u0Var.f18587c.h(n41Var)) {
            int i7 = n41Var.d;
            if (i7 != 2 && n41Var.f56712a != 17) {
                if (i7 == 1) {
                    u0Var.f18591r = !u0Var.f18591r;
                    u0Var.f18586b.f35323g3.O(true);
                    u0Var.a0(true);
                    return;
                } else if (i7 == 3) {
                    b0 b0Var = u0Var.f18587c;
                    u0Var.f18592s = true;
                    b0Var.h = true;
                    u0Var.f18586b.f35323g3.O(true);
                    u0Var.a0(true);
                    return;
                } else if (i7 == 4) {
                    b0 b0Var2 = u0Var.f18587c;
                    u0Var.f18592s = false;
                    b0Var2.h = false;
                    u0Var.f18586b.f35323g3.O(true);
                    u0Var.a0(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", u0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            u0Var.presentFragment(new bn(bundle));
        }
    }
}
