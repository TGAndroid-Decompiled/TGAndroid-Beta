package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
public final class av8 extends skb {
    public final yza a0;
    public final int b0;
    public final uk8 c0;

    public av8(int i, vnb vnbVar, Context context) {
        super(context, vnbVar);
        int i2;
        this.a0 = new yza(1, 15);
        this.c0 = new uk8(this, (byte) 14);
        if (i == 1) {
            i2 = aob.Wk;
        } else {
            i2 = aob.Dk;
        }
        this.b0 = i2;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean e = i86.e(131072);
        uk8 uk8Var = this.c0;
        if (e) {
            yza yzaVar = this.a0;
            yzaVar.d();
            yzaVar.a(canvas, aob.w0(null, this.b0, false));
            jh2.d().a(15, uk8Var);
        } else {
            jh2.d().g(uk8Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jh2.d().g(this.c0);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e29 e29Var = this.e;
        float width = (e29Var.getWidth() / 2.0f) + e29Var.getX();
        float y = e29Var.getY();
        float height = ((e29Var.getHeight() / 2.0f) + (y + e29Var.getPaddingTop())) - hl.L(3.0f);
        RectF rectF = hl.P;
        rectF.set(width - hl.L(16.0f), height - hl.L(16.0f), width + hl.L(16.0f), height + hl.L(16.0f));
        this.a0.g(rectF);
    }
}
