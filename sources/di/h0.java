package di;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import bi.va;
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
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a61;
import org.telegram.ui.yo0;
import org.telegram.ui.zi1;
public final class h0 implements DialogInterface.OnDismissListener {
    public final int f6655a;
    public final Object f6656b;
    public final Object f6657c;

    public h0(int i10, Object obj, Object obj2) {
        this.f6655a = i10;
        this.f6656b = obj;
        this.f6657c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.p2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        int i10 = this.f6655a;
        Object obj = this.f6656b;
        Object obj2 = this.f6657c;
        switch (i10) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                gg.u1 u1Var = (gg.u1) obj2;
                if (!zArr[0]) {
                    u1Var.run(Boolean.FALSE);
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
                fg.l1 l1Var = (fg.l1) obj2;
                l1Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    l1Var.Q();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj2;
                p2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                p2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == p2Var.visibleDialog) {
                    p2Var.visibleDialog = null;
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                p2Var2.onPause();
                p2Var2.onFragmentDestroy();
                if (n2Var != null && (runnable = n2Var.f18486b) != null) {
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
                ((org.telegram.ui.web.y1) obj).run(Integer.valueOf(((dd0) obj2).getValue()));
                return;
            case 8:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f29902x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj2).text));
                externalActionActivity.finish();
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                if (d2Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.f29957q0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            wc a02 = wc.a0(lastFragment);
                            int i11 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.K0;
                            } else {
                                hashMap2 = launchActivity.J0;
                            }
                            pc Q = a02.Q(i11, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap2));
                            Q.f26081j = 5000;
                            Q.j();
                        } else {
                            wc wcVar = new wc(kb.a(launchActivity), null);
                            int i12 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap = launchActivity.K0;
                            } else {
                                hashMap = launchActivity.J0;
                            }
                            pc Q2 = wcVar.Q(i12, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap));
                            Q2.f26081j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    launchActivity.H0 = null;
                } else if (d2Var == launchActivity.F0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.putBoolean("proxy_enabled_calls", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.F0 = null;
                }
                launchActivity.E0.remove(d2Var);
                return;
            case 10:
                yo0 yo0Var = (yo0) obj2;
                if (!((boolean[]) obj)[0]) {
                    yo0Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 11:
                a61 a61Var = (a61) obj2;
                if (!((boolean[]) obj)[0]) {
                    a61Var.c(true);
                }
                a61Var.f33297w = null;
                return;
            case 12:
                zi1 zi1Var = (zi1) obj2;
                if (!((boolean[]) obj)[0]) {
                    zi1Var.f39394u0.b();
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
                c1Var.f37881c0 = null;
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
                va vaVar = (va) obj2;
                if (!((AtomicBoolean) obj).get()) {
                    vaVar.run();
                    return;
                }
                return;
            default:
                wh.m4 m4Var = (wh.m4) obj2;
                if (!((boolean[]) obj)[0]) {
                    m4Var.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }

    public h0(Object obj, boolean[] zArr, int i10) {
        this.f6655a = i10;
        this.f6657c = obj;
        this.f6656b = zArr;
    }
}
