package ig;

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
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.k9;
import w7.a6;
public final class v1 extends FrameLayout {
    public final k9 f11664a;
    public final ImageReceiver f11665b;
    public final TextView f11666c;
    public final TextView d;
    public final aq e;
    public final Path f11667f;
    public final Paint h;
    public final c6 f11668n;
    public final int[] f11669r;
    public boolean f11670s;

    public v1(Context context, c6 c6Var) {
        super(context);
        float f7;
        float f10;
        float f11;
        float f12;
        this.f11664a = new k9((c6) null);
        this.f11665b = new ImageReceiver(this);
        this.f11667f = new Path();
        this.h = new Paint(1);
        this.f11669r = new int[1];
        this.f11668n = c6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f11666c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(g6.w0(g6.G6, c6Var));
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
        addView(textView, a6.a(-2.0f, f7, 10.33f, f10, 0.0f, -1, 7));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        yh.n(g6.f20305z6, c6Var, textView2, 1, 15.0f);
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
        addView(textView2, a6.a(-2.0f, f11, 32.0f, f12, 0.0f, -1, 7));
        aq aqVar = new aq(getContext(), 21, c6Var);
        this.e = aqVar;
        aqVar.b(-1, g6.f19901d6, g6.f20029k7);
        aqVar.setDrawUnchecked(false);
        aqVar.setDrawBackgroundAsArc(3);
        addView(aqVar, a6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
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
        ImageReceiver imageReceiver = this.f11665b;
        imageReceiver.setImageCoords(f10, AndroidUtilities.dp(11.33f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        canvas.drawPath(this.f11667f, this.h);
        if (this.f11670s) {
            Paint U0 = g6.U0("paintDivider", this.f11668n);
            if (U0 == null) {
                U0 = g6.f20022k0;
            }
            Paint paint = U0;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f) + (this.f11670s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(g6.m1(0.85f, g6.w0(g6.f20305z6, this.f11668n)));
        Path path = this.f11667f;
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
