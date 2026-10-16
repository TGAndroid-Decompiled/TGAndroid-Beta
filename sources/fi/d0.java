package fi;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.j8;
import org.telegram.ui.cj1;
import org.telegram.ui.cp0;
import org.telegram.ui.g61;
public final class d0 implements DialogInterface.OnDismissListener {
    public final int f9222a;
    public final Object f9223b;
    public final Object f9224c;

    public d0(int i10, Object obj, Object obj2) {
        this.f9222a = i10;
        this.f9223b = obj;
        this.f9224c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.m2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        j8 j8Var;
        int i10 = this.f9222a;
        Object obj = this.f9223b;
        Object obj2 = this.f9224c;
        switch (i10) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                bi.u3 u3Var = (bi.u3) obj2;
                if (!zArr[0]) {
                    u3Var.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) obj;
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    a0Var.run(null);
                    return;
                }
                return;
            case 2:
                hg.j1 j1Var = (hg.j1) obj2;
                j1Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    j1Var.Q();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj2;
                m2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                m2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == m2Var.visibleDialog) {
                    m2Var.visibleDialog = null;
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                m2Var2.onPause();
                m2Var2.onFragmentDestroy();
                if (k2Var != null && (runnable = k2Var.f20170b) != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                q0.a aVar = (q0.a) obj2;
                if (!((AtomicBoolean) obj).get()) {
                    aVar.accept(Boolean.FALSE);
                    return;
                }
                return;
            case 6:
                AndroidUtilities.hideKeyboard((EditText) obj);
                AndroidUtilities.hideKeyboard((EditText) obj2);
                return;
            case 7:
                ((ji.p1) obj).run(Integer.valueOf(((ud0) obj2).getValue()));
                return;
            case 8:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f31780x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj2).text));
                externalActionActivity.finish();
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                if (a2Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.f31835q0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            zc a02 = zc.a0(lastFragment);
                            int i11 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.K0;
                            } else {
                                hashMap2 = launchActivity.J0;
                            }
                            sc Q = a02.Q(i11, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap2));
                            Q.f28805j = 5000;
                            Q.j();
                        } else {
                            zc zcVar = new zc(nb.a(launchActivity), null);
                            int i12 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap = launchActivity.K0;
                            } else {
                                hashMap = launchActivity.J0;
                            }
                            sc Q2 = zcVar.Q(i12, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap));
                            Q2.f28805j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    launchActivity.H0 = null;
                } else if (a2Var == launchActivity.F0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.F0 = null;
                }
                launchActivity.E0.remove(a2Var);
                return;
            case 10:
                cp0 cp0Var = (cp0) obj2;
                if (!((boolean[]) obj)[0]) {
                    cp0Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 11:
                g61 g61Var = (g61) obj2;
                if (!((boolean[]) obj)[0]) {
                    g61Var.c(true);
                }
                g61Var.f38277w = null;
                return;
            case 12:
                cj1 cj1Var = (cj1) obj2;
                if (!((boolean[]) obj)[0]) {
                    cj1Var.f34714u0.b();
                    return;
                }
                return;
            case 13:
                TLRPC.User user = (TLRPC.User) obj;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj2;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    if (user != null) {
                        j8Var = new j8(user);
                    } else {
                        j8Var = new j8(wallettransactionpeeruser.address);
                        j8Var.u0(wallettransactionpeeruser.domain);
                    }
                    U.presentFragment(j8Var);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                Runnable runnable2 = (Runnable) obj2;
                if (runnable2 != null) {
                    c1Var.getClass();
                    runnable2.run();
                }
                c1Var.f40986c0 = null;
                return;
            case 15:
                boolean[] zArr3 = (boolean[]) obj;
                JsPromptResult jsPromptResult = (JsPromptResult) obj2;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 16:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) obj2;
                if (!((AtomicBoolean) obj).get()) {
                    e0Var.run();
                    return;
                }
                return;
            default:
                yh.l4 l4Var = (yh.l4) obj2;
                if (!((boolean[]) obj)[0]) {
                    l4Var.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }

    public d0(Object obj, boolean[] zArr, int i10) {
        this.f9222a = i10;
        this.f9224c = obj;
        this.f9223b = zArr;
    }
}
