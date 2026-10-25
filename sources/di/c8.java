package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.o60;
public final class c8 extends a5.a {
    public final ArrayList f8460c = new ArrayList();
    public final Context d;
    public final y9 e;
    public final org.telegram.ui.ActionBar.u6 f8461f;
    public final o9 f8462g;

    public c8(o9 o9Var, Context context, y9 y9Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f8462g = o9Var;
        this.d = context;
        this.e = y9Var;
        this.f8461f = u6Var;
    }

    @Override
    public final void a(a5.m mVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        mVar.removeView(frameLayout);
        q4 q4Var = (q4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(q4Var);
        this.f8460c.add(q4Var);
    }

    @Override
    public final int b() {
        o9 o9Var = this.f8462g;
        ArrayList arrayList = o9Var.f8564x0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return o9Var.A0.size();
    }

    @Override
    public final Object e(a5.m mVar, int i10) {
        q4 b8Var;
        long dialogId;
        Context context = this.d;
        o9 o9Var = this.f8462g;
        e8 e8Var = new e8(o9Var, context);
        ArrayList arrayList = this.f8460c;
        boolean isEmpty = arrayList.isEmpty();
        y9 y9Var = this.e;
        if (!isEmpty) {
            b8Var = (q4) arrayList.remove(0);
            b8Var.f8973d1.f8776a.getImageReceiver().setVisible(true, true);
            if (b8Var.T1 != null) {
                b8Var.Q1.N0();
                b8Var.Q1.setAlpha(1.0f - b8Var.S3);
            }
            fl0 fl0Var = b8Var.U1;
            if (fl0Var != null) {
                fl0Var.n();
            }
            fl0 fl0Var2 = b8Var.f8984g3;
            if (fl0Var2 != null) {
                fl0Var2.n();
            }
            o60 o60Var = b8Var.f9049y2;
            if (o60Var != null) {
                AndroidUtilities.removeFromParent(o60Var);
                b8Var.f9049y2.c(true);
                b8Var.f9049y2 = null;
            }
            b8Var.setActive(false);
            b8Var.setIsVisible(false);
            b8Var.A2 = false;
            b8Var.D2.d(0.0f, false);
            b8Var.f8965a1 = null;
            b8Var.X2 = false;
            b8Var.n0();
        } else {
            b8Var = new b8(this, this.d, y9Var, o9Var.H0, this.f8461f);
        }
        e8Var.f8526a = b8Var;
        b8Var.setAccount(o9Var.f8565y0);
        b8Var.setDelegate(o9Var.B0);
        b8Var.setLongpressed(y9Var.f9418a1);
        e8Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = o9Var.f8564x0;
        if (arrayList2 != null) {
            if (y9Var.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            e8Var.f8528c = arrayList3;
            z6 z6Var = y9Var.O0;
            if (!(z6Var instanceof t6) && !(z6Var instanceof c7)) {
                e8Var.f8527b = o9Var.f8563w0;
            } else {
                MessageObject f7 = z6Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f7 == null) {
                    dialogId = o9Var.f8563w0;
                } else {
                    dialogId = f7.getDialogId();
                }
                e8Var.f8527b = dialogId;
            }
        } else {
            e8Var.f8528c = null;
            e8Var.f8527b = ((Long) o9Var.A0.get(i10)).longValue();
        }
        e8Var.addView(b8Var);
        b8Var.requestLayout();
        mVar.addView(e8Var);
        return e8Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
