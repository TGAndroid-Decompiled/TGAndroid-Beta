package defpackage;

import android.graphics.Canvas;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;
public final class e85 extends a {
    public final hh2 G1;
    public final j95 H1;

    public e85(j95 j95Var, LaunchActivity launchActivity, hh2 hh2Var) {
        super(launchActivity, null);
        this.H1 = j95Var;
        this.G1 = hh2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - hl.L(1.0f));
            hh2 hh2Var = this.G1;
            hh2Var.f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            hh2Var.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f) {
        if (getAlpha() != f) {
            super.setAlpha(f);
            this.H1.b.invalidate();
        }
    }
}
