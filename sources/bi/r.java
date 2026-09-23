package bi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ul;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import w7.x5;
public final class r extends LinearLayout {
    public final TextView f3574a;
    public final q f3575b;
    public final o f3576c;
    public final ci.d d;

    public r(Context context, d6 d6Var) {
        super(context);
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f3574a = textView;
        int i10 = h6.f19170y6;
        ul.o(i10, d6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, x5.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        q qVar = new q(0, context, d6Var, true);
        this.f3575b = qVar;
        qVar.setMinWidth(AndroidUtilities.dp(200.0f));
        qVar.g(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
        addView(qVar, x5.q(-2, 44, 17));
        o oVar = new o(context, d6Var);
        this.f3576c = oVar;
        oVar.setTextColor(h6.v0(i10, d6Var));
        oVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        oVar.setTextSize(1, 14.0f);
        oVar.setTextAlignment(4);
        oVar.setGravity(17);
        oVar.setTypeface(AndroidUtilities.bold());
        addView(oVar, x5.t(165, -2, 17, 0, 17, 0, 12));
        ci.d dVar = new ci.d(context, d6Var, false);
        this.d = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(200.0f));
        addView(dVar, x5.q(-2, 44, 17));
    }
}
