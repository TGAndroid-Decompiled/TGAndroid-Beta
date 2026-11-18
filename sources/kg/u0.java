package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.l41;
import org.telegram.ui.bn;
public final class u0 implements org.telegram.ui.ActionBar.r1, v10 {
    public final int f18494a;
    public final v0 f18495b;

    public u0(v0 v0Var, int i7) {
        this.f18494a = i7;
        this.f18495b = v0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f18494a) {
            case 0:
                this.f18495b.c0();
                return;
            default:
                this.f18495b.finishFragment();
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        v0 v0Var = this.f18495b;
        if (!v0Var.f18502c.h(l41Var)) {
            int i7 = l41Var.d;
            if (i7 != 2 && l41Var.f56589a != 17) {
                if (i7 == 1) {
                    v0Var.f18506r = !v0Var.f18506r;
                    v0Var.f18501b.f34607g3.O(true);
                    v0Var.a0(true);
                    return;
                } else if (i7 == 3) {
                    a0 a0Var = v0Var.f18502c;
                    v0Var.f18507s = true;
                    a0Var.h = true;
                    v0Var.f18501b.f34607g3.O(true);
                    v0Var.a0(true);
                    return;
                } else if (i7 == 4) {
                    a0 a0Var2 = v0Var.f18502c;
                    v0Var.f18507s = false;
                    a0Var2.h = false;
                    v0Var.f18501b.f34607g3.O(true);
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
