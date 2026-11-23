package di;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fc1;
import org.telegram.ui.g01;
import org.telegram.ui.ll0;
import org.telegram.ui.ox0;
public final class u1 implements DialogInterface.OnDismissListener {
    public final int f9841a;
    public final Object f9842b;
    public final Object f9843c;

    public u1(int i7, Object obj, Object obj2) {
        this.f9841a = i7;
        this.f9842b = obj;
        this.f9843c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.ActionBar.g2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        org.telegram.ui.Wallet.ea eaVar;
        int i7 = this.f9841a;
        Object obj = this.f9843c;
        Object obj2 = this.f9842b;
        switch (i7) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                Runnable runnable = ((Runnable[]) obj)[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                w10 w10Var = (w10) obj;
                boolean[] zArr = (boolean[]) obj2;
                if (w10Var != null && !zArr[0]) {
                    w10Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 2:
                bi.r8 r8Var = (bi.r8) obj;
                if (!((boolean[]) obj2)[0]) {
                    r8Var.a(Boolean.FALSE, null);
                    return;
                }
                return;
            case 3:
                jg.h1 h1Var = (jg.h1) obj;
                h1Var.getClass();
                if (!((boolean[]) obj2)[0]) {
                    h1Var.Q();
                    return;
                }
                return;
            case 4:
                boolean[] zArr2 = (boolean[]) obj2;
                bi.o2 o2Var = (bi.o2) obj;
                if (!zArr2[0]) {
                    o2Var.a(Boolean.FALSE);
                    zArr2[0] = true;
                    return;
                }
                return;
            case 5:
                boolean[] zArr3 = (boolean[]) obj2;
                org.telegram.ui.web.v vVar = (org.telegram.ui.web.v) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    vVar.a(null);
                    return;
                }
                return;
            case 6:
                org.telegram.messenger.g0.v1((EditText) obj2);
                org.telegram.messenger.g0.v1((EditText) obj);
                return;
            case 7:
                q0.a aVar = (q0.a) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    aVar.accept(Boolean.FALSE);
                    return;
                }
                return;
            case 8:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.f43158y;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj;
                if (t1Var == launchActivity.G0) {
                    ActionBarLayout actionBarLayout = launchActivity.f43214p0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = gd.E0().B.f23445c;
                        if (lastFragment != null) {
                            org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(lastFragment);
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.J0;
                            } else {
                                hashMap2 = launchActivity.I0;
                            }
                            org.telegram.ui.Components.fc Q = b02.Q(2131624104, 36, LaunchActivity.U(2131752533, "ChangeLanguageLater", hashMap2));
                            Q.f35091j = 5000;
                            Q.j();
                        } else {
                            org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(org.telegram.ui.Components.bb.a(launchActivity), null);
                            if (str.equals("en")) {
                                hashMap = launchActivity.J0;
                            } else {
                                hashMap = launchActivity.I0;
                            }
                            org.telegram.ui.Components.fc Q2 = kcVar.Q(2131624104, 36, LaunchActivity.U(2131752533, "ChangeLanguageLater", hashMap));
                            Q2.f35091j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    launchActivity.G0 = null;
                } else if (t1Var == launchActivity.E0) {
                    mp.g1();
                    SharedPreferences.Editor edit = mp.g1().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    ks.e().k(280, new Object[0]);
                    launchActivity.E0 = null;
                }
                launchActivity.D0.remove(t1Var);
                return;
            case 10:
                ll0 ll0Var = (ll0) obj;
                if (!((boolean[]) obj2)[0]) {
                    ll0Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 11:
                g01 g01Var = (g01) obj;
                if (!((boolean[]) obj2)[0]) {
                    g01Var.c(true);
                }
                g01Var.f49933x = null;
                return;
            case 12:
                fc1 fc1Var = (fc1) obj;
                if (!((boolean[]) obj2)[0]) {
                    fc1Var.f47790u0.b();
                    return;
                }
                return;
            case 13:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (user != null) {
                        eaVar = new org.telegram.ui.Wallet.ea(user);
                    } else {
                        eaVar = new org.telegram.ui.Wallet.ea(wallettransactionpeeruser.address);
                        eaVar.A0(wallettransactionpeeruser.domain);
                    }
                    T.presentFragment(eaVar);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    v0Var.getClass();
                    runnable2.run();
                }
                v0Var.f53581d0 = null;
                return;
            case 15:
                boolean[] zArr4 = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr4[0]) {
                    zArr4[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            default:
                ox0 ox0Var = (ox0) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    ox0Var.run();
                    return;
                }
                return;
        }
    }

    public u1(Object obj, boolean[] zArr, int i7) {
        this.f9841a = i7;
        this.f9843c = obj;
        this.f9842b = zArr;
    }
}
