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
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ap0;
import org.telegram.ui.ti1;
import org.telegram.ui.x51;
public final class e0 implements DialogInterface.OnDismissListener {
    public final int f8307a;
    public final Object f8308b;
    public final Object f8309c;

    public e0(int i10, Object obj, Object obj2) {
        this.f8307a = i10;
        this.f8308b = obj;
        this.f8309c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.o2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        int i10 = this.f8307a;
        Object obj = this.f8308b;
        Object obj2 = this.f8309c;
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
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    a0Var.run(null);
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
                if (m2Var != null && (runnable = m2Var.f19398b) != null) {
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
                ((org.telegram.ui.web.b1) obj).run(Integer.valueOf(((uc0) obj2).getValue()));
                return;
            case 8:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f30803x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj2).text));
                externalActionActivity.finish();
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                if (c2Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.f30858q0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            vc a02 = vc.a0(lastFragment);
                            int i11 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.K0;
                            } else {
                                hashMap2 = launchActivity.J0;
                            }
                            oc Q = a02.Q(i11, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap2));
                            Q.f26702j = 5000;
                            Q.j();
                        } else {
                            vc vcVar = new vc(jb.a(launchActivity), null);
                            int i12 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap = launchActivity.K0;
                            } else {
                                hashMap = launchActivity.J0;
                            }
                            oc Q2 = vcVar.Q(i12, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap));
                            Q2.f26702j = 5000;
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
                ap0 ap0Var = (ap0) obj2;
                if (!((boolean[]) obj)[0]) {
                    ap0Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 11:
                x51 x51Var = (x51) obj2;
                if (!((boolean[]) obj)[0]) {
                    x51Var.c(true);
                }
                x51Var.f33318w = null;
                return;
            case 12:
                ti1 ti1Var = (ti1) obj2;
                if (!((boolean[]) obj)[0]) {
                    ti1Var.f37794u0.b();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj;
                Runnable runnable2 = (Runnable) obj2;
                if (runnable2 != null) {
                    d1Var.getClass();
                    runnable2.run();
                }
                d1Var.f38741c0 = null;
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
                xh.m4 m4Var = (xh.m4) obj2;
                if (!((boolean[]) obj)[0]) {
                    m4Var.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }

    public e0(Object obj, boolean[] zArr, int i10) {
        this.f8307a = i10;
        this.f8309c = obj;
        this.f8308b = zArr;
    }
}
