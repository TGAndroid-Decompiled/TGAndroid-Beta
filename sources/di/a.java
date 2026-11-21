package di;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.ks;
public final class a implements Runnable {
    public final int f8487a;
    public final org.telegram.ui.ActionBar.h6 f8488b;
    public final Context f8489c;

    public a(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f8487a = i7;
        this.f8489c = context;
        this.f8488b = h6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f8487a;
        org.telegram.ui.ActionBar.h6 h6Var = this.f8488b;
        Context context = this.f8489c;
        switch (i7) {
            case 0:
                new gb(context, h6Var).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                SpannableStringBuilder U2 = org.telegram.messenger.g0.U2(org.telegram.messenger.g0.L2(gd.N0(2131754172, null), h6Var, new fs(t1VarArr, 0)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(U2);
                while (matcher.find()) {
                    U2.setSpan(new org.telegram.messenger.v(t1VarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                String N0 = gd.N0(2131754171, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                t1Var.S = N0;
                t1Var.U = U2;
                alertDialog$Builder.k(gd.N0(2131754173, null), null);
                t1VarArr[0] = alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.Wallet.n6.M0(context, h6Var);
                return;
        }
    }

    public a(ks ksVar, org.telegram.ui.ActionBar.h6 h6Var, Context context) {
        this.f8487a = 1;
        this.f8488b = h6Var;
        this.f8489c = context;
    }
}
