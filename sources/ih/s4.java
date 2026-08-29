package ih;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import i7.h6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.iq;
public final class s4 extends TextView {
    public final iq f9374a;

    public s4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int v02 = g6.v0(g6.y8, c6Var);
        setTextColor(v02);
        setBackground(g6.Z(g6.l1(0.08f, v02), g6.l1(0.15f, v02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        h6.a(this);
        iq iqVar = new iq(R.drawable.arrows_select, 0);
        this.f9374a = iqVar;
        iqVar.spaceScaleX = 0.8f;
        iqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }

    public void setSorting(a5 a5Var) {
        iq iqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (a5Var == a5.BY_DATE) {
            iqVar = new iq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (a5Var == a5.BY_PRICE) {
            iqVar = new iq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (a5Var == a5.BY_NUMBER) {
            iqVar = new iq(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            iqVar = null;
        }
        if (iqVar != null) {
            iqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f9374a, append.length() - 1, length, 33);
        setText(append);
    }
}
