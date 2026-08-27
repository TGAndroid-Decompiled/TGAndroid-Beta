package gh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cq;

public final class z4 extends TextView {

    public final cq f7701a;

    public z4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23425y8, c6Var);
        setTextColor(iV0);
        setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.l1(0.08f, iV0), org.telegram.ui.ActionBar.g6.l1(0.15f, iV0), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        h7.b6.a(this);
        cq cqVar = new cq(R.drawable.arrows_select, 0);
        this.f7701a = cqVar;
        cqVar.spaceScaleX = 0.8f;
        cqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }

    public void setSorting(h5 h5Var) {
        cq cqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (h5Var == h5.BY_DATE) {
            cqVar = new cq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (h5Var == h5.BY_PRICE) {
            cqVar = new cq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (h5Var == h5.BY_NUMBER) {
            cqVar = new cq(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            cqVar = null;
        }
        if (cqVar != null) {
            cqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        spannableStringBuilderAppend.setSpan(this.f7701a, spannableStringBuilderAppend.length() - 1, spannableStringBuilderAppend.length(), 33);
        setText(spannableStringBuilderAppend);
    }
}
