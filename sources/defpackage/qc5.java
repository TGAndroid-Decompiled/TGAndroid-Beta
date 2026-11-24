package defpackage;

import android.location.Location;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class qc5 implements g59, lc6 {
    public final uc5 a;

    public qc5(uc5 uc5Var) {
        this.a = uc5Var;
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        uc5 uc5Var = this.a;
        Location location = uc5Var.V;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        uc5Var.U = messageMedia.address;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        boolean z = view instanceof vkb;
        uc5 uc5Var = this.a;
        if (z) {
            if (gm.H1(uc5Var)) {
                pc6 pc6Var = new pc6(4);
                pc6Var.m0 = 0L;
                pc6Var.M0 = new qc5(uc5Var);
                uc5Var.presentFragment(pc6Var);
            } else {
                return;
            }
        }
        if ((view instanceof xib) && uc5Var.Q != 5) {
            m8 m8Var = uc5Var.x;
            if (m8Var == null || !m8Var.isShowing()) {
                trc trcVar = new trc(uc5Var.getParentActivity(), null, new ai4(uc5Var, (byte) 6), true, 1, null);
                trcVar.B(uc5Var.X);
                m8 m8Var2 = new m8((ActionBarPopupWindow$ActionBarPopupWindowLayout) trcVar.b, -2, -2);
                uc5Var.x = m8Var2;
                m8Var2.e = true;
                m8Var2.c = (short) 220;
                m8Var2.setOutsideTouchable(true);
                uc5Var.x.setClippingEnabled(true);
                uc5Var.x.setAnimationStyle(2131755192);
                uc5Var.x.setFocusable(true);
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) trcVar.b).measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE));
                uc5Var.x.setInputMethodMode(2);
                uc5Var.x.getContentView().setFocusableInTouchMode(true);
                uc5Var.x.showAtLocation(uc5Var.getFragmentView(), 0, (int) (view.getX() + f), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) trcVar.b).getMeasuredHeight() / 2.0f) + view.getY() + f2));
                uc5Var.x.b();
            }
        }
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
