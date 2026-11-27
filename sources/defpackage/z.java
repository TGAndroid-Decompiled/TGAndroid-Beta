package defpackage;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class z implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public z(Object obj, Object obj2, byte b) {
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
                b1 b1Var = (b1) obj;
                d79 d79Var = b1Var.n1;
                kg5 kg5Var = (kg5) obj2;
                if (b1Var.y2 == kg5Var && kg5Var.getParent() != null) {
                    b1Var.k1(false);
                } else if (d79Var.getViewTreeObserver().isAlive()) {
                    d79Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 1:
                kg5 kg5Var2 = (kg5) obj2;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (kg5Var2.getParent() == null) {
                    if (chatActivityEnterView.getViewTreeObserver().isAlive()) {
                        chatActivityEnterView.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                } else {
                    int i = ChatActivityEnterView.X7;
                    chatActivityEnterView.w1(kg5Var2);
                }
                return true;
            case 2:
                ((ci3) obj).a.f0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                hl.d3((pqa) obj2, 100L);
                return false;
            case 3:
                j95 j95Var = (j95) obj;
                j95Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                j95Var.i4 = null;
                j95Var.T3.h((wc2) obj2);
                hl.V3(j95Var.e4);
                j95Var.b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                i19 i19Var = (i19) obj;
                c21 c21Var = i19Var.X;
                if (c21Var != null) {
                    int[] iArr = i19.e0;
                    c21Var.getLocationInWindow(iArr);
                    float f2 = iArr[0];
                    float translationY = iArr[1] - i19Var.X.getTranslationY();
                    c21 c21Var2 = i19Var.X;
                    if (c21Var2.top) {
                        f = c21Var2.getTopOffset();
                    } else {
                        f = -c21Var2.getBottomOffset();
                    }
                    i19Var.a.getLocationInWindow(iArr);
                    i19Var.Y = (i19Var.X.a.getMeasuredWidth() / 2.0f) + (f2 - iArr[0]) + i19Var.X.a.getLeft();
                    i19Var.Z = (i19Var.X.a.getMeasuredHeight() / 2.0f) + ((translationY + f) - iArr[1]) + i19Var.X.a.getTop();
                }
                i19Var.c();
                return true;
        }
    }
}
