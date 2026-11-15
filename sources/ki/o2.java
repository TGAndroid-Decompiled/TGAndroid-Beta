package ki;

import android.content.Context;
import android.widget.FrameLayout;
public final class o2 extends x3 {
    public final int f18477d0;
    public final Object f18478e0;

    public o2(int i7, Context context, Object obj) {
        super(context);
        this.f18477d0 = i7;
        this.f18478e0 = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: ki.o2.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.f18477d0) {
            case 0:
                if (!((x2) this.f18478e0).H) {
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
        switch (this.f18477d0) {
            case 0:
                super.setTranslationY(f10);
                x2 x2Var = (x2) this.f18478e0;
                org.telegram.messenger.h2 h2Var = x2Var.f18671o0;
                if (h2Var != null) {
                    h2Var.setTranslationY(org.telegram.messenger.g0.L(24.0f) + f10);
                }
                FrameLayout frameLayout = x2Var.f18675r0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(24.0f);
                    int L = org.telegram.messenger.g0.L(70.0f) + x2Var.f18669n.top;
                    frameLayout.setTranslationY(x2Var.f18683x.getTranslationY() + org.telegram.messenger.g0.W1(x2Var.f18664h0, currentActionBarHeight, L));
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
