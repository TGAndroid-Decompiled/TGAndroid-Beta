package ci;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.m60;
public final class f8 extends z4.a {
    public final ArrayList f5392c = new ArrayList();
    public final Context d;
    public final aa e;
    public final org.telegram.ui.ActionBar.d6 f5393f;
    public final q9 f5394g;

    public f8(q9 q9Var, Context context, aa aaVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f5394g = q9Var;
        this.d = context;
        this.e = aaVar;
        this.f5393f = d6Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        q4 q4Var = (q4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(q4Var);
        this.f5392c.add(q4Var);
    }

    @Override
    public final int b() {
        q9 q9Var = this.f5394g;
        ArrayList arrayList = q9Var.f5514x0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return q9Var.A0.size();
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        q4 e8Var;
        long dialogId;
        Context context = this.d;
        q9 q9Var = this.f5394g;
        h8 h8Var = new h8(q9Var, context);
        ArrayList arrayList = this.f5392c;
        boolean isEmpty = arrayList.isEmpty();
        aa aaVar = this.e;
        if (!isEmpty) {
            e8Var = (q4) arrayList.remove(0);
            e8Var.f5806o1.f5608a.getImageReceiver().setVisible(true, true);
            if (e8Var.f5778e2 != null) {
                e8Var.f5766b2.N0();
                e8Var.f5766b2.setAlpha(1.0f - e8Var.f5776d4);
            }
            cl0 cl0Var = e8Var.f5781f2;
            if (cl0Var != null) {
                cl0Var.n();
            }
            cl0 cl0Var2 = e8Var.f5817r3;
            if (cl0Var2 != null) {
                cl0Var2.n();
            }
            m60 m60Var = e8Var.J2;
            if (m60Var != null) {
                AndroidUtilities.removeFromParent(m60Var);
                e8Var.J2.c(true);
                e8Var.J2 = null;
            }
            e8Var.setActive(false);
            e8Var.setIsVisible(false);
            e8Var.L2 = false;
            e8Var.O2.d(0.0f, false);
            e8Var.l1 = null;
            e8Var.f5791i3 = false;
            e8Var.p0();
        } else {
            e8Var = new e8(this, this.d, aaVar, q9Var.H0, this.f5393f);
        }
        h8Var.f5476a = e8Var;
        e8Var.setAccount(q9Var.f5515y0);
        e8Var.setDelegate(q9Var.B0);
        e8Var.setLongpressed(aaVar.f5176a1);
        h8Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = q9Var.f5514x0;
        if (arrayList2 != null) {
            if (aaVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            h8Var.f5478c = arrayList3;
            a7 a7Var = aaVar.O0;
            if (!(a7Var instanceof u6) && !(a7Var instanceof d7)) {
                h8Var.f5477b = q9Var.f5513w0;
            } else {
                MessageObject f7 = a7Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f7 == null) {
                    dialogId = q9Var.f5513w0;
                } else {
                    dialogId = f7.getDialogId();
                }
                h8Var.f5477b = dialogId;
            }
        } else {
            h8Var.f5478c = null;
            h8Var.f5477b = ((Long) q9Var.A0.get(i10)).longValue();
        }
        h8Var.addView(e8Var);
        e8Var.requestLayout();
        gVar.addView(h8Var);
        return h8Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
