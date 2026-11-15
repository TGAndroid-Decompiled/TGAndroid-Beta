package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g5;
public final class l0 extends FrameLayout {
    public final TextView f1340a;
    public final g5 f1341b;
    public final org.telegram.ui.ActionBar.t2 f1342c;
    public final boolean d;
    public final Paint f1343e;
    public final Paint f1344f;
    public long h;

    public l0(Context context, h hVar, int i7, int i10, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f1343e = paint;
        this.f1344f = new Paint(1);
        this.d = z10;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 19.0f);
        textView.setGravity(17);
        addView(textView, ja.d(28, 28.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        long j3 = hVar.f1234c;
        if (j3 != 0) {
            this.f1341b = g5.m(i10, j3, null, 2);
        } else if (hVar.f1235e) {
            org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(context);
            this.f1342c = t2Var;
            t2Var.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        } else {
            String str = hVar.f1233b;
            if (str != null) {
                textView.setText(str);
            }
        }
        TextView textView2 = new TextView(context);
        this.f1340a = textView2;
        textView2.setText(hVar.f1232a);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(i7);
        textView2.setSingleLine(true);
        textView2.setGravity(16);
        addView(textView2, ja.d(-2, -1.0f, 3, 54.0f, 0.0f, 40.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.75f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(i7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float min;
        super.dispatchDraw(canvas);
        float height = getHeight() / 2.0f;
        g5 g5Var = this.f1341b;
        if (g5Var != null) {
            int L = org.telegram.messenger.g0.L(24.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            fi.u2 u2Var = g5Var.f34809k;
            if (u2Var != null && u2Var.J() && this.h == 0) {
                this.h = SystemClock.uptimeMillis();
            }
            if (this.h == 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.h)) / 260.0f);
            }
            float f10 = min;
            if (f10 < 1.0f) {
                int r12 = j6.r1((1.0f - f10) * 0.08f, this.f1340a.getCurrentTextColor());
                Paint paint = this.f1344f;
                paint.setColor(r12);
                canvas.drawRoundRect(org.telegram.messenger.g0.L(1.0f) + L2, height - org.telegram.messenger.g0.L(11.0f), (L2 + L) - org.telegram.messenger.g0.L(1.0f), height + org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), paint);
                canvas2 = canvas;
                invalidate();
            } else {
                canvas2 = canvas;
            }
            g5Var.setAlpha((int) (f10 * 255.0f));
            float f11 = L / 2.0f;
            g5Var.setBounds(L2, (int) (height - f11), L + L2, (int) (f11 + height));
            g5Var.draw(canvas);
        } else {
            canvas2 = canvas;
            org.telegram.ui.ActionBar.t2 t2Var = this.f1342c;
            if (t2Var != null) {
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int L4 = org.telegram.messenger.g0.L(16.0f);
                float f12 = L3 / 2.0f;
                t2Var.setBounds(L4, (int) (height - f12), L3 + L4, (int) (f12 + height));
                t2Var.draw(canvas);
            }
        }
        if (this.d) {
            float width = getWidth() - org.telegram.messenger.g0.L(26.0f);
            Paint paint2 = this.f1343e;
            canvas2.drawLine(width - org.telegram.messenger.g0.L(5.0f), height, width - org.telegram.messenger.g0.L(1.5f), height + org.telegram.messenger.g0.L(3.5f), paint2);
            canvas.drawLine(width - org.telegram.messenger.g0.L(1.5f), height + org.telegram.messenger.g0.L(3.5f), width + org.telegram.messenger.g0.L(5.5f), height - org.telegram.messenger.g0.L(4.0f), paint2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g5 g5Var = this.f1341b;
        if (g5Var != null) {
            g5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g5 g5Var = this.f1341b;
        if (g5Var != null) {
            g5Var.n(this);
        }
    }
}
