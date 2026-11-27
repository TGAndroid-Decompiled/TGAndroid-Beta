package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;
public abstract class z15 {
    public static final boolean[] a = new boolean[4];
    public static final y15[] b = new y15[4];
    public static final HashSet[] c = new HashSet[4];

    public static void a(int i, long j, long j2, int i2, zo2 zo2Var) {
        c C = c.C(i);
        if (C.z() >= j) {
            zo2Var.a(Boolean.TRUE);
        } else if (System.currentTimeMillis() > j2) {
            zo2Var.a(Boolean.FALSE);
        } else {
            if (i2 % 5 == 0) {
                C.J();
            }
            hl.d3(new x15(i, j, j2, i2, zo2Var), 2000L);
        }
    }

    public static void b(e eVar, long j, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, qs0 qs0Var, wy wyVar) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        int currentAccount = eVar.getCurrentAccount();
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(currentAccount);
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        if (tL_inputCheckPasswordSRP != null) {
            tL_inputCheckPasswordEmpty = tL_inputCheckPasswordSRP;
        } else {
            tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        gettmppassword.password = tL_inputCheckPasswordEmpty;
        gettmppassword.period = 60;
        connectionsManager.sendRequest(gettmppassword, new q15(connectionsManager, twoStepVerificationActivity, eVar, j, qs0Var, wyVar, currentAccount, tL_inputCheckPasswordSRP));
    }

    public static boolean c(int i) {
        return uc7.s1(i).l4.v0.f;
    }

    public static void d(y15 y15Var) {
        int i = y15Var.a;
        y15[] y15VarArr = b;
        if (y15VarArr[i] == y15Var && !y15Var.h) {
            if (System.currentTimeMillis() - y15Var.e > 600000) {
                y15VarArr[i] = null;
                jn7.f(i).k(jn7.B3, new Object[0]);
                return;
            }
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
            tL_payments_getStarsTransactions.offset = "";
            tL_payments_getStarsTransactions.limit = 10;
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsTransactions, new w15(y15Var, (byte) 0));
        }
    }

    public static HashSet e(int i) {
        HashSet[] hashSetArr = c;
        if (hashSetArr[i] == null) {
            hashSetArr[i] = new HashSet(uc7.s1(i).Y3.getStringSet("gram_earnings_wallet_withdraws", Collections.EMPTY_SET));
        }
        return hashSetArr[i];
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        while (true) {
            int indexOf = spannableStringBuilder.toString().indexOf(str);
            if (indexOf >= 0) {
                wm2 wm2Var = new wm2(i, 0);
                wm2Var.c(hl.L(16.0f));
                if (i2 >= 0) {
                    wm2Var.a(i2);
                }
                spannableStringBuilder.replace(indexOf, str.length() + indexOf, "x");
                spannableStringBuilder.setSpan(wm2Var, indexOf, indexOf + 1, 33);
            } else {
                return;
            }
        }
    }

    public static void g(e eVar, long j, qs0 qs0Var) {
        if (eVar.getContext() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, eVar.getResourceProvider(), eVar.getContext());
        String a0 = ob6.a0(null, null, 2131749268, c.w(j, false));
        id idVar = alertDialog$Builder.a;
        idVar.S = a0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131749269, null));
        f(spannableStringBuilder, "⚙", 2131232365, -1);
        f(spannableStringBuilder, "💎", 2131231959, aob.v6);
        idVar.U = spannableStringBuilder;
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131749276, null), new ps0(eVar, j, qs0Var, (byte) 3));
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
        spannableStringBuilder.append((CharSequence) ob6.M0(2131742495, null));
        spannableStringBuilder.append((CharSequence) "\n\n• ").append((CharSequence) hl.S2(ob6.M0(2131751265, null)));
        spannableStringBuilder.append((CharSequence) "\n• ").append((CharSequence) hl.S2(ob6.M0(2131751264, null)));
        spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) ob6.M0(2131751263, null));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, twoStepVerificationActivity.getResourceProvider(), twoStepVerificationActivity.getParentActivity());
        String M0 = ob6.M0(2131751262, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = spannableStringBuilder;
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        twoStepVerificationActivity.showDialog(idVar);
        return true;
    }
}
