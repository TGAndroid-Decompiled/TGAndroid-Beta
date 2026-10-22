package ai;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.vs;
public final class b implements Runnable {
    public final int f996a;
    public final org.telegram.ui.ActionBar.d6 f997b;
    public final Context f998c;

    public b(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f996a = i10;
        this.f998c = context;
        this.f997b = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f996a) {
            case 0:
                new dd(this.f998c, this.f997b).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                vs vsVar = new vs(b2VarArr, 0);
                org.telegram.ui.ActionBar.d6 d6Var = this.f997b;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, d6Var, vsVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f998c;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.q0(b2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                        b2Var.R = string2;
                        b2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        b2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
            default:
                org.telegram.ui.Wallet.o5.D0(this.f998c, this.f997b);
                return;
        }
    }

    public b(at atVar, org.telegram.ui.ActionBar.d6 d6Var, Context context) {
        this.f996a = 1;
        this.f997b = d6Var;
        this.f998c = context;
    }
}
