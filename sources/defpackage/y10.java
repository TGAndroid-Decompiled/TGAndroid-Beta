package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class y10 extends FrameLayout {
    public final be0[] a;
    public boolean b;
    public AnimatorSet c;
    public long d;
    public final i20 e;

    public y10(i20 i20Var, Activity activity) {
        super(activity);
        this.e = i20Var;
        this.a = new be0[2];
        for (int i = 0; i < 2; i++) {
            this.a[i] = new be0(activity);
            this.a[i].getImageReceiver().h1 = new jh(this, i, (byte) 1);
            this.a[i].setRoundRadius(gl.L(4.0f));
            if (i == 1) {
                this.a[i].setVisibility(8);
            }
            addView(this.a[i], nme.c(-1.0f, -1));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        i20 i20Var = this.e;
        if (action == 0) {
            if (this.a[this.b ? 1 : 0].getImageReceiver().B()) {
                i20Var.Q0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            i20Var.Q0(false, true);
        }
        return true;
    }
}
