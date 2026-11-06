package bi;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ec1;
import org.telegram.ui.g01;
import org.telegram.ui.il0;
import org.telegram.ui.p31;
public final class u3 implements DialogInterface.OnDismissListener {
    public final int f4796a;
    public final Object f4797b;
    public final Object f4798c;

    public u3(int i7, Object obj, Object obj2) {
        this.f4796a = i7;
        this.f4797b = obj;
        this.f4798c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.f2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        org.telegram.ui.Wallet.n9 n9Var;
        int i7 = this.f4796a;
        Object obj = this.f4798c;
        Object obj2 = this.f4797b;
        switch (i7) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                Runnable runnable2 = ((Runnable[]) obj)[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 1:
                zh.p3 p3Var = (zh.p3) obj;
                if (!((boolean[]) obj2)[0]) {
                    p3Var.a(Boolean.FALSE, null);
                    return;
                }
                return;
            case 2:
                boolean[] zArr = (boolean[]) obj2;
                di.s2 s2Var = (di.s2) obj;
                if (!zArr[0]) {
                    s2Var.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            case 3:
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    uVar.a(null);
                    return;
                }
                return;
            case 4:
                jg.i1 i1Var = (jg.i1) obj;
                i1Var.getClass();
                if (!((boolean[]) obj2)[0]) {
                    i1Var.Q();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                f2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                f2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == f2Var.visibleDialog) {
                    f2Var.visibleDialog = null;
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                f2Var2.onPause();
                f2Var2.onFragmentDestroy();
                if (d2Var != null && (runnable = d2Var.f27421b) != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                org.telegram.messenger.g0.v1((EditText) obj2);
                org.telegram.messenger.g0.v1((EditText) obj);
                return;
            case 8:
                q0.a aVar = (q0.a) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    aVar.accept(Boolean.FALSE);
                    return;
                }
                return;
            case 9:
                ((ai.i) obj2).a(Integer.valueOf(((hb0) obj).getValue()));
                return;
            case 10:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.f41197y;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                return;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj;
                if (u1Var == launchActivity.F0) {
                    ActionBarLayout actionBarLayout = launchActivity.f41251o0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = org.telegram.messenger.hd.E0().B.f22176c;
                        if (lastFragment != null) {
                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(lastFragment);
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.I0;
                            } else {
                                hashMap2 = launchActivity.H0;
                            }
                            org.telegram.ui.Components.cc Q = a02.Q(2131624103, 36, LaunchActivity.U(2131752545, "ChangeLanguageLater", hashMap2));
                            Q.f32523j = 5000;
                            Q.j();
                        } else {
                            org.telegram.ui.Components.hc hcVar = new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(launchActivity), null);
                            if (str.equals("en")) {
                                hashMap = launchActivity.I0;
                            } else {
                                hashMap = launchActivity.H0;
                            }
                            org.telegram.ui.Components.cc Q2 = hcVar.Q(2131624103, 36, LaunchActivity.U(2131752545, "ChangeLanguageLater", hashMap));
                            Q2.f32523j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    launchActivity.F0 = null;
                } else if (u1Var == launchActivity.D0) {
                    qp.e1();
                    SharedPreferences.Editor edit = qp.e1().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    qs.e().k(277, new Object[0]);
                    launchActivity.D0 = null;
                }
                launchActivity.C0.remove(u1Var);
                return;
            case 12:
                il0 il0Var = (il0) obj;
                if (!((boolean[]) obj2)[0]) {
                    il0Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 13:
                g01 g01Var = (g01) obj;
                if (!((boolean[]) obj2)[0]) {
                    g01Var.c(true);
                }
                g01Var.f47604x = null;
                return;
            case 14:
                ec1 ec1Var = (ec1) obj;
                if (!((boolean[]) obj2)[0]) {
                    ec1Var.f45279t0.b();
                    return;
                }
                return;
            case 15:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    if (user != null) {
                        n9Var = new org.telegram.ui.Wallet.n9(user);
                    } else {
                        n9Var = new org.telegram.ui.Wallet.n9(wallettransactionpeeruser.address);
                        n9Var.A0(wallettransactionpeeruser.domain);
                    }
                    T.presentFragment(n9Var);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (runnable3 != null) {
                    x0Var.getClass();
                    runnable3.run();
                }
                x0Var.f51353c0 = null;
                return;
            case 17:
                boolean[] zArr3 = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            default:
                p31 p31Var = (p31) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    p31Var.run();
                    return;
                }
                return;
        }
    }

    public u3(Object obj, boolean[] zArr, int i7) {
        this.f4796a = i7;
        this.f4798c = obj;
        this.f4797b = zArr;
    }
}
