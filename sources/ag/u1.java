package ag;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.o20;
import org.telegram.ui.Components.a51;
import org.telegram.ui.un;
public final class u1 implements org.telegram.ui.ActionBar.u1, o20 {
    public final int f740a;
    public final v1 f741b;

    public u1(v1 v1Var, int i10) {
        this.f740a = i10;
        this.f741b = v1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f740a) {
            case 0:
                this.f741b.b0();
                return;
            default:
                this.f741b.finishFragment();
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        a51 a51Var = (a51) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        v1 v1Var = this.f741b;
        if (!v1Var.f750c.h(a51Var)) {
            int i10 = a51Var.d;
            if (i10 != 2 && a51Var.f7680a != 17) {
                if (i10 == 1) {
                    v1Var.f753r = !v1Var.f753r;
                    v1Var.f749b.f30819f3.O(true);
                    v1Var.Z(true);
                    return;
                } else if (i10 == 3) {
                    x0 x0Var = v1Var.f750c;
                    v1Var.f754s = true;
                    x0Var.h = true;
                    v1Var.f749b.f30819f3.O(true);
                    v1Var.Z(true);
                    return;
                } else if (i10 == 4) {
                    x0 x0Var2 = v1Var.f750c;
                    v1Var.f754s = false;
                    x0Var2.h = false;
                    v1Var.f749b.f30819f3.O(true);
                    v1Var.Z(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", v1Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            v1Var.presentFragment(new un(bundle));
        }
    }
}
