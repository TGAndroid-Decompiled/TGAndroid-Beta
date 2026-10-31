package og;

import ag.a1;
import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.mt;
import w7.b6;
public final class m extends LinearLayout {
    public final mt f14207a;
    public final TextView f14208b;
    public l f14209c;

    public m(Context context, p6 p6Var) {
        super(context);
        setOrientation(0);
        mt mtVar = new mt(context, p6Var);
        this.f14207a = mtVar;
        mtVar.setLines(1);
        mtVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new k(this)};
        mtVar.setInputType(16384);
        mtVar.setFilters(inputFilterArr);
        mtVar.setTextSize(1, 16.0f);
        a7.V(mtVar, t6.Ie, p6Var);
        a7.H(mtVar, t6.Vc, p6Var);
        a7.D(mtVar, t6.f21028ig, p6Var);
        int i10 = t6.Je;
        a7.m(mtVar, 34, i10, p6Var);
        a7.E(mtVar, i10, p6Var);
        a7.m(mtVar, 30, t6.Ke, p6Var);
        a7.m(mtVar, 36, t6.f21048jg, p6Var);
        mtVar.setBackground(null);
        mtVar.setHint(cd.L0(2131753477, null));
        mtVar.addTextChangedListener(new a1(this, 6));
        mtVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f14208b = textView;
        textView.setTextSize(1, 16.0f);
        a7.V(textView, t6.f21037j5, p6Var);
        if (cd.X) {
            LinearLayout.LayoutParams t10 = b6.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(mtVar, t10);
            addView(textView, b6.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, b6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(mtVar, b6.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i0.L(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(l lVar) {
        this.f14209c = lVar;
    }

    public void setCount(int i10) {
        this.f14208b.setText(String.valueOf(i10));
    }
}
