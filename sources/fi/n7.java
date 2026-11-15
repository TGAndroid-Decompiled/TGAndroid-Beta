package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.r40;
public final class n7 extends c5.a {
    public final Context f12078c;
    public final i9 d;
    public final org.telegram.ui.ActionBar.e6 f12079e;
    public final w f12080f;

    public n7(w wVar, Context context, i9 i9Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f12080f = wVar;
        this.f12078c = context;
        this.d = i9Var;
        this.f12079e = e6Var;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        lVar.removeView(frameLayout);
        b4 b4Var = (b4) frameLayout.getChildAt(0);
        org.telegram.messenger.g0.E2(b4Var);
        this.f12080f.Q0.add(b4Var);
    }

    @Override
    public final int b() {
        w wVar = this.f12080f;
        ArrayList arrayList = wVar.f12233y0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return wVar.B0.size();
    }

    @Override
    public final Object e(c5.l lVar, int i7) {
        b4 m7Var;
        long B0;
        Context context = this.f12078c;
        w wVar = this.f12080f;
        p7 p7Var = new p7(wVar, context);
        ArrayList arrayList = wVar.Q0;
        boolean isEmpty = arrayList.isEmpty();
        i9 i9Var = this.d;
        if (!isEmpty) {
            m7Var = (b4) arrayList.remove(0);
            m7Var.Y0.f12493a.getImageReceiver().O0(true, true);
            if (m7Var.O1 != null) {
                m7Var.L1.e1();
                m7Var.L1.setAlpha(1.0f - m7Var.O3);
            }
            mi0 mi0Var = m7Var.P1;
            if (mi0Var != null) {
                mi0Var.n();
            }
            mi0 mi0Var2 = m7Var.f11462b3;
            if (mi0Var2 != null) {
                mi0Var2.n();
            }
            r40 r40Var = m7Var.f11524t2;
            if (r40Var != null) {
                org.telegram.messenger.g0.E2(r40Var);
                m7Var.f11524t2.d(true);
                m7Var.f11524t2 = null;
            }
            m7Var.setActive(false);
            m7Var.setIsVisible(false);
            m7Var.f11532v2 = false;
            m7Var.f11544y2.e(false, 0.0f);
            m7Var.V0 = null;
            m7Var.S2 = false;
            m7Var.n0();
        } else {
            m7Var = new m7(this, this.f12078c, i9Var, wVar.I0, this.f12079e);
        }
        p7Var.f12179a = m7Var;
        m7Var.setAccount(wVar.f12234z0);
        m7Var.setDelegate(wVar.C0);
        m7Var.setLongpressed(i9Var.f11832a1);
        p7Var.setTag(Integer.valueOf(i7));
        ArrayList arrayList2 = wVar.f12233y0;
        if (arrayList2 != null) {
            if (i9Var.R0) {
                i7 = (arrayList2.size() - 1) - i7;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i7);
            p7Var.f12181c = arrayList3;
            k6 k6Var = i9Var.O0;
            if (!(k6Var instanceof d6) && !(k6Var instanceof n6)) {
                p7Var.f12180b = wVar.f12232x0;
            } else {
                gj f10 = k6Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f10 == null) {
                    B0 = wVar.f12232x0;
                } else {
                    B0 = gj.B0(f10.f23817k);
                }
                p7Var.f12180b = B0;
            }
        } else {
            p7Var.f12181c = null;
            p7Var.f12180b = ((Long) wVar.B0.get(i7)).longValue();
        }
        p7Var.addView(m7Var);
        m7Var.requestLayout();
        lVar.addView(p7Var);
        return p7Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
