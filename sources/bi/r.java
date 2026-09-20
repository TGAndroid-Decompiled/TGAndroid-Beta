package bi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rk;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import w7.y5;
public final class r extends LinearLayout {
    public final TextView f3582a;
    public final q f3583b;
    public final o f3584c;
    public final ci.d d;

    public r(Context context, f6 f6Var) {
        super(context);
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f3582a = textView;
        int i10 = j6.f19477y6;
        rk.n(i10, f6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, y5.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        q qVar = new q(0, context, f6Var, true);
        this.f3583b = qVar;
        qVar.setMinWidth(AndroidUtilities.dp(200.0f));
        qVar.g(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
        addView(qVar, y5.q(-2, 44, 17));
        o oVar = new o(context, f6Var);
        this.f3584c = oVar;
        oVar.setTextColor(j6.v0(i10, f6Var));
        oVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        oVar.setTextSize(1, 14.0f);
        oVar.setTextAlignment(4);
        oVar.setGravity(17);
        oVar.setTypeface(AndroidUtilities.bold());
        addView(oVar, y5.t(165, -2, 17, 0, 17, 0, 12));
        ci.d dVar = new ci.d(context, f6Var, false);
        this.d = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(200.0f));
        addView(dVar, y5.q(-2, 44, 17));
    }
}
