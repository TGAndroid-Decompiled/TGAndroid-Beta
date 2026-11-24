package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class n44 extends LinearLayout {
    public final qu3 a;
    public final TextView b;
    public m44 c;

    public n44(Context context, ylb ylbVar) {
        super(context);
        setOrientation(0);
        qu3 qu3Var = new qu3(context, ylbVar);
        this.a = qu3Var;
        qu3Var.setLines(1);
        qu3Var.setSingleLine(true);
        InputFilter[] inputFilterArr = {new l44(this)};
        qu3Var.setInputType(16384);
        qu3Var.setFilters(inputFilterArr);
        qu3Var.setTextSize(1, 16.0f);
        anb.X(qu3Var, cmb.Ke, ylbVar);
        anb.G(qu3Var, cmb.Xc, ylbVar);
        anb.C(qu3Var, cmb.kg, ylbVar);
        int i = cmb.Le;
        anb.l(qu3Var, 34, i, ylbVar);
        anb.D(qu3Var, i, ylbVar);
        anb.l(qu3Var, 30, cmb.Me, ylbVar);
        anb.l(qu3Var, 36, cmb.lg, ylbVar);
        qu3Var.setBackground(null);
        qu3Var.setHint(jb6.M0(2131753442, null));
        qu3Var.addTextChangedListener(new b7(this, (byte) 23));
        qu3Var.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        anb.X(textView, cmb.i5, ylbVar);
        if (jb6.a0) {
            LinearLayout.LayoutParams t = qoe.t(-1, -2, 16, 20, 0, 36, 0);
            t.weight = 1.0f;
            addView(qu3Var, t);
            addView(textView, qoe.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, qoe.t(-2, -2, 16, 20, 0, 0, 0));
        addView(qu3Var, qoe.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(m44 m44Var) {
        this.c = m44Var;
    }

    public void setCount(int i) {
        this.b.setText(String.valueOf(i));
    }
}
