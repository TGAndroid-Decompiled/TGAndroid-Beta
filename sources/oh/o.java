package oh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import eg.s0;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class o extends LinearLayout {
    public final TextView f16593a;
    public final lh.o f16594b;
    public final s0 f16595c;
    public final ph.d d;

    public o(Context context, f6 f6Var) {
        super(context);
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f16593a = textView;
        int i10 = j6.f20281y6;
        org.telegram.ui.b.l(i10, f6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, b6.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        lh.o oVar = new lh.o(1, context, f6Var, true);
        this.f16594b = oVar;
        oVar.setMinWidth(AndroidUtilities.dp(200.0f));
        oVar.g(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
        addView(oVar, b6.q(-2, 44, 17));
        s0 s0Var = new s0(context, f6Var);
        this.f16595c = s0Var;
        s0Var.setTextColor(j6.v0(i10, f6Var));
        s0Var.setText(LocaleController.getString(R.string.ProfileBotOr));
        s0Var.setTextSize(1, 14.0f);
        s0Var.setTextAlignment(4);
        s0Var.setGravity(17);
        s0Var.setTypeface(AndroidUtilities.bold());
        addView(s0Var, b6.t(165, -2, 17, 0, 17, 0, 12));
        ph.d dVar = new ph.d(context, f6Var, false);
        this.d = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(200.0f));
        addView(dVar, b6.q(-2, 44, 17));
    }
}
