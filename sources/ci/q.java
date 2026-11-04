package ci;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
public final class q extends LinearLayout {
    public final int f5791a;

    public q(Context context, int i3) {
        super(context);
        this.f5791a = i3;
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f5791a) {
            case 9:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f5791a) {
            case 5:
                super.onLayout(z10, i3, i10, i11, i12);
                setPivotX(getWidth());
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f5791a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
                return;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
                return;
            case 2:
            case 5:
            case 6:
            case 7:
            case 9:
            default:
                super.onMeasure(i3, i10);
                return;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
                return;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(220.0f), View.MeasureSpec.getSize(i3)), View.MeasureSpec.getMode(i3)), i10);
                return;
            case 10:
                super.onMeasure(i3, i10);
                setPivotY(0.0f);
                setPivotX(0.0f);
                return;
            case 11:
                super.onMeasure(i3, i10);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
                return;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(600.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(800.0f)), 1073741824));
                return;
        }
    }

    public q(Context context) {
        super(context);
        this.f5791a = 13;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        TextView g7 = org.telegram.messenger.k5.g(context, 1, 14.0f);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(g7, i3, null);
        g7.setTypeface(org.telegram.messenger.g0.o());
        g7.setText(bd.M0(2131754944, null));
        addView(g7);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i3, null);
        textView.setText(org.telegram.messenger.g0.X2(bd.M0(2131754946, null)));
        addView(textView, mf.q(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, i3, null);
        textView2.setText(org.telegram.messenger.g0.X2(bd.M0(2131754945, null)));
        addView(textView2, mf.q(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }

    private final void a(boolean z10) {
    }
}
