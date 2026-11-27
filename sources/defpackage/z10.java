package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class z10 extends FrameLayout {
    public final de0[] a;
    public boolean b;
    public AnimatorSet c;
    public long d;
    public final j20 e;

    public z10(j20 j20Var, Activity activity) {
        super(activity);
        this.e = j20Var;
        this.a = new de0[2];
        for (int i = 0; i < 2; i++) {
            this.a[i] = new de0(activity);
            this.a[i].getImageReceiver().h1 = new wg(this, i, (byte) 1);
            this.a[i].setRoundRadius(hl.L(4.0f));
            if (i == 1) {
                this.a[i].setVisibility(8);
            }
            addView(this.a[i], tre.c(-1.0f, -1));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        j20 j20Var = this.e;
        if (action == 0) {
            if (this.a[this.b ? 1 : 0].getImageReceiver().B()) {
                j20Var.R0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            j20Var.R0(false, true);
        }
        return true;
    }
}
