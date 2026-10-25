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
import org.telegram.ui.Components.md0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lh0;
import org.telegram.ui.ph1;
import org.telegram.ui.qo0;
import org.telegram.ui.r41;
public final class u3 implements DialogInterface.OnDismissListener {
    public final int f5509a;
    public final Object f5510b;
    public final Object f5511c;

    public u3(int i10, Object obj, Object obj2) {
        this.f5509a = i10;
        this.f5510b = obj;
        this.f5511c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.r2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        org.telegram.ui.Wallet.i9 i9Var;
        int i10 = this.f5509a;
        Object obj = this.f5511c;
        Object obj2 = this.f5510b;
        switch (i10) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                Runnable runnable2 = ((Runnable[]) obj)[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 1:
                zh.m4 m4Var = (zh.m4) obj;
                if (!((boolean[]) obj2)[0]) {
                    m4Var.run(Boolean.FALSE, null);
                    return;
                }
                return;
            case 2:
                boolean[] zArr = (boolean[]) obj2;
                di.y2 y2Var = (di.y2) obj;
                if (!zArr[0]) {
                    y2Var.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            case 3:
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    a0Var.run(null);
                    return;
                }
                return;
            case 4:
                ig.j1 j1Var = (ig.j1) obj;
                j1Var.getClass();
                if (!((boolean[]) obj2)[0]) {
                    j1Var.Q();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                r2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                r2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == r2Var.visibleDialog) {
                    r2Var.visibleDialog = null;
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                r2Var2.onPause();
                r2Var2.onFragmentDestroy();
                if (p2Var != null && (runnable = p2Var.f22927b) != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                q0.a aVar = (q0.a) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    aVar.accept(Boolean.FALSE);
                    return;
                }
                return;
            case 8:
                AndroidUtilities.hideKeyboard((EditText) obj2);
                AndroidUtilities.hideKeyboard((EditText) obj);
                return;
            case 9:
                ((ai.i) obj2).run(Integer.valueOf(((md0) obj).getValue()));
                return;
            case 10:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.f35495x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                return;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                if (e2Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.f35550q0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(lastFragment);
                            int i11 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.K0;
                            } else {
                                hashMap2 = launchActivity.J0;
                            }
                            org.telegram.ui.Components.qc R = b02.R(i11, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap2));
                            R.f31887j = 5000;
                            R.j();
                        } else {
                            org.telegram.ui.Components.wc wcVar = new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(launchActivity), null);
                            int i12 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap = launchActivity.K0;
                            } else {
                                hashMap = launchActivity.J0;
                            }
                            org.telegram.ui.Components.qc R2 = wcVar.R(i12, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap));
                            R2.f31887j = 5000;
                            R2.j();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    launchActivity.H0 = null;
                } else if (e2Var == launchActivity.F0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.F0 = null;
                }
                launchActivity.E0.remove(e2Var);
                return;
            case 12:
                qo0 qo0Var = (qo0) obj;
                if (!((boolean[]) obj2)[0]) {
                    qo0Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 13:
                r41 r41Var = (r41) obj;
                if (!((boolean[]) obj2)[0]) {
                    r41Var.c(true);
                }
                r41Var.f45963w = null;
                return;
            case 14:
                ph1 ph1Var = (ph1) obj;
                if (!((boolean[]) obj2)[0]) {
                    ph1Var.f42545u0.b();
                    return;
                }
                return;
            case 15:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    if (user != null) {
                        i9Var = new org.telegram.ui.Wallet.i9(user);
                    } else {
                        i9Var = new org.telegram.ui.Wallet.i9(wallettransactionpeeruser.address);
                        i9Var.w0(wallettransactionpeeruser.domain);
                    }
                    U.presentFragment(i9Var);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (runnable3 != null) {
                    a1Var.getClass();
                    runnable3.run();
                }
                a1Var.f45156c0 = null;
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
                lh0 lh0Var = (lh0) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    lh0Var.run();
                    return;
                }
                return;
        }
    }

    public u3(Object obj, boolean[] zArr, int i10) {
        this.f5509a = i10;
        this.f5511c = obj;
        this.f5510b = zArr;
    }
}
