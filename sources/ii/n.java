package ii;

import ai.b1;
import android.text.SpannableStringBuilder;
import di.p9;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.h0;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.kq;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.v0;
public abstract class n {
    public static final boolean[] f16413a = new boolean[4];
    public static final m[] f16414b = new m[4];
    public static final HashSet[] f16415c = new HashSet[4];

    public static void a(int i7, long j3, long j10, int i10, p9 p9Var) {
        v0 D = v0.D(i7);
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

    public static void b(g2 g2Var, long j3, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, p10 p10Var, Runnable runnable) {
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
        connectionsManager.sendRequest(gettmppassword, new c(connectionsManager, twoStepVerificationActivity, g2Var, j3, p10Var, runnable, currentAccount, inputCheckPasswordSRP));
    }

    public static boolean c(int i7) {
        return ((h0) mp.u1(i7).A7.f26254p0.f17372b).f24439c;
    }

    public static void d(m mVar) {
        int i7 = mVar.f16407a;
        m[] mVarArr = f16414b;
        if (mVarArr[i7] == mVar && !mVar.h) {
            if (System.currentTimeMillis() - mVar.f16410e > 600000) {
                mVarArr[i7] = null;
                ks.f(i7).k(ks.B3, new Object[0]);
                return;
            }
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
            tL_payments_getStarsTransactions.offset = "";
            tL_payments_getStarsTransactions.limit = 10;
            ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsTransactions, new b1(mVar, 14));
        }
    }

    public static HashSet e(int i7) {
        HashSet[] hashSetArr = f16415c;
        if (hashSetArr[i7] == null) {
            hashSetArr[i7] = new HashSet(mp.u1(i7).h7.getStringSet("gram_earnings_wallet_withdraws", Collections.EMPTY_SET));
        }
        return hashSetArr[i7];
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, String str, int i7, int i10) {
        while (true) {
            int indexOf = spannableStringBuilder.toString().indexOf(str);
            if (indexOf >= 0) {
                kq kqVar = new kq(i7, 0);
                kqVar.c(g0.L(16.0f));
                if (i10 >= 0) {
                    kqVar.a(i10);
                }
                spannableStringBuilder.replace(indexOf, str.length() + indexOf, "x");
                spannableStringBuilder.setSpan(kqVar, indexOf, indexOf + 1, 33);
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
        String a02 = gd.a0(null, null, 2131749321, v0.x(j3, false));
        t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = a02;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131749322, null));
        f(spannableStringBuilder, "⚙", 2131232365, -1);
        f(spannableStringBuilder, "💎", 2131231959, n6.f29786v6);
        t1Var.U = spannableStringBuilder;
        alertDialog$Builder.h(gd.N0(2131752577, null), null);
        alertDialog$Builder.k(gd.N0(2131749329, null), new di.h(g2Var, j3, iVar, 3));
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
        spannableStringBuilder.append((CharSequence) gd.N0(2131742593, null));
        spannableStringBuilder.append((CharSequence) "\n\n• ").append((CharSequence) g0.W2(gd.N0(2131751288, null)));
        spannableStringBuilder.append((CharSequence) "\n• ").append((CharSequence) g0.W2(gd.N0(2131751287, null)));
        spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) gd.N0(2131751286, null));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, twoStepVerificationActivity.getParentActivity(), twoStepVerificationActivity.getResourceProvider());
        String N0 = gd.N0(2131751285, null);
        t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = spannableStringBuilder;
        alertDialog$Builder.k(gd.N0(2131747637, null), null);
        twoStepVerificationActivity.showDialog(t1Var);
        return true;
    }
}
