package kh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mq;
public final class s4 extends TextView {
    public final mq f10816a;

    public s4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int v02 = j6.v0(j6.f20283y8, f6Var);
        setTextColor(v02);
        setBackground(j6.Z(j6.l1(0.08f, v02), j6.l1(0.15f, v02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        k7.d6.a(this);
        mq mqVar = new mq(R.drawable.arrows_select, 0);
        this.f10816a = mqVar;
        mqVar.spaceScaleX = 0.8f;
        mqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }

    public void setSorting(a5 a5Var) {
        mq mqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (a5Var == a5.BY_DATE) {
            mqVar = new mq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(mqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (a5Var == a5.BY_PRICE) {
            mqVar = new mq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(mqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (a5Var == a5.BY_NUMBER) {
            mqVar = new mq(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(mqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            mqVar = null;
        }
        if (mqVar != null) {
            mqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f10816a, append.length() - 1, length, 33);
        setText(append);
    }
}
