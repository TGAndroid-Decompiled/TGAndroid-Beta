package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.j10;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.xj0;
public final class d0 extends xj0 {
    public final ArrayList f18275r;
    public final int f18276s;
    public final Context f18277w;
    public final g0 f18278x;

    public d0(g0 g0Var, Context context) {
        this.f18278x = g0Var;
        ArrayList arrayList = new ArrayList();
        this.f18275r = arrayList;
        int i7 = j10.f24773t0;
        this.f18276s = i7;
        this.f18277w = context;
        arrayList.addAll(w1.f(i7).e());
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        if (i7 != 0 && i7 != 2) {
            return this.f18275r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i7, int i10) {
        if (i7 != 0 && i10 >= 0) {
            ArrayList arrayList = this.f18275r;
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
        if (i7 != 0 && i7 != 2 && i10 < this.f18275r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.f1 f1Var) {
        if (f1Var.f59126f == 0) {
            s1 s1Var = (s1) f1Var.f59122a;
            Object O = O(i7, i10);
            boolean z10 = true;
            if (i7 == 1 && i10 == M(i7) - 1) {
                z10 = false;
            }
            if (O instanceof v1) {
                v1 v1Var = (v1) O;
                s1Var.a(v1Var, null, z10);
                s1Var.d.a(this.f18278x.f18324x.contains(Integer.valueOf(v1Var.f18509a)), false);
            }
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.f18275r;
        arrayList.clear();
        arrayList.addAll(w1.f(this.f18276s).e());
        X(false);
        this.f18278x.Q();
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View s1Var;
        Context context = this.f18277w;
        if (i7 != 0) {
            if (i7 != 1) {
                s1Var = new View(context);
                s1Var.setTag(-33024);
            } else {
                s1Var = new View(context);
                s1Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                s1Var.setTag(-33024);
            }
        } else {
            s1Var = new s1(context, this.f18278x.f36765a, false);
        }
        return new v4.f1(s1Var);
    }
}
