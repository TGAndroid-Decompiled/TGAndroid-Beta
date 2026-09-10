package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
public final class d3 extends t4 {
    public final int f6589c0;
    public final Object f6590d0;

    public d3(Object obj, Context context, int i10) {
        super(context);
        this.f6589c0 = i10;
        this.f6590d0 = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: di.d3.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.f6589c0) {
            case 0:
                if (!((n3) this.f6590d0).F) {
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
        switch (this.f6589c0) {
            case 0:
                super.setTranslationY(f7);
                n3 n3Var = (n3) this.f6590d0;
                BotFullscreenButtons botFullscreenButtons = n3Var.m0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f7);
                }
                FrameLayout frameLayout = n3Var.f6801p0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f);
                    int i10 = n3Var.h.top;
                    frameLayout.setTranslationY(n3Var.v.getTranslationY() + AndroidUtilities.lerp(currentActionBarHeight, AndroidUtilities.dp(70.0f) + i10, n3Var.f6791f0));
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
