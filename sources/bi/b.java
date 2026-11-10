package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.ur;
public final class b implements Runnable {
    public final int f3496a;
    public final org.telegram.ui.ActionBar.h6 f3497b;
    public final Context f3498c;

    public b(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f3496a = i7;
        this.f3498c = context;
        this.f3497b = h6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f3496a;
        org.telegram.ui.ActionBar.h6 h6Var = this.f3497b;
        Context context = this.f3498c;
        switch (i7) {
            case 0:
                new uc(context, h6Var).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(org.telegram.messenger.g0.L2(org.telegram.messenger.id.M0(2131754175, null), h6Var, new pr(u1VarArr, 0)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(V2);
                while (matcher.find()) {
                    V2.setSpan(new org.telegram.messenger.v(u1VarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                String M0 = org.telegram.messenger.id.M0(2131754174, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = V2;
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754176, null), null);
                u1VarArr[0] = alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.Wallet.z5.I0(context, h6Var);
                return;
        }
    }

    public b(ur urVar, org.telegram.ui.ActionBar.h6 h6Var, Context context) {
        this.f3496a = 1;
        this.f3497b = h6Var;
        this.f3498c = context;
    }
}
