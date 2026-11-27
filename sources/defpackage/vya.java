package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class vya extends de0 {
    public mpa H;
    public Path I;
    public RectF J;
    public Drawable K;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        vya vyaVar;
        Canvas canvas2;
        RectF rectF = this.J;
        Path path = this.I;
        Drawable drawable = this.K;
        super.dispatchDraw(canvas);
        mpa mpaVar = this.H;
        if (mpaVar == null) {
            mpaVar = mpa.e(this);
            this.H = mpaVar;
        }
        if (mpaVar != null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            path.rewind();
            path.addRoundRect(rectF, hl.L(24.0f), hl.L(24.0f), Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            vyaVar = this;
            canvas2 = canvas;
            this.H.c(canvas2, vyaVar, getWidth(), getHeight(), 1.0f, false);
            canvas2.restore();
        } else {
            vyaVar = this;
            canvas2 = canvas;
        }
        drawable.setBounds((vyaVar.getWidth() - drawable.getIntrinsicWidth()) / 2, (vyaVar.getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + vyaVar.getWidth()) / 2, (drawable.getIntrinsicHeight() + vyaVar.getHeight()) / 2);
        drawable.draw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        mpa mpaVar = this.H;
        if (mpaVar != null) {
            mpaVar.a(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        mpa mpaVar = this.H;
        if (mpaVar != null) {
            mpaVar.b(this);
        }
        super.onDetachedFromWindow();
    }
}
