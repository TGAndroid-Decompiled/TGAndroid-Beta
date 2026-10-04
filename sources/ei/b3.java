package ei;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
public final class b3 extends q4 {
    public final int f8941c0;
    public final Object f8942d0;

    public b3(Object obj, Context context, int i10) {
        super(context);
        this.f8941c0 = i10;
        this.f8942d0 = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: ei.b3.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.f8941c0) {
            case 0:
                if (!((l3) this.f8942d0).F) {
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
        switch (this.f8941c0) {
            case 0:
                super.setTranslationY(f7);
                l3 l3Var = (l3) this.f8942d0;
                BotFullscreenButtons botFullscreenButtons = l3Var.m0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f7);
                }
                FrameLayout frameLayout = l3Var.f9169p0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f);
                    int i10 = l3Var.h.top;
                    frameLayout.setTranslationY(l3Var.v.getTranslationY() + AndroidUtilities.lerp(currentActionBarHeight, AndroidUtilities.dp(70.0f) + i10, l3Var.f9159f0));
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
