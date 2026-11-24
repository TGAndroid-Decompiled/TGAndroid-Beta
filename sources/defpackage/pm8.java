package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
public final class pm8 extends gb3 {
    public int F = -1;
    public final ProfileActivity G;

    public pm8(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j, long j2, long j3) {
        return 0L;
    }

    @Override
    public final void N() {
        gl.c3(new w88(this, (byte) 20));
    }

    @Override
    public final void P(s49 s49Var) {
        RectF rectF = ProfileActivity.Z6;
        this.G.I3();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new u28(this, (byte) 13));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().q(null, this.F, true);
        }
        super.m();
    }
}
