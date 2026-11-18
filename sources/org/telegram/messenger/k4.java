package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ih0;
public final class k4 implements Runnable {
    public final int f24979a;
    public final boolean f24980b;
    public final boolean f24981c;
    public final boolean d;
    public final Object f24982e;
    public final Object f24983f;

    public k4(Object obj, Object obj2, boolean z10, boolean z11, boolean z12, int i7) {
        this.f24979a = i7;
        this.f24982e = obj;
        this.f24983f = obj2;
        this.f24980b = z10;
        this.f24981c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.u uVar;
        String p10;
        int i7 = this.f24979a;
        boolean z10 = this.f24980b;
        Object obj = this.f24983f;
        Object obj2 = this.f24982e;
        switch (i7) {
            case 0:
                i5 i5Var = (i5) obj2;
                HashMap hashMap = (HashMap) obj;
                if (s2.f26723a) {
                    a8.b("sync contacts by alert");
                }
                i5Var.F(hashMap, true, this.f24980b, this.f24981c, false, false, this.d);
                return;
            case 1:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) obj2;
                Activity activity = (Activity) obj;
                if (cxVar.getParentActivity() != null) {
                    cxVar.f46763v2 = false;
                    boolean z11 = this.f24981c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        cxVar.B0 = true;
                        if (z10 && ih0.K0(activity)) {
                            c8.na.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.bn(new org.telegram.ui.Components.ph(14, cxVar, activity), 1));
                            return;
                        } else if (z11 && cxVar.W1 && cxVar.getUserConfig().V && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.b5.v(activity, new org.telegram.ui.xu(cxVar, 1)).f28746a;
                            cxVar.V1 = u1Var;
                            cxVar.showDialog(u1Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.g5) {
                                org.telegram.ui.ActionBar.u1 v = ((org.telegram.ui.g5) activity).v(2131624119, gd.M0(2131747106, null));
                                cxVar.V1 = v;
                                cxVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            cxVar.u3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj2;
                q10 q10Var = (q10) obj;
                org.telegram.ui.Wallet.u0.P("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) u0Var.f45086e;
                if (u0Var.f45085c.f(tL_walletState.public_key)) {
                    org.telegram.ui.Wallet.u0.P("getSecretPhrase: device has secured phrase, requesting");
                    org.telegram.ui.Wallet.z0 z0Var = u0Var.f45085c;
                    byte[] bArr = tL_walletState.public_key;
                    hi.lb lbVar = new hi.lb(u0Var, q10Var, z10, 5);
                    if (bArr == null) {
                        p10 = "";
                    } else {
                        z0Var.getClass();
                        p10 = org.telegram.ui.Wallet.z0.p(bArr);
                    }
                    org.telegram.ui.Wallet.z0.f45333i.execute(new org.telegram.ui.Components.r2(z0Var, z0Var.l(), p10, true, (x10) lbVar));
                    return;
                } else if (!tL_walletState.backup_enabled) {
                    org.telegram.ui.Wallet.u0.n("getSecretPhrase: no server backup!");
                    q10Var.a(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    org.telegram.ui.Wallet.u0.P("getSecretPhrase: exportSecretPhrase through password request");
                    int i10 = u0Var.f45083a;
                    ci.y yVar = new ci.y(9);
                    fi.b0 b0Var = new fi.b0(4, u0Var, q10Var);
                    if (!z10) {
                        uVar = null;
                    } else {
                        uVar = new org.telegram.ui.Wallet.u(u0Var, q10Var);
                    }
                    org.telegram.ui.Wallet.n3.a(i10, yVar, null, null, null, b0Var, this.f24981c, this.d, new m.b3(null, uVar));
                    return;
                }
        }
    }

    public k4(org.telegram.ui.cx cxVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f24979a = 1;
        this.f24982e = cxVar;
        this.f24980b = z10;
        this.f24981c = z11;
        this.d = z12;
        this.f24983f = activity;
    }
}
