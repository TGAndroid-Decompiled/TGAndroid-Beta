package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.google.android.gms.internal.vision.e2;
import fi.s2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o5;
public final class l extends View {
    public final int f5697a;
    public o5 f5698b;
    public final Paint f5699c;
    public long d;
    public TLRPC.Document f5700e;
    public String f5701f;
    public float h;
    public float f5702n;
    public float f5703r;

    public l(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.f5699c = paint;
        this.f5702n = 1.0f;
        this.f5703r = 1.0f;
        this.f5697a = i7;
        paint.setColor(738197503);
    }

    public String getKey() {
        return this.f5701f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o5 o5Var = this.f5698b;
        if (o5Var != null) {
            o5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o5 o5Var = this.f5698b;
        if (o5Var != null) {
            o5Var.n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        s2 s2Var;
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
        float f13 = (1.0f - (this.h * 0.2f)) * this.f5702n * this.f5703r;
        if (f13 > 0.01f) {
            float width = getWidth() * 0.78f * f13;
            float width2 = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            o5 o5Var = this.f5698b;
            if (o5Var == null || (s2Var = o5Var.f38028k) == null || !s2Var.J()) {
                canvas.drawCircle(width2, height, 0.42f * width, this.f5699c);
            }
            o5 o5Var2 = this.f5698b;
            if (o5Var2 != null) {
                float f14 = width / 2.0f;
                o5Var2.setBounds((int) (width2 - f14), (int) (height - f14), (int) (width2 + f14), (int) (height + f14));
                s.b(canvas, this.f5698b);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        setMeasuredDimension(size, size);
    }

    public void set(TLRPC.Document document) {
        long j3 = document.f28498id;
        if (j3 == 0) {
            if (this.f5698b != null && isAttachedToWindow()) {
                this.f5698b.n(this);
            }
            this.f5698b = null;
            this.d = 0L;
            this.f5700e = document;
            this.f5701f = null;
            invalidate();
        } else if (j3 == this.d && this.f5698b != null) {
        } else {
            if (this.f5698b != null && isAttachedToWindow()) {
                this.f5698b.n(this);
            }
            this.d = document.f28498id;
            this.f5700e = document;
            this.f5701f = "c:" + document.f28498id;
            this.f5698b = o5.l(this.f5697a, 2, document);
            if (isAttachedToWindow()) {
                this.f5698b.a(this);
            }
            setContentDescription(document.f28498id + "");
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
