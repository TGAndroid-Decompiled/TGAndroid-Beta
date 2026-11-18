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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.mp;
public final class q1 extends FrameLayout implements c6 {
    public final b9 f18425a;
    public final ImageReceiver f18426b;
    public final TextView f18427c;
    public final TextView d;
    public final mp f18428e;
    public final Path f18429f;
    public final Paint h;
    public final i6 f18430n;
    public final int[] f18431r;
    public boolean f18432s;

    public q1(Context context, i6 i6Var) {
        super(context);
        float f10;
        float f11;
        float f12;
        float f13;
        this.f18425a = new b9((i6) null);
        this.f18426b = new ImageReceiver(this);
        this.f18429f = new Path();
        this.h = new Paint(1);
        this.f18431r = new int[1];
        this.f18430n = i6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f18427c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        u6.U(textView, n6.G6, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        boolean z10 = gd.f24213a0;
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
        u6.U(textView2, n6.f29805z6, i6Var);
        textView2.setTextSize(1, 15.0f);
        boolean z11 = gd.f24213a0;
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
        mp mpVar = new mp(21, getContext(), i6Var);
        this.f18428e = mpVar;
        mpVar.b(-1, n6.f29394d6, n6.f29524k7);
        mpVar.setDrawUnchecked(false);
        mpVar.setDrawBackgroundAsArc(3);
        addView(mpVar, ma.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f10;
        if (gd.f24213a0) {
            L = getMeasuredWidth() - org.telegram.messenger.g0.L(65.0f);
        } else {
            L = org.telegram.messenger.g0.L(9.0f);
        }
        float f11 = L;
        ImageReceiver imageReceiver = this.f18426b;
        imageReceiver.y0(f11, org.telegram.messenger.g0.L(11.33f), org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f18429f, this.h);
        if (this.f18432s) {
            Paint W0 = n6.W0("paintDivider", this.f18430n);
            if (W0 == null) {
                W0 = n6.f29517k0;
            }
            Paint paint = W0;
            float f12 = 78.0f;
            if (gd.f24213a0) {
                f10 = 0.0f;
            } else {
                f10 = 78.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!gd.f24213a0) {
                f12 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - org.telegram.messenger.g0.L(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float measuredWidth;
        int i11;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f) + (this.f18432s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setColor(n6.r1(0.85f, n6.w0(n6.f29805z6, this.f18430n)));
        Path path = this.f18429f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (gd.f24213a0) {
            measuredWidth = org.telegram.messenger.g0.N(29.66f);
        } else {
            measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.N(24.33f);
        }
        path.moveTo(measuredWidth, measuredHeight - org.telegram.messenger.g0.N(5.66f));
        if (gd.f24213a0) {
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
            this.h.setColor(n6.r1(0.85f, n6.w0(n6.f29805z6, this.f18430n)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
