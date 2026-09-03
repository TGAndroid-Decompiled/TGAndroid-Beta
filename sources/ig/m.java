package ig;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ut;
public final class m extends LinearLayout {
    public final ut f7508a;
    public final TextView f7509b;
    public l f7510c;

    public m(Context context, f6 f6Var) {
        super(context);
        setOrientation(0);
        ut utVar = new ut(context, f6Var);
        this.f7508a = utVar;
        utVar.setLines(1);
        utVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new k(this)};
        utVar.setInputType(16384);
        utVar.setFilters(inputFilterArr);
        utVar.setTextSize(1, 16.0f);
        utVar.setTextColor(j6.v0(j6.Ud, f6Var));
        utVar.setLinkTextColor(j6.v0(j6.f19958hc, f6Var));
        utVar.setHighlightColor(j6.v0(j6.f20191uf, f6Var));
        int i10 = j6.Vd;
        utVar.setHintColor(j6.v0(i10, f6Var));
        utVar.setHintTextColor(j6.v0(i10, f6Var));
        utVar.setCursorColor(j6.v0(j6.Wd, f6Var));
        utVar.setHandlesColor(j6.v0(j6.f20209vf, f6Var));
        utVar.setBackground(null);
        utVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        utVar.addTextChangedListener(new dh.c(this, 2));
        utVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f7509b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(j6.v0(j6.f19987j5, f6Var));
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t6 = b6.t(-1, -2, 16, 20, 0, 36, 0);
            t6.weight = 1.0f;
            addView(utVar, t6);
            addView(textView, b6.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, b6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(utVar, b6.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(l lVar) {
        this.f7510c = lVar;
    }

    public void setCount(int i10) {
        this.f7509b.setText(String.valueOf(i10));
    }
}
