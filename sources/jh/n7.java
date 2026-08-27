package jh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.wj0;

public final class n7 extends m2.a {

    public final ArrayList f13702c = new ArrayList();
    public final Context d;

    public final i9 f13703e;

    public final org.telegram.ui.ActionBar.c6 f13704f;

    public final y8 f13705g;

    public n7(y8 y8Var, Context context, i9 i9Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f13705g = y8Var;
        this.d = context;
        this.f13703e = i9Var;
        this.f13704f = c6Var;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        e4 e4Var = (e4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(e4Var);
        this.f13702c.add(e4Var);
    }

    @Override
    public final int b() {
        y8 y8Var = this.f13705g;
        ArrayList arrayList = y8Var.f13864t0;
        return arrayList != null ? arrayList.size() : y8Var.f13867w0.size();
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        e4 m7Var;
        Context context = this.d;
        y8 y8Var = this.f13705g;
        p7 p7Var = new p7(y8Var, context);
        ArrayList arrayList = this.f13702c;
        boolean zIsEmpty = arrayList.isEmpty();
        i9 i9Var = this.f13703e;
        if (zIsEmpty) {
            m7Var = new m7(this, this.d, i9Var, y8Var.D0, this.f13704f);
        } else {
            m7Var = (e4) arrayList.remove(0);
            m7Var.f13247k1.f13033a.getImageReceiver().setVisible(true, true);
            if (m7Var.a2 != null) {
                m7Var.X1.P0();
                m7Var.X1.setAlpha(1.0f - m7Var.Z3);
            }
            wj0 wj0Var = m7Var.f13221b2;
            if (wj0Var != null) {
                wj0Var.n();
            }
            wj0 wj0Var2 = m7Var.f13257n3;
            if (wj0Var2 != null) {
                wj0Var2.n();
            }
            k50 k50Var = m7Var.F2;
            if (k50Var != null) {
                AndroidUtilities.removeFromParent(k50Var);
                m7Var.F2.h(true);
                m7Var.F2 = null;
            }
            m7Var.setActive(false);
            m7Var.setIsVisible(false);
            m7Var.H2 = false;
            m7Var.K2.d(0.0f, false);
            m7Var.f13238h1 = null;
            m7Var.f13231e3 = false;
            m7Var.p0();
        }
        p7Var.f13828a = m7Var;
        m7Var.setAccount(y8Var.f13865u0);
        m7Var.setDelegate(y8Var.f13868x0);
        m7Var.setLongpressed(i9Var.W0);
        p7Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = y8Var.f13864t0;
        if (arrayList2 != null) {
            if (i9Var.N0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            p7Var.f13830c = arrayList3;
            j6 j6Var = i9Var.K0;
            if ((j6Var instanceof d6) || (j6Var instanceof m6)) {
                MessageObject messageObjectF = j6Var.f(((Integer) arrayList3.get(0)).intValue());
                p7Var.f13829b = messageObjectF == null ? y8Var.f13863s0 : messageObjectF.getDialogId();
            } else {
                p7Var.f13829b = y8Var.f13863s0;
            }
        } else {
            p7Var.f13830c = null;
            p7Var.f13829b = ((Long) y8Var.f13867w0.get(i10)).longValue();
        }
        p7Var.addView(m7Var);
        m7Var.requestLayout();
        gVar.addView(p7Var);
        return p7Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
