package ci;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import w7.a6;
public final class q extends LinearLayout {
    public final TextView f4771a;
    public final p f4772b;
    public final n f4773c;
    public final di.d d;

    public q(Context context, c6 c6Var) {
        super(context);
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f4771a = textView;
        int i10 = g6.f20288y6;
        yh.n(i10, c6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, a6.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        p pVar = new p(0, context, c6Var, true);
        this.f4772b = pVar;
        pVar.setMinWidth(AndroidUtilities.dp(200.0f));
        pVar.g(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
        addView(pVar, a6.q(-2, 44, 17));
        n nVar = new n(context, c6Var);
        this.f4773c = nVar;
        nVar.setTextColor(g6.w0(i10, c6Var));
        nVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        nVar.setTextSize(1, 14.0f);
        nVar.setTextAlignment(4);
        nVar.setGravity(17);
        nVar.setTypeface(AndroidUtilities.bold());
        addView(nVar, a6.t(165, -2, 17, 0, 17, 0, 12));
        di.d dVar = new di.d(context, c6Var, false);
        this.d = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(200.0f));
        addView(dVar, a6.q(-2, 44, 17));
    }
}
