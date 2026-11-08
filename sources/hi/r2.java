package hi;

import android.content.Context;
import android.widget.FrameLayout;
public final class r2 extends b4 {
    public final int f14928c0;
    public final Object f14929d0;

    public r2(int i7, Context context, Object obj) {
        super(context);
        this.f14928c0 = i7;
        this.f14929d0 = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: hi.r2.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.f14928c0) {
            case 0:
                if (!((a3) this.f14929d0).G) {
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
        switch (this.f14928c0) {
            case 0:
                super.setTranslationY(f10);
                a3 a3Var = (a3) this.f14929d0;
                org.telegram.messenger.h2 h2Var = a3Var.f14528n0;
                if (h2Var != null) {
                    h2Var.setTranslationY(org.telegram.messenger.g0.L(24.0f) + f10);
                }
                FrameLayout frameLayout = a3Var.f14531q0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(24.0f);
                    int L = org.telegram.messenger.g0.L(70.0f) + a3Var.f14527n.top;
                    frameLayout.setTranslationY(a3Var.f14541x.getTranslationY() + org.telegram.messenger.g0.W1(a3Var.f14521g0, currentActionBarHeight, L));
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
