package ii;

import ai.e1;
import android.text.SpannableStringBuilder;
import di.o9;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.h0;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.lq;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.u0;
public abstract class n {
    public static final boolean[] f16325a = new boolean[4];
    public static final m[] f16326b = new m[4];
    public static final HashSet[] f16327c = new HashSet[4];

    public static void a(int i7, long j3, long j10, int i10, o9 o9Var) {
        u0 D = u0.D(i7);
        if (D.A() >= j3) {
            o9Var.a(Boolean.TRUE);
        } else if (System.currentTimeMillis() > j10) {
            o9Var.a(Boolean.FALSE);
        } else {
            if (i10 % 5 == 0) {
                D.K();
            }
            g0.h3(new k(i7, j3, j10, i10, o9Var), 2000L);
        }
    }

    public static void b(h2 h2Var, long j3, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, q10 q10Var, Runnable runnable) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        int currentAccount = h2Var.getCurrentAccount();
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(currentAccount);
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        if (inputCheckPasswordSRP != null) {
            tL_inputCheckPasswordEmpty = inputCheckPasswordSRP;
        } else {
            tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        gettmppassword.password = tL_inputCheckPasswordEmpty;
        gettmppassword.period = 60;
        connectionsManager.sendRequest(gettmppassword, new c(connectionsManager, twoStepVerificationActivity, h2Var, j3, q10Var, runnable, currentAccount, inputCheckPasswordSRP));
    }

    public static boolean c(int i7) {
        return ((h0) mp.u1(i7).A7.f26161p0.f14001b).f24339c;
    }

    public static void d(m mVar) {
        int i7 = mVar.f16319a;
        m[] mVarArr = f16326b;
        if (mVarArr[i7] == mVar && !mVar.h) {
            if (System.currentTimeMillis() - mVar.f16322e > 600000) {
                mVarArr[i7] = null;
                ks.f(i7).k(ks.B3, new Object[0]);
                return;
            }
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
            tL_payments_getStarsTransactions.offset = "";
            tL_payments_getStarsTransactions.limit = 10;
            ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsTransactions, new e1(mVar, 14));
        }
    }

    public static HashSet e(int i7) {
        HashSet[] hashSetArr = f16327c;
        if (hashSetArr[i7] == null) {
            hashSetArr[i7] = new HashSet(mp.u1(i7).h7.getStringSet("gram_earnings_wallet_withdraws", Collections.EMPTY_SET));
        }
        return hashSetArr[i7];
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, String str, int i7, int i10) {
        while (true) {
            int indexOf = spannableStringBuilder.toString().indexOf(str);
            if (indexOf >= 0) {
                lq lqVar = new lq(i7, 0);
                lqVar.c(g0.L(16.0f));
                if (i10 >= 0) {
                    lqVar.a(i10);
                }
                spannableStringBuilder.replace(indexOf, str.length() + indexOf, "x");
                spannableStringBuilder.setSpan(lqVar, indexOf, indexOf + 1, 33);
            } else {
                return;
            }
        }
    }

    public static void g(h2 h2Var, long j3, di.i iVar) {
        if (h2Var.getContext() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h2Var.getContext(), h2Var.getResourceProvider());
        String a02 = gd.a0(null, null, 2131749322, u0.x(j3, false));
        u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = a02;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.M0(2131749323, null));
        f(spannableStringBuilder, "⚙", 2131232362, -1);
        f(spannableStringBuilder, "💎", 2131231956, n6.f29731v6);
        u1Var.U = spannableStringBuilder;
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        alertDialog$Builder.k(gd.M0(2131749330, null), new di.h(h2Var, j3, iVar, 3));
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
        spannableStringBuilder.append((CharSequence) gd.M0(2131742606, null));
        spannableStringBuilder.append((CharSequence) "\n\n• ").append((CharSequence) g0.W2(gd.M0(2131751289, null)));
        spannableStringBuilder.append((CharSequence) "\n• ").append((CharSequence) g0.W2(gd.M0(2131751288, null)));
        spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) gd.M0(2131751287, null));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, twoStepVerificationActivity.getParentActivity(), twoStepVerificationActivity.getResourceProvider());
        String M0 = gd.M0(2131751286, null);
        u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        u1Var.U = spannableStringBuilder;
        alertDialog$Builder.k(gd.M0(2131747638, null), null);
        twoStepVerificationActivity.showDialog(u1Var);
        return true;
    }
}
