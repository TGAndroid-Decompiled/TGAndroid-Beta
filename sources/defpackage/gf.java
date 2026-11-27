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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
public final class gf implements DialogInterface.OnDismissListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public gf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        e lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        euc eucVar;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hl.t1((EditText) obj2);
                hl.t1((EditText) obj);
                return;
            case 1:
                pt2 pt2Var = (pt2) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    pt2Var.accept(Boolean.FALSE);
                    return;
                }
                return;
            case 2:
                e eVar = (e) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                eVar.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == eVar.visibleDialog) {
                    eVar.visibleDialog = null;
                    return;
                }
                return;
            case 3:
                e eVar2 = (e) obj2;
                bg0 bg0Var = (bg0) obj;
                eVar2.onPause();
                eVar2.onFragmentDestroy();
                if (bg0Var != null && (runnable = bg0Var.b) != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                kt ktVar = (kt) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    ktVar.run();
                    return;
                }
                return;
            case 5:
                boolean[] zArr = (boolean[]) obj2;
                ku0 ku0Var = (ku0) obj;
                if (!zArr[0]) {
                    ku0Var.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            case 6:
                boolean[] zArr2 = (boolean[]) obj2;
                hu0 hu0Var = (hu0) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    hu0Var.a(null);
                    return;
                }
                return;
            case 7:
                ((Runnable) obj).run();
                ((rv0) obj2).d0 = null;
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
                id idVar = (id) obj;
                String str = LaunchActivity.C1;
                if (idVar == launchActivity.G0) {
                    ActionBarLayout actionBarLayout = launchActivity.p0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str2 = ob6.D0().B.c;
                        if (lastFragment != null) {
                            d31 b0 = d31.b0(lastFragment);
                            if (str2.equals("en")) {
                                hashMap2 = launchActivity.J0;
                            } else {
                                hashMap2 = launchActivity.I0;
                            }
                            v21 Q = b0.Q(2131624104, 36, LaunchActivity.T(2131752526, "ChangeLanguageLater", hashMap2));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            d31 d31Var = new d31(o11.a(launchActivity), null);
                            if (str2.equals("en")) {
                                hashMap = launchActivity.J0;
                            } else {
                                hashMap = launchActivity.I0;
                            }
                            v21 Q2 = d31Var.Q(2131624104, 36, LaunchActivity.T(2131752526, "ChangeLanguageLater", hashMap));
                            Q2.j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    launchActivity.G0 = null;
                } else if (idVar == launchActivity.E0) {
                    uc7.e1();
                    SharedPreferences.Editor edit = uc7.e1().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    jn7.e().k(281, new Object[0]);
                    launchActivity.E0 = null;
                }
                launchActivity.D0.remove(idVar);
                return;
            case 11:
                r17 r17Var = (r17) obj2;
                if (!((boolean[]) obj)[0]) {
                    r17Var.Q();
                    return;
                }
                return;
            case 12:
                gn1 gn1Var = (gn1) obj;
                if (!((boolean[]) obj2)[0]) {
                    gn1Var.run();
                    return;
                }
                return;
            case 13:
                d38 d38Var = (d38) obj;
                if (!((boolean[]) obj2)[0]) {
                    d38Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 14:
                c0a c0aVar = (c0a) obj2;
                if (!((boolean[]) obj)[0]) {
                    c0aVar.a(true);
                }
                c0aVar.x = null;
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
                p4a p4aVar = (p4a) obj2;
                if (!((boolean[]) obj)[0]) {
                    p4aVar.a(Boolean.FALSE, null);
                    return;
                }
                return;
            case 17:
                mkc mkcVar = (mkc) obj2;
                if (!((boolean[]) obj)[0]) {
                    mkcVar.u0.b();
                    return;
                }
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                e S = LaunchActivity.S();
                if (S != null) {
                    if (user != null) {
                        eucVar = new euc(user);
                    } else {
                        eucVar = new euc(wallettransactionpeeruser.address);
                        eucVar.A0(wallettransactionpeeruser.domain);
                    }
                    S.presentFragment(eucVar);
                    return;
                }
                return;
        }
    }
}
