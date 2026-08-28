package dg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.mt;
public final class m extends LinearLayout {
    public final mt f4533a;
    public final TextView f4534b;
    public l f4535c;

    public m(Context context, b6 b6Var) {
        super(context);
        setOrientation(0);
        mt mtVar = new mt(context, b6Var);
        this.f4533a = mtVar;
        mtVar.setLines(1);
        mtVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new k(this)};
        mtVar.setInputType(16384);
        mtVar.setFilters(inputFilterArr);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setTextColor(f6.v0(f6.Ud, b6Var));
        mtVar.setLinkTextColor(f6.v0(f6.f23079hc, b6Var));
        mtVar.setHighlightColor(f6.v0(f6.f23312uf, b6Var));
        int i9 = f6.Vd;
        mtVar.setHintColor(f6.v0(i9, b6Var));
        mtVar.setHintTextColor(f6.v0(i9, b6Var));
        mtVar.setCursorColor(f6.v0(f6.Wd, b6Var));
        mtVar.setHandlesColor(f6.v0(f6.f23325vf, b6Var));
        mtVar.setBackground(null);
        mtVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        mtVar.addTextChangedListener(new bh.f(this, 1));
        mtVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f4534b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(f6.v0(f6.f23108j5, b6Var));
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t10 = e6.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(mtVar, t10);
            addView(textView, e6.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, e6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(mtVar, e6.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(l lVar) {
        this.f4535c = lVar;
    }

    public void setCount(int i9) {
        this.f4534b.setText(String.valueOf(i9));
    }
}
