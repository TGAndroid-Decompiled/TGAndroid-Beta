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
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hc1;
import org.telegram.ui.i01;
import org.telegram.ui.nl0;
import org.telegram.ui.qx0;
public final class u1 implements DialogInterface.OnDismissListener {
    public final int f9877a;
    public final Object f9878b;
    public final Object f9879c;

    public u1(int i7, Object obj, Object obj2) {
        this.f9877a = i7;
        this.f9878b = obj;
        this.f9879c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.ActionBar.g2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        org.telegram.ui.Wallet.da daVar;
        int i7 = this.f9877a;
        Object obj = this.f9879c;
        Object obj2 = this.f9878b;
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
                x10 x10Var = (x10) obj;
                boolean[] zArr = (boolean[]) obj2;
                if (x10Var != null && !zArr[0]) {
                    x10Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 2:
                bi.p8 p8Var = (bi.p8) obj;
                if (!((boolean[]) obj2)[0]) {
                    p8Var.a(Boolean.FALSE, null);
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
                bi.m2 m2Var = (bi.m2) obj;
                if (!zArr2[0]) {
                    m2Var.a(Boolean.FALSE);
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
                ArrayList arrayList = ExternalActionActivity.f43079y;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj;
                if (t1Var == launchActivity.G0) {
                    ActionBarLayout actionBarLayout = launchActivity.f43135p0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = gd.E0().B.f23358c;
                        if (lastFragment != null) {
                            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(lastFragment);
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.J0;
                            } else {
                                hashMap2 = launchActivity.I0;
                            }
                            org.telegram.ui.Components.gc Q = b02.Q(2131624104, 36, LaunchActivity.U(2131752533, "ChangeLanguageLater", hashMap2));
                            Q.f35508j = 5000;
                            Q.j();
                        } else {
                            org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(launchActivity), null);
                            if (str.equals("en")) {
                                hashMap = launchActivity.J0;
                            } else {
                                hashMap = launchActivity.I0;
                            }
                            org.telegram.ui.Components.gc Q2 = lcVar.Q(2131624104, 36, LaunchActivity.U(2131752533, "ChangeLanguageLater", hashMap));
                            Q2.f35508j = 5000;
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
                nl0 nl0Var = (nl0) obj;
                if (!((boolean[]) obj2)[0]) {
                    nl0Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 11:
                i01 i01Var = (i01) obj;
                if (!((boolean[]) obj2)[0]) {
                    i01Var.c(true);
                }
                i01Var.f50403x = null;
                return;
            case 12:
                hc1 hc1Var = (hc1) obj;
                if (!((boolean[]) obj2)[0]) {
                    hc1Var.f48364u0.b();
                    return;
                }
                return;
            case 13:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (user != null) {
                        daVar = new org.telegram.ui.Wallet.da(user);
                    } else {
                        daVar = new org.telegram.ui.Wallet.da(wallettransactionpeeruser.address);
                        daVar.A0(wallettransactionpeeruser.domain);
                    }
                    T.presentFragment(daVar);
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
                v0Var.f53343d0 = null;
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
                qx0 qx0Var = (qx0) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    qx0Var.run();
                    return;
                }
                return;
        }
    }

    public u1(Object obj, boolean[] zArr, int i7) {
        this.f9877a = i7;
        this.f9879c = obj;
        this.f9878b = zArr;
    }
}
