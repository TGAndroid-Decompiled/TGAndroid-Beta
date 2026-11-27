package defpackage;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
public final class em7 extends v79 {
    public final int a;
    public final im7 b;
    public final jm7 c;
    public final lm7 d;

    public em7(lm7 lm7Var, int i, im7 im7Var, jm7 jm7Var) {
        this.d = lm7Var;
        this.a = i;
        this.b = im7Var;
        this.c = jm7Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 1) {
            lm7 lm7Var = this.d;
            fm7[] fm7VarArr = lm7Var.X;
            int i2 = this.a;
            fm7VarArr[i2] = null;
            if (i2 != 2) {
                if (lm7Var.M && TextUtils.isEmpty(lm7Var.Q)) {
                    lm7Var.j0();
                }
            } else if (lm7Var.getParentActivity() != null) {
                hl.t1(lm7Var.getParentActivity().getCurrentFocus());
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        lm7 lm7Var = this.d;
        int i3 = this.a;
        if (i3 != 2) {
            lm7Var.P0();
        }
        jm7 jm7Var = this.c;
        if (i2 >= 0) {
            im7 im7Var = this.b;
            if (im7Var.f3.M0() >= im7Var.g3.E.size() - 5 && !jm7Var.n) {
                lm7Var.y0(i3, false);
            }
        }
        if (i3 == 1) {
            lm7Var.z0(jm7Var);
        }
        lm7Var.O0(i3);
    }
}
