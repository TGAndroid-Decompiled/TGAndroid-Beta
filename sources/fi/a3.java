package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
public final class a3 extends q4 {
    public final int f9547c0;
    public final Object f9548d0;

    public a3(Object obj, Context context, int i10) {
        super(context);
        this.f9547c0 = i10;
        this.f9548d0 = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: fi.a3.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.f9547c0) {
            case 0:
                if (!((k3) this.f9548d0).F) {
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
        switch (this.f9547c0) {
            case 0:
                super.setTranslationY(f7);
                k3 k3Var = (k3) this.f9548d0;
                BotFullscreenButtons botFullscreenButtons = k3Var.m0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f7);
                }
                FrameLayout frameLayout = k3Var.f9778p0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f);
                    int i10 = k3Var.h.top;
                    frameLayout.setTranslationY(k3Var.v.getTranslationY() + AndroidUtilities.lerp(currentActionBarHeight, AndroidUtilities.dp(70.0f) + i10, k3Var.f9768f0));
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
