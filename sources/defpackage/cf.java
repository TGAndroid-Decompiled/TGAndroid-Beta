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
public final class cf implements DialogInterface.OnDismissListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public cf(Object obj, Object obj2, byte b) {
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
        qpc qpcVar;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gl.t1((EditText) obj2);
                gl.t1((EditText) obj);
                return;
            case 1:
                vs2 vs2Var = (vs2) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    vs2Var.accept(Boolean.FALSE);
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
                ag0 ag0Var = (ag0) obj;
                dVar2.onPause();
                dVar2.onFragmentDestroy();
                if (ag0Var != null && (runnable = ag0Var.b) != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                et etVar = (et) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    etVar.run();
                    return;
                }
                return;
            case 5:
                boolean[] zArr = (boolean[]) obj2;
                au0 au0Var = (au0) obj;
                if (!zArr[0]) {
                    au0Var.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            case 6:
                boolean[] zArr2 = (boolean[]) obj2;
                yt0 yt0Var = (yt0) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    yt0Var.a(null);
                    return;
                }
                return;
            case 7:
                ((Runnable) obj).run();
                ((hv0) obj2).d0 = null;
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
                hd hdVar = (hd) obj;
                String str = LaunchActivity.C1;
                if (hdVar == launchActivity.G0) {
                    ActionBarLayout actionBarLayout = launchActivity.p0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str2 = k96.D0().B.c;
                        if (lastFragment != null) {
                            u21 b0 = u21.b0(lastFragment);
                            if (str2.equals("en")) {
                                hashMap2 = launchActivity.J0;
                            } else {
                                hashMap2 = launchActivity.I0;
                            }
                            m21 Q = b0.Q(2131624104, 36, LaunchActivity.T(2131752533, "ChangeLanguageLater", hashMap2));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            u21 u21Var = new u21(f11.a(launchActivity), null);
                            if (str2.equals("en")) {
                                hashMap = launchActivity.J0;
                            } else {
                                hashMap = launchActivity.I0;
                            }
                            m21 Q2 = u21Var.Q(2131624104, 36, LaunchActivity.T(2131752533, "ChangeLanguageLater", hashMap));
                            Q2.j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                    launchActivity.G0 = null;
                } else if (hdVar == launchActivity.E0) {
                    na7.c1();
                    SharedPreferences.Editor edit = na7.c1().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    kk7.e().k(280, new Object[0]);
                    launchActivity.E0 = null;
                }
                launchActivity.D0.remove(hdVar);
                return;
            case 11:
                kz6 kz6Var = (kz6) obj2;
                if (!((boolean[]) obj)[0]) {
                    kz6Var.Q();
                    return;
                }
                return;
            case 12:
                vm1 vm1Var = (vm1) obj;
                if (!((boolean[]) obj2)[0]) {
                    vm1Var.run();
                    return;
                }
                return;
            case 13:
                xz7 xz7Var = (xz7) obj;
                if (!((boolean[]) obj2)[0]) {
                    xz7Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 14:
                jw9 jw9Var = (jw9) obj2;
                if (!((boolean[]) obj)[0]) {
                    jw9Var.a(true);
                }
                jw9Var.x = null;
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
                w0a w0aVar = (w0a) obj2;
                if (!((boolean[]) obj)[0]) {
                    w0aVar.a(Boolean.FALSE, null);
                    return;
                }
                return;
            case 17:
                hgc hgcVar = (hgc) obj2;
                if (!((boolean[]) obj)[0]) {
                    hgcVar.u0.b();
                    return;
                }
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                d S = LaunchActivity.S();
                if (S != null) {
                    if (user != null) {
                        qpcVar = new qpc(user);
                    } else {
                        qpcVar = new qpc(wallettransactionpeeruser.address);
                        qpcVar.z0(wallettransactionpeeruser.domain);
                    }
                    S.presentFragment(qpcVar);
                    return;
                }
                return;
        }
    }
}
