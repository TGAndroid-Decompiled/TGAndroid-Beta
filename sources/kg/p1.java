package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.op;
public final class p1 extends FrameLayout implements b6 {
    public final b9 f18445a;
    public final ImageReceiver f18446b;
    public final TextView f18447c;
    public final TextView d;
    public final op f18448e;
    public final Path f18449f;
    public final Paint h;
    public final h6 f18450n;
    public final int[] f18451r;
    public boolean f18452s;

    public p1(Context context, h6 h6Var) {
        super(context);
        float f10;
        float f11;
        float f12;
        float f13;
        this.f18445a = new b9((h6) null);
        this.f18446b = new ImageReceiver(this);
        this.f18449f = new Path();
        this.h = new Paint(1);
        this.f18451r = new int[1];
        this.f18450n = h6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f18447c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        t6.U(textView, m6.G6, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        boolean z10 = gd.f24241a0;
        if (z10) {
            f10 = 40.0f;
        } else {
            f10 = 78.0f;
        }
        if (z10) {
            f11 = 78.0f;
        } else {
            f11 = 40.0f;
        }
        addView(textView, ma.d(-1, -2.0f, 7, f10, 10.33f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        t6.U(textView2, m6.f29789z6, h6Var);
        textView2.setTextSize(1, 15.0f);
        boolean z11 = gd.f24241a0;
        if (z11) {
            f12 = 40.0f;
        } else {
            f12 = 78.0f;
        }
        if (z11) {
            f13 = 78.0f;
        } else {
            f13 = 40.0f;
        }
        addView(textView2, ma.d(-1, -2.0f, 7, f12, 32.0f, f13, 0.0f));
        op opVar = new op(21, getContext(), h6Var);
        this.f18448e = opVar;
        opVar.b(-1, m6.f29378d6, m6.f29508k7);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(3);
        addView(opVar, ma.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f10;
        if (gd.f24241a0) {
            L = getMeasuredWidth() - org.telegram.messenger.g0.L(65.0f);
        } else {
            L = org.telegram.messenger.g0.L(9.0f);
        }
        float f11 = L;
        ImageReceiver imageReceiver = this.f18446b;
        imageReceiver.y0(f11, org.telegram.messenger.g0.L(11.33f), org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f18449f, this.h);
        if (this.f18452s) {
            Paint W0 = m6.W0("paintDivider", this.f18450n);
            if (W0 == null) {
                W0 = m6.f29501k0;
            }
            Paint paint = W0;
            float f12 = 78.0f;
            if (gd.f24241a0) {
                f10 = 0.0f;
            } else {
                f10 = 78.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!gd.f24241a0) {
                f12 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - org.telegram.messenger.g0.L(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float measuredWidth;
        int i11;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f) + (this.f18452s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setColor(m6.r1(0.85f, m6.w0(m6.f29789z6, this.f18450n)));
        Path path = this.f18449f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (gd.f24241a0) {
            measuredWidth = org.telegram.messenger.g0.N(29.66f);
        } else {
            measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.N(24.33f);
        }
        path.moveTo(measuredWidth, measuredHeight - org.telegram.messenger.g0.N(5.66f));
        if (gd.f24241a0) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        path.lineTo((org.telegram.messenger.g0.N(5.33f) * i11) + measuredWidth, measuredHeight);
        path.lineTo(measuredWidth, org.telegram.messenger.g0.N(5.66f) + measuredHeight);
    }

    @Override
    public final void updateColors() {
        try {
            this.h.setColor(m6.r1(0.85f, m6.w0(m6.f29789z6, this.f18450n)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
