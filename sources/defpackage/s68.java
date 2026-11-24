package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
public final class s68 extends FrameLayout {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final t68 I;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public float d;
    public float e;
    public float f;
    public float h;
    public byte n;
    public float r;
    public float s;
    public int w;
    public int x;
    public int y;

    public s68(t68 t68Var, Context context) {
        super(context);
        this.I = t68Var;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 600.0f;
        this.e = 600.0f;
        this.f = -1.0f;
        this.h = -1.0f;
        this.n = (byte) 0;
        this.r = 0.0f;
        this.s = 0.0f;
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(1073412858);
        this.a.setStrokeWidth(gm.L(2.0f));
        this.a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new a7(this, (byte) 13));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        t68 t68Var = this.I;
        BitmapDrawable bitmapDrawable = t68Var.b;
        if (bitmapDrawable != null) {
            try {
                int i3 = this.y;
                int i4 = this.E;
                bitmapDrawable.setBounds(i3, i4, this.w + i3, this.x + i4);
                t68Var.b.draw(canvas);
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
        canvas.drawRect(this.y, this.E, i + this.w, this.h, this.c);
        float f = this.h;
        canvas.drawRect(this.y, f, this.f, f + this.e, this.c);
        float f2 = this.h;
        canvas.drawRect(this.f + this.d, f2, this.y + this.w, f2 + this.e, this.c);
        canvas.drawRect(this.y, this.h + this.e, i2 + this.w, this.E + this.x, this.c);
        float f3 = this.f;
        float f4 = this.h;
        canvas.drawRect(f3, f4, f3 + this.d, f4 + this.e, this.a);
        int L = gm.L(1.0f);
        float f5 = L;
        float f6 = this.f + f5;
        float f7 = L * 3;
        canvas.drawRect(f6, this.h + f5, f6 + gm.L(20.0f), this.h + f7, this.b);
        float f8 = this.f;
        float f9 = this.h + f5;
        canvas.drawRect(f8 + f5, f9, f8 + f7, f9 + gm.L(20.0f), this.b);
        float L2 = ((this.f + this.d) - f5) - gm.L(20.0f);
        float f10 = this.h;
        canvas.drawRect(L2, f10 + f5, (this.f + this.d) - f5, f10 + f7, this.b);
        float f11 = this.f + this.d;
        float f12 = this.h + f5;
        canvas.drawRect(f11 - f7, f12, f11 - f5, f12 + gm.L(20.0f), this.b);
        canvas.drawRect(this.f + f5, ((this.h + this.e) - f5) - gm.L(20.0f), this.f + f7, (this.h + this.e) - f5, this.b);
        float f13 = this.f + f5;
        canvas.drawRect(f13, (this.h + this.e) - f7, f13 + gm.L(20.0f), (this.h + this.e) - f5, this.b);
        float L3 = ((this.f + this.d) - f5) - gm.L(20.0f);
        float f14 = this.h + this.e;
        canvas.drawRect(L3, f14 - f7, (this.f + this.d) - f5, f14 - f5, this.b);
        canvas.drawRect((this.f + this.d) - f7, ((this.h + this.e) - f5) - gm.L(20.0f), (this.f + this.d) - f5, (this.h + this.e) - f5, this.b);
        for (int i5 = 1; i5 < 3; i5++) {
            float f15 = this.f;
            float f16 = i5;
            float f17 = (this.d / 3.0f) * f16;
            float f18 = this.h;
            canvas.drawRect(f17 + f15, f18 + f5, f15 + f5 + f17, (f18 + this.e) - f5, this.b);
            float f19 = this.f;
            float A = b10.A(this.e, 3.0f, f16, this.h);
            canvas.drawRect(f19 + f5, A, (f19 - f5) + this.d, A + f5, this.b);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        t68 t68Var;
        Bitmap bitmap;
        float f;
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        this.F = (i3 - i) - gm.L(28.0f);
        int L = (i4 - i2) - gm.L(28.0f);
        this.G = L;
        if (this.F != 0 && L != 0 && (bitmap = (t68Var = this.I).a) != null) {
            float f2 = this.f - this.y;
            float f3 = this.w;
            float f4 = f2 / f3;
            float f5 = this.h - this.E;
            float f6 = this.x;
            float f7 = f5 / f6;
            float f8 = this.d / f3;
            float f9 = this.e / f6;
            float width = bitmap.getWidth();
            float height = t68Var.a.getHeight();
            int i7 = this.F;
            float f10 = i7 / width;
            int i8 = this.G;
            if (f10 > i8 / height) {
                this.x = i8;
                this.w = (int) Math.ceil(width * f);
            } else {
                this.w = i7;
                this.x = (int) Math.ceil(height * f10);
            }
            this.y = gm.L(14.0f) + ((this.F - this.w) / 2);
            int L2 = gm.L(14.0f) + ((this.G - this.x) / 2);
            this.E = L2;
            if (this.f == -1.0f && this.h == -1.0f) {
                if (this.H) {
                    this.h = L2;
                    this.f = this.y;
                    this.d = this.w;
                    this.e = this.x;
                } else {
                    if (this.w > this.x) {
                        this.h = L2;
                        this.f = gm.L(14.0f) + ((this.F - i6) / 2);
                        float f11 = this.x;
                        this.d = f11;
                        this.e = f11;
                    } else {
                        this.f = this.y;
                        this.h = gm.L(14.0f) + ((this.G - i5) / 2);
                        float f12 = this.w;
                        this.d = f12;
                        this.e = f12;
                    }
                }
            } else {
                float f13 = this.w;
                this.f = (f4 * f13) + this.y;
                float f14 = this.x;
                this.h = (f7 * f14) + L2;
                this.d = f8 * f13;
                this.e = f9 * f14;
            }
            invalidate();
        }
    }
}
