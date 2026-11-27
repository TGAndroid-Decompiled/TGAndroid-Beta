package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
public final class aq8 extends zb3 {
    public int F = -1;
    public final ProfileActivity G;

    public aq8(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j, long j2, long j3) {
        return 0L;
    }

    @Override
    public final void N() {
        hl.c3(new uk8(this, (byte) 6));
    }

    @Override
    public final void P(f89 f89Var) {
        RectF rectF = ProfileActivity.Z6;
        this.G.J3();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new pv7(this, (byte) 16));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().p(null, this.F, true);
        }
        super.m();
    }
}
