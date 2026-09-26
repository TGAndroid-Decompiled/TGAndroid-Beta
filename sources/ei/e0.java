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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mi1;
import org.telegram.ui.p51;
import org.telegram.ui.qo0;
public final class e0 implements DialogInterface.OnDismissListener {
    public final int f8289a;
    public final Object f8290b;
    public final Object f8291c;

    public e0(int i10, Object obj, Object obj2) {
        this.f8289a = i10;
        this.f8290b = obj;
        this.f8291c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.m2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        int i10 = this.f8289a;
        Object obj = this.f8290b;
        Object obj2 = this.f8291c;
        switch (i10) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                ai.e4 e4Var = (ai.e4) obj2;
                if (!zArr[0]) {
                    e4Var.run(Boolean.FALSE);
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
                gg.k1 k1Var = (gg.k1) obj2;
                k1Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    k1Var.Q();
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
                if (k2Var != null && (runnable = k2Var.f19582b) != null) {
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
                ((ii.q1) obj).run(Integer.valueOf(((fd0) obj2).getValue()));
                return;
            case 8:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f31074x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj2).text));
                externalActionActivity.finish();
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                if (a2Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.f31129q0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            xc a02 = xc.a0(lastFragment);
                            int i11 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.K0;
                            } else {
                                hashMap2 = launchActivity.J0;
                            }
                            qc Q = a02.Q(i11, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap2));
                            Q.f27635j = 5000;
                            Q.j();
                        } else {
                            xc xcVar = new xc(lb.a(launchActivity), null);
                            int i12 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap = launchActivity.K0;
                            } else {
                                hashMap = launchActivity.J0;
                            }
                            qc Q2 = xcVar.Q(i12, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap));
                            Q2.f27635j = 5000;
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
                qo0 qo0Var = (qo0) obj2;
                if (!((boolean[]) obj)[0]) {
                    qo0Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 11:
                p51 p51Var = (p51) obj2;
                if (!((boolean[]) obj)[0]) {
                    p51Var.c(true);
                }
                p51Var.f38909w = null;
                return;
            case 12:
                mi1 mi1Var = (mi1) obj2;
                if (!((boolean[]) obj)[0]) {
                    mi1Var.f35604u0.b();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                Runnable runnable2 = (Runnable) obj2;
                if (runnable2 != null) {
                    b1Var.getClass();
                    runnable2.run();
                }
                b1Var.f39001c0 = null;
                return;
            case 14:
                boolean[] zArr3 = (boolean[]) obj;
                JsPromptResult jsPromptResult = (JsPromptResult) obj2;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 15:
                ai.j jVar = (ai.j) obj2;
                if (!((AtomicBoolean) obj).get()) {
                    jVar.run();
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
        this.f8289a = i10;
        this.f8291c = obj;
        this.f8290b = zArr;
    }
}
