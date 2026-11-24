package defpackage;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class fv2 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public fv2(nk3 nk3Var, boolean z, boolean z2, boolean z3, Activity activity) {
        this.a = (byte) 1;
        this.e = nk3Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = activity;
    }

    @Override
    public final void run() {
        c25 c25Var;
        String p;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                bw2 bw2Var = (bw2) obj2;
                HashMap hashMap = (HashMap) obj;
                if (e21.a) {
                    fc4.b("sync contacts by alert");
                }
                bw2Var.F(hashMap, true, this.b, this.c, false, false, this.d);
                return;
            case 1:
                nk3 nk3Var = (nk3) obj2;
                Activity activity = (Activity) obj;
                if (nk3Var.getParentActivity() != null) {
                    nk3Var.v2 = false;
                    boolean z2 = this.c;
                    boolean z3 = this.d;
                    if (z || z2 || z3) {
                        nk3Var.B0 = true;
                        if (z && wn7.E0(activity)) {
                            use.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new h72(new qy1(nk3Var, activity, (byte) 13), (byte) 3));
                            return;
                        } else if (z2 && nk3Var.W1 && nk3Var.getUserConfig().V && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            he heVar = ik.v(activity, new ci3(nk3Var, (byte) 1)).a;
                            nk3Var.V1 = heVar;
                            nk3Var.showDialog(heVar);
                            return;
                        } else if (z3 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof th0) {
                                he x = ((th0) activity).x(2131624119, jb6.M0(2131747032, null));
                                nk3Var.V1 = x;
                                nk3Var.showDialog(x);
                                return;
                            }
                            return;
                        } else {
                            nk3Var.C2(true);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                c cVar = (c) obj2;
                jac jacVar = (jac) obj;
                c.O("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) cVar.e;
                if (cVar.c.f(tL_walletState.public_key)) {
                    c.O("getSecretPhrase: device has secured phrase, requesting");
                    g35 g35Var = cVar.c;
                    byte[] bArr = tL_walletState.public_key;
                    z52 z52Var = new z52(cVar, jacVar, z, (byte) 2);
                    if (bArr == null) {
                        p = "";
                    } else {
                        g35Var.getClass();
                        p = g35.p(bArr);
                    }
                    g35.i.execute(new qf2(g35Var, g35Var.l(), p, true, (qac) z52Var));
                    return;
                } else if (!tL_walletState.backup_enabled) {
                    c.m("getSecretPhrase: no server backup!");
                    jacVar.a(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    c.O("getSecretPhrase: exportSecretPhrase through password request");
                    int i = cVar.a;
                    pb pbVar = new pb((byte) 5);
                    qp0 qp0Var = new qp0(cVar, jacVar, (byte) 2);
                    if (!z) {
                        c25Var = null;
                    } else {
                        c25Var = new c25(cVar, jacVar);
                    }
                    e08.a(i, pbVar, null, null, null, qp0Var, this.c, this.d, new s34((qn4) null, c25Var));
                    return;
                }
        }
    }

    public fv2(Object obj, Object obj2, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }
}
