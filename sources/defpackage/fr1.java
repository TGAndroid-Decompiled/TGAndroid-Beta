package defpackage;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class fr1 extends FrameLayout {
    public final yv1 a;

    public fr1(yv1 yv1Var, Activity activity) {
        super(activity);
        this.a = yv1Var;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.a.N5(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i2), gm.L(300.0f));
        if (min == 0) {
            min = gm.L(300.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE));
    }
}
