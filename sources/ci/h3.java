package ci;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.el0;
import org.telegram.ui.f31;
import org.telegram.ui.wz0;
import org.telegram.ui.zb1;
public final class h3 implements DialogInterface.OnDismissListener {
    public final int f5211a;
    public final Object f5212b;
    public final Object f5213c;

    public h3(int i3, Object obj, Object obj2) {
        this.f5211a = i3;
        this.f5212b = obj;
        this.f5213c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.d2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        org.telegram.ui.Wallet.m9 m9Var;
        int i3 = this.f5211a;
        Object obj = this.f5213c;
        Object obj2 = this.f5212b;
        switch (i3) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                Runnable runnable2 = ((Runnable[]) obj)[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 1:
                ai.n6 n6Var = (ai.n6) obj;
                if (!((boolean[]) obj2)[0]) {
                    n6Var.a(Boolean.FALSE, null);
                    return;
                }
                return;
            case 2:
                boolean[] zArr = (boolean[]) obj2;
                ai.v1 v1Var = (ai.v1) obj;
                if (!zArr[0]) {
                    v1Var.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            case 3:
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.web.w wVar = (org.telegram.ui.web.w) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    wVar.a(null);
                    return;
                }
                return;
            case 4:
                kg.e1 e1Var = (kg.e1) obj;
                e1Var.getClass();
                if (!((boolean[]) obj2)[0]) {
                    e1Var.Q();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                d2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                d2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == d2Var.visibleDialog) {
                    d2Var.visibleDialog = null;
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                d2Var2.onPause();
                d2Var2.onFragmentDestroy();
                if (b2Var != null && (runnable = b2Var.f27396b) != null) {
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
                ((ai.v2) obj2).a(Integer.valueOf(((cb0) obj).getValue()));
                return;
            case 10:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.f41254y;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                return;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj;
                if (s1Var == launchActivity.I0) {
                    ActionBarLayout actionBarLayout = launchActivity.f41314r0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = bd.E0().B.f26563c;
                        if (lastFragment != null) {
                            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(lastFragment);
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.L0;
                            } else {
                                hashMap2 = launchActivity.K0;
                            }
                            org.telegram.ui.Components.ac Q = a02.Q(2131624103, 36, LaunchActivity.U(2131752545, "ChangeLanguageLater", hashMap2));
                            Q.f31792j = 5000;
                            Q.j();
                        } else {
                            org.telegram.ui.Components.fc fcVar = new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(launchActivity), null);
                            if (str.equals("en")) {
                                hashMap = launchActivity.L0;
                            } else {
                                hashMap = launchActivity.K0;
                            }
                            org.telegram.ui.Components.ac Q2 = fcVar.Q(2131624103, 36, LaunchActivity.U(2131752545, "ChangeLanguageLater", hashMap));
                            Q2.f31792j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    launchActivity.I0 = null;
                } else if (s1Var == launchActivity.G0) {
                    hp.e1();
                    SharedPreferences.Editor edit = hp.e1().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    hs.e().k(277, new Object[0]);
                    launchActivity.G0 = null;
                }
                launchActivity.F0.remove(s1Var);
                return;
            case 12:
                el0 el0Var = (el0) obj;
                if (!((boolean[]) obj2)[0]) {
                    el0Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 13:
                wz0 wz0Var = (wz0) obj;
                if (!((boolean[]) obj2)[0]) {
                    wz0Var.c(true);
                }
                wz0Var.f44199x = null;
                return;
            case 14:
                zb1 zb1Var = (zb1) obj;
                if (!((boolean[]) obj2)[0]) {
                    zb1Var.f52644v0.b();
                    return;
                }
                return;
            case 15:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    if (user != null) {
                        m9Var = new org.telegram.ui.Wallet.m9(user);
                    } else {
                        m9Var = new org.telegram.ui.Wallet.m9(wallettransactionpeeruser.address);
                        m9Var.A0(wallettransactionpeeruser.domain);
                    }
                    T.presentFragment(m9Var);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (runnable3 != null) {
                    w0Var.getClass();
                    runnable3.run();
                }
                w0Var.f51066d0 = null;
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
                f31 f31Var = (f31) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    f31Var.run();
                    return;
                }
                return;
        }
    }

    public h3(Object obj, boolean[] zArr, int i3) {
        this.f5211a = i3;
        this.f5213c = obj;
        this.f5212b = zArr;
    }
}
