package ki;

import android.content.Context;
import android.widget.FrameLayout;
public final class j2 extends r3 {
    public final int f18762d0;
    public final Object f18763e0;

    public j2(int i7, Context context, Object obj) {
        super(context);
        this.f18762d0 = i7;
        this.f18763e0 = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: ki.j2.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.f18762d0) {
            case 0:
                if (!((s2) this.f18763e0).H) {
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
        switch (this.f18762d0) {
            case 0:
                super.setTranslationY(f10);
                s2 s2Var = (s2) this.f18763e0;
                org.telegram.messenger.h2 h2Var = s2Var.f18947o0;
                if (h2Var != null) {
                    h2Var.setTranslationY(org.telegram.messenger.g0.L(24.0f) + f10);
                }
                FrameLayout frameLayout = s2Var.f18951r0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(24.0f);
                    int L = org.telegram.messenger.g0.L(70.0f) + s2Var.f18945n.top;
                    frameLayout.setTranslationY(s2Var.f18959x.getTranslationY() + org.telegram.messenger.g0.W1(s2Var.f18940h0, currentActionBarHeight, L));
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
