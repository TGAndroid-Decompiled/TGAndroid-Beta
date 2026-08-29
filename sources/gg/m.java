package gg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.st;
public final class m extends LinearLayout {
    public final st f7317a;
    public final TextView f7318b;
    public l f7319c;

    public m(Context context, c6 c6Var) {
        super(context);
        setOrientation(0);
        st stVar = new st(context, c6Var);
        this.f7317a = stVar;
        stVar.setLines(1);
        stVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new k(this)};
        stVar.setInputType(16384);
        stVar.setFilters(inputFilterArr);
        stVar.setTextSize(1, 16.0f);
        stVar.setTextColor(g6.v0(g6.Ud, c6Var));
        stVar.setLinkTextColor(g6.v0(g6.hc, c6Var));
        stVar.setHighlightColor(g6.v0(g6.f23374uf, c6Var));
        int i10 = g6.Vd;
        stVar.setHintColor(g6.v0(i10, c6Var));
        stVar.setHintTextColor(g6.v0(i10, c6Var));
        stVar.setCursorColor(g6.v0(g6.Wd, c6Var));
        stVar.setHandlesColor(g6.v0(g6.f23392vf, c6Var));
        stVar.setBackground(null);
        stVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        stVar.addTextChangedListener(new bh.c(this, 2));
        stVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f7318b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(g6.v0(g6.f23169j5, c6Var));
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t10 = f6.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(stVar, t10);
            addView(textView, f6.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, f6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(stVar, f6.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(l lVar) {
        this.f7319c = lVar;
    }

    public void setCount(int i10) {
        this.f7318b.setText(String.valueOf(i10));
    }
}
