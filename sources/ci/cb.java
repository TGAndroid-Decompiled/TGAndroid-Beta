package ci;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class cb extends org.telegram.ui.Components.k9 {
    public yh.e H;
    public Path I;
    public RectF J;
    public Drawable K;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        RectF rectF = this.J;
        Path path = this.I;
        Drawable drawable = this.K;
        super.dispatchDraw(canvas);
        if (this.H == null) {
            this.H = yh.e.e(this);
        }
        if (this.H != null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            path.rewind();
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            canvas2 = canvas;
            this.H.c(canvas2, this, getWidth(), getHeight(), 1.0f, false);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        drawable.setBounds((getWidth() - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
        drawable.draw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        yh.e eVar = this.H;
        if (eVar != null) {
            eVar.a(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        yh.e eVar = this.H;
        if (eVar != null) {
            eVar.b(this);
        }
        super.onDetachedFromWindow();
    }
}
