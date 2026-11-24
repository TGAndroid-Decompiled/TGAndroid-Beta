package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class sc extends ViewGroup {
    public final TextView a;
    public final TextView b;
    public final tc c;

    public sc(tc tcVar, Context context) {
        super(context);
        this.c = tcVar;
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        addView(textView);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setSingleLine();
        textView2.setGravity(16);
        addView(textView2);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int L = gm.L(10.0f);
        int L2 = gm.L(6.83f);
        int i6 = i4 - i2;
        int i7 = i3 - i;
        boolean z2 = jb6.a0;
        TextView textView = this.a;
        int measuredWidth = textView.getMeasuredWidth();
        if (z2) {
            i5 = (i7 - L) - measuredWidth;
        } else {
            i5 = L;
        }
        int measuredHeight = textView.getMeasuredHeight();
        int i8 = (i6 - measuredHeight) / 2;
        textView.layout(i5, i8, textView.getMeasuredWidth() + i5, measuredHeight + i8);
        int i9 = measuredWidth + L2 + L;
        TextView textView2 = this.b;
        if (textView2.getVisibility() != 8) {
            int measuredWidth2 = textView2.getMeasuredWidth();
            if (z2) {
                i9 = (i7 - i9) - measuredWidth2;
            }
            int measuredHeight2 = textView2.getMeasuredHeight();
            int i10 = (i6 - measuredHeight2) / 2;
            textView2.layout(i9, i10, textView2.getMeasuredWidth() + i9, measuredHeight2 + i10);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int L = gm.L(10.0f);
        int L2 = gm.L(6.83f);
        int i3 = L << 1;
        int min = Math.min(this.c.e, View.MeasureSpec.getSize(i)) - i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        TextView textView = this.b;
        if (textView.getVisibility() != 8) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, min), Integer.MIN_VALUE), makeMeasureSpec);
            min -= textView.getMeasuredWidth() + L2;
            i3 += textView.getMeasuredWidth() + L2;
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(gm.L(48.0f), min), Integer.MIN_VALUE);
        TextView textView2 = this.a;
        textView2.measure(makeMeasureSpec2, makeMeasureSpec);
        setMeasuredDimension(textView2.getMeasuredWidth() + i3, size);
    }
}
