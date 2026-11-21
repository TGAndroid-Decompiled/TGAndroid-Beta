package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.o41;
import org.telegram.ui.bn;
public final class t0 implements org.telegram.ui.ActionBar.q1, v10 {
    public final int f18515a;
    public final u0 f18516b;

    public t0(u0 u0Var, int i7) {
        this.f18515a = i7;
        this.f18516b = u0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18515a) {
            case 0:
                this.f18516b.c0();
                return;
            default:
                this.f18516b.finishFragment();
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        o41 o41Var = (o41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        u0 u0Var = this.f18516b;
        if (!u0Var.f18523c.h(o41Var)) {
            int i7 = o41Var.d;
            if (i7 != 2 && o41Var.f56630a != 17) {
                if (i7 == 1) {
                    u0Var.f18527r = !u0Var.f18527r;
                    u0Var.f18522b.f35796g3.O(true);
                    u0Var.a0(true);
                    return;
                } else if (i7 == 3) {
                    b0 b0Var = u0Var.f18523c;
                    u0Var.f18528s = true;
                    b0Var.h = true;
                    u0Var.f18522b.f35796g3.O(true);
                    u0Var.a0(true);
                    return;
                } else if (i7 == 4) {
                    b0 b0Var2 = u0Var.f18523c;
                    u0Var.f18528s = false;
                    b0Var2.h = false;
                    u0Var.f18522b.f35796g3.O(true);
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
