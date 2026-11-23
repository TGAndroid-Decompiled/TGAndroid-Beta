package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.hh0;
public final class k4 implements Runnable {
    public final int f25075a;
    public final boolean f25076b;
    public final boolean f25077c;
    public final boolean d;
    public final Object f25078e;
    public final Object f25079f;

    public k4(Object obj, Object obj2, boolean z10, boolean z11, boolean z12, int i7) {
        this.f25075a = i7;
        this.f25078e = obj;
        this.f25079f = obj2;
        this.f25076b = z10;
        this.f25077c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.v vVar;
        String p10;
        int i7 = this.f25075a;
        boolean z10 = this.f25076b;
        Object obj = this.f25079f;
        Object obj2 = this.f25078e;
        switch (i7) {
            case 0:
                i5 i5Var = (i5) obj2;
                HashMap hashMap = (HashMap) obj;
                if (s2.f26829a) {
                    a8.b("sync contacts by alert");
                }
                i5Var.F(hashMap, true, this.f25076b, this.f25077c, false, false, this.d);
                return;
            case 1:
                org.telegram.ui.bx bxVar = (org.telegram.ui.bx) obj2;
                Activity activity = (Activity) obj;
                if (bxVar.getParentActivity() != null) {
                    bxVar.f46629v2 = false;
                    boolean z11 = this.f25077c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        bxVar.B0 = true;
                        if (z10 && hh0.K0(activity)) {
                            c8.oa.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.bn(new org.telegram.ui.Components.ph(15, bxVar, activity), 1));
                            return;
                        } else if (z11 && bxVar.W1 && bxVar.getUserConfig().V && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.b5.v(activity, new org.telegram.ui.wu(bxVar, 1)).f28835a;
                            bxVar.V1 = t1Var;
                            bxVar.showDialog(t1Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.g5) {
                                org.telegram.ui.ActionBar.t1 v = ((org.telegram.ui.g5) activity).v(2131624119, gd.N0(2131747105, null));
                                bxVar.V1 = v;
                                bxVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            bxVar.u3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj2;
                p10 p10Var = (p10) obj;
                org.telegram.ui.Wallet.v0.P("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) v0Var.f45258e;
                if (v0Var.f45257c.f(tL_walletState.public_key)) {
                    org.telegram.ui.Wallet.v0.P("getSecretPhrase: device has secured phrase, requesting");
                    org.telegram.ui.Wallet.a1 a1Var = v0Var.f45257c;
                    byte[] bArr = tL_walletState.public_key;
                    hi.fc fcVar = new hi.fc(v0Var, p10Var, z10, 5);
                    if (bArr == null) {
                        p10 = "";
                    } else {
                        a1Var.getClass();
                        p10 = org.telegram.ui.Wallet.a1.p(bArr);
                    }
                    org.telegram.ui.Wallet.a1.f44035i.execute(new org.telegram.ui.Components.r2(a1Var, a1Var.l(), p10, true, (w10) fcVar));
                    return;
                } else if (!tL_walletState.backup_enabled) {
                    org.telegram.ui.Wallet.v0.n("getSecretPhrase: no server backup!");
                    p10Var.a(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    org.telegram.ui.Wallet.v0.P("getSecretPhrase: exportSecretPhrase through password request");
                    int i10 = v0Var.f45255a;
                    ci.y yVar = new ci.y(9);
                    fi.b0 b0Var = new fi.b0(4, v0Var, p10Var);
                    if (!z10) {
                        vVar = null;
                    } else {
                        vVar = new org.telegram.ui.Wallet.v(v0Var, p10Var);
                    }
                    org.telegram.ui.Wallet.o3.a(i10, yVar, null, null, null, b0Var, this.f25077c, this.d, new m.b3(null, vVar));
                    return;
                }
        }
    }

    public k4(org.telegram.ui.bx bxVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f25075a = 1;
        this.f25078e = bxVar;
        this.f25076b = z10;
        this.f25077c = z11;
        this.d = z12;
        this.f25079f = activity;
    }
}
