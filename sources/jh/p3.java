package jh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.z71;
public final class p3 extends z71 {
    public final h5 P;

    public p3(h5 h5Var, Context context) {
        super(context, null);
        this.P = h5Var;
    }

    @Override
    public final void E(View view, float f9) {
        int i10;
        View view2;
        ih.m3 m3Var;
        ih.m3 m3Var2;
        r3 r3Var;
        r3 r3Var2;
        r3 r3Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f9);
            return;
        }
        float clamp = Utilities.clamp(f9 / getMeasuredWidth(), 1.0f, -1.0f);
        h5 h5Var = this.P;
        i10 = ((org.telegram.ui.ActionBar.f3) h5Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f9);
        float f10 = 0.0f;
        if (clamp <= 0.0f) {
            f10 = view.getMeasuredWidth();
        }
        view.setPivotX(f10);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                m3Var = h5Var.X;
                if (m3Var != null && view2 == m3Var.U && (r3Var3 = m3Var.Z) != null) {
                    r3Var3.invalidate();
                }
                if (view2 == h5Var.U && (r3Var2 = h5Var.Z) != null) {
                    r3Var2.invalidate();
                }
                m3Var2 = h5Var.Y;
                if (m3Var2 == null && view2 == m3Var2.U && (r3Var = m3Var2.Z) != null) {
                    r3Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        m3Var = h5Var.X;
        if (m3Var != null) {
            r3Var3.invalidate();
        }
        if (view2 == h5Var.U) {
            r3Var2.invalidate();
        }
        m3Var2 = h5Var.Y;
        if (m3Var2 == null) {
        }
    }

    @Override
    public final void F() {
        super.F();
        int i10 = this.f35259b;
        h5 h5Var = this.P;
        boolean z10 = false;
        if (i10 != h5Var.L1(false)) {
            if (this.f35259b > h5Var.L1(false)) {
                z10 = true;
            }
            AndroidUtilities.runOnUIThread(new hh.f(3, this, z10));
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        a5.d dVar = this.P.U0;
        if (dVar != null && !dVar.c(0)) {
            return false;
        }
        return true;
    }
}
