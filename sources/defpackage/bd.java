package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class bd implements ViewTreeObserver.OnScrollChangedListener {
    public final byte a;
    public final Object b;

    public bd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onScrollChanged() {
        boolean z;
        xr5 xr5Var;
        byte b = this.a;
        boolean z2 = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                hd hdVar = ((cd) obj).d;
                if (hdVar.f != null && hdVar.w.getScrollY() > hdVar.x.getTop()) {
                    z = true;
                } else {
                    z = false;
                }
                hdVar.i(0, z);
                if (hdVar.u0 != null) {
                    if (hdVar.w.getHeight() + hdVar.w.getScrollY() < hdVar.x.getBottom()) {
                        z2 = true;
                    }
                }
                hdVar.i(1, z2);
                hdVar.w.invalidate();
                return;
            case 1:
                ((jf4) obj).run();
                return;
            case 2:
                cs5 cs5Var = (cs5) obj;
                if (cs5Var.h0 != null && (xr5Var = cs5Var.m) != null && xr5Var.isShowing()) {
                    int[] iArr = new int[2];
                    cs5Var.h0.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int[] iArr2 = cs5Var.k0;
                    if (i != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i;
                        iArr2[1] = iArr[1];
                        cs5Var.P();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                koc kocVar = (koc) obj;
                if (kocVar.i1) {
                    kocVar.f0();
                    return;
                }
                return;
            default:
                lqc lqcVar = (lqc) obj;
                PopupWindow popupWindow = lqcVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    lqcVar.c();
                    return;
                }
                return;
        }
    }
}
