package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class w86 extends ViewGroup {
    public int E;
    public boolean F;
    public final x86 G;
    public final long a;
    public boolean b;
    public long c;
    public final ImageReceiver d;
    public final TextView e;
    public final ho3 f;
    public final Paint h;
    public final mm n;
    public final mm r;
    public final RectF s;
    public final Path w;
    public int x;
    public int y;

    public w86(x86 x86Var, Context context, long j) {
        super(context);
        this.G = x86Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        Paint paint = new Paint(1);
        this.h = paint;
        k43 k43Var = k43.h;
        this.n = new mm(this, 0L, 320L, k43Var);
        this.r = new mm(this, 0L, 320L, k43Var);
        this.s = new RectF();
        this.w = new Path();
        this.a = j;
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setIncludeFontPadding(false);
        addView(textView);
        ho3 ho3Var = new ho3(textView);
        this.f = ho3Var;
        ho3Var.c(-9717249, -1, true);
        imageReceiver.q0(hl.L(11.0f));
        paint.setColor(-13946053);
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z = false;
        float e = this.n.e(false, this.y);
        float e2 = this.r.e(false, this.E);
        RectF rectF = this.s;
        float f = 0.0f;
        rectF.set(0.0f, 0.0f, e, e2);
        Path path = this.w;
        path.rewind();
        path.addRoundRect(rectF, hl.L(14.0f), hl.L(14.0f), Path.Direction.CW);
        canvas.drawPath(path, this.h);
        if (Build.VERSION.SDK_INT >= 29) {
            x86 x86Var = this.G;
            if (x86Var.b != null && canvas.isHardwareAccelerated()) {
                View view = this;
                float f2 = 0.0f;
                while (true) {
                    if (view != x86Var.d) {
                        f += view.getX();
                        f2 += view.getY();
                        ViewParent parent = view.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-f, -f2);
                    float f3 = x86Var.c;
                    canvas.scale(f3, f3);
                    canvas.drawRenderNode(x86Var.b);
                    canvas.restore();
                }
            }
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
        this.d.h(canvas, null);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.K();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = this.e;
        Layout layout = textView.getLayout();
        int L = hl.L(19.0f);
        int i5 = 0;
        if (layout != null && layout.getLineCount() > 0) {
            i5 = layout.getLineBaseline(0);
        }
        int i6 = L - i5;
        textView.layout(hl.L(32.0f), i6, textView.getMeasuredWidth() + hl.L(32.0f), textView.getMeasuredHeight() + i6);
        this.d.i0(hl.L(4.0f), hl.L(3.0f), hl.L(22.0f), hl.L(22.0f));
        setPivotX(0.0f);
        setPivotY(i4 - i2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - hl.L(44.0f)), Integer.MIN_VALUE);
        TextView textView = this.e;
        textView.measure(makeMeasureSpec, 0);
        this.y = hl.L(44.0f) + textView.getMeasuredWidth();
        int e = qu6.e(8.0f, textView.getMeasuredHeight(), hl.L(28.0f));
        this.E = e;
        setMeasuredDimension(size, e);
        if (!this.F) {
            this.F = true;
            this.n.e(true, this.y);
            this.r.e(true, this.E);
        }
        invalidate();
    }
}
