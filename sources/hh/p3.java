package hh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.p71;

public final class p3 extends p71 {
    public final i5 P;

    public p3(i5 i5Var, Context context) {
        super(context, null);
        this.P = i5Var;
    }

    @Override
    public final void E(View view, float f10) {
        View childAt;
        r3 r3Var;
        r3 r3Var2;
        r3 r3Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f10);
            return;
        }
        float fClamp = Utilities.clamp(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        i5 i5Var = this.P;
        view.setTranslationX(((-fClamp) * 2.0f * ((org.telegram.ui.ActionBar.e3) i5Var).backgroundPaddingLeft) + f10);
        view.setPivotX(fClamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * fClamp));
        view.setRotationY(fClamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                childAt = frameLayout.getChildAt(0);
            } else {
                childAt = null;
            }
        } else {
            childAt = null;
        }
        gh.s3 s3Var = i5Var.X;
        if (s3Var != null && childAt == s3Var.U && (r3Var3 = s3Var.Z) != null) {
            r3Var3.invalidate();
        }
        if (childAt == i5Var.U && (r3Var2 = i5Var.Z) != null) {
            r3Var2.invalidate();
        }
        gh.s3 s3Var2 = i5Var.Y;
        if (s3Var2 == null || childAt != s3Var2.U || (r3Var = s3Var2.Z) == null) {
            return;
        }
        r3Var.invalidate();
    }

    @Override
    public final void F() {
        super.F();
        int i10 = this.f31543b;
        i5 i5Var = this.P;
        if (i10 != i5Var.L1(false)) {
            AndroidUtilities.runOnUIThread(new fh.f(3, this, this.f31543b > i5Var.L1(false)));
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        j4 j4Var = this.P.U0;
        return j4Var == null || j4Var.c(0);
    }
}
