package ag;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.r8;
import w7.b6;
public final class w2 extends FrameLayout implements k6 {
    public final r8 f774a;
    public final ImageReceiver f775b;
    public final TextView f776c;
    public final TextView d;
    public final ep e;
    public final Path f777f;
    public final Paint h;
    public final p6 f778n;
    public final int[] f779r;
    public boolean f780s;

    public w2(Context context, p6 p6Var) {
        super(context);
        float f7;
        float f10;
        float f11;
        float f12;
        this.f774a = new r8((p6) null);
        this.f775b = new ImageReceiver(this);
        this.f777f = new Path();
        this.h = new Paint(1);
        this.f779r = new int[1];
        this.f778n = p6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f776c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        a7.V(textView, t6.G6, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 16.0f);
        boolean z10 = cd.X;
        if (z10) {
            f7 = 40.0f;
        } else {
            f7 = 78.0f;
        }
        if (z10) {
            f10 = 78.0f;
        } else {
            f10 = 40.0f;
        }
        addView(textView, b6.d(-1, -2.0f, 7, f7, 10.33f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        a7.V(textView2, t6.f21330z6, p6Var);
        textView2.setTextSize(1, 15.0f);
        boolean z11 = cd.X;
        if (z11) {
            f11 = 40.0f;
        } else {
            f11 = 78.0f;
        }
        if (z11) {
            f12 = 78.0f;
        } else {
            f12 = 40.0f;
        }
        addView(textView2, b6.d(-1, -2.0f, 7, f11, 32.0f, f12, 0.0f));
        ep epVar = new ep(21, getContext(), p6Var);
        this.e = epVar;
        epVar.b(-1, t6.f20929d6, t6.f21059k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(3);
        addView(epVar, b6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f7;
        if (cd.X) {
            L = getMeasuredWidth() - org.telegram.messenger.i0.L(65.0f);
        } else {
            L = org.telegram.messenger.i0.L(9.0f);
        }
        float f10 = L;
        ImageReceiver imageReceiver = this.f775b;
        imageReceiver.y0(f10, org.telegram.messenger.i0.L(11.33f), org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f777f, this.h);
        if (this.f780s) {
            Paint W0 = t6.W0("paintDivider", this.f778n);
            if (W0 == null) {
                W0 = t6.f21052k0;
            }
            Paint paint = W0;
            float f11 = 78.0f;
            if (cd.X) {
                f7 = 0.0f;
            } else {
                f7 = 78.0f;
            }
            float L2 = org.telegram.messenger.i0.L(f7);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!cd.X) {
                f11 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - org.telegram.messenger.i0.L(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float measuredWidth;
        int i12;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(78.0f) + (this.f780s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.66f));
        paint.setColor(t6.r1(0.85f, t6.w0(t6.f21330z6, this.f778n)));
        Path path = this.f777f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (cd.X) {
            measuredWidth = org.telegram.messenger.i0.N(29.66f);
        } else {
            measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.N(24.33f);
        }
        path.moveTo(measuredWidth, measuredHeight - org.telegram.messenger.i0.N(5.66f));
        if (cd.X) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        path.lineTo((org.telegram.messenger.i0.N(5.33f) * i12) + measuredWidth, measuredHeight);
        path.lineTo(measuredWidth, org.telegram.messenger.i0.N(5.66f) + measuredHeight);
    }

    @Override
    public final void updateColors() {
        try {
            this.h.setColor(t6.r1(0.85f, t6.w0(t6.f21330z6, this.f778n)));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
