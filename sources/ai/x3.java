package ai;

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
import org.telegram.ui.Components.od0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.io0;
import org.telegram.ui.jh1;
import org.telegram.ui.lh0;
import org.telegram.ui.o41;
public final class x3 implements DialogInterface.OnDismissListener {
    public final int f2426a;
    public final Object f2427b;
    public final Object f2428c;

    public x3(int i10, Object obj, Object obj2) {
        this.f2426a = i10;
        this.f2427b = obj;
        this.f2428c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.n2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        org.telegram.ui.Wallet.i9 i9Var;
        int i10 = this.f2426a;
        Object obj = this.f2428c;
        Object obj2 = this.f2427b;
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
                yh.l4 l4Var = (yh.l4) obj;
                if (!((boolean[]) obj2)[0]) {
                    l4Var.run(Boolean.FALSE, null);
                    return;
                }
                return;
            case 2:
                boolean[] zArr = (boolean[]) obj2;
                ci.y2 y2Var = (ci.y2) obj;
                if (!zArr[0]) {
                    y2Var.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            case 3:
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    b0Var.run(null);
                    return;
                }
                return;
            case 4:
                hg.j1 j1Var = (hg.j1) obj;
                j1Var.getClass();
                if (!((boolean[]) obj2)[0]) {
                    j1Var.Q();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                n2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                n2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == n2Var.visibleDialog) {
                    n2Var.visibleDialog = null;
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                org.telegram.ui.ActionBar.l2 l2Var = (org.telegram.ui.ActionBar.l2) obj;
                n2Var2.onPause();
                n2Var2.onFragmentDestroy();
                if (l2Var != null && (runnable = l2Var.f21553b) != null) {
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
                ((r0) obj2).run(Integer.valueOf(((od0) obj).getValue()));
                return;
            case 10:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.f33118x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                return;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                if (b2Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.f33173q0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(lastFragment);
                            int i11 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.K0;
                            } else {
                                hashMap2 = launchActivity.J0;
                            }
                            org.telegram.ui.Components.qc Q = a02.Q(i11, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap2));
                            Q.f29638j = 5000;
                            Q.j();
                        } else {
                            org.telegram.ui.Components.xc xcVar = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(launchActivity), null);
                            int i12 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap = launchActivity.K0;
                            } else {
                                hashMap = launchActivity.J0;
                            }
                            org.telegram.ui.Components.qc Q2 = xcVar.Q(i12, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap));
                            Q2.f29638j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    launchActivity.H0 = null;
                } else if (b2Var == launchActivity.F0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.F0 = null;
                }
                launchActivity.E0.remove(b2Var);
                return;
            case 12:
                io0 io0Var = (io0) obj;
                if (!((boolean[]) obj2)[0]) {
                    io0Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 13:
                o41 o41Var = (o41) obj;
                if (!((boolean[]) obj2)[0]) {
                    o41Var.c(true);
                }
                o41Var.f42105w = null;
                return;
            case 14:
                jh1 jh1Var = (jh1) obj;
                if (!((boolean[]) obj2)[0]) {
                    jh1Var.f38210u0.b();
                    return;
                }
                return;
            case 15:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (user != null) {
                        i9Var = new org.telegram.ui.Wallet.i9(user);
                    } else {
                        i9Var = new org.telegram.ui.Wallet.i9(wallettransactionpeeruser.address);
                        i9Var.u0(wallettransactionpeeruser.domain);
                    }
                    U.presentFragment(i9Var);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (runnable3 != null) {
                    b1Var.getClass();
                    runnable3.run();
                }
                b1Var.f42524c0 = null;
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

    public x3(Object obj, boolean[] zArr, int i10) {
        this.f2426a = i10;
        this.f2428c = obj;
        this.f2427b = zArr;
    }
}
