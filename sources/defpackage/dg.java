package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
public final class dg implements DialogInterface.OnDismissListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public dg(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        d lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        rrc rrcVar;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gm.t1((EditText) obj2);
                gm.t1((EditText) obj);
                return;
            case 1:
                gu2 gu2Var = (gu2) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    gu2Var.accept(Boolean.FALSE);
                    return;
                }
                return;
            case 2:
                d dVar = (d) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                dVar.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == dVar.visibleDialog) {
                    dVar.visibleDialog = null;
                    return;
                }
                return;
            case 3:
                d dVar2 = (d) obj2;
                bh0 bh0Var = (bh0) obj;
                dVar2.onPause();
                dVar2.onFragmentDestroy();
                if (bh0Var != null && (runnable = bh0Var.b) != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                fu fuVar = (fu) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    fuVar.run();
                    return;
                }
                return;
            case 5:
                boolean[] zArr = (boolean[]) obj2;
                jv0 jv0Var = (jv0) obj;
                if (!zArr[0]) {
                    jv0Var.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            case 6:
                boolean[] zArr2 = (boolean[]) obj2;
                hv0 hv0Var = (hv0) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    hv0Var.a(null);
                    return;
                }
                return;
            case 7:
                ((Runnable) obj).run();
                ((qw0) obj2).d0 = null;
                return;
            case 8:
                boolean[] zArr3 = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 9:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.y;
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                return;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                he heVar = (he) obj;
                String str = LaunchActivity.C1;
                if (heVar == launchActivity.G0) {
                    ActionBarLayout actionBarLayout = launchActivity.p0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str2 = jb6.D0().B.c;
                        if (lastFragment != null) {
                            c41 b0 = c41.b0(lastFragment);
                            if (str2.equals("en")) {
                                hashMap2 = launchActivity.J0;
                            } else {
                                hashMap2 = launchActivity.I0;
                            }
                            u31 Q = b0.Q(2131624104, 36, LaunchActivity.T(2131752498, "ChangeLanguageLater", hashMap2));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            c41 c41Var = new c41(n21.a(launchActivity), null);
                            if (str2.equals("en")) {
                                hashMap = launchActivity.J0;
                            } else {
                                hashMap = launchActivity.I0;
                            }
                            u31 Q2 = c41Var.Q(2131624104, 36, LaunchActivity.T(2131752498, "ChangeLanguageLater", hashMap));
                            Q2.j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    launchActivity.G0 = null;
                } else if (heVar == launchActivity.E0) {
                    oc7.d1();
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    nm7.e().k(282, new Object[0]);
                    launchActivity.E0 = null;
                }
                launchActivity.D0.remove(heVar);
                return;
            case 11:
                k17 k17Var = (k17) obj2;
                if (!((boolean[]) obj)[0]) {
                    k17Var.Q();
                    return;
                }
                return;
            case 12:
                ho1 ho1Var = (ho1) obj;
                if (!((boolean[]) obj2)[0]) {
                    ho1Var.run();
                    return;
                }
                return;
            case 13:
                a28 a28Var = (a28) obj;
                if (!((boolean[]) obj2)[0]) {
                    a28Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 14:
                ly9 ly9Var = (ly9) obj2;
                if (!((boolean[]) obj)[0]) {
                    ly9Var.a(true);
                }
                ly9Var.x = null;
                return;
            case 15:
                ((boolean[]) obj2)[0] = true;
                Runnable runnable2 = ((Runnable[]) obj)[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 16:
                y2a y2aVar = (y2a) obj2;
                if (!((boolean[]) obj)[0]) {
                    y2aVar.a(Boolean.FALSE, null);
                    return;
                }
                return;
            case 17:
                iic iicVar = (iic) obj2;
                if (!((boolean[]) obj)[0]) {
                    iicVar.u0.b();
                    return;
                }
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                d S = LaunchActivity.S();
                if (S != null) {
                    if (user != null) {
                        rrcVar = new rrc(user);
                    } else {
                        rrcVar = new rrc(wallettransactionpeeruser.address);
                        rrcVar.A0(wallettransactionpeeruser.domain);
                    }
                    S.presentFragment(rrcVar);
                    return;
                }
                return;
        }
    }
}
