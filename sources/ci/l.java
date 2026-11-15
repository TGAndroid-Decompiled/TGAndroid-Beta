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
    public final int f5419a;
    public g5 f5420b;
    public final Paint f5421c;
    public long d;
    public TLRPC.Document f5422e;
    public String f5423f;
    public float h;
    public float f5424n;
    public float f5425r;

    public l(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.f5421c = paint;
        this.f5424n = 1.0f;
        this.f5425r = 1.0f;
        this.f5419a = i7;
        paint.setColor(738197503);
    }

    public String getKey() {
        return this.f5423f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g5 g5Var = this.f5420b;
        if (g5Var != null) {
            g5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g5 g5Var = this.f5420b;
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
        float f13 = (1.0f - (this.h * 0.2f)) * this.f5424n * this.f5425r;
        if (f13 > 0.01f) {
            float width = getWidth() * 0.78f * f13;
            float width2 = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            g5 g5Var = this.f5420b;
            if (g5Var == null || (u2Var = g5Var.f34809k) == null || !u2Var.I()) {
                canvas.drawCircle(width2, height, 0.42f * width, this.f5421c);
            }
            g5 g5Var2 = this.f5420b;
            if (g5Var2 != null) {
                float f14 = width / 2.0f;
                g5Var2.setBounds((int) (width2 - f14), (int) (height - f14), (int) (width2 + f14), (int) (height + f14));
                s.b(canvas, this.f5420b);
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
            if (this.f5420b != null && isAttachedToWindow()) {
                this.f5420b.n(this);
            }
            this.f5420b = null;
            this.d = 0L;
            this.f5422e = document;
            this.f5423f = null;
            invalidate();
        } else if (j3 == this.d && this.f5420b != null) {
        } else {
            if (this.f5420b != null && isAttachedToWindow()) {
                this.f5420b.n(this);
            }
            this.d = document.f28057id;
            this.f5422e = document;
            this.f5423f = "c:" + document.f28057id;
            this.f5420b = g5.l(this.f5419a, 2, document);
            if (isAttachedToWindow()) {
                this.f5420b.a(this);
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
