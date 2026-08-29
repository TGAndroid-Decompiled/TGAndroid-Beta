package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.s50;
public final class o7 extends m2.a {
    public final ArrayList f16023c = new ArrayList();
    public final Context d;
    public final i9 f16024e;
    public final org.telegram.ui.ActionBar.c6 f16025f;
    public final y8 f16026g;

    public o7(y8 y8Var, Context context, i9 i9Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f16026g = y8Var;
        this.d = context;
        this.f16024e = i9Var;
        this.f16025f = c6Var;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        d4 d4Var = (d4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(d4Var);
        this.f16023c.add(d4Var);
    }

    @Override
    public final int b() {
        y8 y8Var = this.f16026g;
        ArrayList arrayList = y8Var.f16179t0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return y8Var.f16182w0.size();
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        d4 n7Var;
        long dialogId;
        Context context = this.d;
        y8 y8Var = this.f16026g;
        q7 q7Var = new q7(y8Var, context);
        ArrayList arrayList = this.f16023c;
        boolean isEmpty = arrayList.isEmpty();
        i9 i9Var = this.f16024e;
        if (!isEmpty) {
            n7Var = (d4) arrayList.remove(0);
            n7Var.f15496k1.f16453a.getImageReceiver().setVisible(true, true);
            if (n7Var.a2 != null) {
                n7Var.X1.P0();
                n7Var.X1.setAlpha(1.0f - n7Var.Z3);
            }
            fk0 fk0Var = n7Var.f15471b2;
            if (fk0Var != null) {
                fk0Var.n();
            }
            fk0 fk0Var2 = n7Var.f15506n3;
            if (fk0Var2 != null) {
                fk0Var2.n();
            }
            s50 s50Var = n7Var.F2;
            if (s50Var != null) {
                AndroidUtilities.removeFromParent(s50Var);
                n7Var.F2.h(true);
                n7Var.F2 = null;
            }
            n7Var.setActive(false);
            n7Var.setIsVisible(false);
            n7Var.H2 = false;
            n7Var.K2.d(0.0f, false);
            n7Var.f15487h1 = null;
            n7Var.f15480e3 = false;
            n7Var.p0();
        } else {
            n7Var = new n7(this, this.d, i9Var, y8Var.D0, this.f16025f);
        }
        q7Var.f16132a = n7Var;
        n7Var.setAccount(y8Var.f16180u0);
        n7Var.setDelegate(y8Var.f16183x0);
        n7Var.setLongpressed(i9Var.W0);
        q7Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = y8Var.f16179t0;
        if (arrayList2 != null) {
            if (i9Var.N0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            q7Var.f16134c = arrayList3;
            k6 k6Var = i9Var.K0;
            if (!(k6Var instanceof e6) && !(k6Var instanceof n6)) {
                q7Var.f16133b = y8Var.f16178s0;
            } else {
                MessageObject f9 = k6Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f9 == null) {
                    dialogId = y8Var.f16178s0;
                } else {
                    dialogId = f9.getDialogId();
                }
                q7Var.f16133b = dialogId;
            }
        } else {
            q7Var.f16134c = null;
            q7Var.f16133b = ((Long) y8Var.f16182w0.get(i10)).longValue();
        }
        q7Var.addView(n7Var);
        n7Var.requestLayout();
        gVar.addView(q7Var);
        return q7Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
