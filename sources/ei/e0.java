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
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.l8;
import org.telegram.ui.c61;
import org.telegram.ui.xi1;
import org.telegram.ui.zo0;
public final class e0 implements DialogInterface.OnDismissListener {
    public final int f9019a;
    public final Object f9020b;
    public final Object f9021c;

    public e0(int i10, Object obj, Object obj2) {
        this.f9019a = i10;
        this.f9020b = obj;
        this.f9021c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.m2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        l8 l8Var;
        int i10 = this.f9019a;
        Object obj = this.f9020b;
        Object obj2 = this.f9021c;
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
                if (k2Var != null && (runnable = k2Var.f21089b) != null) {
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
                ((ii.q1) obj).run(Integer.valueOf(((yd0) obj2).getValue()));
                return;
            case 8:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f33588x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj2).text));
                externalActionActivity.finish();
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                if (a2Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.f33646q0;
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
                            Q.f30536j = 5000;
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
                            Q2.f30536j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
                zo0 zo0Var = (zo0) obj2;
                if (!((boolean[]) obj)[0]) {
                    zo0Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 11:
                c61 c61Var = (c61) obj2;
                if (!((boolean[]) obj)[0]) {
                    c61Var.c(true);
                }
                c61Var.f39123w = null;
                return;
            case 12:
                xi1 xi1Var = (xi1) obj2;
                if (!((boolean[]) obj)[0]) {
                    xi1Var.f44022u0.b();
                    return;
                }
                return;
            case 13:
                TLRPC.User user = (TLRPC.User) obj;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj2;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    if (user != null) {
                        l8Var = new l8(user);
                    } else {
                        l8Var = new l8(wallettransactionpeeruser.address);
                        l8Var.u0(wallettransactionpeeruser.domain);
                    }
                    U.presentFragment(l8Var);
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
                b1Var.f43186c0 = null;
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
                xh.m4 m4Var = (xh.m4) obj2;
                if (!((boolean[]) obj)[0]) {
                    m4Var.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }

    public e0(Object obj, boolean[] zArr, int i10) {
        this.f9019a = i10;
        this.f9021c = obj;
        this.f9020b = zArr;
    }
}
