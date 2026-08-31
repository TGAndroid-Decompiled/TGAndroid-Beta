package fg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.k6;
public final class a extends LinearLayout {
    public a(Context context) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        TextView g10 = y3.g(context, 1, 14.0f);
        int i10 = k6.G6;
        g10.setTextColor(k6.w0(null, i10, false));
        g10.setTypeface(AndroidUtilities.bold());
        g10.setText(LocaleController.getString(R.string.AboutPremiumTitle));
        addView(g10);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(k6.w0(null, i10, false));
        y3.q(R.string.AboutPremiumDescription, textView);
        addView(textView, c6.p(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(k6.w0(null, i10, false));
        y3.q(R.string.AboutPremiumDescription2, textView2);
        addView(textView2, c6.p(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }
}
