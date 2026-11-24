package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.q;
public final class z2b extends pr7 {
    public final Context c;
    public final m8b d;
    public final f53 e;
    public final c8b f;

    public z2b(c8b c8bVar, Context context, m8b m8bVar, f53 f53Var) {
        this.f = c8bVar;
        this.c = context;
        this.d = m8bVar;
        this.e = f53Var;
    }

    @Override
    public final void a(gec gecVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gecVar.removeView(frameLayout);
        y28 y28Var = (y28) frameLayout.getChildAt(0);
        gl.B2(y28Var);
        this.f.Q0.add(y28Var);
    }

    @Override
    public final int b() {
        c8b c8bVar = this.f;
        ArrayList arrayList = c8bVar.y0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return c8bVar.B0.size();
    }

    @Override
    public final Object e(gec gecVar, int i) {
        y28 y2bVar;
        long B0;
        Context context = this.c;
        c8b c8bVar = this.f;
        a3b a3bVar = new a3b(c8bVar, context);
        ArrayList arrayList = c8bVar.Q0;
        boolean isEmpty = arrayList.isEmpty();
        m8b m8bVar = this.d;
        if (!isEmpty) {
            y2bVar = (y28) arrayList.remove(0);
            y2bVar.e1.a.getImageReceiver().v0(true, true);
            if (y2bVar.U1 != null) {
                y2bVar.R1.p1();
                y2bVar.R1.setAlpha(1.0f - y2bVar.T3);
            }
            t09 t09Var = y2bVar.V1;
            if (t09Var != null) {
                t09Var.k();
            }
            t09 t09Var2 = y2bVar.h3;
            if (t09Var2 != null) {
                t09Var2.k();
            }
            q qVar = y2bVar.z2;
            if (qVar != null) {
                gl.B2(qVar);
                y2bVar.z2.m();
                y2bVar.z2 = null;
            }
            y2bVar.setActive(false);
            y2bVar.setIsVisible(false);
            y2bVar.B2 = false;
            y2bVar.E2.e(false, 0.0f);
            y2bVar.b1 = null;
            y2bVar.Y2 = false;
            y2bVar.f0();
        } else {
            y2bVar = new y2b(this, this.c, m8bVar, c8bVar.I0, this.e);
        }
        a3bVar.a = y2bVar;
        y2bVar.setAccount(c8bVar.z0);
        y2bVar.setDelegate(c8bVar.C0);
        y2bVar.setLongpressed(m8bVar.a1);
        a3bVar.setTag(Integer.valueOf(i));
        ArrayList arrayList2 = c8bVar.y0;
        if (arrayList2 != null) {
            if (m8bVar.R0) {
                i = (arrayList2.size() - 1) - i;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i);
            a3bVar.c = arrayList3;
            y1b y1bVar = m8bVar.O0;
            if (!(y1bVar instanceof t1b) && !(y1bVar instanceof a2b)) {
                a3bVar.b = c8bVar.x0;
            } else {
                k27 f = y1bVar.f(((Integer) arrayList3.get(0)).intValue());
                if (f == null) {
                    B0 = c8bVar.x0;
                } else {
                    B0 = k27.B0(f.k);
                }
                a3bVar.b = B0;
            }
        } else {
            a3bVar.c = null;
            a3bVar.b = ((Long) c8bVar.B0.get(i)).longValue();
        }
        a3bVar.addView(y2bVar);
        y2bVar.requestLayout();
        gecVar.addView(a3bVar);
        return a3bVar;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
