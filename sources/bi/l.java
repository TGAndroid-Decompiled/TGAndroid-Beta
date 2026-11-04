package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import ei.c3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g5;
public final class l extends View {
    public final int f3780a;
    public g5 f3781b;
    public final Paint f3782c;
    public long d;
    public TLRPC.Document f3783e;
    public String f3784f;
    public float h;
    public float f3785n;
    public float f3786r;

    public l(Context context, int i3) {
        super(context);
        Paint paint = new Paint(1);
        this.f3782c = paint;
        this.f3785n = 1.0f;
        this.f3786r = 1.0f;
        this.f3780a = i3;
        paint.setColor(738197503);
    }

    public String getKey() {
        return this.f3784f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g5 g5Var = this.f3781b;
        if (g5Var != null) {
            g5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g5 g5Var = this.f3781b;
        if (g5Var != null) {
            g5Var.n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        c3 c3Var;
        if (isPressed()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float f11 = this.h;
        if (f11 != f10) {
            if (Math.abs(f11 - f10) >= 0.02f) {
                float f12 = this.h;
                f10 = com.google.android.recaptcha.internal.a.y(f10, f12, 0.35f, f12);
            }
            this.h = f10;
            invalidate();
        }
        float f13 = (1.0f - (this.h * 0.2f)) * this.f3785n * this.f3786r;
        if (f13 > 0.01f) {
            float width = getWidth() * 0.78f * f13;
            float width2 = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            g5 g5Var = this.f3781b;
            if (g5Var == null || (c3Var = g5Var.f33971k) == null || !c3Var.I()) {
                canvas.drawCircle(width2, height, 0.42f * width, this.f3782c);
            }
            g5 g5Var2 = this.f3781b;
            if (g5Var2 != null) {
                float f14 = width / 2.0f;
                g5Var2.setBounds((int) (width2 - f14), (int) (height - f14), (int) (width2 + f14), (int) (height + f14));
                s.b(canvas, this.f3781b);
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        setMeasuredDimension(size, size);
    }

    public void set(TLRPC.Document document) {
        long j10 = document.f27007id;
        if (j10 == 0) {
            if (this.f3781b != null && isAttachedToWindow()) {
                this.f3781b.n(this);
            }
            this.f3781b = null;
            this.d = 0L;
            this.f3783e = document;
            this.f3784f = null;
            invalidate();
        } else if (j10 == this.d && this.f3781b != null) {
        } else {
            if (this.f3781b != null && isAttachedToWindow()) {
                this.f3781b.n(this);
            }
            this.d = document.f27007id;
            this.f3783e = document;
            this.f3784f = "c:" + document.f27007id;
            this.f3781b = g5.l(this.f3780a, 2, document);
            if (isAttachedToWindow()) {
                this.f3781b.a(this);
            }
            setContentDescription(document.f27007id + "");
            invalidate();
        }
    }

    @Override
    public void setPressed(boolean z10) {
        if (z10 != isPressed()) {
            super.setPressed(z10);
            invalidate();
        }
    }
}
