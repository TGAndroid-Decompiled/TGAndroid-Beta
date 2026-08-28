package mh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
public final class t2 extends f4 {
    public final int V;
    public final Object W;

    public t2(Object obj, Context context, int i9) {
        super(context);
        this.V = i9;
        this.W = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: mh.t2.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.V) {
            case 0:
                if (!((c3) this.W).B) {
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
        switch (this.V) {
            case 0:
                super.setTranslationY(f10);
                c3 c3Var = (c3) this.W;
                BotFullscreenButtons botFullscreenButtons = c3Var.f17760i0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f10);
                }
                FrameLayout frameLayout = c3Var.f17763l0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f);
                    int i9 = c3Var.h.top;
                    frameLayout.setTranslationY(c3Var.v.getTranslationY() + AndroidUtilities.lerp(currentActionBarHeight, AndroidUtilities.dp(70.0f) + i9, c3Var.f17750b0));
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
