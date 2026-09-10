package ai;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import w7.a6;
public final class x extends LinearLayout {
    public final TextView f472a;
    public final w f473b;
    public final t f474c;
    public final bi.d d;

    public x(Context context, f6 f6Var) {
        super(context);
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f472a = textView;
        int i10 = j6.f18306y6;
        em.n(i10, f6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, a6.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        w wVar = new w(0, context, f6Var, true);
        this.f473b = wVar;
        wVar.setMinWidth(AndroidUtilities.dp(200.0f));
        wVar.g(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
        addView(wVar, a6.q(-2, 44, 17));
        t tVar = new t(context, f6Var);
        this.f474c = tVar;
        tVar.setTextColor(j6.v0(i10, f6Var));
        tVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        tVar.setTextSize(1, 14.0f);
        tVar.setTextAlignment(4);
        tVar.setGravity(17);
        tVar.setTypeface(AndroidUtilities.bold());
        addView(tVar, a6.t(165, -2, 17, 0, 17, 0, 12));
        bi.d dVar = new bi.d(context, f6Var, false);
        this.d = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(200.0f));
        addView(dVar, a6.q(-2, 44, 17));
    }
}
