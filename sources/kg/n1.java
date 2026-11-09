package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wo;
public final class n1 extends FrameLayout implements b6 {
    public final w8 f17449a;
    public final ImageReceiver f17450b;
    public final TextView f17451c;
    public final TextView d;
    public final wo f17452e;
    public final Path f17453f;
    public final Paint h;
    public final g6 f17454n;
    public final int[] f17455r;
    public boolean f17456s;

    public n1(Context context, g6 g6Var) {
        super(context);
        float f10;
        float f11;
        float f12;
        float f13;
        this.f17449a = new w8((g6) null);
        this.f17450b = new ImageReceiver(this);
        this.f17453f = new Path();
        this.h = new Paint(1);
        this.f17455r = new int[1];
        this.f17454n = g6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f17451c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        s6.U(textView, l6.G6, g6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        boolean z9 = id.f23157a0;
        if (z9) {
            f10 = 40.0f;
        } else {
            f10 = 78.0f;
        }
        if (z9) {
            f11 = 78.0f;
        } else {
            f11 = 40.0f;
        }
        addView(textView, ha.d(-1, -2.0f, 7, f10, 10.33f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        s6.U(textView2, l6.f28275z6, g6Var);
        textView2.setTextSize(1, 15.0f);
        boolean z10 = id.f23157a0;
        if (z10) {
            f12 = 40.0f;
        } else {
            f12 = 78.0f;
        }
        if (z10) {
            f13 = 78.0f;
        } else {
            f13 = 40.0f;
        }
        addView(textView2, ha.d(-1, -2.0f, 7, f12, 32.0f, f13, 0.0f));
        wo woVar = new wo(21, getContext(), g6Var);
        this.f17452e = woVar;
        woVar.b(-1, l6.f27865d6, l6.f27995k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar, ha.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f10;
        if (id.f23157a0) {
            L = getMeasuredWidth() - org.telegram.messenger.g0.L(65.0f);
        } else {
            L = org.telegram.messenger.g0.L(9.0f);
        }
        float f11 = L;
        ImageReceiver imageReceiver = this.f17450b;
        imageReceiver.y0(f11, org.telegram.messenger.g0.L(11.33f), org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f17453f, this.h);
        if (this.f17456s) {
            Paint W0 = l6.W0("paintDivider", this.f17454n);
            if (W0 == null) {
                W0 = l6.f27988k0;
            }
            Paint paint = W0;
            float f12 = 78.0f;
            if (id.f23157a0) {
                f10 = 0.0f;
            } else {
                f10 = 78.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!id.f23157a0) {
                f12 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - org.telegram.messenger.g0.L(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float measuredWidth;
        int i11;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f) + (this.f17456s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setColor(l6.r1(0.85f, l6.w0(l6.f28275z6, this.f17454n)));
        Path path = this.f17453f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (id.f23157a0) {
            measuredWidth = org.telegram.messenger.g0.N(29.66f);
        } else {
            measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.N(24.33f);
        }
        path.moveTo(measuredWidth, measuredHeight - org.telegram.messenger.g0.N(5.66f));
        if (id.f23157a0) {
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
            this.h.setColor(l6.r1(0.85f, l6.w0(l6.f28275z6, this.f17454n)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
