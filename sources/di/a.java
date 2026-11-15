package di;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.wr;
public final class a implements Runnable {
    public final int f8176a;
    public final org.telegram.ui.ActionBar.e6 f8177b;
    public final Context f8178c;

    public a(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f8176a = i7;
        this.f8178c = context;
        this.f8177b = e6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f8176a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f8177b;
        Context context = this.f8178c;
        switch (i7) {
            case 0:
                new db(context, e6Var).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(org.telegram.messenger.g0.L2(hd.M0(2131754175, null), e6Var, new wr(t1VarArr, 0)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(V2);
                while (matcher.find()) {
                    V2.setSpan(new org.telegram.messenger.v(t1VarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                String M0 = hd.M0(2131754174, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = V2;
                alertDialog$Builder.k(hd.M0(2131754176, null), null);
                t1VarArr[0] = alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.Wallet.y5.I0(context, e6Var);
                return;
        }
    }

    public a(bs bsVar, org.telegram.ui.ActionBar.e6 e6Var, Context context) {
        this.f8176a = 1;
        this.f8177b = e6Var;
        this.f8178c = context;
    }
}
