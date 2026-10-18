package gi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
public final class u2 extends e4 {
    public final int f11502c0;
    public final Object f11503d0;

    public u2(Object obj, Context context, int i10) {
        super(context);
        this.f11502c0 = i10;
        this.f11503d0 = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: gi.u2.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.f11502c0) {
            case 0:
                if (!((d3) this.f11503d0).F) {
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
    public void setTranslationY(float f7) {
        switch (this.f11502c0) {
            case 0:
                super.setTranslationY(f7);
                d3 d3Var = (d3) this.f11503d0;
                BotFullscreenButtons botFullscreenButtons = d3Var.m0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f7);
                }
                FrameLayout frameLayout = d3Var.f11154p0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f);
                    int i10 = d3Var.h.top;
                    frameLayout.setTranslationY(d3Var.v.getTranslationY() + AndroidUtilities.lerp(currentActionBarHeight, AndroidUtilities.dp(70.0f) + i10, d3Var.f11144f0));
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
