package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.zp;
public final class w1 extends FrameLayout implements p6 {
    public final j9 f15881a;
    public final ImageReceiver f15882b;
    public final TextView f15883c;
    public final TextView d;
    public final zp e;
    public final Path f15884f;
    public final Paint h;
    public final u6 f15885n;
    public final int[] f15886r;
    public boolean f15887s;

    public w1(Context context, u6 u6Var) {
        super(context);
        float f7;
        float f10;
        float f11;
        float f12;
        this.f15881a = new j9((u6) null);
        this.f15882b = new ImageReceiver(this);
        this.f15884f = new Path();
        this.h = new Paint(1);
        this.f15886r = new int[1];
        this.f15885n = u6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f15883c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        f7.V(textView, y6.G6, u6Var);
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
        addView(textView, gb1.h(-1, -2.0f, 7, f7, 10.33f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        f7.V(textView2, y6.f23767z6, u6Var);
        textView2.setTextSize(1, 15.0f);
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
        addView(textView2, gb1.h(-1, -2.0f, 7, f11, 32.0f, f12, 0.0f));
        zp zpVar = new zp(getContext(), 21, u6Var);
        this.e = zpVar;
        zpVar.b(-1, y6.f23356d6, y6.f23485k7);
        zpVar.setDrawUnchecked(false);
        zpVar.setDrawBackgroundAsArc(3);
        addView(zpVar, gb1.m(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
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
        ImageReceiver imageReceiver = this.f15882b;
        imageReceiver.setImageCoords(f10, AndroidUtilities.dp(11.33f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        canvas.drawPath(this.f15884f, this.h);
        if (this.f15887s) {
            Paint V0 = y6.V0("paintDivider", this.f15885n);
            if (V0 == null) {
                V0 = y6.f23478k0;
            }
            Paint paint = V0;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f) + (this.f15887s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(y6.o1(0.85f, y6.w0(y6.f23767z6, this.f15885n)));
        Path path = this.f15884f;
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

    @Override
    public final void updateColors() {
        try {
            this.h.setColor(y6.o1(0.85f, y6.w0(y6.f23767z6, this.f15885n)));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
