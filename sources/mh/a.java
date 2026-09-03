package mh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.rs;
public final class a implements Runnable {
    public final int f13664a = 0;
    public final org.telegram.ui.ActionBar.g6 f13665b;
    public final Context f13666c;

    public a(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f13666c = context;
        this.f13665b = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f13664a) {
            case 0:
                new aa(this.f13666c, this.f13665b).show();
                return;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                ms msVar = new ms(d2VarArr, 0);
                org.telegram.ui.ActionBar.g6 g6Var = this.f13665b;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, g6Var, msVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f13666c;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.p0(d2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                        d2Var.O = string2;
                        d2Var.Q = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        d2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
        }
    }

    public a(rs rsVar, org.telegram.ui.ActionBar.g6 g6Var, Context context) {
        this.f13665b = g6Var;
        this.f13666c = context;
    }
}
