package kh;

import ag.e1;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public final class o extends LinearLayout {

    public final TextView f15205a;

    public final hh.p f15206b;

    public final e1 f15207c;
    public final lh.d d;

    public o(Context context, c6 c6Var) {
        super(context);
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f15205a = textView;
        int i10 = g6.f23423y6;
        rl.l(i10, c6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, z5.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        hh.p pVar = new hh.p(1, context, c6Var, true);
        this.f15206b = pVar;
        pVar.setMinWidth(AndroidUtilities.dp(200.0f));
        pVar.g(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
        addView(pVar, z5.q(-2, 44, 17));
        e1 e1Var = new e1(context, c6Var);
        this.f15207c = e1Var;
        e1Var.setTextColor(g6.v0(i10, c6Var));
        e1Var.setText(LocaleController.getString(R.string.ProfileBotOr));
        e1Var.setTextSize(1, 14.0f);
        e1Var.setTextAlignment(4);
        e1Var.setGravity(17);
        e1Var.setTypeface(AndroidUtilities.bold());
        addView(e1Var, z5.t(165, -2, 17, 0, 17, 0, 12));
        lh.d dVar = new lh.d(context, c6Var, false);
        this.d = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(200.0f));
        addView(dVar, z5.q(-2, 44, 17));
    }
}
