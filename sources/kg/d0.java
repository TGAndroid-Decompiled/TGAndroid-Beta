package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.pj0;
public final class d0 extends kj0 {
    public final ArrayList f17334r;
    public final int f17335s;
    public final Context f17336w;
    public final g0 f17337x;

    public d0(g0 g0Var, Context context) {
        this.f17337x = g0Var;
        ArrayList arrayList = new ArrayList();
        this.f17334r = arrayList;
        int i7 = p10.f24459s0;
        this.f17335s = i7;
        this.f17336w = context;
        arrayList.addAll(t1.f(i7).e());
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        if (i7 != 0 && i7 != 2) {
            return this.f17334r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i7, int i10) {
        if (i7 != 0 && i10 >= 0) {
            ArrayList arrayList = this.f17334r;
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
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        if (i7 != 0 && i7 != 2 && i10 < this.f17334r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.d1 d1Var) {
        if (d1Var.f56931f == 0) {
            p1 p1Var = (p1) d1Var.f56927a;
            Object O = O(i7, i10);
            boolean z9 = true;
            if (i7 == 1 && i10 == M(i7) - 1) {
                z9 = false;
            }
            if (O instanceof s1) {
                s1 s1Var = (s1) O;
                p1Var.a(s1Var, null, z9);
                p1Var.d.a(this.f17337x.f17385x.contains(Integer.valueOf(s1Var.f17529a)), false);
            }
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.f17334r;
        arrayList.clear();
        arrayList.addAll(t1.f(this.f17335s).e());
        X(false);
        this.f17337x.P();
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View p1Var;
        Context context = this.f17336w;
        if (i7 != 0) {
            if (i7 != 1) {
                p1Var = new View(context);
                p1Var.setTag(-33024);
            } else {
                p1Var = new View(context);
                p1Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
                p1Var.setTag(-33024);
            }
        } else {
            p1Var = new p1(context, this.f17337x.f38950a, false);
        }
        return new v4.d1(p1Var);
    }
}
