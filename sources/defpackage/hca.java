package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class hca extends LinearLayout {
    public TextView a;
    public p66 b;
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
        p66 p66Var = this.b;
        TextView textView2 = this.a;
        TextView textView3 = this.d;
        this.e = i;
        if (i == 0) {
            textView2.setText(ob6.a0(null, null, 2131752121, xnb.k(new StringBuilder("+"), uc7.s1(i2).X1(Long.valueOf(yac.h(i2).n)).phone, f78.f())));
            String M0 = ob6.M0(2131752120, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            int indexOf = M0.indexOf("**");
            int lastIndexOf = M0.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new f8c(ob6.M0(2131752119, null), (rmb) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            p66Var.setText(spannableStringBuilder);
            textView.setText(ob6.M0(2131752117, null));
            textView3.setVisibility(0);
            textView3.setText(ob6.M0(2131752118, null));
        } else if (i == 1) {
            textView2.setText(ob6.M0(2131742434, null));
            p66Var.setText(ob6.M0(2131742433, null));
            textView.setText(ob6.M0(2131742431, null));
            textView3.setVisibility(0);
            textView3.setText(ob6.M0(2131742432, null));
        } else if (i == 2) {
            textView2.setText(ob6.M0(2131749297, null));
            p66Var.setText(ob6.M0(2131749298, null));
            textView.setText(ob6.M0(2131749299, null));
            textView3.setVisibility(8);
        }
    }
}
