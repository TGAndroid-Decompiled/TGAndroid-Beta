package defpackage;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class gq1 extends FrameLayout {
    public final zu1 a;

    public gq1(zu1 zu1Var, Activity activity) {
        super(activity);
        this.a = zu1Var;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.a.M5(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i2), hl.L(300.0f));
        if (min == 0) {
            min = hl.L(300.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE));
    }
}
