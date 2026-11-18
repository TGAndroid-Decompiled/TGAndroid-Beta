package di;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.is;
public final class a implements Runnable {
    public final int f8458a;
    public final org.telegram.ui.ActionBar.i6 f8459b;
    public final Context f8460c;

    public a(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f8458a = i7;
        this.f8460c = context;
        this.f8459b = i6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f8458a;
        org.telegram.ui.ActionBar.i6 i6Var = this.f8459b;
        Context context = this.f8460c;
        switch (i7) {
            case 0:
                new gb(context, i6Var).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                SpannableStringBuilder U2 = org.telegram.messenger.g0.U2(org.telegram.messenger.g0.L2(gd.M0(2131754173, null), i6Var, new ds(u1VarArr, 0)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(U2);
                while (matcher.find()) {
                    U2.setSpan(new org.telegram.messenger.v(u1VarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                String M0 = gd.M0(2131754172, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                u1Var.U = U2;
                alertDialog$Builder.k(gd.M0(2131754174, null), null);
                u1VarArr[0] = alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.Wallet.n6.M0(context, i6Var);
                return;
        }
    }

    public a(is isVar, org.telegram.ui.ActionBar.i6 i6Var, Context context) {
        this.f8458a = 1;
        this.f8459b = i6Var;
        this.f8460c = context;
    }
}
