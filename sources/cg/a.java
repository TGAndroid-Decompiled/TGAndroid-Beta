package cg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.g6;
public final class a extends LinearLayout {
    public a(Context context) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        TextView h = x3.h(context, 1, 14.0f);
        int i10 = g6.G6;
        h.setTextColor(g6.w0(null, i10, false));
        h.setTypeface(AndroidUtilities.bold());
        h.setText(LocaleController.getString(R.string.AboutPremiumTitle));
        addView(h);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(g6.w0(null, i10, false));
        x3.r(R.string.AboutPremiumDescription, textView);
        addView(textView, f6.p(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(g6.w0(null, i10, false));
        x3.r(R.string.AboutPremiumDescription2, textView2);
        addView(textView2, f6.p(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }
}
