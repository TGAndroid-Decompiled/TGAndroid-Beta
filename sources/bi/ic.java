package bi;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class ic extends org.telegram.ui.Components.l9 {
    public xh.e G;
    public Path H;
    public RectF I;
    public Drawable J;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        RectF rectF = this.I;
        Path path = this.H;
        Drawable drawable = this.J;
        super.dispatchDraw(canvas);
        if (this.G == null) {
            this.G = xh.e.e(this);
        }
        if (this.G != null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            path.rewind();
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            canvas2 = canvas;
            this.G.c(canvas2, this, getWidth(), getHeight(), 1.0f, false);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        drawable.setBounds((getWidth() - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
        drawable.draw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        xh.e eVar = this.G;
        if (eVar != null) {
            eVar.a(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        xh.e eVar = this.G;
        if (eVar != null) {
            eVar.b(this);
        }
        super.onDetachedFromWindow();
    }
}
