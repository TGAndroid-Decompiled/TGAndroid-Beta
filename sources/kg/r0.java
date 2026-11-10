package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.ui.Components.x31;
import org.telegram.ui.cn;
public final class r0 implements org.telegram.ui.ActionBar.r1, a20 {
    public final int f17521a;
    public final s0 f17522b;

    public r0(s0 s0Var, int i7) {
        this.f17521a = i7;
        this.f17522b = s0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f17521a) {
            case 0:
                this.f17522b.c0();
                return;
            default:
                this.f17522b.finishFragment();
                return;
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        x31 x31Var = (x31) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        s0 s0Var = this.f17522b;
        if (!s0Var.f17528c.h(x31Var)) {
            int i7 = x31Var.d;
            if (i7 != 2 && x31Var.f54543a != 17) {
                if (i7 == 1) {
                    s0Var.f17532r = !s0Var.f17532r;
                    s0Var.f17527b.f37496f3.O(true);
                    s0Var.a0(true);
                    return;
                } else if (i7 == 3) {
                    a0 a0Var = s0Var.f17528c;
                    s0Var.f17533s = true;
                    a0Var.h = true;
                    s0Var.f17527b.f37496f3.O(true);
                    s0Var.a0(true);
                    return;
                } else if (i7 == 4) {
                    a0 a0Var2 = s0Var.f17528c;
                    s0Var.f17533s = false;
                    a0Var2.h = false;
                    s0Var.f17527b.f37496f3.O(true);
                    s0Var.a0(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", s0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            s0Var.presentFragment(new cn(bundle));
        }
    }
}
