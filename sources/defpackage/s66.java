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
public final class s66 extends ViewGroup {
    public int E;
    public boolean F;
    public final t66 G;
    public final long a;
    public boolean b;
    public long c;
    public final ImageReceiver d;
    public final TextView e;
    public final qn3 f;
    public final Paint h;
    public final lm n;
    public final lm r;
    public final RectF s;
    public final Path w;
    public int x;
    public int y;

    public s66(t66 t66Var, Context context, long j) {
        super(context);
        this.G = t66Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        Paint paint = new Paint(1);
        this.h = paint;
        s33 s33Var = s33.h;
        this.n = new lm(this, 0L, 320L, s33Var);
        this.r = new lm(this, 0L, 320L, s33Var);
        this.s = new RectF();
        this.w = new Path();
        this.a = j;
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setIncludeFontPadding(false);
        addView(textView);
        qn3 qn3Var = new qn3(textView);
        this.f = qn3Var;
        qn3Var.c(-9717249, -1, true);
        imageReceiver.q0(gl.L(11.0f));
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
        path.addRoundRect(rectF, gl.L(14.0f), gl.L(14.0f), Path.Direction.CW);
        canvas.drawPath(path, this.h);
        if (Build.VERSION.SDK_INT >= 29) {
            t66 t66Var = this.G;
            if (t66Var.b != null && canvas.isHardwareAccelerated()) {
                View view = this;
                float f2 = 0.0f;
                while (true) {
                    if (view != t66Var.d) {
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
                    float f3 = t66Var.c;
                    canvas.scale(f3, f3);
                    canvas.drawRenderNode(t66Var.b);
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
        int L = gl.L(19.0f);
        int i5 = 0;
        if (layout != null && layout.getLineCount() > 0) {
            i5 = layout.getLineBaseline(0);
        }
        int i6 = L - i5;
        textView.layout(gl.L(32.0f), i6, textView.getMeasuredWidth() + gl.L(32.0f), textView.getMeasuredHeight() + i6);
        this.d.i0(gl.L(4.0f), gl.L(3.0f), gl.L(22.0f), gl.L(22.0f));
        setPivotX(0.0f);
        setPivotY(i4 - i2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - gl.L(44.0f)), Integer.MIN_VALUE);
        TextView textView = this.e;
        textView.measure(makeMeasureSpec, 0);
        this.y = gl.L(44.0f) + textView.getMeasuredWidth();
        int e = ls6.e(8.0f, textView.getMeasuredHeight(), gl.L(28.0f));
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
