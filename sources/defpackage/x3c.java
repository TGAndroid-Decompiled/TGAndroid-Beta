package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
public final class x3c extends tpa {
    public final pm3 V;
    public final a4c W;

    public x3c(a4c a4cVar, Context context) {
        super(context);
        this.W = a4cVar;
        this.V = new pm3((byte) 7);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = hl.L(8.0f) + this.W.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - L, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        xpa.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = hl.P;
        rectF.set((getWidth() - L) - hl.L(24.0f), 0.0f, getWidth() - L, getHeight());
        this.V.r(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
