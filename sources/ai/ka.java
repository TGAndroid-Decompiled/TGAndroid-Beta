package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.x50;
public final class ka extends z4.a {
    public final ArrayList f1151c = new ArrayList();
    public final Context d;
    public final jc e;
    public final org.telegram.ui.ActionBar.d6 f1152f;
    public final zb f1153g;

    public ka(zb zbVar, Context context, jc jcVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f1153g = zbVar;
        this.d = context;
        this.e = jcVar;
        this.f1152f = d6Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        e6 e6Var = (e6) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(e6Var);
        this.f1151c.add(e6Var);
    }

    @Override
    public final int b() {
        zb zbVar = this.f1153g;
        ArrayList arrayList = zbVar.f1309x0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return zbVar.A0.size();
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        e6 jaVar;
        long dialogId;
        Context context = this.d;
        zb zbVar = this.f1153g;
        ma maVar = new ma(zbVar, context);
        ArrayList arrayList = this.f1151c;
        boolean isEmpty = arrayList.isEmpty();
        jc jcVar = this.e;
        if (!isEmpty) {
            jaVar = (e6) arrayList.remove(0);
            jaVar.f812o1.f520a.getImageReceiver().setVisible(true, true);
            if (jaVar.f785e2 != null) {
                jaVar.f773b2.Q0();
                jaVar.f773b2.setAlpha(1.0f - jaVar.f783d4);
            }
            gk0 gk0Var = jaVar.f788f2;
            if (gk0Var != null) {
                gk0Var.n();
            }
            gk0 gk0Var2 = jaVar.f823r3;
            if (gk0Var2 != null) {
                gk0Var2.n();
            }
            x50 x50Var = jaVar.J2;
            if (x50Var != null) {
                AndroidUtilities.removeFromParent(x50Var);
                jaVar.J2.h(true);
                jaVar.J2 = null;
            }
            jaVar.setActive(false);
            jaVar.setIsVisible(false);
            jaVar.L2 = false;
            jaVar.O2.d(0.0f, false);
            jaVar.l1 = null;
            jaVar.f798i3 = false;
            jaVar.p0();
        } else {
            jaVar = new ja(this, this.d, jcVar, zbVar.H0, this.f1152f);
        }
        maVar.f1268a = jaVar;
        jaVar.setAccount(zbVar.f1310y0);
        jaVar.setDelegate(zbVar.B0);
        jaVar.setLongpressed(jcVar.f1060a1);
        maVar.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = zbVar.f1309x0;
        if (arrayList2 != null) {
            if (jcVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            maVar.f1270c = arrayList3;
            d9 d9Var = jcVar.O0;
            if (!(d9Var instanceof v8) && !(d9Var instanceof g9)) {
                maVar.f1269b = zbVar.f1308w0;
            } else {
                MessageObject f7 = d9Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f7 == null) {
                    dialogId = zbVar.f1308w0;
                } else {
                    dialogId = f7.getDialogId();
                }
                maVar.f1269b = dialogId;
            }
        } else {
            maVar.f1270c = null;
            maVar.f1269b = ((Long) zbVar.A0.get(i10)).longValue();
        }
        maVar.addView(jaVar);
        jaVar.requestLayout();
        gVar.addView(maVar);
        return maVar;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
