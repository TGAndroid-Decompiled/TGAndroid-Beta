package defpackage;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class ut2 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public ut2(cj3 cj3Var, boolean z, boolean z2, boolean z3, Activity activity) {
        this.a = (byte) 1;
        this.e = cj3Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = activity;
    }

    @Override
    public final void run() {
        c05 c05Var;
        String p;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                qu2 qu2Var = (qu2) obj2;
                HashMap hashMap = (HashMap) obj;
                if (w01.a) {
                    fa4.b("sync contacts by alert");
                }
                qu2Var.F(hashMap, true, this.b, this.c, false, false, this.d);
                return;
            case 1:
                cj3 cj3Var = (cj3) obj2;
                Activity activity = (Activity) obj;
                if (cj3Var.getParentActivity() != null) {
                    cj3Var.v2 = false;
                    boolean z2 = this.c;
                    boolean z3 = this.d;
                    if (z || z2 || z3) {
                        cj3Var.B0 = true;
                        if (z && tl7.E0(activity)) {
                            rqe.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new w52(new pz1(cj3Var, activity, (byte) 12), (byte) 3));
                            return;
                        } else if (z2 && cj3Var.W1 && cj3Var.getUserConfig().V && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            hd hdVar = ij.v(activity, new qg3(cj3Var, (byte) 1)).a;
                            cj3Var.V1 = hdVar;
                            cj3Var.showDialog(hdVar);
                            return;
                        } else if (z3 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof tg0) {
                                hd x = ((tg0) activity).x(2131624119, k96.M0(2131747106, null));
                                cj3Var.V1 = x;
                                cj3Var.showDialog(x);
                                return;
                            }
                            return;
                        } else {
                            cj3Var.A2(true);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                c cVar = (c) obj2;
                i8c i8cVar = (i8c) obj;
                c.O("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) cVar.e;
                if (cVar.c.f(tL_walletState.public_key)) {
                    c.O("getSecretPhrase: device has secured phrase, requesting");
                    g15 g15Var = cVar.c;
                    byte[] bArr = tL_walletState.public_key;
                    o42 o42Var = new o42(cVar, i8cVar, z, (byte) 2);
                    if (bArr == null) {
                        p = "";
                    } else {
                        g15Var.getClass();
                        p = g15.p(bArr);
                    }
                    g15.i.execute(new fe2(g15Var, g15Var.l(), p, true, (p8c) o42Var));
                    return;
                } else if (!tL_walletState.backup_enabled) {
                    c.m("getSecretPhrase: no server backup!");
                    i8cVar.a(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    c.O("getSecretPhrase: exportSecretPhrase through password request");
                    int i = cVar.a;
                    pb pbVar = new pb((byte) 5);
                    qo0 qo0Var = new qo0(cVar, i8cVar, (byte) 2);
                    if (!z) {
                        c05Var = null;
                    } else {
                        c05Var = new c05(cVar, i8cVar);
                    }
                    cy7.a(i, pbVar, null, null, null, qo0Var, this.c, this.d, new h24((iu4) null, c05Var));
                    return;
                }
        }
    }

    public ut2(Object obj, Object obj2, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }
}
