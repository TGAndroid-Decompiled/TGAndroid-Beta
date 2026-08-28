package gh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.n71;
public final class q3 extends n71 {
    public final k5 P;

    public q3(k5 k5Var, Context context) {
        super(context, null);
        this.P = k5Var;
    }

    @Override
    public final void E(View view, float f10) {
        int i9;
        View view2;
        fh.x3 x3Var;
        fh.x3 x3Var2;
        s3 s3Var;
        s3 s3Var2;
        s3 s3Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f10);
            return;
        }
        float clamp = Utilities.clamp(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        k5 k5Var = this.P;
        i9 = ((org.telegram.ui.ActionBar.f3) k5Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i9) + f10);
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
                x3Var = k5Var.X;
                if (x3Var != null && view2 == x3Var.U && (s3Var3 = x3Var.Z) != null) {
                    s3Var3.invalidate();
                }
                if (view2 == k5Var.U && (s3Var2 = k5Var.Z) != null) {
                    s3Var2.invalidate();
                }
                x3Var2 = k5Var.Y;
                if (x3Var2 == null && view2 == x3Var2.U && (s3Var = x3Var2.Z) != null) {
                    s3Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        x3Var = k5Var.X;
        if (x3Var != null) {
            s3Var3.invalidate();
        }
        if (view2 == k5Var.U) {
            s3Var2.invalidate();
        }
        x3Var2 = k5Var.Y;
        if (x3Var2 == null) {
        }
    }

    @Override
    public final void F() {
        super.F();
        int i9 = this.f31033b;
        k5 k5Var = this.P;
        boolean z10 = false;
        if (i9 != k5Var.L1(false)) {
            if (this.f31033b > k5Var.L1(false)) {
                z10 = true;
            }
            AndroidUtilities.runOnUIThread(new eh.f(3, this, z10));
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        l4 l4Var = this.P.U0;
        if (l4Var != null && !l4Var.c(0)) {
            return false;
        }
        return true;
    }
}
