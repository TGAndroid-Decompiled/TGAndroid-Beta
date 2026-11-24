package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class l65 extends LinearLayout {
    public final byte a = 1;
    public final LinearLayout b;
    public final LinearLayout c;

    public l65(Context context) {
        super(context);
        setOrientation(0);
        setGravity(17);
        setPadding(gl.L(3.0f), gl.L(3.0f), gl.L(3.0f), gl.L(3.0f));
        LinearLayout a = a(2131232336, k96.M0(2131746078, null));
        this.c = a;
        addView(a, nme.o(-2, -1));
        LinearLayout a2 = a(2131231732, k96.M0(2131751323, null));
        this.b = a2;
        addView(a2, nme.o(-2, -1));
    }

    public final LinearLayout a(int i, String str) {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(gl.L(25.0f), gl.L(7.0f), gl.L(25.0f), gl.L(7.0f));
        linearLayout.addView(tb4.k(context, i), nme.k(0.0f, 0.0f, 8.0f, 0.0f, 24, 24));
        TextView textView = new TextView(context);
        textView.setGravity(16);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setSingleLine(true);
        textView.setTextColor(-1);
        linearLayout.addView(textView, nme.o(-2, -2));
        ote.a(linearLayout);
        return linearLayout;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        LinearLayout linearLayout = this.c;
        LinearLayout linearLayout2 = this.b;
        switch (b) {
            case 0:
                linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), 0);
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout2.getMeasuredWidth(), 1073741824), 0);
                    setMeasuredDimension(linearLayout2.getMeasuredWidth(), linearLayout.getMeasuredHeight() + linearLayout2.getMeasuredHeight());
                    return;
                }
                setMeasuredDimension(linearLayout2.getMeasuredWidth(), linearLayout2.getMeasuredHeight());
                return;
            default:
                ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                int paddingTop = getPaddingTop();
                int max = Math.max(0, size - paddingRight);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - (getPaddingBottom() + paddingTop)), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
                linearLayout2.measure(makeMeasureSpec2, makeMeasureSpec);
                linearLayout.measure(makeMeasureSpec2, makeMeasureSpec);
                int min = Math.min(Math.max(linearLayout2.getMeasuredWidth(), linearLayout.getMeasuredWidth()), max / 2);
                layoutParams2.width = min;
                layoutParams.width = min;
                super.onMeasure(i, i2);
                return;
        }
    }

    public l65(Context context, LinearLayout linearLayout, LinearLayout linearLayout2) {
        super(context);
        this.b = linearLayout;
        this.c = linearLayout2;
    }
}
