package di;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d01;
import org.telegram.ui.ec1;
import org.telegram.ui.kl0;
import org.telegram.ui.n31;
public final class a3 implements DialogInterface.OnDismissListener {
    public final int f8188a;
    public final Object f8189b;
    public final Object f8190c;

    public a3(int i7, Object obj, Object obj2) {
        this.f8188a = i7;
        this.f8189b = obj;
        this.f8190c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.e2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        org.telegram.ui.Wallet.p9 p9Var;
        int i7 = this.f8188a;
        Object obj = this.f8190c;
        Object obj2 = this.f8189b;
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
                bi.f6 f6Var = (bi.f6) obj;
                if (!((boolean[]) obj2)[0]) {
                    f6Var.a(Boolean.FALSE, null);
                    return;
                }
                return;
            case 2:
                jg.h1 h1Var = (jg.h1) obj;
                h1Var.getClass();
                if (!((boolean[]) obj2)[0]) {
                    h1Var.Q();
                    return;
                }
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj2;
                bi.o1 o1Var = (bi.o1) obj;
                if (!zArr[0]) {
                    o1Var.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            case 4:
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.web.v vVar = (org.telegram.ui.web.v) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    vVar.a(null);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                e2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                e2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == e2Var.visibleDialog) {
                    e2Var.visibleDialog = null;
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                e2Var2.onPause();
                e2Var2.onFragmentDestroy();
                if (c2Var != null && (runnable = c2Var.f28477b) != null) {
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
                ((ai.f0) obj2).a(Integer.valueOf(((ib0) obj).getValue()));
                return;
            case 10:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.f42593y;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                return;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj;
                if (t1Var == launchActivity.G0) {
                    ActionBarLayout actionBarLayout = launchActivity.f42649p0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = hd.E0().B.f23060c;
                        if (lastFragment != null) {
                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(lastFragment);
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.J0;
                            } else {
                                hashMap2 = launchActivity.I0;
                            }
                            org.telegram.ui.Components.xb Q = a02.Q(2131624104, 36, LaunchActivity.U(2131752545, "ChangeLanguageLater", hashMap2));
                            Q.f41643j = 5000;
                            Q.j();
                        } else {
                            org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(launchActivity), null);
                            if (str.equals("en")) {
                                hashMap = launchActivity.J0;
                            } else {
                                hashMap = launchActivity.I0;
                            }
                            org.telegram.ui.Components.xb Q2 = ccVar.Q(2131624104, 36, LaunchActivity.U(2131752545, "ChangeLanguageLater", hashMap));
                            Q2.f41643j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    launchActivity.G0 = null;
                } else if (t1Var == launchActivity.E0) {
                    np.e1();
                    SharedPreferences.Editor edit = np.e1().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    ns.e().k(277, new Object[0]);
                    launchActivity.E0 = null;
                }
                launchActivity.D0.remove(t1Var);
                return;
            case 12:
                kl0 kl0Var = (kl0) obj;
                if (!((boolean[]) obj2)[0]) {
                    kl0Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 13:
                d01 d01Var = (d01) obj;
                if (!((boolean[]) obj2)[0]) {
                    d01Var.c(true);
                }
                d01Var.f48195x = null;
                return;
            case 14:
                ec1 ec1Var = (ec1) obj;
                if (!((boolean[]) obj2)[0]) {
                    ec1Var.f46719u0.b();
                    return;
                }
                return;
            case 15:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    if (user != null) {
                        p9Var = new org.telegram.ui.Wallet.p9(user);
                    } else {
                        p9Var = new org.telegram.ui.Wallet.p9(wallettransactionpeeruser.address);
                        p9Var.A0(wallettransactionpeeruser.domain);
                    }
                    T.presentFragment(p9Var);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (runnable3 != null) {
                    v0Var.getClass();
                    runnable3.run();
                }
                v0Var.f52817d0 = null;
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
                n31 n31Var = (n31) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    n31Var.run();
                    return;
                }
                return;
        }
    }

    public a3(Object obj, boolean[] zArr, int i7) {
        this.f8188a = i7;
        this.f8190c = obj;
        this.f8189b = zArr;
    }
}
