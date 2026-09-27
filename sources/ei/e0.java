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
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ki1;
import org.telegram.ui.r51;
import org.telegram.ui.to0;
public final class e0 implements DialogInterface.OnDismissListener {
    public final int f8291a;
    public final Object f8292b;
    public final Object f8293c;

    public e0(int i10, Object obj, Object obj2) {
        this.f8291a = i10;
        this.f8292b = obj;
        this.f8293c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.o2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        int i10 = this.f8291a;
        Object obj = this.f8292b;
        Object obj2 = this.f8293c;
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
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj2;
                o2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                o2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == o2Var.visibleDialog) {
                    o2Var.visibleDialog = null;
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                o2Var2.onPause();
                o2Var2.onFragmentDestroy();
                if (m2Var != null && (runnable = m2Var.f19632b) != null) {
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
                ((ii.q1) obj).run(Integer.valueOf(((ed0) obj2).getValue()));
                return;
            case 8:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f31077x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj2).text));
                externalActionActivity.finish();
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                if (c2Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.f31132q0;
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
                            Q.f27691j = 5000;
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
                            Q2.f27691j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    launchActivity.H0 = null;
                } else if (c2Var == launchActivity.F0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.F0 = null;
                }
                launchActivity.E0.remove(c2Var);
                return;
            case 10:
                to0 to0Var = (to0) obj2;
                if (!((boolean[]) obj)[0]) {
                    to0Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 11:
                r51 r51Var = (r51) obj2;
                if (!((boolean[]) obj)[0]) {
                    r51Var.c(true);
                }
                r51Var.f40147w = null;
                return;
            case 12:
                ki1 ki1Var = (ki1) obj2;
                if (!((boolean[]) obj)[0]) {
                    ki1Var.f35082u0.b();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                Runnable runnable2 = (Runnable) obj2;
                if (runnable2 != null) {
                    c1Var.getClass();
                    runnable2.run();
                }
                c1Var.f38963c0 = null;
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
                xh.o4 o4Var = (xh.o4) obj2;
                if (!((boolean[]) obj)[0]) {
                    o4Var.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }

    public e0(Object obj, boolean[] zArr, int i10) {
        this.f8291a = i10;
        this.f8293c = obj;
        this.f8292b = zArr;
    }
}
