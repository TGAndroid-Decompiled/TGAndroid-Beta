package lg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.tj0;
public final class e0 extends oj0 {
    public final ArrayList f18282r;
    public final int f18283s;
    public final Context f18284w;
    public final h0 f18285x;

    public e0(h0 h0Var, Context context) {
        this.f18285x = h0Var;
        ArrayList arrayList = new ArrayList();
        this.f18282r = arrayList;
        int i3 = h10.f22829t0;
        this.f18283s = i3;
        this.f18284w = context;
        arrayList.addAll(u1.f(i3).e());
    }

    @Override
    public final String F(int i3) {
        return null;
    }

    @Override
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i3) {
        if (i3 != 0 && i3 != 2) {
            return this.f18282r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i3, int i10) {
        if (i3 != 0 && i10 >= 0) {
            ArrayList arrayList = this.f18282r;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
        }
        return null;
    }

    @Override
    public final int P(int i3, int i10) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final int R() {
        return 3;
    }

    @Override
    public final View T(int i3, View view) {
        return null;
    }

    @Override
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        if (i3 != 0 && i3 != 2 && i10 < this.f18282r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i3, int i10, u4.d1 d1Var) {
        if (d1Var.f55544f == 0) {
            q1 q1Var = (q1) d1Var.f55540a;
            Object O = O(i3, i10);
            boolean z10 = true;
            if (i3 == 1 && i10 == M(i3) - 1) {
                z10 = false;
            }
            if (O instanceof t1) {
                t1 t1Var = (t1) O;
                q1Var.a(t1Var, null, z10);
                q1Var.d.a(this.f18285x.f18324x.contains(Integer.valueOf(t1Var.f18473a)), false);
            }
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.f18282r;
        arrayList.clear();
        arrayList.addAll(u1.f(this.f18283s).e());
        X(false);
        this.f18285x.P();
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View q1Var;
        Context context = this.f18284w;
        if (i3 != 0) {
            if (i3 != 1) {
                q1Var = new View(context);
                q1Var.setTag(-33024);
            } else {
                q1Var = new View(context);
                q1Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                q1Var.setTag(-33024);
            }
        } else {
            q1Var = new q1(context, this.f18285x.f38415a, false);
        }
        return new u4.d1(q1Var);
    }
}
