package lg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wo;
public final class o1 extends FrameLayout implements z5 {
    public final u8 f18386a;
    public final ImageReceiver f18387b;
    public final TextView f18388c;
    public final TextView d;
    public final wo f18389e;
    public final Path f18390f;
    public final Paint h;
    public final e6 f18391n;
    public final int[] f18392r;
    public boolean f18393s;

    public o1(Context context, e6 e6Var) {
        super(context);
        float f10;
        float f11;
        float f12;
        float f13;
        this.f18386a = new u8((e6) null);
        this.f18387b = new ImageReceiver(this);
        this.f18390f = new Path();
        this.h = new Paint(1);
        this.f18392r = new int[1];
        this.f18391n = e6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f18388c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        r6.V(textView, k6.G6, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        boolean z10 = bd.f21784a0;
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
        addView(textView, mf.d(-1, -2.0f, 7, f10, 10.33f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        r6.V(textView2, k6.f28290z6, e6Var);
        textView2.setTextSize(1, 15.0f);
        boolean z11 = bd.f21784a0;
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
        addView(textView2, mf.d(-1, -2.0f, 7, f12, 32.0f, f13, 0.0f));
        wo woVar = new wo(21, getContext(), e6Var);
        this.f18389e = woVar;
        woVar.b(-1, k6.f27878d6, k6.f28008k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar, mf.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f10;
        if (bd.f21784a0) {
            L = getMeasuredWidth() - org.telegram.messenger.g0.L(65.0f);
        } else {
            L = org.telegram.messenger.g0.L(9.0f);
        }
        float f11 = L;
        ImageReceiver imageReceiver = this.f18387b;
        imageReceiver.y0(f11, org.telegram.messenger.g0.L(11.33f), org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f18390f, this.h);
        if (this.f18393s) {
            Paint W0 = k6.W0("paintDivider", this.f18391n);
            if (W0 == null) {
                W0 = k6.f28002k0;
            }
            Paint paint = W0;
            float f12 = 78.0f;
            if (bd.f21784a0) {
                f10 = 0.0f;
            } else {
                f10 = 78.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!bd.f21784a0) {
                f12 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - org.telegram.messenger.g0.L(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float measuredWidth;
        int i11;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f) + (this.f18393s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setColor(k6.r1(0.85f, k6.w0(k6.f28290z6, this.f18391n)));
        Path path = this.f18390f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (bd.f21784a0) {
            measuredWidth = org.telegram.messenger.g0.N(29.66f);
        } else {
            measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.N(24.33f);
        }
        path.moveTo(measuredWidth, measuredHeight - org.telegram.messenger.g0.N(5.66f));
        if (bd.f21784a0) {
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
            this.h.setColor(k6.r1(0.85f, k6.w0(k6.f28290z6, this.f18391n)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
