package hh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.fs;

public final class a implements Runnable {

    public final int f8931a = 0;

    public final org.telegram.ui.ActionBar.c6 f8932b;

    public final Context f8933c;

    public a(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f8933c = context;
        this.f8932b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f8931a) {
            case 0:
                new fa(this.f8933c, this.f8932b).show();
                break;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                as asVar = new as(b2VarArr, 0);
                org.telegram.ui.ActionBar.c6 c6Var = this.f8932b;
                SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, c6Var, asVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(spannableStringBuilderReplaceTags);
                while (true) {
                    boolean zFind = matcher.find();
                    Context context = this.f8933c;
                    if (!zFind) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.N = string2;
                        b2Var.P = spannableStringBuilderReplaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        b2VarArr[0] = alertDialog$Builder.o();
                    } else {
                        spannableStringBuilderReplaceTags.setSpan(new org.telegram.ui.r0(b2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    }
                    break;
                }
                break;
        }
    }

    public a(fs fsVar, org.telegram.ui.ActionBar.c6 c6Var, Context context) {
        this.f8932b = c6Var;
        this.f8933c = context;
    }
}
