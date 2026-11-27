package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class xy8 extends View {
    public final int a;
    public wl b;
    public final Paint c;
    public long d;
    public TLRPC.Document e;
    public String f;
    public float h;
    public float n;
    public float r;

    public xy8(Context context, int i) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.n = 1.0f;
        this.r = 1.0f;
        this.a = i;
        paint.setColor(738197503);
    }

    public String getKey() {
        return this.f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wl wlVar = this.b;
        if (wlVar != null) {
            wlVar.b(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wl wlVar = this.b;
        if (wlVar != null) {
            wlVar.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        nl nlVar;
        if (isPressed()) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float f2 = this.h;
        if (f2 != f) {
            if (Math.abs(f2 - f) >= 0.02f) {
                float f3 = this.h;
                f = qd4.A(f, f3, 0.35f, f3);
            }
            this.h = f;
            invalidate();
        }
        float f4 = (1.0f - (this.h * 0.2f)) * this.n * this.r;
        if (f4 > 0.01f) {
            float width = getWidth() * 0.78f * f4;
            float width2 = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            wl wlVar = this.b;
            if (wlVar == null || (nlVar = wlVar.k) == null || !nlVar.B()) {
                canvas.drawCircle(width2, height, 0.42f * width, this.c);
            }
            wl wlVar2 = this.b;
            if (wlVar2 != null) {
                float f5 = width / 2.0f;
                wlVar2.setBounds((int) (width2 - f5), (int) (height - f5), (int) (width2 + f5), (int) (height + f5));
                dz8.b(canvas, this.b);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, size);
    }

    public void set(TLRPC.Document document) {
        long j = document.id;
        if (j == 0) {
            if (this.b != null && isAttachedToWindow()) {
                this.b.o(this);
            }
            this.b = null;
            this.d = 0L;
            this.e = document;
            this.f = null;
            invalidate();
        } else if (j == this.d && this.b != null) {
        } else {
            if (this.b != null && isAttachedToWindow()) {
                this.b.o(this);
            }
            this.d = document.id;
            this.e = document;
            this.f = "c:" + document.id;
            this.b = wl.l(this.a, 2, document);
            if (isAttachedToWindow()) {
                this.b.b(this);
            }
            setContentDescription(document.id + "");
            invalidate();
        }
    }

    @Override
    public void setPressed(boolean z) {
        if (z != isPressed()) {
            super.setPressed(z);
            invalidate();
        }
    }
}
