package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.k10;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.zj0;
public final class e0 extends zj0 {
    public final ArrayList f18330r;
    public final int f18331s;
    public final Context f18332w;
    public final h0 f18333x;

    public e0(h0 h0Var, Context context) {
        this.f18333x = h0Var;
        ArrayList arrayList = new ArrayList();
        this.f18330r = arrayList;
        int i7 = k10.f24968t0;
        this.f18331s = i7;
        this.f18332w = context;
        arrayList.addAll(v1.f(i7).e());
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        if (i7 != 0 && i7 != 2) {
            return this.f18330r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i7, int i10) {
        if (i7 != 0 && i10 >= 0) {
            ArrayList arrayList = this.f18330r;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
        }
        return null;
    }

    @Override
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final int R() {
        return 3;
    }

    @Override
    public final View T(int i7, View view) {
        return null;
    }

    @Override
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        if (i7 != 0 && i7 != 2 && i10 < this.f18330r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.f1 f1Var) {
        if (f1Var.f59169f == 0) {
            r1 r1Var = (r1) f1Var.f59165a;
            Object O = O(i7, i10);
            boolean z10 = true;
            if (i7 == 1 && i10 == M(i7) - 1) {
                z10 = false;
            }
            if (O instanceof u1) {
                u1 u1Var = (u1) O;
                r1Var.a(u1Var, null, z10);
                r1Var.d.a(this.f18333x.f18367x.contains(Integer.valueOf(u1Var.f18533a)), false);
            }
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.f18330r;
        arrayList.clear();
        arrayList.addAll(v1.f(this.f18331s).e());
        X(false);
        this.f18333x.Q();
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View r1Var;
        Context context = this.f18332w;
        if (i7 != 0) {
            if (i7 != 1) {
                r1Var = new View(context);
                r1Var.setTag(-33024);
            } else {
                r1Var = new View(context);
                r1Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                r1Var.setTag(-33024);
            }
        } else {
            r1Var = new r1(context, this.f18333x.f37519a, false);
        }
        return new v4.f1(r1Var);
    }
}
