package lh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.oq;
public final class s4 extends TextView {
    public final oq f12965a;

    public s4(Context context, g6 g6Var) {
        super(context);
        int v02 = k6.v0(k6.f22040y8, g6Var);
        setTextColor(v02);
        setBackground(k6.Z(k6.l1(0.08f, v02), k6.l1(0.15f, v02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        k7.e6.a(this);
        oq oqVar = new oq(R.drawable.arrows_select, 0);
        this.f12965a = oqVar;
        oqVar.spaceScaleX = 0.8f;
        oqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }

    public void setSorting(a5 a5Var) {
        oq oqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (a5Var == a5.BY_DATE) {
            oqVar = new oq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (a5Var == a5.BY_PRICE) {
            oqVar = new oq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (a5Var == a5.BY_NUMBER) {
            oqVar = new oq(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            oqVar = null;
        }
        if (oqVar != null) {
            oqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f12965a, append.length() - 1, length, 33);
        setText(append);
    }
}
