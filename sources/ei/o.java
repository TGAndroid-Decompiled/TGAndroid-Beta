package ei;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
public final class o extends LinearLayout {
    public final TextView f9991a;
    public final bi.v f9992b;
    public final n f9993c;
    public final fi.d d;

    public o(Context context, u6 u6Var) {
        super(context);
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f9991a = textView;
        int i10 = y6.f23749y6;
        f7.V(textView, i10, u6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, kb1.o(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        bi.v vVar = new bi.v(1, context, u6Var, true);
        this.f9992b = vVar;
        vVar.setMinWidth(AndroidUtilities.dp(200.0f));
        vVar.i(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
        addView(vVar, kb1.u(-2, 44, 17));
        n nVar = new n(context, u6Var);
        this.f9993c = nVar;
        f7.V(nVar, i10, u6Var);
        nVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        nVar.setTextSize(1, 14.0f);
        nVar.setTextAlignment(4);
        nVar.setGravity(17);
        nVar.setTypeface(AndroidUtilities.bold());
        addView(nVar, kb1.x(165, -2, 17, 0, 17, 0, 12));
        fi.d dVar = new fi.d(context, u6Var, false);
        this.d = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(200.0f));
        addView(dVar, kb1.u(-2, 44, 17));
    }
}
