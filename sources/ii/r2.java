package ii;

import android.content.Context;
import android.widget.FrameLayout;
public final class r2 extends c4 {
    public final int f15199d0;
    public final Object f15200e0;

    public r2(int i3, Context context, Object obj) {
        super(context);
        this.f15199d0 = i3;
        this.f15200e0 = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: ii.r2.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.f15199d0) {
            case 0:
                if (!((a3) this.f15200e0).H) {
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
        switch (this.f15199d0) {
            case 0:
                super.setTranslationY(f10);
                a3 a3Var = (a3) this.f15200e0;
                org.telegram.messenger.h2 h2Var = a3Var.f14812o0;
                if (h2Var != null) {
                    h2Var.setTranslationY(org.telegram.messenger.g0.L(24.0f) + f10);
                }
                FrameLayout frameLayout = a3Var.f14816r0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(24.0f);
                    int L = org.telegram.messenger.g0.L(70.0f) + a3Var.f14810n.top;
                    frameLayout.setTranslationY(a3Var.f14824x.getTranslationY() + org.telegram.messenger.g0.W1(a3Var.f14805h0, currentActionBarHeight, L));
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
