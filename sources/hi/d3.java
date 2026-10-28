package hi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
public final class d3 extends n4 {
    public final int f12943c0;
    public final Object f12944d0;

    public d3(Object obj, Context context, int i10) {
        super(context);
        this.f12943c0 = i10;
        this.f12944d0 = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: hi.d3.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.f12943c0) {
            case 0:
                if (!((m3) this.f12944d0).G) {
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
        switch (this.f12943c0) {
            case 0:
                super.setTranslationY(f7);
                m3 m3Var = (m3) this.f12944d0;
                BotFullscreenButtons botFullscreenButtons = m3Var.f13117n0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f7);
                }
                FrameLayout frameLayout = m3Var.f13120q0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f);
                    int i10 = m3Var.f13116n.top;
                    frameLayout.setTranslationY(m3Var.f13128w.getTranslationY() + AndroidUtilities.lerp(currentActionBarHeight, AndroidUtilities.dp(70.0f) + i10, m3Var.f13110g0));
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
