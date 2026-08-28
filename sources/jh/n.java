package jh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class n extends LinearLayout {
    public final TextView f14354a;
    public final gh.p f14355b;
    public final bh.e f14356c;
    public final kh.d d;

    public n(Context context, b6 b6Var) {
        super(context);
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f14354a = textView;
        int i9 = f6.f23369y6;
        ll.n(i9, b6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, e6.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        gh.p pVar = new gh.p(1, context, b6Var, true);
        this.f14355b = pVar;
        pVar.setMinWidth(AndroidUtilities.dp(200.0f));
        pVar.g(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
        addView(pVar, e6.q(-2, 44, 17));
        bh.e eVar = new bh.e(context, b6Var);
        this.f14356c = eVar;
        eVar.setTextColor(f6.v0(i9, b6Var));
        eVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        eVar.setTextSize(1, 14.0f);
        eVar.setTextAlignment(4);
        eVar.setGravity(17);
        eVar.setTypeface(AndroidUtilities.bold());
        addView(eVar, e6.t(165, -2, 17, 0, 17, 0, 12));
        kh.d dVar = new kh.d(context, b6Var, false);
        this.d = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(200.0f));
        addView(dVar, e6.q(-2, 44, 17));
    }
}
