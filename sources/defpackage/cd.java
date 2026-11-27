package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class cd implements ViewTreeObserver.OnScrollChangedListener {
    public final byte a;
    public final Object b;

    public cd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onScrollChanged() {
        boolean z;
        zt5 zt5Var;
        byte b = this.a;
        boolean z2 = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                id idVar = ((dd) obj).d;
                if (idVar.f != null && idVar.w.getScrollY() > idVar.x.getTop()) {
                    z = true;
                } else {
                    z = false;
                }
                idVar.i(0, z);
                if (idVar.u0 != null) {
                    if (idVar.w.getHeight() + idVar.w.getScrollY() < idVar.x.getBottom()) {
                        z2 = true;
                    }
                }
                idVar.i(1, z2);
                idVar.w.invalidate();
                return;
            case 1:
                ((re4) obj).run();
                return;
            case 2:
                fu5 fu5Var = (fu5) obj;
                if (fu5Var.k0 != null && (zt5Var = fu5Var.m) != null && zt5Var.isShowing()) {
                    int[] iArr = new int[2];
                    fu5Var.k0.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int[] iArr2 = fu5Var.n0;
                    if (i != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i;
                        iArr2[1] = iArr[1];
                        fu5Var.P();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                wsc wscVar = (wsc) obj;
                if (wscVar.i1) {
                    wscVar.f0();
                    return;
                }
                return;
            default:
                zuc zucVar = (zuc) obj;
                PopupWindow popupWindow = zucVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    zucVar.c();
                    return;
                }
                return;
        }
    }
}
