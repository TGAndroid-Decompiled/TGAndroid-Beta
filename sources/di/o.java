package di;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import w7.z5;
public final class o extends LinearLayout {
    public final TextView f8052a;
    public final ai.v f8053b;
    public final n f8054c;
    public final ei.d d;

    public o(Context context, g6 g6Var) {
        super(context);
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f8052a = textView;
        int i10 = k6.f21571y6;
        r6.W(textView, i10, g6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, z5.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        ai.v vVar = new ai.v(1, context, g6Var, true);
        this.f8053b = vVar;
        vVar.setMinWidth(AndroidUtilities.dp(200.0f));
        vVar.i(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
        addView(vVar, z5.q(-2, 44, 17));
        n nVar = new n(context, g6Var);
        this.f8054c = nVar;
        r6.W(nVar, i10, g6Var);
        nVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        nVar.setTextSize(1, 14.0f);
        nVar.setTextAlignment(4);
        nVar.setGravity(17);
        nVar.setTypeface(AndroidUtilities.bold());
        addView(nVar, z5.t(165, -2, 17, 0, 17, 0, 12));
        ei.d dVar = new ei.d(context, g6Var, false);
        this.d = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(200.0f));
        addView(dVar, z5.q(-2, 44, 17));
    }
}
