package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class nq8 extends de8 {
    public final ProfileActivity T;

    public nq8(ProfileActivity profileActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = profileActivity;
    }

    @Override
    public final void c(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        a aVar;
        a aVar2;
        a aVar3;
        if (f > 0.0f) {
            RectF rectF = hl.P;
            ProfileActivity profileActivity = this.T;
            rectF.set(0.0f, 0.0f, profileActivity.o0.getMeasuredWidth(), hl.L(30.0f) + profileActivity.o0.getMeasuredHeight());
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f), 31);
            profileActivity.Z.draw(canvas);
            canvas.save();
            aVar = ((e) profileActivity).actionBar;
            float x = aVar.getX();
            aVar2 = ((e) profileActivity).actionBar;
            canvas.translate(x, aVar2.getY());
            aVar3 = ((e) profileActivity).actionBar;
            aVar3.draw(canvas);
            canvas.restore();
            e29 e29Var = profileActivity.s;
            if (e29Var != null && e29Var.getVisibility() == 0 && profileActivity.s.getAlpha() > 0.0f) {
                canvas.save();
                float f6 = (f * 0.5f) + 0.5f;
                canvas.scale(f6, f6, (profileActivity.s.getMeasuredWidth() / 2.0f) + profileActivity.s.getX(), (profileActivity.s.getMeasuredHeight() / 2.0f) + profileActivity.s.getY());
                canvas.translate(profileActivity.s.getX(), profileActivity.s.getY());
                profileActivity.s.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        super.e();
        ProfileActivity profileActivity = this.T;
        profileActivity.fragmentView.invalidate();
        for (int i = 0; i < profileActivity.o0.getChildCount(); i++) {
            profileActivity.o0.getChildAt(i).invalidate();
        }
        e29 e29Var = profileActivity.s;
        if (e29Var != null) {
            e29Var.invalidate();
        }
    }

    @Override
    public final boolean i(ViewGroup viewGroup, ImageReceiver imageReceiver) {
        if (super.i(viewGroup, imageReceiver) && this.T.a.getScrollState() != 1) {
            return true;
        }
        return false;
    }
}
