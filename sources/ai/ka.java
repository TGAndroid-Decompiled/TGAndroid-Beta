package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.qk0;
public final class ka extends z4.a {
    public final ArrayList f1151c = new ArrayList();
    public final Context d;
    public final jc e;
    public final org.telegram.ui.ActionBar.e6 f1152f;
    public final zb f1153g;

    public ka(zb zbVar, Context context, jc jcVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f1153g = zbVar;
        this.d = context;
        this.e = jcVar;
        this.f1152f = e6Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        f6 f6Var = (f6) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(f6Var);
        this.f1151c.add(f6Var);
    }

    @Override
    public final int b() {
        zb zbVar = this.f1153g;
        ArrayList arrayList = zbVar.f1308x0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return zbVar.A0.size();
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        f6 jaVar;
        long dialogId;
        Context context = this.d;
        zb zbVar = this.f1153g;
        ma maVar = new ma(zbVar, context);
        ArrayList arrayList = this.f1151c;
        boolean isEmpty = arrayList.isEmpty();
        jc jcVar = this.e;
        if (!isEmpty) {
            jaVar = (f6) arrayList.remove(0);
            jaVar.f839o1.f582a.getImageReceiver().setVisible(true, true);
            if (jaVar.f812e2 != null) {
                jaVar.f800b2.P0();
                jaVar.f800b2.setAlpha(1.0f - jaVar.f810d4);
            }
            qk0 qk0Var = jaVar.f815f2;
            if (qk0Var != null) {
                qk0Var.n();
            }
            qk0 qk0Var2 = jaVar.f850r3;
            if (qk0Var2 != null) {
                qk0Var2.n();
            }
            b60 b60Var = jaVar.J2;
            if (b60Var != null) {
                AndroidUtilities.removeFromParent(b60Var);
                jaVar.J2.d(true);
                jaVar.J2 = null;
            }
            jaVar.setActive(false);
            jaVar.setIsVisible(false);
            jaVar.L2 = false;
            jaVar.O2.d(0.0f, false);
            jaVar.l1 = null;
            jaVar.f825i3 = false;
            jaVar.p0();
        } else {
            jaVar = new ja(this, this.d, jcVar, zbVar.H0, this.f1152f);
        }
        maVar.f1261a = jaVar;
        jaVar.setAccount(zbVar.f1309y0);
        jaVar.setDelegate(zbVar.B0);
        jaVar.setLongpressed(jcVar.f1069a1);
        maVar.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = zbVar.f1308x0;
        if (arrayList2 != null) {
            if (jcVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            maVar.f1263c = arrayList3;
            d9 d9Var = jcVar.O0;
            if (!(d9Var instanceof v8) && !(d9Var instanceof g9)) {
                maVar.f1262b = zbVar.f1307w0;
            } else {
                MessageObject f7 = d9Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f7 == null) {
                    dialogId = zbVar.f1307w0;
                } else {
                    dialogId = f7.getDialogId();
                }
                maVar.f1262b = dialogId;
            }
        } else {
            maVar.f1263c = null;
            maVar.f1262b = ((Long) zbVar.A0.get(i10)).longValue();
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
