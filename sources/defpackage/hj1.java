package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public final class hj1 extends FrameLayout {
    public final vnb a;
    public final gm b;
    public final TextView c;
    public final TextView d;
    public final DecimalFormat e;
    public boolean f;

    public hj1(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        LinearLayout j = uh9.j(context, 1);
        addView(j, tre.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        yob.X(textView, aob.G6, vnbVar);
        j.addView(textView, tre.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        yob.X(textView2, aob.y6, vnbVar);
        j.addView(textView2, tre.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        gm gmVar = new gm(context);
        this.b = gmVar;
        gmVar.setTypeface(hl.o());
        gmVar.setTextSize(1, 13.0f);
        addView(gmVar, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.e = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i;
        super.onDraw(canvas);
        if (this.f) {
            vnb vnbVar = this.a;
            if (vnbVar != null) {
                paint = vnbVar.d("paintDivider");
            } else {
                paint = aob.j0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (ob6.a0) {
                    L = 0.0f;
                } else {
                    L = hl.L(17.0f);
                }
                float f = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (ob6.a0) {
                    i = hl.L(17.0f);
                } else {
                    i = 0;
                }
                canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }
}
