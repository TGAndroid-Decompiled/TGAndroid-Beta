package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.w50;
public final class r9 extends z4.a {
    public final ArrayList f3661c = new ArrayList();
    public final Context d;
    public final pb f3662e;
    public final org.telegram.ui.ActionBar.f6 f3663f;
    public final fb f3664g;

    public r9(fb fbVar, Context context, pb pbVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f3664g = fbVar;
        this.d = context;
        this.f3662e = pbVar;
        this.f3663f = f6Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        o5 o5Var = (o5) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(o5Var);
        this.f3661c.add(o5Var);
    }

    @Override
    public final int b() {
        fb fbVar = this.f3664g;
        ArrayList arrayList = fbVar.f3829x0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return fbVar.A0.size();
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        o5 q9Var;
        long dialogId;
        Context context = this.d;
        fb fbVar = this.f3664g;
        t9 t9Var = new t9(fbVar, context);
        ArrayList arrayList = this.f3661c;
        boolean isEmpty = arrayList.isEmpty();
        pb pbVar = this.f3662e;
        if (!isEmpty) {
            q9Var = (o5) arrayList.remove(0);
            q9Var.f3445o1.f3195a.getImageReceiver().setVisible(true, true);
            if (q9Var.f3418e2 != null) {
                q9Var.f3406b2.P0();
                q9Var.f3406b2.setAlpha(1.0f - q9Var.f3416d4);
            }
            fk0 fk0Var = q9Var.f3421f2;
            if (fk0Var != null) {
                fk0Var.n();
            }
            fk0 fk0Var2 = q9Var.f3456r3;
            if (fk0Var2 != null) {
                fk0Var2.n();
            }
            w50 w50Var = q9Var.J2;
            if (w50Var != null) {
                AndroidUtilities.removeFromParent(w50Var);
                q9Var.J2.h(true);
                q9Var.J2 = null;
            }
            q9Var.setActive(false);
            q9Var.setIsVisible(false);
            q9Var.L2 = false;
            q9Var.O2.d(0.0f, false);
            q9Var.l1 = null;
            q9Var.f3431i3 = false;
            q9Var.p0();
        } else {
            q9Var = new q9(this, this.d, pbVar, fbVar.H0, this.f3663f);
        }
        t9Var.f3749a = q9Var;
        q9Var.setAccount(fbVar.f3830y0);
        q9Var.setDelegate(fbVar.B0);
        q9Var.setLongpressed(pbVar.f3533a1);
        t9Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = fbVar.f3829x0;
        if (arrayList2 != null) {
            if (pbVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            t9Var.f3751c = arrayList3;
            l8 l8Var = pbVar.O0;
            if (!(l8Var instanceof d8) && !(l8Var instanceof o8)) {
                t9Var.f3750b = fbVar.f3828w0;
            } else {
                MessageObject f7 = l8Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f7 == null) {
                    dialogId = fbVar.f3828w0;
                } else {
                    dialogId = f7.getDialogId();
                }
                t9Var.f3750b = dialogId;
            }
        } else {
            t9Var.f3751c = null;
            t9Var.f3750b = ((Long) fbVar.A0.get(i10)).longValue();
        }
        t9Var.addView(q9Var);
        q9Var.requestLayout();
        gVar.addView(t9Var);
        return t9Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
