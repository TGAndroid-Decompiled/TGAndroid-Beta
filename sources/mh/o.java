package mh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import cg.s0;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class o extends LinearLayout {
    public final TextView f17032a;
    public final jh.n f17033b;
    public final s0 f17034c;
    public final nh.d d;

    public o(Context context, c6 c6Var) {
        super(context);
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f17032a = textView;
        int i10 = g6.f23433y6;
        org.telegram.ui.b.m(i10, c6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, f6.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        jh.n nVar = new jh.n(1, context, c6Var, true);
        this.f17033b = nVar;
        nVar.setMinWidth(AndroidUtilities.dp(200.0f));
        nVar.g(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
        addView(nVar, f6.q(-2, 44, 17));
        s0 s0Var = new s0(context, c6Var);
        this.f17034c = s0Var;
        s0Var.setTextColor(g6.v0(i10, c6Var));
        s0Var.setText(LocaleController.getString(R.string.ProfileBotOr));
        s0Var.setTextSize(1, 14.0f);
        s0Var.setTextAlignment(4);
        s0Var.setGravity(17);
        s0Var.setTypeface(AndroidUtilities.bold());
        addView(s0Var, f6.t(165, -2, 17, 0, 17, 0, 12));
        nh.d dVar = new nh.d(context, c6Var, false);
        this.d = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(200.0f));
        addView(dVar, f6.q(-2, 44, 17));
    }
}
