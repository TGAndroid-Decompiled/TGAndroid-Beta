package ag;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.e20;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.uk0;
public final class e1 extends pk0 {
    public final ArrayList f493r;
    public final int f494s;
    public final Context f495w;
    public final h1 f496x;

    public e1(h1 h1Var, Context context) {
        this.f496x = h1Var;
        ArrayList arrayList = new ArrayList();
        this.f493r = arrayList;
        int i10 = e20.f15506s0;
        this.f494s = i10;
        this.f495w = context;
        arrayList.addAll(i3.f(i10).e());
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 != 0 && i10 != 2) {
            return this.f493r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.f493r;
            if (i11 < arrayList.size()) {
                return arrayList.get(i11);
            }
        }
        return null;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final int R() {
        return 3;
    }

    @Override
    public final View T(int i10, View view) {
        return null;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 != 0 && i10 != 2 && i11 < this.f493r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        if (c1Var.f47912f == 0) {
            y2 y2Var = (y2) c1Var.f47909a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof h3) {
                h3 h3Var = (h3) O;
                y2Var.a(h3Var, null, z10);
                y2Var.d.a(this.f496x.f544x.contains(Integer.valueOf(h3Var.f551a)), false);
            }
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.f493r;
        arrayList.clear();
        arrayList.addAll(i3.f(this.f494s).e());
        X(false);
        this.f496x.O();
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View y2Var;
        Context context = this.f495w;
        if (i10 != 0) {
            if (i10 != 1) {
                y2Var = new View(context);
                y2Var.setTag(-33024);
            } else {
                y2Var = new View(context);
                y2Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
                y2Var.setTag(-33024);
            }
        } else {
            y2Var = new y2(context, this.f496x.f30963a, false);
        }
        return new s4.c1(y2Var);
    }
}
