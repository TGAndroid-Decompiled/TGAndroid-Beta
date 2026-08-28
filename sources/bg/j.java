package bg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import fh.h6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eb0;
import org.telegram.ui.mh1;
import org.telegram.ui.q41;
public final class j implements DialogInterface.OnDismissListener {
    public final int f1840a;
    public final Object f1841b;
    public final Object f1842c;

    public j(int i9, Object obj, Object obj2) {
        this.f1840a = i9;
        this.f1841b = obj;
        this.f1842c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.o2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        int i9 = this.f1840a;
        Object obj = this.f1842c;
        Object obj2 = this.f1841b;
        switch (i9) {
            case 0:
                i2 i2Var = (i2) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    i2Var.run();
                    return;
                }
                return;
            case 1:
                h6 h6Var = (h6) obj2;
                if (!((boolean[]) obj)[0]) {
                    h6Var.run(Boolean.FALSE, null);
                    return;
                }
                return;
            case 2:
                boolean[] zArr = (boolean[]) obj2;
                fh.i iVar = (fh.i) obj;
                if (!zArr[0]) {
                    iVar.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            case 3:
                boolean[] zArr2 = (boolean[]) obj2;
                j1 j1Var = (j1) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    j1Var.run(null);
                    return;
                }
                return;
            case 4:
                of.f1 f1Var = (of.f1) obj2;
                f1Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    f1Var.Q();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
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
            case 6:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                o2Var2.onPause();
                o2Var2.onFragmentDestroy();
                if (m2Var != null && (runnable = m2Var.f23654b) != null) {
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
                ((i) obj2).run(Integer.valueOf(((bc0) obj).getValue()));
                return;
            case 10:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.f35465x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                return;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                if (c2Var == launchActivity.D0) {
                    ActionBarLayout actionBarLayout = launchActivity.m0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            oc a02 = oc.a0(lastFragment);
                            int i10 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.G0;
                            } else {
                                hashMap2 = launchActivity.F0;
                            }
                            gc Q = a02.Q(i10, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap2));
                            Q.f28737j = 5000;
                            Q.j();
                        } else {
                            oc ocVar = new oc(cb.a(launchActivity), null);
                            int i11 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap = launchActivity.G0;
                            } else {
                                hashMap = launchActivity.F0;
                            }
                            gc Q2 = ocVar.Q(i11, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap));
                            Q2.f28737j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    launchActivity.D0 = null;
                } else if (c2Var == launchActivity.B0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.putBoolean("proxy_enabled_calls", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, "", 1080, "", "", "");
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.B0 = null;
                }
                launchActivity.A0.remove(c2Var);
                return;
            case 12:
                eb0 eb0Var = (eb0) obj;
                if (!((boolean[]) obj2)[0]) {
                    eb0Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 13:
                q41 q41Var = (q41) obj2;
                if (!((boolean[]) obj)[0]) {
                    q41Var.c(true);
                }
                q41Var.f44375w = null;
                return;
            case 14:
                mh1 mh1Var = (mh1) obj2;
                if (!((boolean[]) obj)[0]) {
                    mh1Var.f40458q0.b();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                y0Var.getClass();
                if (!((AtomicBoolean) obj2).get()) {
                    y0Var.v("popup_closed", new JSONObject());
                }
                y0Var.V = null;
                y0Var.f44071a0 = System.currentTimeMillis();
                return;
            case 16:
                org.telegram.ui.web.y0 y0Var2 = (org.telegram.ui.web.y0) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    y0Var2.getClass();
                    runnable2.run();
                }
                y0Var2.V = null;
                return;
            default:
                boolean[] zArr3 = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
        }
    }

    public j(org.telegram.ui.web.y0 y0Var, AtomicBoolean atomicBoolean) {
        this.f1840a = 15;
        this.f1842c = y0Var;
        this.f1841b = atomicBoolean;
    }
}
