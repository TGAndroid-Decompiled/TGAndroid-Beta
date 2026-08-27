package eg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.lt;

public final class m extends LinearLayout {

    public final lt f5424a;

    public final TextView f5425b;

    public l f5426c;

    public m(Context context, c6 c6Var) {
        super(context);
        setOrientation(0);
        lt ltVar = new lt(context, c6Var);
        this.f5424a = ltVar;
        ltVar.setLines(1);
        ltVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new k(this)};
        ltVar.setInputType(16384);
        ltVar.setFilters(inputFilterArr);
        ltVar.setTextSize(1, 16.0f);
        ltVar.setTextColor(g6.v0(g6.Ud, c6Var));
        ltVar.setLinkTextColor(g6.v0(g6.f23131hc, c6Var));
        ltVar.setHighlightColor(g6.v0(g6.f23366uf, c6Var));
        int i10 = g6.Vd;
        ltVar.setHintColor(g6.v0(i10, c6Var));
        ltVar.setHintTextColor(g6.v0(i10, c6Var));
        ltVar.setCursorColor(g6.v0(g6.Wd, c6Var));
        ltVar.setHandlesColor(g6.v0(g6.f23382vf, c6Var));
        ltVar.setBackground(null);
        ltVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        ltVar.addTextChangedListener(new ch.e(this, 1));
        ltVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f5425b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(g6.v0(g6.f23161j5, c6Var));
        if (!LocaleController.isRTL) {
            addView(textView, z5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(ltVar, z5.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams layoutParamsT = z5.t(-1, -2, 16, 20, 0, 36, 0);
            layoutParamsT.weight = 1.0f;
            addView(ltVar, layoutParamsT);
            addView(textView, z5.t(-2, -2, 16, 0, 0, 20, 0));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(l lVar) {
        this.f5426c = lVar;
    }

    public void setCount(int i10) {
        this.f5425b.setText(String.valueOf(i10));
    }
}
