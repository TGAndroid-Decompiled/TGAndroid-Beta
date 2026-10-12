package bi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.am;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import w7.w5;
public final class r extends LinearLayout {
    public final TextView f3912a;
    public final q f3913b;
    public final o f3914c;
    public final ci.d d;

    public r(Context context, c6 c6Var) {
        super(context);
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f3912a = textView;
        int i10 = h6.f20946y6;
        am.o(i10, c6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, w5.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        q qVar = new q(0, context, c6Var, true);
        this.f3913b = qVar;
        qVar.setMinWidth(AndroidUtilities.dp(200.0f));
        qVar.g(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
        addView(qVar, w5.q(-2, 44, 17));
        o oVar = new o(context, c6Var);
        this.f3914c = oVar;
        oVar.setTextColor(h6.w0(i10, c6Var));
        oVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        oVar.setTextSize(1, 14.0f);
        oVar.setTextAlignment(4);
        oVar.setGravity(17);
        oVar.setTypeface(AndroidUtilities.bold());
        addView(oVar, w5.t(165, -2, 17, 0, 17, 0, 12));
        ci.d dVar = new ci.d(context, c6Var, false);
        this.d = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(200.0f));
        addView(dVar, w5.q(-2, 44, 17));
    }
}
