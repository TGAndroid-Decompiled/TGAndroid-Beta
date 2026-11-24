package defpackage;

import android.view.ViewTreeObserver;
public final class xj3 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public xj3(Object obj, Object obj2, byte b) {
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
                ((ui3) obj).a.f0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                gm.d3((toa) obj2, 100L);
                return false;
            case 1:
                g95 g95Var = (g95) obj;
                g95Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                g95Var.i4 = null;
                g95Var.T3.h((rd2) obj2);
                gm.V3(g95Var.e4);
                g95Var.b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                wz8 wz8Var = (wz8) obj;
                b31 b31Var = wz8Var.X;
                if (b31Var != null) {
                    int[] iArr = wz8.e0;
                    b31Var.getLocationInWindow(iArr);
                    float f2 = iArr[0];
                    float translationY = iArr[1] - wz8Var.X.getTranslationY();
                    b31 b31Var2 = wz8Var.X;
                    if (b31Var2.top) {
                        f = b31Var2.getTopOffset();
                    } else {
                        f = -b31Var2.getBottomOffset();
                    }
                    wz8Var.a.getLocationInWindow(iArr);
                    wz8Var.Y = (wz8Var.X.a.getMeasuredWidth() / 2.0f) + (f2 - iArr[0]) + wz8Var.X.a.getLeft();
                    wz8Var.Z = (wz8Var.X.a.getMeasuredHeight() / 2.0f) + ((translationY + f) - iArr[1]) + wz8Var.X.a.getTop();
                }
                wz8Var.c();
                return true;
        }
    }
}
