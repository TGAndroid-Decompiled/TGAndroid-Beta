package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class c34 extends LinearLayout {
    public final gt3 a;
    public final TextView b;
    public b34 c;

    public c34(Context context, wjb wjbVar) {
        super(context);
        setOrientation(0);
        gt3 gt3Var = new gt3(context, wjbVar);
        this.a = gt3Var;
        gt3Var.setLines(1);
        gt3Var.setSingleLine(true);
        InputFilter[] inputFilterArr = {new a34(this)};
        gt3Var.setInputType(16384);
        gt3Var.setFilters(inputFilterArr);
        gt3Var.setTextSize(1, 16.0f);
        zkb.X(gt3Var, bkb.Ke, wjbVar);
        zkb.G(gt3Var, bkb.Xc, wjbVar);
        zkb.C(gt3Var, bkb.kg, wjbVar);
        int i = bkb.Le;
        zkb.l(gt3Var, 34, i, wjbVar);
        zkb.D(gt3Var, i, wjbVar);
        zkb.l(gt3Var, 30, bkb.Me, wjbVar);
        zkb.l(gt3Var, 36, bkb.lg, wjbVar);
        gt3Var.setBackground(null);
        gt3Var.setHint(k96.M0(2131753474, null));
        gt3Var.addTextChangedListener(new b7(this, (byte) 22));
        gt3Var.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        zkb.X(textView, bkb.i5, wjbVar);
        if (k96.a0) {
            LinearLayout.LayoutParams t = nme.t(-1, -2, 16, 20, 0, 36, 0);
            t.weight = 1.0f;
            addView(gt3Var, t);
            addView(textView, nme.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, nme.t(-2, -2, 16, 20, 0, 0, 0));
        addView(gt3Var, nme.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(b34 b34Var) {
        this.c = b34Var;
    }

    public void setCount(int i) {
        this.b.setText(String.valueOf(i));
    }
}
