package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class y20 extends FrameLayout {
    public final bf0[] a;
    public boolean b;
    public AnimatorSet c;
    public long d;
    public final i30 e;

    public y20(i30 i30Var, Activity activity) {
        super(activity);
        this.e = i30Var;
        this.a = new bf0[2];
        for (int i = 0; i < 2; i++) {
            this.a[i] = new bf0(activity);
            this.a[i].getImageReceiver().h1 = new ji(this, i, (byte) 1);
            this.a[i].setRoundRadius(gm.L(4.0f));
            if (i == 1) {
                this.a[i].setVisibility(8);
            }
            addView(this.a[i], qoe.c(-1.0f, -1));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        i30 i30Var = this.e;
        if (action == 0) {
            if (this.a[this.b ? 1 : 0].getImageReceiver().B()) {
                i30Var.Q0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            i30Var.Q0(false, true);
        }
        return true;
    }
}
