package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.o40;
public final class u7 extends c5.a {
    public final Context f9838c;
    public final q9 d;
    public final org.telegram.ui.ActionBar.h6 f9839e;
    public final w f9840f;

    public u7(w wVar, Context context, q9 q9Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f9840f = wVar;
        this.f9838c = context;
        this.d = q9Var;
        this.f9839e = h6Var;
    }

    @Override
    public final void a(c5.k kVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        kVar.removeView(frameLayout);
        j4 j4Var = (j4) frameLayout.getChildAt(0);
        org.telegram.messenger.g0.E2(j4Var);
        this.f9840f.P0.add(j4Var);
    }

    @Override
    public final int b() {
        w wVar = this.f9840f;
        ArrayList arrayList = wVar.f9941x0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return wVar.A0.size();
    }

    @Override
    public final Object e(c5.k kVar, int i7) {
        j4 t7Var;
        long B0;
        Context context = this.f9838c;
        w wVar = this.f9840f;
        w7 w7Var = new w7(wVar, context);
        ArrayList arrayList = wVar.P0;
        boolean isEmpty = arrayList.isEmpty();
        q9 q9Var = this.d;
        if (!isEmpty) {
            t7Var = (j4) arrayList.remove(0);
            t7Var.X0.f8990a.getImageReceiver().O0(true, true);
            if (t7Var.N1 != null) {
                t7Var.K1.P0();
                t7Var.K1.setAlpha(1.0f - t7Var.N3);
            }
            ii0 ii0Var = t7Var.O1;
            if (ii0Var != null) {
                ii0Var.n();
            }
            ii0 ii0Var2 = t7Var.f9169a3;
            if (ii0Var2 != null) {
                ii0Var2.n();
            }
            o40 o40Var = t7Var.f9231s2;
            if (o40Var != null) {
                org.telegram.messenger.g0.E2(o40Var);
                t7Var.f9231s2.d(true);
                t7Var.f9231s2 = null;
            }
            t7Var.setActive(false);
            t7Var.setIsVisible(false);
            t7Var.f9239u2 = false;
            t7Var.f9251x2.e(false, 0.0f);
            t7Var.U0 = null;
            t7Var.R2 = false;
            t7Var.n0();
        } else {
            t7Var = new t7(this, this.f9838c, q9Var, wVar.H0, this.f9839e);
        }
        w7Var.f9906a = t7Var;
        t7Var.setAccount(wVar.f9942y0);
        t7Var.setDelegate(wVar.B0);
        t7Var.setLongpressed(q9Var.Z0);
        w7Var.setTag(Integer.valueOf(i7));
        ArrayList arrayList2 = wVar.f9941x0;
        if (arrayList2 != null) {
            if (q9Var.Q0) {
                i7 = (arrayList2.size() - 1) - i7;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i7);
            w7Var.f9908c = arrayList3;
            r6 r6Var = q9Var.N0;
            if (!(r6Var instanceof l6) && !(r6Var instanceof u6)) {
                w7Var.f9907b = wVar.f9940w0;
            } else {
                ij f10 = r6Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f10 == null) {
                    B0 = wVar.f9940w0;
                } else {
                    B0 = ij.B0(f10.f23266k);
                }
                w7Var.f9907b = B0;
            }
        } else {
            w7Var.f9908c = null;
            w7Var.f9907b = ((Long) wVar.A0.get(i7)).longValue();
        }
        w7Var.addView(t7Var);
        t7Var.requestLayout();
        kVar.addView(w7Var);
        return w7Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
