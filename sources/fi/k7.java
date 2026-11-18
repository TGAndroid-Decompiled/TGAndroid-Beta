package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.z40;
public final class k7 extends c5.a {
    public final Context f12187c;
    public final f9 d;
    public final org.telegram.ui.ActionBar.i6 f12188e;
    public final w f12189f;

    public k7(w wVar, Context context, f9 f9Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f12189f = wVar;
        this.f12187c = context;
        this.d = f9Var;
        this.f12188e = i6Var;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        lVar.removeView(frameLayout);
        z3 z3Var = (z3) frameLayout.getChildAt(0);
        org.telegram.messenger.g0.E2(z3Var);
        this.f12189f.Q0.add(z3Var);
    }

    @Override
    public final int b() {
        w wVar = this.f12189f;
        ArrayList arrayList = wVar.f12309y0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return wVar.B0.size();
    }

    @Override
    public final Object e(c5.l lVar, int i7) {
        z3 j7Var;
        long B0;
        Context context = this.f12187c;
        w wVar = this.f12189f;
        m7 m7Var = new m7(wVar, context);
        ArrayList arrayList = wVar.Q0;
        boolean isEmpty = arrayList.isEmpty();
        f9 f9Var = this.d;
        if (!isEmpty) {
            j7Var = (z3) arrayList.remove(0);
            j7Var.Y0.f12640a.getImageReceiver().O0(true, true);
            if (j7Var.O1 != null) {
                j7Var.L1.m1();
                j7Var.L1.setAlpha(1.0f - j7Var.O3);
            }
            vi0 vi0Var = j7Var.P1;
            if (vi0Var != null) {
                vi0Var.n();
            }
            vi0 vi0Var2 = j7Var.f12815b3;
            if (vi0Var2 != null) {
                vi0Var2.n();
            }
            z40 z40Var = j7Var.f12877t2;
            if (z40Var != null) {
                org.telegram.messenger.g0.E2(z40Var);
                j7Var.f12877t2.d(true);
                j7Var.f12877t2 = null;
            }
            j7Var.setActive(false);
            j7Var.setIsVisible(false);
            j7Var.f12885v2 = false;
            j7Var.f12897y2.e(false, 0.0f);
            j7Var.V0 = null;
            j7Var.S2 = false;
            j7Var.n0();
        } else {
            j7Var = new j7(this, this.f12187c, f9Var, wVar.I0, this.f12188e);
        }
        m7Var.f12277a = j7Var;
        j7Var.setAccount(wVar.f12310z0);
        j7Var.setDelegate(wVar.C0);
        j7Var.setLongpressed(f9Var.f11957a1);
        m7Var.setTag(Integer.valueOf(i7));
        ArrayList arrayList2 = wVar.f12309y0;
        if (arrayList2 != null) {
            if (f9Var.R0) {
                i7 = (arrayList2.size() - 1) - i7;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i7);
            m7Var.f12279c = arrayList3;
            h6 h6Var = f9Var.O0;
            if (!(h6Var instanceof b6) && !(h6Var instanceof k6)) {
                m7Var.f12278b = wVar.f12308x0;
            } else {
                fj f10 = h6Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f10 == null) {
                    B0 = wVar.f12308x0;
                } else {
                    B0 = fj.B0(f10.f23968k);
                }
                m7Var.f12278b = B0;
            }
        } else {
            m7Var.f12279c = null;
            m7Var.f12278b = ((Long) wVar.B0.get(i7)).longValue();
        }
        m7Var.addView(j7Var);
        j7Var.requestLayout();
        lVar.addView(m7Var);
        return m7Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
