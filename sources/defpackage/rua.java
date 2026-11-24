package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class rua extends be0 {
    public pla H;
    public Path I;
    public RectF J;
    public Drawable K;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        rua ruaVar;
        Canvas canvas2;
        RectF rectF = this.J;
        Path path = this.I;
        Drawable drawable = this.K;
        super.dispatchDraw(canvas);
        pla plaVar = this.H;
        if (plaVar == null) {
            plaVar = pla.e(this);
            this.H = plaVar;
        }
        if (plaVar != null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            path.rewind();
            path.addRoundRect(rectF, gl.L(24.0f), gl.L(24.0f), Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            ruaVar = this;
            canvas2 = canvas;
            this.H.c(canvas2, ruaVar, getWidth(), getHeight(), 1.0f, false);
            canvas2.restore();
        } else {
            ruaVar = this;
            canvas2 = canvas;
        }
        drawable.setBounds((ruaVar.getWidth() - drawable.getIntrinsicWidth()) / 2, (ruaVar.getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + ruaVar.getWidth()) / 2, (drawable.getIntrinsicHeight() + ruaVar.getHeight()) / 2);
        drawable.draw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        pla plaVar = this.H;
        if (plaVar != null) {
            plaVar.a(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        pla plaVar = this.H;
        if (plaVar != null) {
            plaVar.b(this);
        }
        super.onDetachedFromWindow();
    }
}
