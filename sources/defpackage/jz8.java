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
public final class jz8 extends FrameLayout implements vlb {
    public final pc0 a;
    public final ImageReceiver b;
    public final TextView c;
    public final TextView d;
    public final jh2 e;
    public final Path f;
    public final Paint h;
    public final ylb n;
    public final int[] r;
    public boolean s;

    public jz8(Context context, ylb ylbVar) {
        super(context);
        float f;
        float f2;
        float f3;
        float f4;
        this.a = new pc0((ylb) null);
        this.b = new ImageReceiver(this);
        this.f = new Path();
        this.h = new Paint(1);
        this.r = new int[1];
        this.n = ylbVar;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        anb.X(textView, cmb.F6, ylbVar);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 16.0f);
        boolean z = jb6.a0;
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
        addView(textView, qoe.d(-1, -2.0f, 7, f, 10.33f, f2, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        anb.X(textView2, cmb.y6, ylbVar);
        textView2.setTextSize(1, 15.0f);
        boolean z2 = jb6.a0;
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
        addView(textView2, qoe.d(-1, -2.0f, 7, f3, 32.0f, f4, 0.0f));
        jh2 jh2Var = new jh2(21, ylbVar, getContext());
        this.e = jh2Var;
        jh2Var.b(-1, cmb.c6, cmb.j7);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(3);
        addView(jh2Var, qoe.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f;
        if (jb6.a0) {
            L = getMeasuredWidth() - gm.L(65.0f);
        } else {
            L = gm.L(9.0f);
        }
        float f2 = L;
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(f2, gm.L(11.33f), gm.L(56.0f), gm.L(56.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f, this.h);
        if (this.s) {
            Paint U0 = cmb.U0("paintDivider", this.n);
            if (U0 == null) {
                U0 = cmb.j0;
            }
            Paint paint = U0;
            float f3 = 78.0f;
            if (jb6.a0) {
                f = 0.0f;
            } else {
                f = 78.0f;
            }
            float L2 = gm.L(f);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!jb6.a0) {
                f3 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - gm.L(f3), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float measuredWidth;
        int i3;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(78.0f) + (this.s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gm.N(1.66f));
        paint.setColor(cmb.p1(0.85f, cmb.v0(cmb.y6, this.n)));
        Path path = this.f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (jb6.a0) {
            measuredWidth = gm.N(29.66f);
        } else {
            measuredWidth = getMeasuredWidth() - gm.N(24.33f);
        }
        path.moveTo(measuredWidth, measuredHeight - gm.N(5.66f));
        if (jb6.a0) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        path.lineTo((gm.N(5.33f) * i3) + measuredWidth, measuredHeight);
        path.lineTo(measuredWidth, gm.N(5.66f) + measuredHeight);
    }

    @Override
    public final void updateColors() {
        try {
            this.h.setColor(cmb.p1(0.85f, cmb.v0(cmb.y6, this.n)));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
