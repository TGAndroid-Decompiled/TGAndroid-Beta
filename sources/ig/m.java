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
import org.telegram.ui.Components.vt;
public final class m extends LinearLayout {
    public final vt f7526a;
    public final TextView f7527b;
    public l f7528c;

    public m(Context context, f6 f6Var) {
        super(context);
        setOrientation(0);
        vt vtVar = new vt(context, f6Var);
        this.f7526a = vtVar;
        vtVar.setLines(1);
        vtVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new k(this)};
        vtVar.setInputType(16384);
        vtVar.setFilters(inputFilterArr);
        vtVar.setTextSize(1, 16.0f);
        vtVar.setTextColor(j6.v0(j6.Ud, f6Var));
        vtVar.setLinkTextColor(j6.v0(j6.f19983hc, f6Var));
        vtVar.setHighlightColor(j6.v0(j6.f20216uf, f6Var));
        int i10 = j6.Vd;
        vtVar.setHintColor(j6.v0(i10, f6Var));
        vtVar.setHintTextColor(j6.v0(i10, f6Var));
        vtVar.setCursorColor(j6.v0(j6.Wd, f6Var));
        vtVar.setHandlesColor(j6.v0(j6.f20234vf, f6Var));
        vtVar.setBackground(null);
        vtVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        vtVar.addTextChangedListener(new dh.c(this, 2));
        vtVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f7527b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(j6.v0(j6.f20012j5, f6Var));
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t6 = b6.t(-1, -2, 16, 20, 0, 36, 0);
            t6.weight = 1.0f;
            addView(vtVar, t6);
            addView(textView, b6.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, b6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(vtVar, b6.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(l lVar) {
        this.f7528c = lVar;
    }

    public void setCount(int i10) {
        this.f7527b.setText(String.valueOf(i10));
    }
}
