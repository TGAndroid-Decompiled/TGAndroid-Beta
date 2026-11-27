package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class l88 extends FrameLayout {
    public final TextView a;
    public final LinearLayout b;
    public View.OnClickListener c;
    public int d;
    public final int[] e;

    public l88(Context context) {
        super(context);
        this.e = new int[]{0, -45747, -753630, -13056, -8269183, -9321002, -16747844, -10080879};
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setGravity(5);
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, tre.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        for (int i = 0; i < this.e.length; i++) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setSize(hl.L(20.0f));
            radioButton.setTag(Integer.valueOf(i));
            this.b.addView(radioButton, tre.l(1.0f / this.e.length, 0, -1));
            radioButton.setOnClickListener(new am7(this, (byte) 12));
        }
        addView(this.b, tre.d(-1, 40.0f, 51, 96.0f, 0.0f, 24.0f, 0.0f));
    }

    public final void a(int i, String str) {
        this.d = i;
        this.a.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        b(false);
    }

    public final void b(boolean z) {
        boolean z2;
        int i;
        LinearLayout linearLayout = this.b;
        int childCount = linearLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayout.getChildAt(i2);
            if (childAt instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) childAt;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                int[] iArr = this.e;
                if (this.d == iArr[intValue]) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                radioButton.a(z2, z);
                if (intValue == 0) {
                    i = -1;
                } else {
                    i = iArr[intValue];
                }
                radioButton.b(i, i);
            }
        }
    }

    public int getCurrentColor() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(40.0f), 1073741824));
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }
}
