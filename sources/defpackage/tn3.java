package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class tn3 extends FrameLayout {
    public final TextView a;
    public final vm b;
    public final hd c;
    public final boolean d;
    public final Paint e;
    public final Paint f;
    public long h;

    public tn3(Context context, vm3 vm3Var, int i, int i2, boolean z) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new Paint(1);
        this.d = z;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 19.0f);
        textView.setGravity(17);
        addView(textView, qoe.d(28, 28.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        long j = vm3Var.b;
        if (j != 0) {
            this.b = vm.m(i2, j, null, 2);
        } else if (vm3Var.d) {
            hd hdVar = new hd(context);
            this.c = hdVar;
            hdVar.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        TextView textView2 = new TextView(context);
        this.a = textView2;
        textView2.setText(vm3Var.a());
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(i);
        textView2.setSingleLine(true);
        textView2.setGravity(16);
        addView(textView2, qoe.d(-2, -1.0f, 3, 54.0f, 0.0f, 40.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.N(1.75f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float min;
        super.dispatchDraw(canvas);
        float height = getHeight() / 2.0f;
        vm vmVar = this.b;
        if (vmVar != null) {
            int L = gm.L(24.0f);
            int L2 = gm.L(16.0f);
            mm mmVar = vmVar.k;
            if (mmVar != null && mmVar.C() && this.h == 0) {
                this.h = SystemClock.uptimeMillis();
            }
            if (this.h == 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.h)) / 260.0f);
            }
            float f = min;
            if (f < 1.0f) {
                int p1 = cmb.p1((1.0f - f) * 0.08f, this.a.getCurrentTextColor());
                Paint paint = this.f;
                paint.setColor(p1);
                canvas.drawRoundRect(gm.L(1.0f) + L2, height - gm.L(11.0f), (L2 + L) - gm.L(1.0f), height + gm.L(11.0f), gm.L(7.0f), gm.L(7.0f), paint);
                invalidate();
            }
            vmVar.setAlpha((int) (f * 255.0f));
            float f2 = L / 2.0f;
            vmVar.setBounds(L2, (int) (height - f2), L + L2, (int) (f2 + height));
            vmVar.draw(canvas);
        } else {
            hd hdVar = this.c;
            if (hdVar != null) {
                int L3 = gm.L(24.0f);
                int L4 = gm.L(16.0f);
                float f3 = L3 / 2.0f;
                hdVar.setBounds(L4, (int) (height - f3), L3 + L4, (int) (f3 + height));
                hdVar.draw(canvas);
            }
        }
        if (this.d) {
            float width = getWidth() - gm.L(26.0f);
            Paint paint2 = this.e;
            canvas.drawLine(width - gm.L(5.0f), height, width - gm.L(1.5f), height + gm.L(3.5f), paint2);
            canvas.drawLine(width - gm.L(1.5f), height + gm.L(3.5f), width + gm.L(5.5f), height - gm.L(4.0f), paint2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vm vmVar = this.b;
        if (vmVar != null) {
            vmVar.b(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vm vmVar = this.b;
        if (vmVar != null) {
            vmVar.o(this);
        }
    }
}
