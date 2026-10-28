package jg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u61;
import org.telegram.ui.wn;
public final class u0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final int f15860a;
    public final v0 f15861b;

    public u0(v0 v0Var, int i10) {
        this.f15860a = i10;
        this.f15861b = v0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f15860a) {
            case 0:
                this.f15861b.Y();
                return;
            default:
                this.f15861b.finishFragment();
                return;
        }
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        u61 u61Var = (u61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        v0 v0Var = this.f15861b;
        if (!v0Var.f15867c.h(u61Var)) {
            int i10 = u61Var.d;
            if (i10 != 2 && u61Var.f47075a != 17) {
                if (i10 == 1) {
                    v0Var.f15870r = !v0Var.f15870r;
                    v0Var.f15866b.f32504g3.O(true);
                    v0Var.W(true);
                    return;
                } else if (i10 == 3) {
                    b0 b0Var = v0Var.f15867c;
                    v0Var.f15871s = true;
                    b0Var.h = true;
                    v0Var.f15866b.f32504g3.O(true);
                    v0Var.W(true);
                    return;
                } else if (i10 == 4) {
                    b0 b0Var2 = v0Var.f15867c;
                    v0Var.f15871s = false;
                    b0Var2.h = false;
                    v0Var.f15866b.f32504g3.O(true);
                    v0Var.W(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", v0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            v0Var.presentFragment(new wn(bundle));
        }
    }
}
