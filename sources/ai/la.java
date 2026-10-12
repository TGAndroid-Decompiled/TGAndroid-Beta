package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.w60;
public final class la extends z4.a {
    public final ArrayList f1358c = new ArrayList();
    public final Context d;
    public final kc f1359e;
    public final org.telegram.ui.ActionBar.c6 f1360f;
    public final ac f1361g;

    public la(ac acVar, Context context, kc kcVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f1361g = acVar;
        this.d = context;
        this.f1359e = kcVar;
        this.f1360f = c6Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        f6 f6Var = (f6) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(f6Var);
        this.f1358c.add(f6Var);
    }

    @Override
    public final int b() {
        ac acVar = this.f1361g;
        ArrayList arrayList = acVar.f1540x0;
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
        ac acVar = this.f1361g;
        na naVar = new na(acVar, context);
        ArrayList arrayList = this.f1358c;
        boolean isEmpty = arrayList.isEmpty();
        kc kcVar = this.f1359e;
        if (!isEmpty) {
            kaVar = (f6) arrayList.remove(0);
            kaVar.f989o1.f709a.getImageReceiver().setVisible(true, true);
            if (kaVar.f962e2 != null) {
                kaVar.f950b2.S0();
                kaVar.f950b2.setAlpha(1.0f - kaVar.f960d4);
            }
            nl0 nl0Var = kaVar.f965f2;
            if (nl0Var != null) {
                nl0Var.n();
            }
            nl0 nl0Var2 = kaVar.f1000r3;
            if (nl0Var2 != null) {
                nl0Var2.n();
            }
            w60 w60Var = kaVar.J2;
            if (w60Var != null) {
                AndroidUtilities.removeFromParent(w60Var);
                kaVar.J2.c(true);
                kaVar.J2 = null;
            }
            kaVar.setActive(false);
            kaVar.setIsVisible(false);
            kaVar.L2 = false;
            kaVar.O2.d(0.0f, false);
            kaVar.l1 = null;
            kaVar.f975i3 = false;
            kaVar.p0();
        } else {
            kaVar = new ka(this, this.d, kcVar, acVar.H0, this.f1360f);
        }
        naVar.f1485a = kaVar;
        kaVar.setAccount(acVar.f1541y0);
        kaVar.setDelegate(acVar.B0);
        kaVar.setLongpressed(kcVar.f1253a1);
        naVar.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = acVar.f1540x0;
        if (arrayList2 != null) {
            if (kcVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            naVar.f1487c = arrayList3;
            e9 e9Var = kcVar.O0;
            if (!(e9Var instanceof w8) && !(e9Var instanceof h9)) {
                naVar.f1486b = acVar.f1539w0;
            } else {
                MessageObject f7 = e9Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f7 == null) {
                    dialogId = acVar.f1539w0;
                } else {
                    dialogId = f7.getDialogId();
                }
                naVar.f1486b = dialogId;
            }
        } else {
            naVar.f1487c = null;
            naVar.f1486b = ((Long) acVar.A0.get(i10)).longValue();
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
