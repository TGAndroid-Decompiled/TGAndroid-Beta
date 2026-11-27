package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class an3 extends FrameLayout {
    public final TextView a;
    public final wl b;
    public final Drawable c;
    public final boolean d;
    public final Paint e;
    public final Paint f;
    public long h;

    public an3(Context context, cm3 cm3Var, int i, int i2, boolean z) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new Paint(1);
        this.d = z;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 19.0f);
        textView.setGravity(17);
        addView(textView, tre.d(28, 28.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        long j = cm3Var.b;
        if (j != 0) {
            this.b = wl.m(i2, j, null, 2);
        } else if (cm3Var.f != 0) {
            Drawable mutate = context.getResources().getDrawable(cm3Var.f).mutate();
            this.c = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.F8, false), PorterDuff.Mode.SRC_IN));
        } else if (cm3Var.d) {
            hc hcVar = new hc(context);
            this.c = hcVar;
            hcVar.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        TextView textView2 = new TextView(context);
        this.a = textView2;
        textView2.setText(cm3Var.a());
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(i);
        textView2.setSingleLine(true);
        textView2.setGravity(16);
        addView(textView2, tre.d(-2, -1.0f, 3, 54.0f, 0.0f, 40.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.N(1.75f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float min;
        super.dispatchDraw(canvas);
        float height = getHeight() / 2.0f;
        wl wlVar = this.b;
        if (wlVar != null) {
            int L = hl.L(24.0f);
            int L2 = hl.L(16.0f);
            nl nlVar = wlVar.k;
            if (nlVar != null && nlVar.C() && this.h == 0) {
                this.h = SystemClock.uptimeMillis();
            }
            if (this.h == 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.h)) / 260.0f);
            }
            float f = min;
            if (f < 1.0f) {
                int p1 = aob.p1((1.0f - f) * 0.08f, this.a.getCurrentTextColor());
                Paint paint = this.f;
                paint.setColor(p1);
                canvas.drawRoundRect(hl.L(1.0f) + L2, height - hl.L(11.0f), (L2 + L) - hl.L(1.0f), height + hl.L(11.0f), hl.L(7.0f), hl.L(7.0f), paint);
                invalidate();
            }
            wlVar.setAlpha((int) (f * 255.0f));
            float f2 = L / 2.0f;
            wlVar.setBounds(L2, (int) (height - f2), L + L2, (int) (f2 + height));
            wlVar.draw(canvas);
        } else {
            Drawable drawable = this.c;
            if (drawable != null) {
                int L3 = hl.L(24.0f);
                int L4 = hl.L(16.0f);
                float f3 = L3 / 2.0f;
                drawable.setBounds(L4, (int) (height - f3), L3 + L4, (int) (f3 + height));
                drawable.draw(canvas);
            }
        }
        if (this.d) {
            float width = getWidth() - hl.L(26.0f);
            Paint paint2 = this.e;
            canvas.drawLine(width - hl.L(5.0f), height, width - hl.L(1.5f), height + hl.L(3.5f), paint2);
            canvas.drawLine(width - hl.L(1.5f), height + hl.L(3.5f), width + hl.L(5.5f), height - hl.L(4.0f), paint2);
        }
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
}
