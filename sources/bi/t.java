package bi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class t extends LinearLayout {
    public final int f4728a;

    public t(Context context, int i7) {
        super(context);
        this.f4728a = i7;
    }

    @Override
    public void dispatchSetPressed(boolean z9) {
        switch (this.f4728a) {
            case 9:
                return;
            default:
                super.dispatchSetPressed(z9);
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f4728a) {
            case 5:
                super.onLayout(z9, i7, i10, i11, i12);
                setPivotX(getWidth());
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f4728a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
            case 2:
            case 5:
            case 6:
            case 7:
            case 9:
            default:
                super.onMeasure(i7, i10);
                return;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(220.0f), View.MeasureSpec.getSize(i7)), View.MeasureSpec.getMode(i7)), i10);
                return;
            case 10:
                super.onMeasure(i7, i10);
                setPivotY(0.0f);
                setPivotX(0.0f);
                return;
            case 11:
                super.onMeasure(i7, i10);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
                return;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(600.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(800.0f)), 1073741824));
                return;
        }
    }

    public t(Context context) {
        super(context);
        this.f4728a = 13;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 14.0f);
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(g10, i7, null);
        g10.setTypeface(org.telegram.messenger.g0.o());
        g10.setText(org.telegram.messenger.id.M0(2131754944, null));
        addView(g10);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i7, null);
        textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131754946, null)));
        addView(textView, c8.ha.q(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, i7, null);
        textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131754945, null)));
        addView(textView2, c8.ha.q(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }

    private final void a(boolean z9) {
    }
}
