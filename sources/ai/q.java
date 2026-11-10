package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import di.z2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h5;
public final class q extends View {
    public final int f1599a;
    public h5 f1600b;
    public final Paint f1601c;
    public long d;
    public TLRPC.Document f1602e;
    public String f1603f;
    public float h;
    public float f1604n;
    public float f1605r;

    public q(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.f1601c = paint;
        this.f1604n = 1.0f;
        this.f1605r = 1.0f;
        this.f1599a = i7;
        paint.setColor(738197503);
    }

    public String getKey() {
        return this.f1603f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h5 h5Var = this.f1600b;
        if (h5Var != null) {
            h5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h5 h5Var = this.f1600b;
        if (h5Var != null) {
            h5Var.n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        z2 z2Var;
        if (isPressed()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float f11 = this.h;
        if (f11 != f10) {
            if (Math.abs(f11 - f10) >= 0.02f) {
                float f12 = this.h;
                f10 = com.google.android.recaptcha.internal.a.z(f10, f12, 0.35f, f12);
            }
            this.h = f10;
            invalidate();
        }
        float f13 = (1.0f - (this.h * 0.2f)) * this.f1604n * this.f1605r;
        if (f13 > 0.01f) {
            float width = getWidth() * 0.78f * f13;
            float width2 = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            h5 h5Var = this.f1600b;
            if (h5Var == null || (z2Var = h5Var.f34176k) == null || !z2Var.I()) {
                canvas.drawCircle(width2, height, 0.42f * width, this.f1601c);
            }
            h5 h5Var2 = this.f1600b;
            if (h5Var2 != null) {
                float f14 = width / 2.0f;
                h5Var2.setBounds((int) (width2 - f14), (int) (height - f14), (int) (width2 + f14), (int) (height + f14));
                x.b(canvas, this.f1600b);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        setMeasuredDimension(size, size);
    }

    public void set(TLRPC.Document document) {
        long j3 = document.f26966id;
        if (j3 == 0) {
            if (this.f1600b != null && isAttachedToWindow()) {
                this.f1600b.n(this);
            }
            this.f1600b = null;
            this.d = 0L;
            this.f1602e = document;
            this.f1603f = null;
            invalidate();
        } else if (j3 == this.d && this.f1600b != null) {
        } else {
            if (this.f1600b != null && isAttachedToWindow()) {
                this.f1600b.n(this);
            }
            this.d = document.f26966id;
            this.f1602e = document;
            this.f1603f = "c:" + document.f26966id;
            this.f1600b = h5.l(this.f1599a, 2, document);
            if (isAttachedToWindow()) {
                this.f1600b.a(this);
            }
            setContentDescription(document.f26966id + "");
            invalidate();
        }
    }

    @Override
    public void setPressed(boolean z9) {
        if (z9 != isPressed()) {
            super.setPressed(z9);
            invalidate();
        }
    }
}
