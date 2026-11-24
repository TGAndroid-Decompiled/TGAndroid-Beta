package defpackage;

import android.view.ViewTreeObserver;
public final class ni3 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public ni3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((ih3) obj).a.f0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                gl.e3((sma) obj2, 100L);
                return false;
            case 1:
                h75 h75Var = (h75) obj;
                h75Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                h75Var.i4 = null;
                h75Var.T3.h((gc2) obj2);
                gl.W3(h75Var.e4);
                h75Var.b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                vx8 vx8Var = (vx8) obj;
                t11 t11Var = vx8Var.X;
                if (t11Var != null) {
                    int[] iArr = vx8.e0;
                    t11Var.getLocationInWindow(iArr);
                    float f2 = iArr[0];
                    float translationY = iArr[1] - vx8Var.X.getTranslationY();
                    t11 t11Var2 = vx8Var.X;
                    if (t11Var2.top) {
                        f = t11Var2.getTopOffset();
                    } else {
                        f = -t11Var2.getBottomOffset();
                    }
                    vx8Var.a.getLocationInWindow(iArr);
                    vx8Var.Y = (vx8Var.X.a.getMeasuredWidth() / 2.0f) + (f2 - iArr[0]) + vx8Var.X.a.getLeft();
                    vx8Var.Z = (vx8Var.X.a.getMeasuredHeight() / 2.0f) + ((translationY + f) - iArr[1]) + vx8Var.X.a.getTop();
                }
                vx8Var.c();
                return true;
        }
    }
}
