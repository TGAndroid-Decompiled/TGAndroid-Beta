package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.uj0;
public final class d0 extends pj0 {
    public final ArrayList f17896r;
    public final int f17897s;
    public final Context f17898w;
    public final g0 f17899x;

    public d0(g0 g0Var, Context context) {
        this.f17899x = g0Var;
        ArrayList arrayList = new ArrayList();
        this.f17896r = arrayList;
        int i7 = m10.f24934t0;
        this.f17897s = i7;
        this.f17898w = context;
        arrayList.addAll(v1.f(i7).e());
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        if (i7 != 0 && i7 != 2) {
            return this.f17896r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i7, int i10) {
        if (i7 != 0 && i10 >= 0) {
            ArrayList arrayList = this.f17896r;
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
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        if (i7 != 0 && i7 != 2 && i10 < this.f17896r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.e1 e1Var) {
        if (e1Var.f58539f == 0) {
            q1 q1Var = (q1) e1Var.f58535a;
            Object O = O(i7, i10);
            boolean z10 = true;
            if (i7 == 1 && i10 == M(i7) - 1) {
                z10 = false;
            }
            if (O instanceof u1) {
                u1 u1Var = (u1) O;
                q1Var.a(u1Var, null, z10);
                q1Var.d.a(this.f17899x.f17947x.contains(Integer.valueOf(u1Var.f18113a)), false);
            }
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.f17896r;
        arrayList.clear();
        arrayList.addAll(v1.f(this.f17897s).e());
        X(false);
        this.f17899x.Q();
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View q1Var;
        Context context = this.f17898w;
        if (i7 != 0) {
            if (i7 != 1) {
                q1Var = new View(context);
                q1Var.setTag(-33024);
            } else {
                q1Var = new View(context);
                q1Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                q1Var.setTag(-33024);
            }
        } else {
            q1Var = new q1(context, this.f17899x.f33606a, false);
        }
        return new v4.e1(q1Var);
    }
}
