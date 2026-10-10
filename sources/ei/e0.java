package ei;

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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.k8;
import org.telegram.ui.wi1;
import org.telegram.ui.xo0;
import org.telegram.ui.z51;
public final class e0 implements DialogInterface.OnDismissListener {
    public final int f9022a;
    public final Object f9023b;
    public final Object f9024c;

    public e0(int i10, Object obj, Object obj2) {
        this.f9022a = i10;
        this.f9023b = obj;
        this.f9024c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.n2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        k8 k8Var;
        int i10 = this.f9022a;
        Object obj = this.f9023b;
        Object obj2 = this.f9024c;
        switch (i10) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                ai.f4 f4Var = (ai.f4) obj2;
                if (!zArr[0]) {
                    f4Var.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) obj;
                org.telegram.ui.web.z zVar = (org.telegram.ui.web.z) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    zVar.run(null);
                    return;
                }
                return;
            case 2:
                gg.j1 j1Var = (gg.j1) obj2;
                j1Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    j1Var.Q();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj2;
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
            case 4:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                org.telegram.ui.ActionBar.l2 l2Var = (org.telegram.ui.ActionBar.l2) obj2;
                n2Var2.onPause();
                n2Var2.onFragmentDestroy();
                if (l2Var != null && (runnable = l2Var.f21362b) != null) {
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
                ((ii.q1) obj).run(Integer.valueOf(((vd0) obj2).getValue()));
                return;
            case 8:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f33787x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj2).text));
                externalActionActivity.finish();
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                if (b2Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.f33845q0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            ad a02 = ad.a0(lastFragment);
                            int i11 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.K0;
                            } else {
                                hashMap2 = launchActivity.J0;
                            }
                            tc Q = a02.Q(i11, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap2));
                            Q.f31096j = 5000;
                            Q.j();
                        } else {
                            ad adVar = new ad(ob.a(launchActivity), null);
                            int i12 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap = launchActivity.K0;
                            } else {
                                hashMap = launchActivity.J0;
                            }
                            tc Q2 = adVar.Q(i12, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap));
                            Q2.f31096j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
            case 10:
                xo0 xo0Var = (xo0) obj2;
                if (!((boolean[]) obj)[0]) {
                    xo0Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 11:
                z51 z51Var = (z51) obj2;
                if (!((boolean[]) obj)[0]) {
                    z51Var.c(true);
                }
                z51Var.f37954w = null;
                return;
            case 12:
                wi1 wi1Var = (wi1) obj2;
                if (!((boolean[]) obj)[0]) {
                    wi1Var.f43709u0.b();
                    return;
                }
                return;
            case 13:
                TLRPC.User user = (TLRPC.User) obj;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj2;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (user != null) {
                        k8Var = new k8(user);
                    } else {
                        k8Var = new k8(wallettransactionpeeruser.address);
                        k8Var.u0(wallettransactionpeeruser.domain);
                    }
                    U.presentFragment(k8Var);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                Runnable runnable2 = (Runnable) obj2;
                if (runnable2 != null) {
                    b1Var.getClass();
                    runnable2.run();
                }
                b1Var.f43286c0 = null;
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
                org.telegram.ui.web.d0 d0Var = (org.telegram.ui.web.d0) obj2;
                if (!((AtomicBoolean) obj).get()) {
                    d0Var.run();
                    return;
                }
                return;
            default:
                xh.n4 n4Var = (xh.n4) obj2;
                if (!((boolean[]) obj)[0]) {
                    n4Var.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }

    public e0(Object obj, boolean[] zArr, int i10) {
        this.f9022a = i10;
        this.f9024c = obj;
        this.f9023b = zArr;
    }
}
