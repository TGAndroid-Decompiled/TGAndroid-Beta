package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
public final class qr8 extends wgb {
    public final vva a0;
    public final int b0;
    public final w88 c0;

    public qr8(int i, wjb wjbVar, Context context) {
        super(context, wjbVar);
        int i2;
        this.a0 = new vva(1, 15);
        this.c0 = new w88(this, (byte) 28);
        if (i == 1) {
            i2 = bkb.Vk;
        } else {
            i2 = bkb.Ck;
        }
        this.b0 = i2;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean e = e66.e(131072);
        w88 w88Var = this.c0;
        if (e) {
            vva vvaVar = this.a0;
            vvaVar.d();
            vvaVar.a(canvas, bkb.w0(null, this.b0, false));
            rg2.d().a(15, w88Var);
        } else {
            rg2.d().g(w88Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rg2.d().g(this.c0);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ry8 ry8Var = this.e;
        float width = (ry8Var.getWidth() / 2.0f) + ry8Var.getX();
        float y = ry8Var.getY();
        float height = ((ry8Var.getHeight() / 2.0f) + (y + ry8Var.getPaddingTop())) - gl.L(3.0f);
        RectF rectF = gl.P;
        rectF.set(width - gl.L(16.0f), height - gl.L(16.0f), width + gl.L(16.0f), height + gl.L(16.0f));
        this.a0.g(rectF);
    }
}
