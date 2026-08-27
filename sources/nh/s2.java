package nh;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.rl;

public final class s2 extends d4 {
    public final int V;
    public final Object W;

    public s2(Object obj, Context context, int i10) {
        super(context);
        this.V = i10;
        this.W = obj;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        switch (this.V) {
            case 0:
                b3 b3Var = (b3) this.W;
                x2 x2Var = b3Var.f18580h0;
                int size = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet()) {
                    i12 = (size / 5) * 2;
                } else {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i12 = (int) (size / 3.5f);
                    } else {
                        i12 = (size / 5) * 2;
                    }
                }
                if (i12 < 0) {
                    i12 = 0;
                }
                float f10 = i12;
                if (getOffsetY() != f10 && !b3Var.Y && b3Var.M0) {
                    b3Var.B = true;
                    setOffsetY(f10);
                    b3Var.B = false;
                    b3Var.M0 = false;
                }
                if (!b3Var.Z && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                    Point point2 = AndroidUtilities.displaySize;
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point2.x, point2.y) * 0.8f), 1073741824);
                }
                int size2 = View.MeasureSpec.getSize(i11);
                if (!b3Var.Z) {
                    size2 = (size2 - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                }
                if (x2Var != null && x2Var.getTotalHeight() > 0) {
                    size2 -= x2Var.getTotalHeight();
                }
                super.onMeasure(i10, rl.B(24.0f, size2, 1073741824));
                break;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i11) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(84.0f)) + ((e4) this.W).J, 1073741824));
                break;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.V) {
            case 0:
                if (!((b3) this.W).B) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.V) {
            case 0:
                super.setTranslationY(f10);
                b3 b3Var = (b3) this.W;
                BotFullscreenButtons botFullscreenButtons = b3Var.f18581i0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f10);
                }
                FrameLayout frameLayout = b3Var.f18584l0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(b3Var.v.getTranslationY() + AndroidUtilities.lerp(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(70.0f) + b3Var.h.top, b3Var.f18571b0));
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
