package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c72 extends y69 {
    public final ArrayList r;
    public final int s;
    public final Context w;
    public final f72 x;

    public c72(f72 f72Var, Context context) {
        this.x = f72Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i = yac.t0;
        this.s = i;
        this.w = context;
        arrayList.addAll(b19.f(i).e());
    }

    @Override
    public final String F(int i) {
        return null;
    }

    @Override
    public final void G(d79 d79Var, float f, int[] iArr) {
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
    public final boolean V(int i, int i2, f89 f89Var) {
        if (i != 0 && i != 2 && i2 < this.r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i, int i2, f89 f89Var) {
        if (f89Var.f == 0) {
            v09 v09Var = (v09) f89Var.a;
            Object O = O(i, i2);
            boolean z = true;
            if (i == 1 && i2 == M(i) - 1) {
                z = false;
            }
            if (O instanceof a19) {
                a19 a19Var = (a19) O;
                v09Var.a(a19Var, null, z);
                v09Var.d.a(this.x.x.contains(Integer.valueOf(a19Var.a)), false);
            }
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(b19.f(this.s).e());
        X(false);
        this.x.P();
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View v09Var;
        Context context = this.w;
        if (i != 0) {
            if (i != 1) {
                v09Var = new View(context);
                v09Var.setTag(-33024);
            } else {
                v09Var = new View(context);
                v09Var.setLayoutParams(new r79(-1, hl.L(56.0f)));
                v09Var.setTag(-33024);
            }
        } else {
            v09Var = new v09(this.x.a, context, false);
        }
        return new f89(v09Var);
    }
}
