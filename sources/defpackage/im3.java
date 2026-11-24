package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class im3 extends FrameLayout {
    public final TextView a;
    public final vl b;
    public final gc c;
    public final boolean d;
    public final Paint e;
    public final Paint f;
    public long h;

    public im3(Context context, kl3 kl3Var, int i, int i2, boolean z) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new Paint(1);
        this.d = z;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 19.0f);
        textView.setGravity(17);
        addView(textView, nme.d(28, 28.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        long j = kl3Var.b;
        if (j != 0) {
            this.b = vl.m(i2, j, null, 2);
        } else if (kl3Var.d) {
            gc gcVar = new gc(context);
            this.c = gcVar;
            gcVar.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        TextView textView2 = new TextView(context);
        this.a = textView2;
        textView2.setText(kl3Var.a());
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(i);
        textView2.setSingleLine(true);
        textView2.setGravity(16);
        addView(textView2, nme.d(-2, -1.0f, 3, 54.0f, 0.0f, 40.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.N(1.75f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float min;
        super.dispatchDraw(canvas);
        float height = getHeight() / 2.0f;
        vl vlVar = this.b;
        if (vlVar != null) {
            int L = gl.L(24.0f);
            int L2 = gl.L(16.0f);
            ml mlVar = vlVar.k;
            if (mlVar != null && mlVar.C() && this.h == 0) {
                this.h = SystemClock.uptimeMillis();
            }
            if (this.h == 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.h)) / 260.0f);
            }
            float f = min;
            if (f < 1.0f) {
                int p1 = bkb.p1((1.0f - f) * 0.08f, this.a.getCurrentTextColor());
                Paint paint = this.f;
                paint.setColor(p1);
                canvas.drawRoundRect(gl.L(1.0f) + L2, height - gl.L(11.0f), (L2 + L) - gl.L(1.0f), height + gl.L(11.0f), gl.L(7.0f), gl.L(7.0f), paint);
                invalidate();
            }
            vlVar.setAlpha((int) (f * 255.0f));
            float f2 = L / 2.0f;
            vlVar.setBounds(L2, (int) (height - f2), L + L2, (int) (f2 + height));
            vlVar.draw(canvas);
        } else {
            gc gcVar = this.c;
            if (gcVar != null) {
                int L3 = gl.L(24.0f);
                int L4 = gl.L(16.0f);
                float f3 = L3 / 2.0f;
                gcVar.setBounds(L4, (int) (height - f3), L3 + L4, (int) (f3 + height));
                gcVar.draw(canvas);
            }
        }
        if (this.d) {
            float width = getWidth() - gl.L(26.0f);
            Paint paint2 = this.e;
            canvas.drawLine(width - gl.L(5.0f), height, width - gl.L(1.5f), height + gl.L(3.5f), paint2);
            canvas.drawLine(width - gl.L(1.5f), height + gl.L(3.5f), width + gl.L(5.5f), height - gl.L(4.0f), paint2);
        }
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
}
