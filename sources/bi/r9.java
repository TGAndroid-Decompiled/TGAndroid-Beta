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
    public final ArrayList f3688c = new ArrayList();
    public final Context d;
    public final pb f3689e;
    public final org.telegram.ui.ActionBar.f6 f3690f;
    public final fb f3691g;

    public r9(fb fbVar, Context context, pb pbVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f3691g = fbVar;
        this.d = context;
        this.f3689e = pbVar;
        this.f3690f = f6Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        o5 o5Var = (o5) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(o5Var);
        this.f3688c.add(o5Var);
    }

    @Override
    public final int b() {
        fb fbVar = this.f3691g;
        ArrayList arrayList = fbVar.f3856x0;
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
        fb fbVar = this.f3691g;
        t9 t9Var = new t9(fbVar, context);
        ArrayList arrayList = this.f3688c;
        boolean isEmpty = arrayList.isEmpty();
        pb pbVar = this.f3689e;
        if (!isEmpty) {
            q9Var = (o5) arrayList.remove(0);
            q9Var.f3472o1.f3222a.getImageReceiver().setVisible(true, true);
            if (q9Var.f3445e2 != null) {
                q9Var.f3433b2.P0();
                q9Var.f3433b2.setAlpha(1.0f - q9Var.f3443d4);
            }
            fk0 fk0Var = q9Var.f3448f2;
            if (fk0Var != null) {
                fk0Var.n();
            }
            fk0 fk0Var2 = q9Var.f3483r3;
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
            q9Var.f3458i3 = false;
            q9Var.p0();
        } else {
            q9Var = new q9(this, this.d, pbVar, fbVar.H0, this.f3690f);
        }
        t9Var.f3776a = q9Var;
        q9Var.setAccount(fbVar.f3857y0);
        q9Var.setDelegate(fbVar.B0);
        q9Var.setLongpressed(pbVar.f3560a1);
        t9Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = fbVar.f3856x0;
        if (arrayList2 != null) {
            if (pbVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            t9Var.f3778c = arrayList3;
            l8 l8Var = pbVar.O0;
            if (!(l8Var instanceof d8) && !(l8Var instanceof o8)) {
                t9Var.f3777b = fbVar.f3855w0;
            } else {
                MessageObject f7 = l8Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f7 == null) {
                    dialogId = fbVar.f3855w0;
                } else {
                    dialogId = f7.getDialogId();
                }
                t9Var.f3777b = dialogId;
            }
        } else {
            t9Var.f3778c = null;
            t9Var.f3777b = ((Long) fbVar.A0.get(i10)).longValue();
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
