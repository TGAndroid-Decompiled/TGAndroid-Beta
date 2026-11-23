package ii;

import ai.g1;
import android.text.SpannableStringBuilder;
import di.p9;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.h0;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.nq;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.u0;
public abstract class n {
    public static final boolean[] f16350a = new boolean[4];
    public static final m[] f16351b = new m[4];
    public static final HashSet[] f16352c = new HashSet[4];

    public static void a(int i7, long j3, long j10, int i10, p9 p9Var) {
        u0 D = u0.D(i7);
        if (D.A() >= j3) {
            p9Var.a(Boolean.TRUE);
        } else if (System.currentTimeMillis() > j10) {
            p9Var.a(Boolean.FALSE);
        } else {
            if (i10 % 5 == 0) {
                D.K();
            }
            g0.h3(new k(i7, j3, j10, i10, p9Var), 2000L);
        }
    }

    public static void b(g2 g2Var, long j3, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, r10 r10Var, Runnable runnable) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        int currentAccount = g2Var.getCurrentAccount();
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(currentAccount);
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        if (inputCheckPasswordSRP != null) {
            tL_inputCheckPasswordEmpty = inputCheckPasswordSRP;
        } else {
            tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        gettmppassword.password = tL_inputCheckPasswordEmpty;
        gettmppassword.period = 60;
        connectionsManager.sendRequest(gettmppassword, new c(connectionsManager, twoStepVerificationActivity, g2Var, j3, r10Var, runnable, currentAccount, inputCheckPasswordSRP));
    }

    public static boolean c(int i7) {
        return ((h0) np.u1(i7).A7.f26239p0.f14030b).f24341c;
    }

    public static void d(m mVar) {
        int i7 = mVar.f16344a;
        m[] mVarArr = f16351b;
        if (mVarArr[i7] == mVar && !mVar.h) {
            if (System.currentTimeMillis() - mVar.f16347e > 600000) {
                mVarArr[i7] = null;
                ls.f(i7).k(ls.B3, new Object[0]);
                return;
            }
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
            tL_payments_getStarsTransactions.offset = "";
            tL_payments_getStarsTransactions.limit = 10;
            ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsTransactions, new g1(mVar, 14));
        }
    }

    public static HashSet e(int i7) {
        HashSet[] hashSetArr = f16352c;
        if (hashSetArr[i7] == null) {
            hashSetArr[i7] = new HashSet(np.u1(i7).h7.getStringSet("gram_earnings_wallet_withdraws", Collections.EMPTY_SET));
        }
        return hashSetArr[i7];
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, String str, int i7, int i10) {
        while (true) {
            int indexOf = spannableStringBuilder.toString().indexOf(str);
            if (indexOf >= 0) {
                nq nqVar = new nq(i7, 0);
                nqVar.c(g0.L(16.0f));
                if (i10 >= 0) {
                    nqVar.a(i10);
                }
                spannableStringBuilder.replace(indexOf, str.length() + indexOf, "x");
                spannableStringBuilder.setSpan(nqVar, indexOf, indexOf + 1, 33);
            } else {
                return;
            }
        }
    }

    public static void g(g2 g2Var, long j3, di.i iVar) {
        if (g2Var.getContext() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getContext(), g2Var.getResourceProvider());
        String a02 = hd.a0(null, null, 2131749321, u0.x(j3, false));
        t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = a02;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.N0(2131749322, null));
        f(spannableStringBuilder, "⚙", 2131232362, -1);
        f(spannableStringBuilder, "💎", 2131231956, m6.f29716v6);
        t1Var.U = spannableStringBuilder;
        alertDialog$Builder.h(hd.N0(2131752577, null), null);
        alertDialog$Builder.k(hd.N0(2131749329, null), new di.h(g2Var, j3, iVar, 3));
        alertDialog$Builder.p();
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
        spannableStringBuilder.append((CharSequence) hd.N0(2131742598, null));
        spannableStringBuilder.append((CharSequence) "\n\n• ").append((CharSequence) g0.W2(hd.N0(2131751288, null)));
        spannableStringBuilder.append((CharSequence) "\n• ").append((CharSequence) g0.W2(hd.N0(2131751287, null)));
        spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) hd.N0(2131751286, null));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, twoStepVerificationActivity.getParentActivity(), twoStepVerificationActivity.getResourceProvider());
        String N0 = hd.N0(2131751285, null);
        t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        t1Var.U = spannableStringBuilder;
        alertDialog$Builder.k(hd.N0(2131747637, null), null);
        twoStepVerificationActivity.showDialog(t1Var);
        return true;
    }
}
