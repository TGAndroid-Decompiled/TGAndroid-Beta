package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.google.android.gms.internal.vision.e2;
import fi.u2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g5;
public final class l extends View {
    public final int f5422a;
    public g5 f5423b;
    public final Paint f5424c;
    public long d;
    public TLRPC.Document f5425e;
    public String f5426f;
    public float h;
    public float f5427n;
    public float f5428r;

    public l(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.f5424c = paint;
        this.f5427n = 1.0f;
        this.f5428r = 1.0f;
        this.f5422a = i7;
        paint.setColor(738197503);
    }

    public String getKey() {
        return this.f5426f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g5 g5Var = this.f5423b;
        if (g5Var != null) {
            g5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g5 g5Var = this.f5423b;
        if (g5Var != null) {
            g5Var.n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        u2 u2Var;
        if (isPressed()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float f11 = this.h;
        if (f11 != f10) {
            if (Math.abs(f11 - f10) >= 0.02f) {
                float f12 = this.h;
                f10 = e2.z(f10, f12, 0.35f, f12);
            }
            this.h = f10;
            invalidate();
        }
        float f13 = (1.0f - (this.h * 0.2f)) * this.f5427n * this.f5428r;
        if (f13 > 0.01f) {
            float width = getWidth() * 0.78f * f13;
            float width2 = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            g5 g5Var = this.f5423b;
            if (g5Var == null || (u2Var = g5Var.f34813k) == null || !u2Var.I()) {
                canvas.drawCircle(width2, height, 0.42f * width, this.f5424c);
            }
            g5 g5Var2 = this.f5423b;
            if (g5Var2 != null) {
                float f14 = width / 2.0f;
                g5Var2.setBounds((int) (width2 - f14), (int) (height - f14), (int) (width2 + f14), (int) (height + f14));
                s.b(canvas, this.f5423b);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        setMeasuredDimension(size, size);
    }

    public void set(TLRPC.Document document) {
        long j3 = document.f28057id;
        if (j3 == 0) {
            if (this.f5423b != null && isAttachedToWindow()) {
                this.f5423b.n(this);
            }
            this.f5423b = null;
            this.d = 0L;
            this.f5425e = document;
            this.f5426f = null;
            invalidate();
        } else if (j3 == this.d && this.f5423b != null) {
        } else {
            if (this.f5423b != null && isAttachedToWindow()) {
                this.f5423b.n(this);
            }
            this.d = document.f28057id;
            this.f5425e = document;
            this.f5426f = "c:" + document.f28057id;
            this.f5423b = g5.l(this.f5422a, 2, document);
            if (isAttachedToWindow()) {
                this.f5423b.a(this);
            }
            setContentDescription(document.f28057id + "");
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
