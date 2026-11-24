package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;
public abstract class u15 {
    public static final boolean[] a = new boolean[4];
    public static final t15[] b = new t15[4];
    public static final HashSet[] c = new HashSet[4];

    public static void a(int i, long j, long j2, int i2, rp2 rp2Var) {
        c C = c.C(i);
        if (C.z() >= j) {
            rp2Var.a(Boolean.TRUE);
        } else if (System.currentTimeMillis() > j2) {
            rp2Var.a(Boolean.FALSE);
        } else {
            if (i2 % 5 == 0) {
                C.J();
            }
            gm.d3(new s15(i, j, j2, i2, rp2Var), 2000L);
        }
    }

    public static void b(d dVar, long j, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, qt0 qt0Var, wz wzVar) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        int currentAccount = dVar.getCurrentAccount();
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(currentAccount);
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        if (tL_inputCheckPasswordSRP != null) {
            tL_inputCheckPasswordEmpty = tL_inputCheckPasswordSRP;
        } else {
            tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        gettmppassword.password = tL_inputCheckPasswordEmpty;
        gettmppassword.period = 60;
        connectionsManager.sendRequest(gettmppassword, new l15(connectionsManager, twoStepVerificationActivity, dVar, j, qt0Var, wzVar, currentAccount, tL_inputCheckPasswordSRP));
    }

    public static boolean c(int i) {
        return oc7.r1(i).l4.n0.f;
    }

    public static void d(t15 t15Var) {
        int i = t15Var.a;
        t15[] t15VarArr = b;
        if (t15VarArr[i] == t15Var && !t15Var.h) {
            if (System.currentTimeMillis() - t15Var.e > 600000) {
                t15VarArr[i] = null;
                nm7.f(i).k(nm7.B3, new Object[0]);
                return;
            }
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
            tL_payments_getStarsTransactions.offset = "";
            tL_payments_getStarsTransactions.limit = 10;
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsTransactions, new r15(t15Var, (byte) 0));
        }
    }

    public static HashSet e(int i) {
        HashSet[] hashSetArr = c;
        if (hashSetArr[i] == null) {
            hashSetArr[i] = new HashSet(oc7.r1(i).X3.getStringSet("gram_earnings_wallet_withdraws", Collections.EMPTY_SET));
        }
        return hashSetArr[i];
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        while (true) {
            int indexOf = spannableStringBuilder.toString().indexOf(str);
            if (indexOf >= 0) {
                pn2 pn2Var = new pn2(i, 0);
                pn2Var.c(gm.L(16.0f));
                if (i2 >= 0) {
                    pn2Var.a(i2);
                }
                spannableStringBuilder.replace(indexOf, str.length() + indexOf, "x");
                spannableStringBuilder.setSpan(pn2Var, indexOf, indexOf + 1, 33);
            } else {
                return;
            }
        }
    }

    public static void g(d dVar, long j, qt0 qt0Var) {
        if (dVar.getContext() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dVar.getResourceProvider(), dVar.getContext());
        String a0 = jb6.a0(null, null, 2131749271, c.w(j, false));
        he heVar = alertDialog$Builder.a;
        heVar.S = a0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131749272, null));
        f(spannableStringBuilder, "⚙", 2131232366, -1);
        f(spannableStringBuilder, "💎", 2131231960, cmb.u6);
        heVar.U = spannableStringBuilder;
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131749279, null), new pt0(dVar, j, qt0Var, (byte) 3));
        alertDialog$Builder.o();
    }

    public static boolean h(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity) {
        String str;
        if (tL_error == null || (str = tL_error.text) == null || (!str.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_"))) {
            return false;
        }
        if (twoStepVerificationActivity.getParentActivity() == null) {
            return true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) jb6.M0(2131742527, null));
        spannableStringBuilder.append((CharSequence) "\n\n• ").append((CharSequence) gm.S2(jb6.M0(2131751237, null)));
        spannableStringBuilder.append((CharSequence) "\n• ").append((CharSequence) gm.S2(jb6.M0(2131751236, null)));
        spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) jb6.M0(2131751235, null));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, twoStepVerificationActivity.getResourceProvider(), twoStepVerificationActivity.getParentActivity());
        String M0 = jb6.M0(2131751234, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = spannableStringBuilder;
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        twoStepVerificationActivity.showDialog(heVar);
        return true;
    }
}
