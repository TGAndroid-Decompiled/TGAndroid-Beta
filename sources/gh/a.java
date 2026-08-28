package gh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.hs;
public final class a implements Runnable {
    public final int f7759a = 0;
    public final org.telegram.ui.ActionBar.b6 f7760b;
    public final Context f7761c;

    public a(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f7761c = context;
        this.f7760b = b6Var;
    }

    @Override
    public final void run() {
        switch (this.f7759a) {
            case 0:
                new fa(this.f7761c, this.f7760b).show();
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                cs csVar = new cs(c2VarArr, 0);
                org.telegram.ui.ActionBar.b6 b6Var = this.f7760b;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, b6Var, csVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f7761c;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.q0(c2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.N = string2;
                        c2Var.P = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        c2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
        }
    }

    public a(hs hsVar, org.telegram.ui.ActionBar.b6 b6Var, Context context) {
        this.f7760b = b6Var;
        this.f7761c = context;
    }
}
