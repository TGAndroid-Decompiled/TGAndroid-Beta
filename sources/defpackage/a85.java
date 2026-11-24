package defpackage;

import android.graphics.Canvas;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;
public final class a85 extends a {
    public final di2 G1;
    public final g95 H1;

    public a85(g95 g95Var, LaunchActivity launchActivity, di2 di2Var) {
        super(launchActivity, null);
        this.H1 = g95Var;
        this.G1 = di2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - gm.L(1.0f));
            di2 di2Var = this.G1;
            di2Var.f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            di2Var.draw(canvas);
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
