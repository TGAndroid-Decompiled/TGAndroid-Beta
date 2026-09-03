package lh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.os;
public final class a implements Runnable {
    public final int f12066a = 0;
    public final org.telegram.ui.ActionBar.f6 f12067b;
    public final Context f12068c;

    public a(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f12068c = context;
        this.f12067b = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f12066a) {
            case 0:
                new aa(this.f12068c, this.f12067b).show();
                return;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                js jsVar = new js(d2VarArr, 0);
                org.telegram.ui.ActionBar.f6 f6Var = this.f12067b;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, f6Var, jsVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f12068c;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.r0(d2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                        d2Var.O = string2;
                        d2Var.Q = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        d2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
        }
    }

    public a(os osVar, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.f12067b = f6Var;
        this.f12068c = context;
    }
}
