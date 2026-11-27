package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.q;
public final class v6b extends vu7 {
    public final Context c;
    public final lcb d;
    public final x53 e;
    public final acb f;

    public v6b(acb acbVar, Context context, lcb lcbVar, x53 x53Var) {
        this.f = acbVar;
        this.c = context;
        this.d = lcbVar;
        this.e = x53Var;
    }

    @Override
    public final void a(fic ficVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        ficVar.removeView(frameLayout);
        o68 o68Var = (o68) frameLayout.getChildAt(0);
        hl.B2(o68Var);
        this.f.Q0.add(o68Var);
    }

    @Override
    public final int b() {
        acb acbVar = this.f;
        ArrayList arrayList = acbVar.y0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return acbVar.B0.size();
    }

    @Override
    public final Object e(fic ficVar, int i) {
        o68 u6bVar;
        long B0;
        Context context = this.c;
        acb acbVar = this.f;
        w6b w6bVar = new w6b(acbVar, context);
        ArrayList arrayList = acbVar.Q0;
        boolean isEmpty = arrayList.isEmpty();
        lcb lcbVar = this.d;
        if (!isEmpty) {
            u6bVar = (o68) arrayList.remove(0);
            u6bVar.Y0.a.getImageReceiver().v0(true, true);
            if (u6bVar.O1 != null) {
                u6bVar.L1.z1();
                u6bVar.L1.setAlpha(1.0f - u6bVar.N3);
            }
            i49 i49Var = u6bVar.P1;
            if (i49Var != null) {
                i49Var.k();
            }
            i49 i49Var2 = u6bVar.b3;
            if (i49Var2 != null) {
                i49Var2.k();
            }
            q qVar = u6bVar.t2;
            if (qVar != null) {
                hl.B2(qVar);
                u6bVar.t2.m();
                u6bVar.t2 = null;
            }
            u6bVar.setActive(false);
            u6bVar.setIsVisible(false);
            u6bVar.v2 = false;
            u6bVar.y2.e(false, 0.0f);
            u6bVar.V0 = null;
            u6bVar.S2 = false;
            u6bVar.f0();
        } else {
            u6bVar = new u6b(this, this.c, lcbVar, acbVar.I0, this.e);
        }
        w6bVar.a = u6bVar;
        u6bVar.setAccount(acbVar.z0);
        u6bVar.setDelegate(acbVar.C0);
        u6bVar.setLongpressed(lcbVar.a1);
        w6bVar.setTag(Integer.valueOf(i));
        ArrayList arrayList2 = acbVar.y0;
        if (arrayList2 != null) {
            if (lcbVar.R0) {
                i = (arrayList2.size() - 1) - i;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i);
            w6bVar.c = arrayList3;
            u5b u5bVar = lcbVar.O0;
            if (!(u5bVar instanceof p5b) && !(u5bVar instanceof w5b)) {
                w6bVar.b = acbVar.x0;
            } else {
                r47 f = u5bVar.f(((Integer) arrayList3.get(0)).intValue());
                if (f == null) {
                    B0 = acbVar.x0;
                } else {
                    B0 = r47.B0(f.k);
                }
                w6bVar.b = B0;
            }
        } else {
            w6bVar.c = null;
            w6bVar.b = ((Long) acbVar.B0.get(i)).longValue();
        }
        w6bVar.addView(u6bVar);
        u6bVar.requestLayout();
        ficVar.addView(w6bVar);
        return w6bVar;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
