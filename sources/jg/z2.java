package jg;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import w7.b6;
public final class z2 extends LinearLayout {
    public final int f10388a;

    public z2(Context context, int i10) {
        super(context);
        this.f10388a = i10;
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f10388a) {
            case 9:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f10388a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                setPivotX(getWidth());
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f10388a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(600.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), org.telegram.messenger.i0.L(800.0f)), 1073741824));
                return;
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 9:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(220.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), i11);
                return;
            case 10:
                super.onMeasure(i10, i11);
                setPivotY(0.0f);
                setPivotX(0.0f);
                return;
            case 11:
                super.onMeasure(i10, i11);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
                return;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
        }
    }

    public z2(Context context) {
        super(context);
        this.f10388a = 1;
        setOrientation(1);
        setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        TextView g10 = m5.g(context, 1, 14.0f);
        int i10 = t6.G6;
        a7.V(g10, i10, null);
        g10.setTypeface(org.telegram.messenger.i0.o());
        g10.setText(dd.L0(2131754944, null));
        addView(g10);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        a7.V(textView, i10, null);
        textView.setText(org.telegram.messenger.i0.W2(dd.L0(2131754946, null)));
        addView(textView, b6.q(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        a7.V(textView2, i10, null);
        textView2.setText(org.telegram.messenger.i0.W2(dd.L0(2131754945, null)));
        addView(textView2, b6.q(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }

    private final void a(boolean z10) {
    }
}
