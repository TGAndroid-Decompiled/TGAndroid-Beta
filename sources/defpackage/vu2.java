package defpackage;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class vu2 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public vu2(uj3 uj3Var, boolean z, boolean z2, boolean z3, Activity activity) {
        this.a = (byte) 1;
        this.e = uj3Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = activity;
    }

    @Override
    public final void run() {
        g25 g25Var;
        String p;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                lv2 lv2Var = (lv2) obj2;
                HashMap hashMap = (HashMap) obj;
                if (f11.a) {
                    cc4.b("sync contacts by alert");
                }
                lv2Var.F(hashMap, true, this.b, this.c, false, false, this.d);
                return;
            case 1:
                uj3 uj3Var = (uj3) obj2;
                Activity activity = (Activity) obj;
                if (uj3Var.getParentActivity() != null) {
                    uj3Var.v2 = false;
                    boolean z2 = this.c;
                    boolean z3 = this.d;
                    if (z || z2 || z3) {
                        uj3Var.B0 = true;
                        if (z && so7.F0(activity)) {
                            jve.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new m62(new rx1(uj3Var, activity, (byte) 13), (byte) 3));
                            return;
                        } else if (z2 && uj3Var.W1 && uj3Var.getUserConfig().V && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            id idVar = jj.v(activity, new qg3(uj3Var, (byte) 0)).a;
                            uj3Var.V1 = idVar;
                            uj3Var.showDialog(idVar);
                            return;
                        } else if (z3 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof ug0) {
                                id x = ((ug0) activity).x(2131624119, ob6.M0(2131747026, null));
                                uj3Var.V1 = x;
                                uj3Var.showDialog(x);
                                return;
                            }
                            return;
                        } else {
                            uj3Var.C2(true);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                c cVar = (c) obj2;
                icc iccVar = (icc) obj;
                c.P("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) cVar.e;
                if (cVar.c.f(tL_walletState.public_key)) {
                    c.P("getSecretPhrase: device has secured phrase, requesting");
                    k35 k35Var = cVar.c;
                    byte[] bArr = tL_walletState.public_key;
                    e52 e52Var = new e52(cVar, iccVar, z, (byte) 2);
                    if (bArr == null) {
                        p = "";
                    } else {
                        k35Var.getClass();
                        p = k35.p(bArr);
                    }
                    k35.i.execute(new re2(k35Var, k35Var.l(), p, true, (pcc) e52Var));
                    return;
                } else if (!tL_walletState.backup_enabled) {
                    c.m("getSecretPhrase: no server backup!");
                    iccVar.a(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    c.P("getSecretPhrase: exportSecretPhrase through password request");
                    int i = cVar.a;
                    sb sbVar = new sb((byte) 5);
                    qo0 qo0Var = new qo0(cVar, iccVar, (byte) 2);
                    if (!z) {
                        g25Var = null;
                    } else {
                        g25Var = new g25(cVar, iccVar);
                    }
                    i18.a(i, sbVar, null, null, null, qo0Var, this.c, this.d, new c34((rj4) null, g25Var));
                    return;
                }
        }
    }

    public vu2(Object obj, Object obj2, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }
}
