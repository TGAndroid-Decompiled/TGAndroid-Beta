package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.p6;
public final class z0 extends vh.d {
    public final RectF f13300k0;
    public boolean f13301l0;
    public float m0;
    public final org.telegram.ui.Components.voip.g f13302n0;

    public z0(Context context, p6 p6Var) {
        super(context, p6Var, true);
        this.f13300k0 = new RectF();
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.f13302n0 = gVar;
        gVar.f31443n = 1.2f;
        gVar.f31440k = false;
        gVar.f31442m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f13301l0) {
            float f7 = this.m0 + 0.016f;
            this.m0 = f7;
            if (f7 > 3.0f) {
                this.f13301l0 = false;
            }
        } else {
            float f10 = this.m0 - 0.016f;
            this.m0 = f10;
            if (f10 < 1.0f) {
                this.f13301l0 = true;
            }
        }
        RectF rectF = this.f13300k0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        ea.f.d().f((-getMeasuredWidth()) * 0.1f * this.m0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), ea.f.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.g gVar = this.f13302n0;
        gVar.f31436f = measuredWidth;
        gVar.a(org.telegram.messenger.i0.L(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
