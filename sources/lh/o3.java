package lh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l81;
public final class o3 extends l81 {
    public final g5 Q;

    public o3(g5 g5Var, Context context) {
        super(context, null);
        this.Q = g5Var;
    }

    @Override
    public final void E(View view, float f10) {
        int i10;
        View view2;
        kh.l3 l3Var;
        kh.l3 l3Var2;
        q3 q3Var;
        q3 q3Var2;
        q3 q3Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f10);
            return;
        }
        float clamp = Utilities.clamp(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        g5 g5Var = this.Q;
        i10 = ((org.telegram.ui.ActionBar.g3) g5Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f10);
        float f11 = 0.0f;
        if (clamp <= 0.0f) {
            f11 = view.getMeasuredWidth();
        }
        view.setPivotX(f11);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                l3Var = g5Var.Y;
                if (l3Var != null && view2 == l3Var.V && (q3Var3 = l3Var.f12450a0) != null) {
                    q3Var3.invalidate();
                }
                if (view2 == g5Var.V && (q3Var2 = g5Var.f12450a0) != null) {
                    q3Var2.invalidate();
                }
                l3Var2 = g5Var.Z;
                if (l3Var2 == null && view2 == l3Var2.V && (q3Var = l3Var2.f12450a0) != null) {
                    q3Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        l3Var = g5Var.Y;
        if (l3Var != null) {
            q3Var3.invalidate();
        }
        if (view2 == g5Var.V) {
            q3Var2.invalidate();
        }
        l3Var2 = g5Var.Z;
        if (l3Var2 == null) {
        }
    }

    @Override
    public final void F() {
        super.F();
        int i10 = this.f26617b;
        g5 g5Var = this.Q;
        boolean z4 = false;
        if (i10 != g5Var.L1(false)) {
            if (this.f26617b > g5Var.L1(false)) {
                z4 = true;
            }
            AndroidUtilities.runOnUIThread(new jh.f(4, this, z4));
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        c5.d dVar = this.Q.V0;
        if (dVar != null && !dVar.c(0)) {
            return false;
        }
        return true;
    }
}
