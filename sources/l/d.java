package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.g0;
import m.h0;
import m.k2;
import m.n0;
import m.q0;
import org.telegram.ui.Components.oc0;
import r0.j0;

public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    public final int f15271a;

    public final Object f15272b;

    public d(Object obj, int i10) {
        this.f15271a = i10;
        this.f15272b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f15271a;
        int i11 = 0;
        Object obj = this.f15272b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                ArrayList arrayList = fVar.f15291n;
                if (fVar.a() && arrayList.size() > 0 && !((e) arrayList.get(0)).f15283a.J) {
                    View view = fVar.A;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            ((e) obj2).f15283a.g();
                        }
                    } else {
                        fVar.dismiss();
                    }
                    break;
                }
                break;
            case 1:
                d0 d0Var = (d0) obj;
                k2 k2Var = d0Var.f15277n;
                if (d0Var.a() && !k2Var.J) {
                    View view2 = d0Var.f15281x;
                    if (view2 != null && view2.isShown()) {
                        k2Var.g();
                    } else {
                        d0Var.dismiss();
                    }
                    break;
                }
                break;
            case 2:
                q0 q0Var = (q0) obj;
                if (!q0Var.getInternalPopup().a()) {
                    q0Var.f17433f.m(h0.b(q0Var), h0.a(q0Var));
                }
                ViewTreeObserver viewTreeObserver = q0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    g0.a(viewTreeObserver, this);
                }
                break;
            case 3:
                n0 n0Var = (n0) obj;
                q0 q0Var2 = n0Var.S;
                n0Var.getClass();
                WeakHashMap weakHashMap = j0.f46605a;
                if (q0Var2.isAttachedToWindow() && q0Var2.getGlobalVisibleRect(n0Var.Q)) {
                    n0Var.r();
                    n0Var.g();
                } else {
                    n0Var.dismiss();
                }
                break;
            default:
                oc0 oc0Var = (oc0) obj;
                oc0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                oc0Var.h = oc0Var.f31253e.getCurrentItem();
                oc0.a(oc0Var, oc0Var.h, 0);
                break;
        }
    }
}
