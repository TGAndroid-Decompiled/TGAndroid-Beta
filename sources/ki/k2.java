package ki;

import android.content.Context;
import android.widget.FrameLayout;
public final class k2 extends s3 {
    public final int f18752d0;
    public final Object f18753e0;

    public k2(int i7, Context context, Object obj) {
        super(context);
        this.f18752d0 = i7;
        this.f18753e0 = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: ki.k2.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.f18752d0) {
            case 0:
                if (!((t2) this.f18753e0).H) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f18752d0) {
            case 0:
                super.setTranslationY(f10);
                t2 t2Var = (t2) this.f18753e0;
                org.telegram.messenger.h2 h2Var = t2Var.f18937o0;
                if (h2Var != null) {
                    h2Var.setTranslationY(org.telegram.messenger.g0.L(24.0f) + f10);
                }
                FrameLayout frameLayout = t2Var.f18941r0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(24.0f);
                    int L = org.telegram.messenger.g0.L(70.0f) + t2Var.f18935n.top;
                    frameLayout.setTranslationY(t2Var.f18949x.getTranslationY() + org.telegram.messenger.g0.W1(t2Var.f18930h0, currentActionBarHeight, L));
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
