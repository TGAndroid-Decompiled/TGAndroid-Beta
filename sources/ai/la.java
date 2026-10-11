package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.t60;
public final class la extends z4.a {
    public final ArrayList f1360c = new ArrayList();
    public final Context d;
    public final kc f1361e;
    public final org.telegram.ui.ActionBar.d6 f1362f;
    public final ac f1363g;

    public la(ac acVar, Context context, kc kcVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f1363g = acVar;
        this.d = context;
        this.f1361e = kcVar;
        this.f1362f = d6Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        f6 f6Var = (f6) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(f6Var);
        this.f1360c.add(f6Var);
    }

    @Override
    public final int b() {
        ac acVar = this.f1363g;
        ArrayList arrayList = acVar.f1542x0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return acVar.A0.size();
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        f6 kaVar;
        long dialogId;
        Context context = this.d;
        ac acVar = this.f1363g;
        na naVar = new na(acVar, context);
        ArrayList arrayList = this.f1360c;
        boolean isEmpty = arrayList.isEmpty();
        kc kcVar = this.f1361e;
        if (!isEmpty) {
            kaVar = (f6) arrayList.remove(0);
            kaVar.f991o1.f711a.getImageReceiver().setVisible(true, true);
            if (kaVar.f964e2 != null) {
                kaVar.f952b2.N0();
                kaVar.f952b2.setAlpha(1.0f - kaVar.f962d4);
            }
            ll0 ll0Var = kaVar.f967f2;
            if (ll0Var != null) {
                ll0Var.n();
            }
            ll0 ll0Var2 = kaVar.f1002r3;
            if (ll0Var2 != null) {
                ll0Var2.n();
            }
            t60 t60Var = kaVar.J2;
            if (t60Var != null) {
                AndroidUtilities.removeFromParent(t60Var);
                kaVar.J2.c(true);
                kaVar.J2 = null;
            }
            kaVar.setActive(false);
            kaVar.setIsVisible(false);
            kaVar.L2 = false;
            kaVar.O2.d(0.0f, false);
            kaVar.l1 = null;
            kaVar.f977i3 = false;
            kaVar.p0();
        } else {
            kaVar = new ka(this, this.d, kcVar, acVar.H0, this.f1362f);
        }
        naVar.f1487a = kaVar;
        kaVar.setAccount(acVar.f1543y0);
        kaVar.setDelegate(acVar.B0);
        kaVar.setLongpressed(kcVar.f1255a1);
        naVar.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = acVar.f1542x0;
        if (arrayList2 != null) {
            if (kcVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            naVar.f1489c = arrayList3;
            e9 e9Var = kcVar.O0;
            if (!(e9Var instanceof w8) && !(e9Var instanceof h9)) {
                naVar.f1488b = acVar.f1541w0;
            } else {
                MessageObject f7 = e9Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f7 == null) {
                    dialogId = acVar.f1541w0;
                } else {
                    dialogId = f7.getDialogId();
                }
                naVar.f1488b = dialogId;
            }
        } else {
            naVar.f1489c = null;
            naVar.f1488b = ((Long) acVar.A0.get(i10)).longValue();
        }
        naVar.addView(kaVar);
        kaVar.requestLayout();
        gVar.addView(naVar);
        return naVar;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
