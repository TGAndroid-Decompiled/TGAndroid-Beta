package ai;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public final class r2 extends LinearLayout {
    public final int f1488a;

    public r2(Context context, int i7) {
        super(context);
        this.f1488a = i7;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f1488a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(400.0f), View.MeasureSpec.getSize(i7)), 1073741824), i10);
                return;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
            case 3:
            case 6:
            case 7:
            default:
                super.onMeasure(i7, i10);
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(220.0f), View.MeasureSpec.getSize(i7)), View.MeasureSpec.getMode(i7)), i10);
                return;
            case 9:
                super.onMeasure(i7, i10);
                setPivotY(0.0f);
                setPivotX(0.0f);
                return;
            case 10:
                super.onMeasure(i7, i10);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
                return;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(600.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(800.0f)), 1073741824));
                return;
        }
    }

    public r2(Context context) {
        super(context);
        this.f1488a = 12;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i7 = n6.G6;
        u6.U(textView, i7, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(gd.M0(2131754944, null));
        addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        u6.U(textView2, i7, null);
        textView2.setText(org.telegram.messenger.g0.W2(gd.M0(2131754946, null)));
        addView(textView2, ma.q(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        u6.U(textView3, i7, null);
        textView3.setText(org.telegram.messenger.g0.W2(gd.M0(2131754945, null)));
        addView(textView3, ma.q(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }
}
