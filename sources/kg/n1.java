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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.wo;
public final class n1 extends FrameLayout implements c6 {
    public final v8 f17452a;
    public final ImageReceiver f17453b;
    public final TextView f17454c;
    public final TextView d;
    public final wo f17455e;
    public final Path f17456f;
    public final Paint h;
    public final h6 f17457n;
    public final int[] f17458r;
    public boolean f17459s;

    public n1(Context context, h6 h6Var) {
        super(context);
        float f10;
        float f11;
        float f12;
        float f13;
        this.f17452a = new v8((h6) null);
        this.f17453b = new ImageReceiver(this);
        this.f17456f = new Path();
        this.h = new Paint(1);
        this.f17458r = new int[1];
        this.f17457n = h6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f17454c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        t6.U(textView, m6.G6, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        boolean z9 = id.f23161a0;
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
        t6.U(textView2, m6.f28300z6, h6Var);
        textView2.setTextSize(1, 15.0f);
        boolean z10 = id.f23161a0;
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
        wo woVar = new wo(21, getContext(), h6Var);
        this.f17455e = woVar;
        woVar.b(-1, m6.f27890d6, m6.f28020k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar, ha.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f10;
        if (id.f23161a0) {
            L = getMeasuredWidth() - org.telegram.messenger.g0.L(65.0f);
        } else {
            L = org.telegram.messenger.g0.L(9.0f);
        }
        float f11 = L;
        ImageReceiver imageReceiver = this.f17453b;
        imageReceiver.y0(f11, org.telegram.messenger.g0.L(11.33f), org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f17456f, this.h);
        if (this.f17459s) {
            Paint W0 = m6.W0("paintDivider", this.f17457n);
            if (W0 == null) {
                W0 = m6.f28013k0;
            }
            Paint paint = W0;
            float f12 = 78.0f;
            if (id.f23161a0) {
                f10 = 0.0f;
            } else {
                f10 = 78.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!id.f23161a0) {
                f12 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - org.telegram.messenger.g0.L(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float measuredWidth;
        int i11;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f) + (this.f17459s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setColor(m6.r1(0.85f, m6.w0(m6.f28300z6, this.f17457n)));
        Path path = this.f17456f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (id.f23161a0) {
            measuredWidth = org.telegram.messenger.g0.N(29.66f);
        } else {
            measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.N(24.33f);
        }
        path.moveTo(measuredWidth, measuredHeight - org.telegram.messenger.g0.N(5.66f));
        if (id.f23161a0) {
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
            this.h.setColor(m6.r1(0.85f, m6.w0(m6.f28300z6, this.f17457n)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
