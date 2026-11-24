package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class n68 extends FrameLayout {
    public final byte a;
    public RectF b;

    public n68(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = this.b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), cmb.h2);
                return;
            default:
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, gm.L(4.0f), gm.L(4.0f), cmb.h2);
                return;
        }
    }
}
