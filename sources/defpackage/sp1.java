package defpackage;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class sp1 extends FrameLayout {
    public final mu1 a;

    public sp1(mu1 mu1Var, Activity activity) {
        super(activity);
        this.a = mu1Var;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.a.F5(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i2), gl.L(300.0f));
        if (min == 0) {
            min = gl.L(300.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE));
    }
}
