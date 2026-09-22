package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.w50;
public final class ka extends z4.a {
    public final ArrayList f1148c = new ArrayList();
    public final Context d;
    public final jc e;
    public final org.telegram.ui.ActionBar.e6 f1149f;
    public final zb f1150g;

    public ka(zb zbVar, Context context, jc jcVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f1150g = zbVar;
        this.d = context;
        this.e = jcVar;
        this.f1149f = e6Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        f6 f6Var = (f6) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(f6Var);
        this.f1148c.add(f6Var);
    }

    @Override
    public final int b() {
        zb zbVar = this.f1150g;
        ArrayList arrayList = zbVar.f1305x0;
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
        zb zbVar = this.f1150g;
        ma maVar = new ma(zbVar, context);
        ArrayList arrayList = this.f1148c;
        boolean isEmpty = arrayList.isEmpty();
        jc jcVar = this.e;
        if (!isEmpty) {
            jaVar = (f6) arrayList.remove(0);
            jaVar.f836o1.f579a.getImageReceiver().setVisible(true, true);
            if (jaVar.f809e2 != null) {
                jaVar.f797b2.Q0();
                jaVar.f797b2.setAlpha(1.0f - jaVar.f807d4);
            }
            fk0 fk0Var = jaVar.f812f2;
            if (fk0Var != null) {
                fk0Var.n();
            }
            fk0 fk0Var2 = jaVar.f847r3;
            if (fk0Var2 != null) {
                fk0Var2.n();
            }
            w50 w50Var = jaVar.J2;
            if (w50Var != null) {
                AndroidUtilities.removeFromParent(w50Var);
                jaVar.J2.h(true);
                jaVar.J2 = null;
            }
            jaVar.setActive(false);
            jaVar.setIsVisible(false);
            jaVar.L2 = false;
            jaVar.O2.d(0.0f, false);
            jaVar.l1 = null;
            jaVar.f822i3 = false;
            jaVar.p0();
        } else {
            jaVar = new ja(this, this.d, jcVar, zbVar.H0, this.f1149f);
        }
        maVar.f1258a = jaVar;
        jaVar.setAccount(zbVar.f1306y0);
        jaVar.setDelegate(zbVar.B0);
        jaVar.setLongpressed(jcVar.f1066a1);
        maVar.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = zbVar.f1305x0;
        if (arrayList2 != null) {
            if (jcVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            maVar.f1260c = arrayList3;
            d9 d9Var = jcVar.O0;
            if (!(d9Var instanceof v8) && !(d9Var instanceof g9)) {
                maVar.f1259b = zbVar.f1304w0;
            } else {
                MessageObject f7 = d9Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f7 == null) {
                    dialogId = zbVar.f1304w0;
                } else {
                    dialogId = f7.getDialogId();
                }
                maVar.f1259b = dialogId;
            }
        } else {
            maVar.f1260c = null;
            maVar.f1259b = ((Long) zbVar.A0.get(i10)).longValue();
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
