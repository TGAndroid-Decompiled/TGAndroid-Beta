package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vr;
public final class b implements Runnable {
    public final int f4848a;
    public final org.telegram.ui.ActionBar.e6 f4849b;
    public final Context f4850c;

    public b(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f4848a = i3;
        this.f4850c = context;
        this.f4849b = e6Var;
    }

    @Override
    public final void run() {
        int i3 = this.f4848a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f4849b;
        Context context = this.f4850c;
        switch (i3) {
            case 0:
                new nb(context, e6Var).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
                SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(org.telegram.messenger.g0.L2(bd.M0(2131754175, null), e6Var, new qr(s1VarArr, 0)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(V2);
                while (matcher.find()) {
                    V2.setSpan(new org.telegram.messenger.v(s1VarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                String M0 = bd.M0(2131754174, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = V2;
                alertDialog$Builder.k(bd.M0(2131754176, null), null);
                s1VarArr[0] = alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.Wallet.w5.I0(context, e6Var);
                return;
        }
    }

    public b(vr vrVar, org.telegram.ui.ActionBar.e6 e6Var, Context context) {
        this.f4848a = 1;
        this.f4849b = e6Var;
        this.f4850c = context;
    }
}
