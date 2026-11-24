package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
public final class y1c extends xna {
    public final in3 V;
    public final b2c W;

    public y1c(b2c b2cVar, Context context) {
        super(context);
        this.W = b2cVar;
        this.V = new in3((byte) 7);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = gm.L(8.0f) + this.W.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - L, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        boa.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = gm.P;
        rectF.set((getWidth() - L) - gm.L(24.0f), 0.0f, getWidth() - L, getHeight());
        this.V.r(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
