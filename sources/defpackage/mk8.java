package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class mk8 extends in {
    public final byte s;
    public final ok8 w;

    public mk8(ok8 ok8Var, Context context, byte b) {
        super(context, true, true, true);
        this.s = b;
        this.w = ok8Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.s;
        ok8 ok8Var = this.w;
        switch (b) {
            case 0:
                if (ok8Var.P > 0.0f) {
                    if (ok8Var.O == null) {
                        ok8Var.O = new di2(ok8Var.f.getTextColor());
                    }
                    int L = (int) ((1.0f - ok8Var.P) * hl.L(24.0f));
                    ok8Var.O.setBounds(0, L, getWidth(), getHeight() + L);
                    ok8Var.O.setAlpha((int) (ok8Var.P * 255.0f));
                    ok8Var.O.draw(canvas);
                    invalidate();
                }
                float f = ok8Var.P;
                if (f < 1.0f) {
                    if (f != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (ok8Var.P * hl.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (ok8Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
            default:
                if (ok8Var.P > 0.0f) {
                    if (ok8Var.O == null) {
                        ok8Var.O = new di2(ok8Var.f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - ok8Var.P) * hl.L(24.0f));
                    ok8Var.O.setBounds(0, L2, getWidth(), getHeight() + L2);
                    ok8Var.O.setAlpha((int) (ok8Var.P * 255.0f));
                    ok8Var.O.draw(canvas);
                    invalidate();
                }
                float f2 = ok8Var.P;
                if (f2 < 1.0f) {
                    if (f2 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (ok8Var.P * hl.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (ok8Var.P * 0.4f));
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
