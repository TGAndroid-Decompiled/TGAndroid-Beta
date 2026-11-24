package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class qaa extends LinearLayout {
    public TextView a;
    public l66 b;
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
        l66 l66Var = this.b;
        TextView textView2 = this.a;
        TextView textView3 = this.d;
        this.e = i;
        if (i == 0) {
            textView2.setText(jb6.a0(null, null, 2131752093, mlb.l(new StringBuilder("+"), oc7.r1(i2).W1(Long.valueOf(z8c.h(i2).n)).phone, r58.f())));
            String M0 = jb6.M0(2131752092, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            int indexOf = M0.indexOf("**");
            int lastIndexOf = M0.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new g6c(jb6.M0(2131752091, null), (wkb) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
            l66Var.setText(spannableStringBuilder);
            textView.setText(jb6.M0(2131752089, null));
            textView3.setVisibility(0);
            textView3.setText(jb6.M0(2131752090, null));
        } else if (i == 1) {
            textView2.setText(jb6.M0(2131742466, null));
            l66Var.setText(jb6.M0(2131742465, null));
            textView.setText(jb6.M0(2131742463, null));
            textView3.setVisibility(0);
            textView3.setText(jb6.M0(2131742464, null));
        } else if (i == 2) {
            textView2.setText(jb6.M0(2131749300, null));
            l66Var.setText(jb6.M0(2131749301, null));
            textView.setText(jb6.M0(2131749302, null));
            textView3.setVisibility(8);
        }
    }
}
