package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import di.f3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t5;
public final class q extends View {
    public final int f1628a;
    public t5 f1629b;
    public final Paint f1630c;
    public long d;
    public TLRPC.Document e;
    public String f1631f;
    public float h;
    public float f1632n;
    public float f1633r;

    public q(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f1630c = paint;
        this.f1632n = 1.0f;
        this.f1633r = 1.0f;
        this.f1628a = i10;
        paint.setColor(738197503);
    }

    public String getKey() {
        return this.f1631f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t5 t5Var = this.f1629b;
        if (t5Var != null) {
            t5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t5 t5Var = this.f1629b;
        if (t5Var != null) {
            t5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        f3 f3Var;
        if (isPressed()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float f10 = this.h;
        if (f10 != f7) {
            if (Math.abs(f10 - f7) >= 0.02f) {
                float f11 = this.h;
                f7 = c3.h0.z(f7, f11, 0.35f, f11);
            }
            this.h = f7;
            invalidate();
        }
        float f12 = (1.0f - (this.h * 0.2f)) * this.f1632n * this.f1633r;
        if (f12 > 0.01f) {
            float width = getWidth() * 0.78f * f12;
            float width2 = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            t5 t5Var = this.f1629b;
            if (t5Var == null || (f3Var = t5Var.f32852k) == null || !f3Var.hasBitmapImage()) {
                canvas.drawCircle(width2, height, 0.42f * width, this.f1630c);
            }
            t5 t5Var2 = this.f1629b;
            if (t5Var2 != null) {
                float f13 = width / 2.0f;
                t5Var2.setBounds((int) (width2 - f13), (int) (height - f13), (int) (width2 + f13), (int) (height + f13));
                y.b(canvas, this.f1629b);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size);
    }

    public void set(TLRPC.Document document) {
        long j10 = document.f22033id;
        if (j10 == 0) {
            if (this.f1629b != null && isAttachedToWindow()) {
                this.f1629b.o(this);
            }
            this.f1629b = null;
            this.d = 0L;
            this.e = document;
            this.f1631f = null;
            invalidate();
        } else if (j10 == this.d && this.f1629b != null) {
        } else {
            if (this.f1629b != null && isAttachedToWindow()) {
                this.f1629b.o(this);
            }
            this.d = document.f22033id;
            this.e = document;
            this.f1631f = "c:" + document.f22033id;
            this.f1629b = t5.m(this.f1628a, 2, document);
            if (isAttachedToWindow()) {
                this.f1629b.a(this);
            }
            setContentDescription(document.f22033id + "");
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
