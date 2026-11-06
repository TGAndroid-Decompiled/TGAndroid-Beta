package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vr;
public final class b implements Runnable {
    public final int f3493a;
    public final org.telegram.ui.ActionBar.f6 f3494b;
    public final Context f3495c;

    public b(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f3493a = i7;
        this.f3495c = context;
        this.f3494b = f6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f3493a;
        org.telegram.ui.ActionBar.f6 f6Var = this.f3494b;
        Context context = this.f3495c;
        switch (i7) {
            case 0:
                new uc(context, f6Var).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.M0(2131754175, null), f6Var, new qr(u1VarArr, 0)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(V2);
                while (matcher.find()) {
                    V2.setSpan(new org.telegram.messenger.v(u1VarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
                String M0 = org.telegram.messenger.hd.M0(2131754174, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                u1Var.T = V2;
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754176, null), null);
                u1VarArr[0] = alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.Wallet.y5.I0(context, f6Var);
                return;
        }
    }

    public b(vr vrVar, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.f3493a = 1;
        this.f3494b = f6Var;
        this.f3495c = context;
    }
}
