package mg;

import ag.m2;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.wb;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.r9;
import org.telegram.ui.be1;
import org.telegram.ui.tm0;
import org.telegram.ui.y11;
import ph.u3;
public final class g implements DialogInterface.OnDismissListener {
    public final int f13117a;
    public final Object f13118b;
    public final Object f13119c;

    public g(int i10, Object obj, Object obj2) {
        this.f13117a = i10;
        this.f13118b = obj;
        this.f13119c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        k2 lastFragment;
        HashMap hashMap;
        HashMap hashMap2;
        r9 r9Var;
        int i10 = this.f13117a;
        Object obj = this.f13119c;
        Object obj2 = this.f13118b;
        switch (i10) {
            case 0:
                bi.e eVar = (bi.e) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    eVar.run();
                    return;
                }
                return;
            case 1:
                k2 k2Var = (k2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                k2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                k2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == k2Var.visibleDialog) {
                    k2Var.visibleDialog = null;
                    return;
                }
                return;
            case 2:
                k2 k2Var2 = (k2) obj2;
                org.telegram.ui.ActionBar.i2 i2Var = (org.telegram.ui.ActionBar.i2) obj;
                k2Var2.onPause();
                k2Var2.onFragmentDestroy();
                if (i2Var != null && (runnable = i2Var.f20390b) != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.i0.v1((EditText) obj2);
                org.telegram.messenger.i0.v1((EditText) obj);
                return;
            case 4:
                q0.a aVar = (q0.a) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    aVar.accept(Boolean.FALSE);
                    return;
                }
                return;
            case 5:
                ((ph.h1) obj2).a(Integer.valueOf(((ac0) obj).getValue()));
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.f33321y;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj;
                if (x1Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.f33377q0;
                    if (actionBarLayout == null) {
                        lastFragment = null;
                    } else {
                        lastFragment = actionBarLayout.getLastFragment();
                    }
                    try {
                        String str = cd.D0().B.f19497c;
                        if (lastFragment != null) {
                            cc a02 = cc.a0(lastFragment);
                            if (str.equals("en")) {
                                hashMap2 = launchActivity.K0;
                            } else {
                                hashMap2 = launchActivity.J0;
                            }
                            wb Q = a02.Q(2131624101, 36, LaunchActivity.U(2131752545, "ChangeLanguageLater", hashMap2));
                            Q.f32135j = 5000;
                            Q.j();
                        } else {
                            cc ccVar = new cc(ra.a(launchActivity), null);
                            if (str.equals("en")) {
                                hashMap = launchActivity.K0;
                            } else {
                                hashMap = launchActivity.J0;
                            }
                            wb Q2 = ccVar.Q(2131624101, 36, LaunchActivity.U(2131752545, "ChangeLanguageLater", hashMap));
                            Q2.f32135j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    launchActivity.H0 = null;
                } else if (x1Var == launchActivity.F0) {
                    vp.d1();
                    SharedPreferences.Editor edit = vp.d1().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    zs.e().k(277, new Object[0]);
                    launchActivity.F0 = null;
                }
                launchActivity.E0.remove(x1Var);
                return;
            case 8:
                tm0 tm0Var = (tm0) obj;
                if (!((boolean[]) obj2)[0]) {
                    tm0Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 9:
                y11 y11Var = (y11) obj2;
                if (!((boolean[]) obj)[0]) {
                    y11Var.c(true);
                }
                y11Var.f36911x = null;
                return;
            case 10:
                be1 be1Var = (be1) obj2;
                if (!((boolean[]) obj)[0]) {
                    be1Var.f36234u0.b();
                    return;
                }
                return;
            case 11:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                k2 T = LaunchActivity.T();
                if (T != null) {
                    if (user != null) {
                        r9Var = new r9(user);
                    } else {
                        r9Var = new r9(wallettransactionpeeruser.address);
                        r9Var.z0(wallettransactionpeeruser.domain);
                    }
                    T.presentFragment(r9Var);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    z0Var.getClass();
                    runnable2.run();
                }
                z0Var.f43262c0 = null;
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
                ((boolean[]) obj2)[0] = true;
                Runnable runnable3 = ((Runnable[]) obj)[0];
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 15:
                u3 u3Var = (u3) obj2;
                if (!((boolean[]) obj)[0]) {
                    u3Var.a(Boolean.FALSE, null);
                    return;
                }
                return;
            case 16:
                boolean[] zArr2 = (boolean[]) obj2;
                m2 m2Var = (m2) obj;
                if (!zArr2[0]) {
                    m2Var.a(Boolean.FALSE);
                    zArr2[0] = true;
                    return;
                }
                return;
            case 17:
                boolean[] zArr3 = (boolean[]) obj2;
                org.telegram.ui.web.v vVar = (org.telegram.ui.web.v) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    vVar.a(null);
                    return;
                }
                return;
            default:
                zf.x0 x0Var = (zf.x0) obj2;
                x0Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    x0Var.Q();
                    return;
                }
                return;
        }
    }
}
