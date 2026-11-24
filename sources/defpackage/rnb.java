package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class rnb extends FrameLayout {
    public final byte a;
    public final RectF b;
    public final rob c;

    public rnb(rob robVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 1:
                this.c = robVar;
                super(context);
                this.b = new RectF();
                return;
            default:
                this.c = robVar;
                this.b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        rob robVar = this.c;
        RectF rectF = this.b;
        switch (b) {
            case 0:
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rnb rnbVar = robVar.F0;
                hob hobVar = robVar.z0;
                tnb tnbVar = robVar.a;
                cmb.s(rnbVar, hobVar, tnbVar);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, tnbVar.d("paintChatActionBackground"));
                if (cmb.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, tnbVar.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rnb rnbVar2 = robVar.G0;
                hob hobVar2 = robVar.z0;
                tnb tnbVar2 = robVar.a;
                cmb.s(rnbVar2, hobVar2, tnbVar2);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, tnbVar2.d("paintChatActionBackground"));
                if (cmb.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, tnbVar2.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
