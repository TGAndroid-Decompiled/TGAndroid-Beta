package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class b19 extends be0 {
    public boolean H;
    public vl I;
    public xl J;
    public boolean K;
    public final d19 L;

    public b19(d19 d19Var, Context context) {
        super(context);
        this.L = d19Var;
        getImageReceiver().T(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        vl vlVar = this.I;
        if (vlVar != null) {
            vlVar.b(this);
        }
        xl xlVar = this.J;
        if (xlVar != null) {
            xlVar.f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        vl vlVar = this.I;
        if (vlVar != null) {
            vlVar.o(this);
        }
        xl xlVar = this.J;
        if (xlVar != null) {
            xlVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        vl vlVar = this.I;
        if (vlVar != null) {
            vlVar.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.setAlpha(255);
            this.I.draw(canvas);
            this.H = true;
            return;
        }
        xl xlVar = this.J;
        if (xlVar != null) {
            xlVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.J.b(canvas);
            this.H = true;
            return;
        }
        if (getImageReceiver().y() != null && getImageReceiver().y().l0) {
            this.H = true;
        }
        if (!this.H && getImageReceiver().y() != null && !getImageReceiver().y().l0) {
            d19 d19Var = this.L;
            if (d19Var.a == 2 && !d19Var.z) {
                getImageReceiver().y().I(getImageReceiver().y().e[0] - 1, false, false);
            } else {
                getImageReceiver().y().I(0, false, false);
                getImageReceiver().y().start();
            }
        }
        super.onDraw(canvas);
    }
}
