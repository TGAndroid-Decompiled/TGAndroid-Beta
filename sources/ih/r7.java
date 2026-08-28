package ih;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.uj0;
public final class r7 extends m2.a {
    public final ArrayList f12072c = new ArrayList();
    public final Context d;
    public final m9 f12073e;
    public final org.telegram.ui.ActionBar.b6 f12074f;
    public final c9 f12075g;

    public r7(c9 c9Var, Context context, m9 m9Var, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f12075g = c9Var;
        this.d = context;
        this.f12073e = m9Var;
        this.f12074f = b6Var;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        i4 i4Var = (i4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(i4Var);
        this.f12072c.add(i4Var);
    }

    @Override
    public final int b() {
        c9 c9Var = this.f12075g;
        ArrayList arrayList = c9Var.f12203t0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return c9Var.f12206w0.size();
    }

    @Override
    public final Object e(m2.g gVar, int i9) {
        i4 q7Var;
        long dialogId;
        Context context = this.d;
        c9 c9Var = this.f12075g;
        t7 t7Var = new t7(c9Var, context);
        ArrayList arrayList = this.f12072c;
        boolean isEmpty = arrayList.isEmpty();
        m9 m9Var = this.f12073e;
        if (!isEmpty) {
            q7Var = (i4) arrayList.remove(0);
            q7Var.f11560k1.f11354a.getImageReceiver().setVisible(true, true);
            if (q7Var.a2 != null) {
                q7Var.X1.P0();
                q7Var.X1.setAlpha(1.0f - q7Var.Z3);
            }
            uj0 uj0Var = q7Var.f11534b2;
            if (uj0Var != null) {
                uj0Var.n();
            }
            uj0 uj0Var2 = q7Var.f11570n3;
            if (uj0Var2 != null) {
                uj0Var2.n();
            }
            f50 f50Var = q7Var.F2;
            if (f50Var != null) {
                AndroidUtilities.removeFromParent(f50Var);
                q7Var.F2.h(true);
                q7Var.F2 = null;
            }
            q7Var.setActive(false);
            q7Var.setIsVisible(false);
            q7Var.H2 = false;
            q7Var.K2.d(0.0f, false);
            q7Var.f11551h1 = null;
            q7Var.f11544e3 = false;
            q7Var.p0();
        } else {
            q7Var = new q7(this, this.d, m9Var, c9Var.D0, this.f12074f);
        }
        t7Var.f12169a = q7Var;
        q7Var.setAccount(c9Var.f12204u0);
        q7Var.setDelegate(c9Var.f12207x0);
        q7Var.setLongpressed(m9Var.W0);
        t7Var.setTag(Integer.valueOf(i9));
        ArrayList arrayList2 = c9Var.f12203t0;
        if (arrayList2 != null) {
            if (m9Var.N0) {
                i9 = (arrayList2.size() - 1) - i9;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i9);
            t7Var.f12171c = arrayList3;
            n6 n6Var = m9Var.K0;
            if (!(n6Var instanceof h6) && !(n6Var instanceof q6)) {
                t7Var.f12170b = c9Var.f12202s0;
            } else {
                MessageObject f10 = n6Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f10 == null) {
                    dialogId = c9Var.f12202s0;
                } else {
                    dialogId = f10.getDialogId();
                }
                t7Var.f12170b = dialogId;
            }
        } else {
            t7Var.f12171c = null;
            t7Var.f12170b = ((Long) c9Var.f12206w0.get(i9)).longValue();
        }
        t7Var.addView(q7Var);
        q7Var.requestLayout();
        gVar.addView(t7Var);
        return t7Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
