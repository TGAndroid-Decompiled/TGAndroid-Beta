package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.li0;
public final class u7 extends b5.a {
    public final Context f11090c;
    public final r9 d;
    public final org.telegram.ui.ActionBar.e6 f11091e;
    public final x f11092f;

    public u7(x xVar, Context context, r9 r9Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f11092f = xVar;
        this.f11090c = context;
        this.d = r9Var;
        this.f11091e = e6Var;
    }

    @Override
    public final void a(b5.l lVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        lVar.removeView(frameLayout);
        j4 j4Var = (j4) frameLayout.getChildAt(0);
        org.telegram.messenger.g0.E2(j4Var);
        this.f11092f.Q0.add(j4Var);
    }

    @Override
    public final int b() {
        x xVar = this.f11092f;
        ArrayList arrayList = xVar.f11211y0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return xVar.B0.size();
    }

    @Override
    public final Object e(b5.l lVar, int i3) {
        j4 t7Var;
        long B0;
        Context context = this.f11090c;
        x xVar = this.f11092f;
        w7 w7Var = new w7(xVar, context);
        ArrayList arrayList = xVar.Q0;
        boolean isEmpty = arrayList.isEmpty();
        r9 r9Var = this.d;
        if (!isEmpty) {
            t7Var = (j4) arrayList.remove(0);
            t7Var.Y0.f10263a.getImageReceiver().O0(true, true);
            if (t7Var.O1 != null) {
                t7Var.L1.O0();
                t7Var.L1.setAlpha(1.0f - t7Var.O3);
            }
            li0 li0Var = t7Var.P1;
            if (li0Var != null) {
                li0Var.n();
            }
            li0 li0Var2 = t7Var.f10446b3;
            if (li0Var2 != null) {
                li0Var2.n();
            }
            k40 k40Var = t7Var.f10508t2;
            if (k40Var != null) {
                org.telegram.messenger.g0.E2(k40Var);
                t7Var.f10508t2.c(true);
                t7Var.f10508t2 = null;
            }
            t7Var.setActive(false);
            t7Var.setIsVisible(false);
            t7Var.f10516v2 = false;
            t7Var.f10528y2.e(false, 0.0f);
            t7Var.V0 = null;
            t7Var.S2 = false;
            t7Var.n0();
        } else {
            t7Var = new t7(this, this.f11090c, r9Var, xVar.I0, this.f11091e);
        }
        w7Var.f11189a = t7Var;
        t7Var.setAccount(xVar.f11212z0);
        t7Var.setDelegate(xVar.C0);
        t7Var.setLongpressed(r9Var.f10913b1);
        w7Var.setTag(Integer.valueOf(i3));
        ArrayList arrayList2 = xVar.f11211y0;
        if (arrayList2 != null) {
            if (r9Var.S0) {
                i3 = (arrayList2.size() - 1) - i3;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i3);
            w7Var.f11191c = arrayList3;
            r6 r6Var = r9Var.P0;
            if (!(r6Var instanceof l6) && !(r6Var instanceof u6)) {
                w7Var.f11190b = xVar.f11210x0;
            } else {
                zi f10 = r6Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f10 == null) {
                    B0 = xVar.f11210x0;
                } else {
                    B0 = zi.B0(f10.f26868k);
                }
                w7Var.f11190b = B0;
            }
        } else {
            w7Var.f11191c = null;
            w7Var.f11190b = ((Long) xVar.B0.get(i3)).longValue();
        }
        w7Var.addView(t7Var);
        t7Var.requestLayout();
        lVar.addView(w7Var);
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
