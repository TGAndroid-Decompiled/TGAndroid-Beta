package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.p60;
public final class u9 extends z4.a {
    public final ArrayList f3799c = new ArrayList();
    public final Context d;
    public final sb e;
    public final org.telegram.ui.ActionBar.c6 f3800f;
    public final ib f3801g;

    public u9(ib ibVar, Context context, sb sbVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f3801g = ibVar;
        this.d = context;
        this.e = sbVar;
        this.f3800f = c6Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        q5 q5Var = (q5) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(q5Var);
        this.f3799c.add(q5Var);
    }

    @Override
    public final int b() {
        ib ibVar = this.f3801g;
        ArrayList arrayList = ibVar.f3989x0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return ibVar.A0.size();
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        q5 t9Var;
        long dialogId;
        Context context = this.d;
        ib ibVar = this.f3801g;
        w9 w9Var = new w9(ibVar, context);
        ArrayList arrayList = this.f3799c;
        boolean isEmpty = arrayList.isEmpty();
        sb sbVar = this.e;
        if (!isEmpty) {
            t9Var = (q5) arrayList.remove(0);
            t9Var.f3552o1.f3313a.getImageReceiver().setVisible(true, true);
            if (t9Var.f3524e2 != null) {
                t9Var.f3512b2.N0();
                t9Var.f3512b2.setAlpha(1.0f - t9Var.f3522d4);
            }
            gl0 gl0Var = t9Var.f3527f2;
            if (gl0Var != null) {
                gl0Var.n();
            }
            gl0 gl0Var2 = t9Var.f3563r3;
            if (gl0Var2 != null) {
                gl0Var2.n();
            }
            p60 p60Var = t9Var.J2;
            if (p60Var != null) {
                AndroidUtilities.removeFromParent(p60Var);
                t9Var.J2.c(true);
                t9Var.J2 = null;
            }
            t9Var.setActive(false);
            t9Var.setIsVisible(false);
            t9Var.L2 = false;
            t9Var.O2.d(0.0f, false);
            t9Var.l1 = null;
            t9Var.f3537i3 = false;
            t9Var.p0();
        } else {
            t9Var = new t9(this, this.d, sbVar, ibVar.H0, this.f3800f);
        }
        w9Var.f3927a = t9Var;
        t9Var.setAccount(ibVar.f3990y0);
        t9Var.setDelegate(ibVar.B0);
        t9Var.setLongpressed(sbVar.f3666a1);
        w9Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = ibVar.f3989x0;
        if (arrayList2 != null) {
            if (sbVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            w9Var.f3929c = arrayList3;
            o8 o8Var = sbVar.O0;
            if (!(o8Var instanceof g8) && !(o8Var instanceof r8)) {
                w9Var.f3928b = ibVar.f3988w0;
            } else {
                MessageObject f7 = o8Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f7 == null) {
                    dialogId = ibVar.f3988w0;
                } else {
                    dialogId = f7.getDialogId();
                }
                w9Var.f3928b = dialogId;
            }
        } else {
            w9Var.f3929c = null;
            w9Var.f3928b = ((Long) ibVar.A0.get(i10)).longValue();
        }
        w9Var.addView(t9Var);
        t9Var.requestLayout();
        gVar.addView(w9Var);
        return w9Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
