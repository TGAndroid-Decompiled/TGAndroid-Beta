package lh;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class l9 extends org.telegram.ui.Components.p9 {
    public ih.j D;
    public Path E;
    public RectF F;
    public Drawable G;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        RectF rectF = this.F;
        Path path = this.E;
        Drawable drawable = this.G;
        super.dispatchDraw(canvas);
        if (this.D == null) {
            this.D = ih.j.e(this);
        }
        if (this.D != null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            canvas2 = canvas;
            this.D.c(canvas2, this, getWidth(), getHeight(), 1.0f, false);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        drawable.setBounds((getWidth() - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
        drawable.draw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        ih.j jVar = this.D;
        if (jVar != null) {
            jVar.a(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        ih.j jVar = this.D;
        if (jVar != null) {
            jVar.b(this);
        }
        super.onDetachedFromWindow();
    }
}
