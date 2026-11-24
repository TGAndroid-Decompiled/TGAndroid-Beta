package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
public final class yzb extends wla {
    public final xl3 V;
    public final b0c W;

    public yzb(b0c b0cVar, Context context) {
        super(context);
        this.W = b0cVar;
        this.V = new xl3((byte) 7);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = gl.L(8.0f) + this.W.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - L, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        ama.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = gl.P;
        rectF.set((getWidth() - L) - gl.L(24.0f), 0.0f, getWidth() - L, getHeight());
        this.V.s(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
