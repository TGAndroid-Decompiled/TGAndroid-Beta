package defpackage;

import android.location.Location;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class tc5 implements s69, qc6 {
    public final xc5 a;

    public tc5(xc5 xc5Var) {
        this.a = xc5Var;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        xc5 xc5Var = this.a;
        Location location = xc5Var.V;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        xc5Var.U = messageMedia.address;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        boolean z = view instanceof qmb;
        xc5 xc5Var = this.a;
        if (z) {
            if (hl.H1(xc5Var)) {
                uc6 uc6Var = new uc6(4);
                uc6Var.m0 = 0L;
                uc6Var.M0 = new tc5(xc5Var);
                xc5Var.presentFragment(uc6Var);
            } else {
                return;
            }
        }
        if ((view instanceof skb) && xc5Var.Q != 5) {
            n8 n8Var = xc5Var.x;
            if (n8Var == null || !n8Var.isShowing()) {
                guc gucVar = new guc(xc5Var.getParentActivity(), null, new xh4(xc5Var, (byte) 6), true, 1, null);
                gucVar.B(xc5Var.X);
                n8 n8Var2 = new n8((ActionBarPopupWindow$ActionBarPopupWindowLayout) gucVar.b, -2, -2);
                xc5Var.x = n8Var2;
                n8Var2.e = true;
                n8Var2.c = (short) 220;
                n8Var2.setOutsideTouchable(true);
                xc5Var.x.setClippingEnabled(true);
                xc5Var.x.setAnimationStyle(2131755192);
                xc5Var.x.setFocusable(true);
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) gucVar.b).measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE));
                xc5Var.x.setInputMethodMode(2);
                xc5Var.x.getContentView().setFocusableInTouchMode(true);
                xc5Var.x.showAtLocation(xc5Var.getFragmentView(), 0, (int) (view.getX() + f), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) gucVar.b).getMeasuredHeight() / 2.0f) + view.getY() + f2));
                xc5Var.x.b();
            }
        }
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
