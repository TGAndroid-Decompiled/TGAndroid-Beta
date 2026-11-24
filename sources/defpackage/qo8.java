package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
public final class qo8 extends sc3 {
    public int F = -1;
    public final ProfileActivity G;

    public qo8(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j, long j2, long j3) {
        return 0L;
    }

    @Override
    public final void N() {
        gm.c3(new q78(this, (byte) 28));
    }

    @Override
    public final void P(u69 u69Var) {
        RectF rectF = ProfileActivity.e7;
        this.G.M3();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new fx7(this, (byte) 15));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().p(null, this.F, true);
        }
        super.m();
    }
}
