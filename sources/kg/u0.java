package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.o41;
import org.telegram.ui.bn;
public final class u0 implements org.telegram.ui.ActionBar.q1, w10 {
    public final int f18490a;
    public final v0 f18491b;

    public u0(v0 v0Var, int i7) {
        this.f18490a = i7;
        this.f18491b = v0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18490a) {
            case 0:
                this.f18491b.c0();
                return;
            default:
                this.f18491b.finishFragment();
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
        v0 v0Var = this.f18491b;
        if (!v0Var.f18498c.h(o41Var)) {
            int i7 = o41Var.d;
            if (i7 != 2 && o41Var.f56599a != 17) {
                if (i7 == 1) {
                    v0Var.f18502r = !v0Var.f18502r;
                    v0Var.f18497b.f35742g3.O(true);
                    v0Var.a0(true);
                    return;
                } else if (i7 == 3) {
                    b0 b0Var = v0Var.f18498c;
                    v0Var.f18503s = true;
                    b0Var.h = true;
                    v0Var.f18497b.f35742g3.O(true);
                    v0Var.a0(true);
                    return;
                } else if (i7 == 4) {
                    b0 b0Var2 = v0Var.f18498c;
                    v0Var.f18503s = false;
                    b0Var2.h = false;
                    v0Var.f18497b.f35742g3.O(true);
                    v0Var.a0(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", v0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            v0Var.presentFragment(new bn(bundle));
        }
    }
}
