package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.o41;
import org.telegram.ui.bn;
public final class t0 implements org.telegram.ui.ActionBar.q1, w10 {
    public final int f18518a;
    public final u0 f18519b;

    public t0(u0 u0Var, int i7) {
        this.f18518a = i7;
        this.f18519b = u0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18518a) {
            case 0:
                this.f18519b.c0();
                return;
            default:
                this.f18519b.finishFragment();
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
        u0 u0Var = this.f18519b;
        if (!u0Var.f18526c.h(o41Var)) {
            int i7 = o41Var.d;
            if (i7 != 2 && o41Var.f56634a != 17) {
                if (i7 == 1) {
                    u0Var.f18530r = !u0Var.f18530r;
                    u0Var.f18525b.f35790g3.O(true);
                    u0Var.a0(true);
                    return;
                } else if (i7 == 3) {
                    b0 b0Var = u0Var.f18526c;
                    u0Var.f18531s = true;
                    b0Var.h = true;
                    u0Var.f18525b.f35790g3.O(true);
                    u0Var.a0(true);
                    return;
                } else if (i7 == 4) {
                    b0 b0Var2 = u0Var.f18526c;
                    u0Var.f18531s = false;
                    b0Var2.h = false;
                    u0Var.f18525b.f35790g3.O(true);
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
