package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.tp;
import w7.a6;
public final class e2 extends FrameLayout {
    public final g9 f8872a;
    public final ImageReceiver f8873b;
    public final TextView f8874c;
    public final TextView d;
    public final tp e;
    public final Path f8875f;
    public final Paint h;
    public final f6 f8876n;
    public final int[] f8877r;
    public boolean f8878s;

    public e2(Context context, f6 f6Var) {
        super(context);
        float f7;
        float f10;
        float f11;
        float f12;
        this.f8872a = new g9((f6) null);
        this.f8873b = new ImageReceiver(this);
        this.f8875f = new Path();
        this.h = new Paint(1);
        this.f8877r = new int[1];
        this.f8876n = f6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f8874c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(j6.v0(j6.G6, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        boolean z10 = LocaleController.isRTL;
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
        addView(textView, a6.d(-1, -2.0f, 7, f7, 10.33f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        em.n(j6.f18325z6, f6Var, textView2, 1, 15.0f);
        boolean z11 = LocaleController.isRTL;
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
        addView(textView2, a6.d(-1, -2.0f, 7, f11, 32.0f, f12, 0.0f));
        tp tpVar = new tp(getContext(), 21, f6Var);
        this.e = tpVar;
        tpVar.b(-1, j6.f17928d6, j6.f18056k7);
        tpVar.setDrawUnchecked(false);
        tpVar.setDrawBackgroundAsArc(3);
        addView(tpVar, a6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        float f7;
        if (LocaleController.isRTL) {
            dp = getMeasuredWidth() - AndroidUtilities.dp(65.0f);
        } else {
            dp = AndroidUtilities.dp(9.0f);
        }
        float f10 = dp;
        ImageReceiver imageReceiver = this.f8873b;
        imageReceiver.setImageCoords(f10, AndroidUtilities.dp(11.33f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        canvas.drawPath(this.f8875f, this.h);
        if (this.f8878s) {
            Paint T0 = j6.T0("paintDivider", this.f8876n);
            if (T0 == null) {
                T0 = j6.f18049k0;
            }
            Paint paint = T0;
            float f11 = 78.0f;
            if (LocaleController.isRTL) {
                f7 = 0.0f;
            } else {
                f7 = 78.0f;
            }
            float dp2 = AndroidUtilities.dp(f7);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f11 = 0.0f;
            }
            canvas.drawRect(dp2, measuredHeight, width - AndroidUtilities.dp(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float measuredWidth;
        int i12;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f) + (this.f8878s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(j6.l1(0.85f, j6.v0(j6.f18325z6, this.f8876n)));
        Path path = this.f8875f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (LocaleController.isRTL) {
            measuredWidth = AndroidUtilities.dpf2(29.66f);
        } else {
            measuredWidth = getMeasuredWidth() - AndroidUtilities.dpf2(24.33f);
        }
        path.moveTo(measuredWidth, measuredHeight - AndroidUtilities.dpf2(5.66f));
        if (LocaleController.isRTL) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        path.lineTo((AndroidUtilities.dpf2(5.33f) * i12) + measuredWidth, measuredHeight);
        path.lineTo(measuredWidth, AndroidUtilities.dpf2(5.66f) + measuredHeight);
    }
}
