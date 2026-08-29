package jh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.ls;
public final class a implements Runnable {
    public final int f11699a = 0;
    public final org.telegram.ui.ActionBar.c6 f11700b;
    public final Context f11701c;

    public a(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f11701c = context;
        this.f11700b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f11699a) {
            case 0:
                new z9(this.f11701c, this.f11700b).show();
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                gs gsVar = new gs(c2VarArr, 0);
                org.telegram.ui.ActionBar.c6 c6Var = this.f11700b;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, c6Var, gsVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f11701c;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.r0(c2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.N = string2;
                        c2Var.P = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        c2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
        }
    }

    public a(ls lsVar, org.telegram.ui.ActionBar.c6 c6Var, Context context) {
        this.f11700b = c6Var;
        this.f11701c = context;
    }
}
