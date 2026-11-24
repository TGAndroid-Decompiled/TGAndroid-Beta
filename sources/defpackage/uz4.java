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
public abstract class uz4 {
    public static final boolean[] a = new boolean[4];
    public static final tz4[] b = new tz4[4];
    public static final HashSet[] c = new HashSet[4];

    public static void a(int i, long j, long j2, int i2, go2 go2Var) {
        c C = c.C(i);
        if (C.z() >= j) {
            go2Var.a(Boolean.TRUE);
        } else if (System.currentTimeMillis() > j2) {
            go2Var.a(Boolean.FALSE);
        } else {
            if (i2 % 5 == 0) {
                C.J();
            }
            gl.e3(new sz4(i, j, j2, i2, go2Var), 2000L);
        }
    }

    public static void b(d dVar, long j, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, is0 is0Var, wy wyVar) {
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
        connectionsManager.sendRequest(gettmppassword, new mz4(connectionsManager, twoStepVerificationActivity, dVar, j, is0Var, wyVar, currentAccount, tL_inputCheckPasswordSRP));
    }

    public static boolean c(int i) {
        return na7.q1(i).k4.n0.f;
    }

    public static void d(tz4 tz4Var) {
        int i = tz4Var.a;
        tz4[] tz4VarArr = b;
        if (tz4VarArr[i] == tz4Var && !tz4Var.h) {
            if (System.currentTimeMillis() - tz4Var.e > 600000) {
                tz4VarArr[i] = null;
                kk7.f(i).k(kk7.A3, new Object[0]);
                return;
            }
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
            tL_payments_getStarsTransactions.offset = "";
            tL_payments_getStarsTransactions.limit = 10;
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsTransactions, new uf(tz4Var, (byte) 29));
        }
    }

    public static HashSet e(int i) {
        HashSet[] hashSetArr = c;
        if (hashSetArr[i] == null) {
            hashSetArr[i] = new HashSet(na7.q1(i).X3.getStringSet("gram_earnings_wallet_withdraws", Collections.EMPTY_SET));
        }
        return hashSetArr[i];
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        while (true) {
            int indexOf = spannableStringBuilder.toString().indexOf(str);
            if (indexOf >= 0) {
                cm2 cm2Var = new cm2(i, 0);
                cm2Var.c(gl.L(16.0f));
                if (i2 >= 0) {
                    cm2Var.a(i2);
                }
                spannableStringBuilder.replace(indexOf, str.length() + indexOf, "x");
                spannableStringBuilder.setSpan(cm2Var, indexOf, indexOf + 1, 33);
            } else {
                return;
            }
        }
    }

    public static void g(d dVar, long j, is0 is0Var) {
        if (dVar.getContext() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dVar.getResourceProvider(), dVar.getContext());
        String a0 = k96.a0(null, null, 2131749322, c.w(j, false));
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = a0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131749323, null));
        f(spannableStringBuilder, "⚙", 2131232365, -1);
        f(spannableStringBuilder, "💎", 2131231959, bkb.u6);
        hdVar.U = spannableStringBuilder;
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131749330, null), new hs0(dVar, j, is0Var, (byte) 3));
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
        spannableStringBuilder.append((CharSequence) k96.M0(2131742601, null));
        spannableStringBuilder.append((CharSequence) "\n\n• ").append((CharSequence) gl.T2(k96.M0(2131751288, null)));
        spannableStringBuilder.append((CharSequence) "\n• ").append((CharSequence) gl.T2(k96.M0(2131751287, null)));
        spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) k96.M0(2131751286, null));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, twoStepVerificationActivity.getResourceProvider(), twoStepVerificationActivity.getParentActivity());
        String M0 = k96.M0(2131751285, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = spannableStringBuilder;
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        twoStepVerificationActivity.showDialog(hdVar);
        return true;
    }
}
