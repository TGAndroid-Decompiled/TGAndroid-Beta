package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class vwa extends bf0 {
    public qna H;
    public Path I;
    public RectF J;
    public Drawable K;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        vwa vwaVar;
        Canvas canvas2;
        RectF rectF = this.J;
        Path path = this.I;
        Drawable drawable = this.K;
        super.dispatchDraw(canvas);
        qna qnaVar = this.H;
        if (qnaVar == null) {
            qnaVar = qna.e(this);
            this.H = qnaVar;
        }
        if (qnaVar != null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            path.rewind();
            path.addRoundRect(rectF, gm.L(24.0f), gm.L(24.0f), Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            vwaVar = this;
            canvas2 = canvas;
            this.H.c(canvas2, vwaVar, getWidth(), getHeight(), 1.0f, false);
            canvas2.restore();
        } else {
            vwaVar = this;
            canvas2 = canvas;
        }
        drawable.setBounds((vwaVar.getWidth() - drawable.getIntrinsicWidth()) / 2, (vwaVar.getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + vwaVar.getWidth()) / 2, (drawable.getIntrinsicHeight() + vwaVar.getHeight()) / 2);
        drawable.draw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        qna qnaVar = this.H;
        if (qnaVar != null) {
            qnaVar.a(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        qna qnaVar = this.H;
        if (qnaVar != null) {
            qnaVar.b(this);
        }
        super.onDetachedFromWindow();
    }
}
