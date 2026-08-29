package eg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import ih.s5;
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
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oh1;
import org.telegram.ui.s41;
import org.telegram.ui.tm;
public final class g implements DialogInterface.OnDismissListener {
    public final int f5993a;
    public final Object f5994b;
    public final Object f5995c;

    public g(int i10, Object obj, Object obj2) {
        this.f5993a = i10;
        this.f5994b = obj;
        this.f5995c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.o2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        int i10 = this.f5993a;
        Object obj = this.f5995c;
        Object obj2 = this.f5994b;
        switch (i10) {
            case 0:
                z1 z1Var = (z1) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    z1Var.run();
                    return;
                }
                return;
            case 1:
                s5 s5Var = (s5) obj2;
                if (!((boolean[]) obj)[0]) {
                    s5Var.run(Boolean.FALSE, null);
                    return;
                }
                return;
            case 2:
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
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                o2Var2.onPause();
                o2Var2.onFragmentDestroy();
                if (m2Var != null && (runnable = m2Var.f23674b) != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                q0.a aVar = (q0.a) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    aVar.accept(Boolean.FALSE);
                    return;
                }
                return;
            case 5:
                AndroidUtilities.hideKeyboard((EditText) obj2);
                AndroidUtilities.hideKeyboard((EditText) obj);
                return;
            case 6:
                ((ag.i0) obj2).run(Integer.valueOf(((qc0) obj).getValue()));
                return;
            case 7:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.f35532x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                return;
            case 8:
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
                            tc a02 = tc.a0(lastFragment);
                            int i11 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.G0;
                            } else {
                                hashMap2 = launchActivity.F0;
                            }
                            mc Q = a02.Q(i11, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap2));
                            Q.f30652j = 5000;
                            Q.j();
                        } else {
                            tc tcVar = new tc(hb.a(launchActivity), null);
                            int i12 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap = launchActivity.G0;
                            } else {
                                hashMap = launchActivity.F0;
                            }
                            mc Q2 = tcVar.Q(i12, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap));
                            Q2.f30652j = 5000;
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
            case 9:
                tm tmVar = (tm) obj;
                if (!((boolean[]) obj2)[0]) {
                    tmVar.run(Boolean.FALSE);
                    return;
                }
                return;
            case 10:
                s41 s41Var = (s41) obj2;
                if (!((boolean[]) obj)[0]) {
                    s41Var.c(true);
                }
                s41Var.f45082w = null;
                return;
            case 11:
                oh1 oh1Var = (oh1) obj2;
                if (!((boolean[]) obj)[0]) {
                    oh1Var.f41166q0.b();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                z0Var.getClass();
                if (!((AtomicBoolean) obj2).get()) {
                    z0Var.v("popup_closed", new JSONObject());
                }
                z0Var.V = null;
                z0Var.f44261a0 = System.currentTimeMillis();
                return;
            case 13:
                org.telegram.ui.web.z0 z0Var2 = (org.telegram.ui.web.z0) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    z0Var2.getClass();
                    runnable2.run();
                }
                z0Var2.V = null;
                return;
            case 14:
                boolean[] zArr = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 15:
                boolean[] zArr2 = (boolean[]) obj2;
                ih.i iVar = (ih.i) obj;
                if (!zArr2[0]) {
                    iVar.run(Boolean.FALSE);
                    zArr2[0] = true;
                    return;
                }
                return;
            case 16:
                boolean[] zArr3 = (boolean[]) obj2;
                d1 d1Var = (d1) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    d1Var.run(null);
                    return;
                }
                return;
            default:
                rf.v0 v0Var = (rf.v0) obj2;
                v0Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    v0Var.Q();
                    return;
                }
                return;
        }
    }

    public g(org.telegram.ui.web.z0 z0Var, AtomicBoolean atomicBoolean) {
        this.f5993a = 12;
        this.f5995c = z0Var;
        this.f5994b = atomicBoolean;
    }
}
