package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.google.android.gms.internal.vision.e2;
import fi.s2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p5;
public final class l extends View {
    public final int f5731a;
    public p5 f5732b;
    public final Paint f5733c;
    public long d;
    public TLRPC.Document f5734e;
    public String f5735f;
    public float h;
    public float f5736n;
    public float f5737r;

    public l(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.f5733c = paint;
        this.f5736n = 1.0f;
        this.f5737r = 1.0f;
        this.f5731a = i7;
        paint.setColor(738197503);
    }

    public String getKey() {
        return this.f5735f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p5 p5Var = this.f5732b;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p5 p5Var = this.f5732b;
        if (p5Var != null) {
            p5Var.n(this);
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
        float f13 = (1.0f - (this.h * 0.2f)) * this.f5736n * this.f5737r;
        if (f13 > 0.01f) {
            float width = getWidth() * 0.78f * f13;
            float width2 = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            p5 p5Var = this.f5732b;
            if (p5Var == null || (s2Var = p5Var.f38501k) == null || !s2Var.I()) {
                canvas.drawCircle(width2, height, 0.42f * width, this.f5733c);
            }
            p5 p5Var2 = this.f5732b;
            if (p5Var2 != null) {
                float f14 = width / 2.0f;
                p5Var2.setBounds((int) (width2 - f14), (int) (height - f14), (int) (width2 + f14), (int) (height + f14));
                s.b(canvas, this.f5732b);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        setMeasuredDimension(size, size);
    }

    public void set(TLRPC.Document document) {
        long j3 = document.f28437id;
        if (j3 == 0) {
            if (this.f5732b != null && isAttachedToWindow()) {
                this.f5732b.n(this);
            }
            this.f5732b = null;
            this.d = 0L;
            this.f5734e = document;
            this.f5735f = null;
            invalidate();
        } else if (j3 == this.d && this.f5732b != null) {
        } else {
            if (this.f5732b != null && isAttachedToWindow()) {
                this.f5732b.n(this);
            }
            this.d = document.f28437id;
            this.f5734e = document;
            this.f5735f = "c:" + document.f28437id;
            this.f5732b = p5.l(this.f5731a, 2, document);
            if (isAttachedToWindow()) {
                this.f5732b.a(this);
            }
            setContentDescription(document.f28437id + "");
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
