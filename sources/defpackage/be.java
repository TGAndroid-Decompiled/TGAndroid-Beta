package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class be implements ViewTreeObserver.OnScrollChangedListener {
    public final byte a;
    public final Object b;

    public be(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onScrollChanged() {
        boolean z;
        wt5 wt5Var;
        byte b = this.a;
        boolean z2 = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                he heVar = ((ce) obj).d;
                if (heVar.f != null && heVar.w.getScrollY() > heVar.x.getTop()) {
                    z = true;
                } else {
                    z = false;
                }
                heVar.i(0, z);
                if (heVar.u0 != null) {
                    if (heVar.w.getHeight() + heVar.w.getScrollY() < heVar.x.getBottom()) {
                        z2 = true;
                    }
                }
                heVar.i(1, z2);
                heVar.w.invalidate();
                return;
            case 1:
                ((if4) obj).run();
                return;
            case 2:
                bu5 bu5Var = (bu5) obj;
                if (bu5Var.h0 != null && (wt5Var = bu5Var.m) != null && wt5Var.isShowing()) {
                    int[] iArr = new int[2];
                    bu5Var.h0.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int[] iArr2 = bu5Var.k0;
                    if (i != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i;
                        iArr2[1] = iArr[1];
                        bu5Var.P();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                mqc mqcVar = (mqc) obj;
                if (mqcVar.i1) {
                    mqcVar.f0();
                    return;
                }
                return;
            default:
                nsc nscVar = (nsc) obj;
                PopupWindow popupWindow = nscVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    nscVar.c();
                    return;
                }
                return;
        }
    }
}
