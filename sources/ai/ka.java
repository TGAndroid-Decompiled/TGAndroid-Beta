package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.sk0;
public final class ka extends z4.a {
    public final ArrayList f1153c = new ArrayList();
    public final Context d;
    public final jc e;
    public final org.telegram.ui.ActionBar.e6 f1154f;
    public final zb f1155g;

    public ka(zb zbVar, Context context, jc jcVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f1155g = zbVar;
        this.d = context;
        this.e = jcVar;
        this.f1154f = e6Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        e6 e6Var = (e6) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(e6Var);
        this.f1153c.add(e6Var);
    }

    @Override
    public final int b() {
        zb zbVar = this.f1155g;
        ArrayList arrayList = zbVar.f1311x0;
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
        zb zbVar = this.f1155g;
        ma maVar = new ma(zbVar, context);
        ArrayList arrayList = this.f1153c;
        boolean isEmpty = arrayList.isEmpty();
        jc jcVar = this.e;
        if (!isEmpty) {
            jaVar = (e6) arrayList.remove(0);
            jaVar.f815o1.f523a.getImageReceiver().setVisible(true, true);
            if (jaVar.f788e2 != null) {
                jaVar.f776b2.P0();
                jaVar.f776b2.setAlpha(1.0f - jaVar.f786d4);
            }
            sk0 sk0Var = jaVar.f791f2;
            if (sk0Var != null) {
                sk0Var.n();
            }
            sk0 sk0Var2 = jaVar.f826r3;
            if (sk0Var2 != null) {
                sk0Var2.n();
            }
            e60 e60Var = jaVar.J2;
            if (e60Var != null) {
                AndroidUtilities.removeFromParent(e60Var);
                jaVar.J2.c(true);
                jaVar.J2 = null;
            }
            jaVar.setActive(false);
            jaVar.setIsVisible(false);
            jaVar.L2 = false;
            jaVar.O2.d(0.0f, false);
            jaVar.l1 = null;
            jaVar.f801i3 = false;
            jaVar.p0();
        } else {
            jaVar = new ja(this, this.d, jcVar, zbVar.H0, this.f1154f);
        }
        maVar.f1270a = jaVar;
        jaVar.setAccount(zbVar.f1312y0);
        jaVar.setDelegate(zbVar.B0);
        jaVar.setLongpressed(jcVar.f1062a1);
        maVar.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = zbVar.f1311x0;
        if (arrayList2 != null) {
            if (jcVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            maVar.f1272c = arrayList3;
            d9 d9Var = jcVar.O0;
            if (!(d9Var instanceof v8) && !(d9Var instanceof g9)) {
                maVar.f1271b = zbVar.f1310w0;
            } else {
                MessageObject f7 = d9Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f7 == null) {
                    dialogId = zbVar.f1310w0;
                } else {
                    dialogId = f7.getDialogId();
                }
                maVar.f1271b = dialogId;
            }
        } else {
            maVar.f1272c = null;
            maVar.f1271b = ((Long) zbVar.A0.get(i10)).longValue();
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
