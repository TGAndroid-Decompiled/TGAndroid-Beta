package ai;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ts;
import org.telegram.ui.Components.ys;
public final class b implements Runnable {
    public final int f991a;
    public final org.telegram.ui.ActionBar.g6 f992b;
    public final Context f993c;

    public b(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f991a = i10;
        this.f993c = context;
        this.f992b = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f991a) {
            case 0:
                new ed(this.f993c, this.f992b).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                ts tsVar = new ts(c2VarArr, 0);
                org.telegram.ui.ActionBar.g6 g6Var = this.f992b;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, g6Var, tsVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f993c;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.p0(c2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                        c2Var.R = string2;
                        c2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        c2VarArr[0] = alertDialog$Builder.p();
                        return;
                    }
                }
            default:
                org.telegram.ui.Wallet.o5.D0(this.f993c, this.f992b);
                return;
        }
    }

    public b(ys ysVar, org.telegram.ui.ActionBar.g6 g6Var, Context context) {
        this.f991a = 1;
        this.f992b = g6Var;
        this.f993c = context;
    }
}
