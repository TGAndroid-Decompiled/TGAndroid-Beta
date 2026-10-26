package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.xs;
public final class b implements Runnable {
    public final int f4300a;
    public final org.telegram.ui.ActionBar.u6 f4301b;
    public final Context f4302c;

    public b(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f4300a = i10;
        this.f4302c = context;
        this.f4301b = u6Var;
    }

    @Override
    public final void run() {
        switch (this.f4300a) {
            case 0:
                new uc(this.f4302c, this.f4301b).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                xs xsVar = new xs(e2VarArr, 0);
                org.telegram.ui.ActionBar.u6 u6Var = this.f4301b;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, u6Var, xsVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f4302c;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.n0(e2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                        e2Var.R = string2;
                        e2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        e2VarArr[0] = alertDialog$Builder.p();
                        return;
                    }
                }
            default:
                org.telegram.ui.Wallet.m5.E0(this.f4302c, this.f4301b);
                return;
        }
    }

    public b(ct ctVar, org.telegram.ui.ActionBar.u6 u6Var, Context context) {
        this.f4300a = 1;
        this.f4301b = u6Var;
        this.f4302c = context;
    }
}
