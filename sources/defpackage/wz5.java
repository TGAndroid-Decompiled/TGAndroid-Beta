package defpackage;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class wz5 implements View.OnAttachStateChangeListener {
    public final LaunchActivity a;

    public wz5(LaunchActivity launchActivity) {
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
