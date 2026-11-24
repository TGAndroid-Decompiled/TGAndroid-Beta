package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class m62 extends j39 {
    public final ArrayList r;
    public final int s;
    public final Context w;
    public final p62 x;

    public m62(p62 p62Var, Context context) {
        this.x = p62Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i = y6c.t0;
        this.s = i;
        this.w = context;
        arrayList.addAll(ox8.f(i).e());
    }

    @Override
    public final String F(int i) {
        return null;
    }

    @Override
    public final void G(o39 o39Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i) {
        if (i != 0 && i != 2) {
            return this.r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i, int i2) {
        if (i != 0 && i2 >= 0) {
            ArrayList arrayList = this.r;
            if (i2 < arrayList.size()) {
                return arrayList.get(i2);
            }
        }
        return null;
    }

    @Override
    public final View T(int i, View view) {
        return null;
    }

    @Override
    public final boolean V(int i, int i2, s49 s49Var) {
        if (i != 0 && i != 2 && i2 < this.r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i, int i2, s49 s49Var) {
        if (s49Var.f == 0) {
            jx8 jx8Var = (jx8) s49Var.a;
            Object O = O(i, i2);
            boolean z = true;
            if (i == 1 && i2 == M(i) - 1) {
                z = false;
            }
            if (O instanceof nx8) {
                nx8 nx8Var = (nx8) O;
                jx8Var.a(nx8Var, null, z);
                jx8Var.d.a(this.x.x.contains(Integer.valueOf(nx8Var.a)), false);
            }
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(ox8.f(this.s).e());
        X(false);
        this.x.Q();
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View jx8Var;
        Context context = this.w;
        if (i != 0) {
            if (i != 1) {
                jx8Var = new View(context);
                jx8Var.setTag(-33024);
            } else {
                jx8Var = new View(context);
                jx8Var.setLayoutParams(new e49(-1, gl.L(56.0f)));
                jx8Var.setTag(-33024);
            }
        } else {
            jx8Var = new jx8(this.x.a, context, false);
        }
        return new s49(jx8Var);
    }
}
