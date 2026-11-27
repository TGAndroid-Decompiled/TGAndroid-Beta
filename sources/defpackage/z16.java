package defpackage;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class z16 implements View.OnAttachStateChangeListener {
    public final LaunchActivity a;

    public z16(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.d1);
    }
}
