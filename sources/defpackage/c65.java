package defpackage;

import android.graphics.Canvas;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;
public final class c65 extends a {
    public final pg2 G1;
    public final h75 H1;

    public c65(h75 h75Var, LaunchActivity launchActivity, pg2 pg2Var) {
        super(launchActivity, null);
        this.H1 = h75Var;
        this.G1 = pg2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - gl.L(1.0f));
            pg2 pg2Var = this.G1;
            pg2Var.f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            pg2Var.draw(canvas);
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
