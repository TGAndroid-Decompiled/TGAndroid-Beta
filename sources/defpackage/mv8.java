package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class mv8 extends View {
    public final int a;
    public vl b;
    public final Paint c;
    public long d;
    public TLRPC.Document e;
    public String f;
    public float h;
    public float n;
    public float r;

    public mv8(Context context, int i) {
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
        vl vlVar = this.b;
        if (vlVar != null) {
            vlVar.b(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vl vlVar = this.b;
        if (vlVar != null) {
            vlVar.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        ml mlVar;
        if (isPressed()) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float f2 = this.h;
        if (f2 != f) {
            if (Math.abs(f2 - f) >= 0.02f) {
                float f3 = this.h;
                f = tb4.A(f, f3, 0.35f, f3);
            }
            this.h = f;
            invalidate();
        }
        float f4 = (1.0f - (this.h * 0.2f)) * this.n * this.r;
        if (f4 > 0.01f) {
            float width = getWidth() * 0.78f * f4;
            float width2 = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            vl vlVar = this.b;
            if (vlVar == null || (mlVar = vlVar.k) == null || !mlVar.B()) {
                canvas.drawCircle(width2, height, 0.42f * width, this.c);
            }
            vl vlVar2 = this.b;
            if (vlVar2 != null) {
                float f5 = width / 2.0f;
                vlVar2.setBounds((int) (width2 - f5), (int) (height - f5), (int) (width2 + f5), (int) (height + f5));
                sv8.b(canvas, this.b);
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
            this.b = vl.l(this.a, 2, document);
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
