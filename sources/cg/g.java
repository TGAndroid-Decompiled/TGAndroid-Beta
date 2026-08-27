package cg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import gh.z5;
import java.util.ArrayList;
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
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ib0;
import org.telegram.ui.lh1;
import org.telegram.ui.p41;

public final class g implements DialogInterface.OnDismissListener {

    public final int f2684a;

    public final Object f2685b;

    public final Object f2686c;

    public g(int i10, Object obj, Object obj2) {
        this.f2684a = i10;
        this.f2685b = obj;
        this.f2686c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        int i10 = this.f2684a;
        Object obj = this.f2686c;
        Object obj2 = this.f2685b;
        switch (i10) {
            case 0:
                b2 b2Var = (b2) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    b2Var.run();
                }
                break;
            case 1:
                z5 z5Var = (z5) obj2;
                if (!((boolean[]) obj)[0]) {
                    z5Var.run(Boolean.FALSE, null);
                }
                break;
            case 2:
                boolean[] zArr = (boolean[]) obj2;
                gh.i iVar = (gh.i) obj;
                if (!zArr[0]) {
                    iVar.run(Boolean.FALSE);
                    zArr[0] = true;
                }
                break;
            case 3:
                boolean[] zArr2 = (boolean[]) obj2;
                e1 e1Var = (e1) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    e1Var.run(null);
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                n2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                n2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == n2Var.visibleDialog) {
                    n2Var.visibleDialog = null;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                org.telegram.ui.ActionBar.l2 l2Var = (org.telegram.ui.ActionBar.l2) obj;
                n2Var2.onPause();
                n2Var2.onFragmentDestroy();
                if (l2Var != null && (runnable = l2Var.f23620b) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                q0.a aVar = (q0.a) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    aVar.accept(Boolean.FALSE);
                }
                break;
            case 7:
                AndroidUtilities.hideKeyboard((EditText) obj2);
                AndroidUtilities.hideKeyboard((EditText) obj);
                break;
            case 8:
                ((ag.n0) obj2).run(Integer.valueOf(((fc0) obj).getValue()));
                break;
            case 9:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.f35468x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj;
                if (b2Var2 == launchActivity.D0) {
                    ActionBarLayout actionBarLayout = launchActivity.m0;
                    org.telegram.ui.ActionBar.n2 lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            ec ecVarQ = mc.a0(lastFragment).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.G0 : launchActivity.F0));
                            ecVarQ.f28020j = 5000;
                            ecVarQ.j();
                        } else {
                            ec ecVarQ2 = new mc(ab.a(launchActivity), null).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.G0 : launchActivity.F0));
                            ecVarQ2.f28020j = 5000;
                            ecVarQ2.j();
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    launchActivity.D0 = null;
                } else if (b2Var2 == launchActivity.B0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                    editorEdit.putBoolean("proxy_enabled", false);
                    editorEdit.putBoolean("proxy_enabled_calls", false);
                    editorEdit.commit();
                    ConnectionsManager.setProxySettings(false, "", 1080, "", "", "");
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.B0 = null;
                }
                launchActivity.A0.remove(b2Var2);
                break;
            case 11:
                ib0 ib0Var = (ib0) obj;
                if (!((boolean[]) obj2)[0]) {
                    ib0Var.run(Boolean.FALSE);
                    break;
                }
                break;
            case 12:
                p41 p41Var = (p41) obj2;
                if (!((boolean[]) obj)[0]) {
                    p41Var.c(true);
                }
                p41Var.f43618w = null;
                break;
            case 13:
                lh1 lh1Var = (lh1) obj2;
                if (!((boolean[]) obj)[0]) {
                    lh1Var.f40119q0.b();
                }
                break;
            case 14:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                z0Var.getClass();
                if (!((AtomicBoolean) obj2).get()) {
                    z0Var.v("popup_closed", new JSONObject());
                }
                z0Var.V = null;
                z0Var.f44058a0 = System.currentTimeMillis();
                break;
            case 15:
                org.telegram.ui.web.z0 z0Var2 = (org.telegram.ui.web.z0) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    z0Var2.getClass();
                    runnable2.run();
                }
                z0Var2.V = null;
                break;
            case 16:
                boolean[] zArr3 = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    jsPromptResult.cancel();
                }
                break;
            default:
                pf.u0 u0Var = (pf.u0) obj2;
                u0Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    u0Var.Q();
                }
                break;
        }
    }

    public g(org.telegram.ui.web.z0 z0Var, AtomicBoolean atomicBoolean) {
        this.f2684a = 14;
        this.f2686c = z0Var;
        this.f2685b = atomicBoolean;
    }
}
