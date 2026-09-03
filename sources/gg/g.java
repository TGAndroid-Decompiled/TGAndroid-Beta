package gg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ii1;
import org.telegram.ui.l51;
import org.telegram.ui.no0;
public final class g implements DialogInterface.OnDismissListener {
    public final int f6631a;
    public final Object f6632b;
    public final Object f6633c;

    public g(int i10, Object obj, Object obj2) {
        this.f6631a = i10;
        this.f6632b = obj;
        this.f6633c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.ActionBar.p2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        int i10 = this.f6631a;
        Object obj = this.f6633c;
        Object obj2 = this.f6632b;
        switch (i10) {
            case 0:
                y1 y1Var = (y1) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    y1Var.run();
                    return;
                }
                return;
            case 1:
                r5 r5Var = (r5) obj2;
                if (!((boolean[]) obj)[0]) {
                    r5Var.run(Boolean.FALSE, null);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
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
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                p2Var2.onPause();
                p2Var2.onFragmentDestroy();
                if (n2Var != null && (runnable = n2Var.f20454b) != null) {
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
                ((cg.h0) obj2).run(Integer.valueOf(((xc0) obj).getValue()));
                return;
            case 7:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.f31561x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                return;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                if (d2Var == launchActivity.E0) {
                    ActionBarLayout actionBarLayout = launchActivity.f31612n0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            qc a02 = qc.a0(lastFragment);
                            int i11 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.H0;
                            } else {
                                hashMap2 = launchActivity.G0;
                            }
                            ic Q = a02.Q(i11, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap2));
                            Q.f25671j = 5000;
                            Q.j();
                        } else {
                            qc qcVar = new qc(cb.a(launchActivity), null);
                            int i12 = R.raw.msg_translate;
                            if (str.equals("en")) {
                                hashMap = launchActivity.H0;
                            } else {
                                hashMap = launchActivity.G0;
                            }
                            ic Q2 = qcVar.Q(i12, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", hashMap));
                            Q2.f25671j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    launchActivity.E0 = null;
                } else if (d2Var == launchActivity.C0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.putBoolean("proxy_enabled_calls", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.C0 = null;
                }
                launchActivity.B0.remove(d2Var);
                return;
            case 9:
                no0 no0Var = (no0) obj;
                if (!((boolean[]) obj2)[0]) {
                    no0Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 10:
                l51 l51Var = (l51) obj2;
                if (!((boolean[]) obj)[0]) {
                    l51Var.c(true);
                }
                l51Var.f38399w = null;
                return;
            case 11:
                ii1 ii1Var = (ii1) obj2;
                if (!((boolean[]) obj)[0]) {
                    ii1Var.f34976r0.b();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    c1Var.getClass();
                    runnable2.run();
                }
                c1Var.W = null;
                return;
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 14:
                boolean[] zArr2 = (boolean[]) obj2;
                c1 c1Var2 = (c1) obj;
                if (!zArr2[0]) {
                    c1Var2.run(Boolean.FALSE);
                    zArr2[0] = true;
                    return;
                }
                return;
            case 15:
                boolean[] zArr3 = (boolean[]) obj2;
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    a0Var.run(null);
                    return;
                }
                return;
            default:
                tf.u0 u0Var = (tf.u0) obj2;
                u0Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    u0Var.Q();
                    return;
                }
                return;
        }
    }
}
