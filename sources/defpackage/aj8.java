package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class aj8 extends io {
    public final byte s;
    public final cj8 w;

    public aj8(cj8 cj8Var, Context context, byte b) {
        super(context, true, true, true);
        this.s = b;
        this.w = cj8Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.s;
        cj8 cj8Var = this.w;
        switch (b) {
            case 0:
                if (cj8Var.P > 0.0f) {
                    if (cj8Var.O == null) {
                        cj8Var.O = new wi2(cj8Var.f.getTextColor());
                    }
                    int L = (int) ((1.0f - cj8Var.P) * gm.L(24.0f));
                    cj8Var.O.setBounds(0, L, getWidth(), getHeight() + L);
                    cj8Var.O.setAlpha((int) (cj8Var.P * 255.0f));
                    cj8Var.O.draw(canvas);
                    invalidate();
                }
                float f = cj8Var.P;
                if (f < 1.0f) {
                    if (f != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (cj8Var.P * gm.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (cj8Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
            default:
                if (cj8Var.P > 0.0f) {
                    if (cj8Var.O == null) {
                        cj8Var.O = new wi2(cj8Var.f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - cj8Var.P) * gm.L(24.0f));
                    cj8Var.O.setBounds(0, L2, getWidth(), getHeight() + L2);
                    cj8Var.O.setAlpha((int) (cj8Var.P * 255.0f));
                    cj8Var.O.draw(canvas);
                    invalidate();
                }
                float f2 = cj8Var.P;
                if (f2 < 1.0f) {
                    if (f2 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (cj8Var.P * gm.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (cj8Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
        }
    }
}
