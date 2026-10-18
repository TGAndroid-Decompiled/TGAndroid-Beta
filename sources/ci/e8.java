package ci;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.m60;
public final class e8 extends z4.a {
    public final ArrayList f5293c = new ArrayList();
    public final Context d;
    public final z9 e;
    public final org.telegram.ui.ActionBar.d6 f5294f;
    public final p9 f5295g;

    public e8(p9 p9Var, Context context, z9 z9Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f5295g = p9Var;
        this.d = context;
        this.e = z9Var;
        this.f5294f = d6Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        p4 p4Var = (p4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(p4Var);
        this.f5293c.add(p4Var);
    }

    @Override
    public final int b() {
        p9 p9Var = this.f5295g;
        ArrayList arrayList = p9Var.f5420x0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return p9Var.A0.size();
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        p4 d8Var;
        long dialogId;
        Context context = this.d;
        p9 p9Var = this.f5295g;
        g8 g8Var = new g8(p9Var, context);
        ArrayList arrayList = this.f5293c;
        boolean isEmpty = arrayList.isEmpty();
        z9 z9Var = this.e;
        if (!isEmpty) {
            d8Var = (p4) arrayList.remove(0);
            d8Var.f5689o1.f5510a.getImageReceiver().setVisible(true, true);
            if (d8Var.f5661e2 != null) {
                d8Var.f5649b2.N0();
                d8Var.f5649b2.setAlpha(1.0f - d8Var.f5659d4);
            }
            cl0 cl0Var = d8Var.f5664f2;
            if (cl0Var != null) {
                cl0Var.n();
            }
            cl0 cl0Var2 = d8Var.f5700r3;
            if (cl0Var2 != null) {
                cl0Var2.n();
            }
            m60 m60Var = d8Var.J2;
            if (m60Var != null) {
                AndroidUtilities.removeFromParent(m60Var);
                d8Var.J2.c(true);
                d8Var.J2 = null;
            }
            d8Var.setActive(false);
            d8Var.setIsVisible(false);
            d8Var.L2 = false;
            d8Var.O2.d(0.0f, false);
            d8Var.l1 = null;
            d8Var.f5674i3 = false;
            d8Var.p0();
        } else {
            d8Var = new d8(this, this.d, z9Var, p9Var.H0, this.f5294f);
        }
        g8Var.f5372a = d8Var;
        d8Var.setAccount(p9Var.f5421y0);
        d8Var.setDelegate(p9Var.B0);
        d8Var.setLongpressed(z9Var.f6211a1);
        g8Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = p9Var.f5420x0;
        if (arrayList2 != null) {
            if (z9Var.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            g8Var.f5374c = arrayList3;
            z6 z6Var = z9Var.O0;
            if (!(z6Var instanceof t6) && !(z6Var instanceof c7)) {
                g8Var.f5373b = p9Var.f5419w0;
            } else {
                MessageObject f7 = z6Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f7 == null) {
                    dialogId = p9Var.f5419w0;
                } else {
                    dialogId = f7.getDialogId();
                }
                g8Var.f5373b = dialogId;
            }
        } else {
            g8Var.f5374c = null;
            g8Var.f5373b = ((Long) p9Var.A0.get(i10)).longValue();
        }
        g8Var.addView(d8Var);
        d8Var.requestLayout();
        gVar.addView(g8Var);
        return g8Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
