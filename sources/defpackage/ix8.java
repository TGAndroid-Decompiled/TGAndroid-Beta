package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
public final class ix8 extends FrameLayout implements tjb {
    public final pb0 a;
    public final ImageReceiver b;
    public final TextView c;
    public final TextView d;
    public final wf2 e;
    public final Path f;
    public final Paint h;
    public final wjb n;
    public final int[] r;
    public boolean s;

    public ix8(Context context, wjb wjbVar) {
        super(context);
        float f;
        float f2;
        float f3;
        float f4;
        this.a = new pb0((wjb) null);
        this.b = new ImageReceiver(this);
        this.f = new Path();
        this.h = new Paint(1);
        this.r = new int[1];
        this.n = wjbVar;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        zkb.X(textView, bkb.F6, wjbVar);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 16.0f);
        boolean z = k96.a0;
        if (z) {
            f = 40.0f;
        } else {
            f = 78.0f;
        }
        if (z) {
            f2 = 78.0f;
        } else {
            f2 = 40.0f;
        }
        addView(textView, nme.d(-1, -2.0f, 7, f, 10.33f, f2, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        zkb.X(textView2, bkb.y6, wjbVar);
        textView2.setTextSize(1, 15.0f);
        boolean z2 = k96.a0;
        if (z2) {
            f3 = 40.0f;
        } else {
            f3 = 78.0f;
        }
        if (z2) {
            f4 = 78.0f;
        } else {
            f4 = 40.0f;
        }
        addView(textView2, nme.d(-1, -2.0f, 7, f3, 32.0f, f4, 0.0f));
        wf2 wf2Var = new wf2(21, wjbVar, getContext());
        this.e = wf2Var;
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(3);
        addView(wf2Var, nme.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f;
        if (k96.a0) {
            L = getMeasuredWidth() - gl.L(65.0f);
        } else {
            L = gl.L(9.0f);
        }
        float f2 = L;
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(f2, gl.L(11.33f), gl.L(56.0f), gl.L(56.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f, this.h);
        if (this.s) {
            Paint U0 = bkb.U0("paintDivider", this.n);
            if (U0 == null) {
                U0 = bkb.j0;
            }
            Paint paint = U0;
            float f3 = 78.0f;
            if (k96.a0) {
                f = 0.0f;
            } else {
                f = 78.0f;
            }
            float L2 = gl.L(f);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!k96.a0) {
                f3 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - gl.L(f3), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float measuredWidth;
        int i3;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(78.0f) + (this.s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gl.N(1.66f));
        paint.setColor(bkb.p1(0.85f, bkb.v0(bkb.y6, this.n)));
        Path path = this.f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (k96.a0) {
            measuredWidth = gl.N(29.66f);
        } else {
            measuredWidth = getMeasuredWidth() - gl.N(24.33f);
        }
        path.moveTo(measuredWidth, measuredHeight - gl.N(5.66f));
        if (k96.a0) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        path.lineTo((gl.N(5.33f) * i3) + measuredWidth, measuredHeight);
        path.lineTo(measuredWidth, gl.N(5.66f) + measuredHeight);
    }

    @Override
    public final void updateColors() {
        try {
            this.h.setColor(bkb.p1(0.85f, bkb.v0(bkb.y6, this.n)));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
