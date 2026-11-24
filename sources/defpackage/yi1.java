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
public final class yi1 extends FrameLayout {
    public final wjb a;
    public final fm b;
    public final TextView c;
    public final TextView d;
    public final DecimalFormat e;
    public boolean f;

    public yi1(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        LinearLayout j = de9.j(context, 1);
        addView(j, nme.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        zkb.X(textView, bkb.F6, wjbVar);
        j.addView(textView, nme.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        zkb.X(textView2, bkb.x6, wjbVar);
        j.addView(textView2, nme.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        fm fmVar = new fm(context);
        this.b = fmVar;
        fmVar.setTypeface(gl.o());
        fmVar.setTextSize(1, 13.0f);
        addView(fmVar, nme.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
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
            wjb wjbVar = this.a;
            if (wjbVar != null) {
                paint = wjbVar.d("paintDivider");
            } else {
                paint = bkb.j0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (k96.a0) {
                    L = 0.0f;
                } else {
                    L = gl.L(17.0f);
                }
                float f = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (k96.a0) {
                    i = gl.L(17.0f);
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
