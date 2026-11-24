package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class q8a extends LinearLayout {
    public TextView a;
    public l46 b;
    public TextView c;
    public TextView d;
    public int e;
    public int f;

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setType(int i) {
        int i2 = this.f;
        TextView textView = this.c;
        l46 l46Var = this.b;
        TextView textView2 = this.a;
        TextView textView3 = this.d;
        this.e = i;
        if (i == 0) {
            textView2.setText(k96.a0(null, null, 2131752144, yjb.k(new StringBuilder("+"), na7.q1(i2).V1(Long.valueOf(y6c.h(i2).n)).phone, p38.f())));
            String M0 = k96.M0(2131752143, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            int indexOf = M0.indexOf("**");
            int lastIndexOf = M0.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new g4c(k96.M0(2131752142, null), (vib) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
            l46Var.setText(spannableStringBuilder);
            textView.setText(k96.M0(2131752140, null));
            textView3.setVisibility(0);
            textView3.setText(k96.M0(2131752141, null));
        } else if (i == 1) {
            textView2.setText(k96.M0(2131742540, null));
            l46Var.setText(k96.M0(2131742539, null));
            textView.setText(k96.M0(2131742537, null));
            textView3.setVisibility(0);
            textView3.setText(k96.M0(2131742538, null));
        } else if (i == 2) {
            textView2.setText(k96.M0(2131749351, null));
            l46Var.setText(k96.M0(2131749352, null));
            textView.setText(k96.M0(2131749353, null));
            textView3.setVisibility(8);
        }
    }
}
