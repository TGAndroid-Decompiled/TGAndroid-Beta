package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class o58 extends FrameLayout {
    public final byte a;
    public final o68 b;

    public o58(o68 o68Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = o68Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x;
        byte b = this.a;
        float f = 1.0f;
        o68 o68Var = this.b;
        switch (b) {
            case 0:
                if (o68Var.p2.getVisibility() == 0 && o68Var.p2.getLayoutParams().width != (x = (int) (((o68Var.k2.getX() + o68Var.k2.getMeasuredWidth()) - o68Var.p2.getX()) + hl.L(10.0f)))) {
                    o68Var.p2.getLayoutParams().width = x;
                    o68Var.p2.invalidate();
                    o68Var.p2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                if (o68Var.n1 && o68Var.B0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - o68Var.B0.c()) - hl.L(6.0f), 0.0f);
                    mm mmVar = o68Var.D0;
                    if (!o68Var.F0) {
                        f = 0.0f;
                    }
                    float e = mmVar.e(false, f);
                    canvas.scale(e, e, o68Var.B0.c() / 2.0f, hl.L(20.0f));
                    hn hnVar = o68Var.B0;
                    hnVar.C = 255;
                    hnVar.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                if (o68Var.n1 && o68Var.A0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - o68Var.A0.c()) - hl.L(6.0f), 0.0f);
                    mm mmVar2 = o68Var.C0;
                    if (!o68Var.E0) {
                        f = 0.0f;
                    }
                    float e2 = mmVar2.e(false, f);
                    canvas.scale(e2, e2, o68Var.A0.c() / 2.0f, hl.L(20.0f));
                    hn hnVar2 = o68Var.A0;
                    hnVar2.C = 255;
                    hnVar2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        byte b = this.a;
        o68 o68Var = this.b;
        switch (b) {
            case 1:
                if (drawable == o68Var.B0 || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            case 2:
                if (drawable == o68Var.A0 || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
