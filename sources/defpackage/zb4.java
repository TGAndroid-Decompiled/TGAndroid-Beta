package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class zb4 {
    public final Object a;
    public final TLRPC.Document b;
    public final String c;
    public final byte d;
    public final bc4 e;

    public zb4(bc4 bc4Var, Object obj, TLRPC.Document document, String str, int i) {
        this.e = bc4Var;
        this.a = obj;
        this.b = document;
        this.c = str;
        this.d = i;
    }

    public final void a(defpackage.lb4 r14, long r15, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb4.a(lb4, long, long):void");
    }

    public final void b(lb4 lb4Var, int i) {
        int i2;
        Object obj = this.a;
        bc4 bc4Var = this.e;
        ConcurrentHashMap concurrentHashMap = bc4Var.x;
        String str = this.c;
        concurrentHashMap.remove(str);
        bc4.K.d(new pz2(bc4Var, lb4Var.e1, lb4Var, (byte) 26), 0L);
        pm5 pm5Var = bc4Var.F;
        if (pm5Var != null) {
            pm5Var.b.u.remove(str);
            i2 = i;
            gm.c3(new zq1(pm5Var, str, i2, pm5Var.a, (byte) 6));
        } else {
            i2 = i;
        }
        if (this.b != null && (obj instanceof k47) && i2 == 0) {
            er3 downloadController = bc4Var.getDownloadController();
            k47 k47Var = (k47) obj;
            downloadController.getClass();
            gm.c3(new wc7(downloadController, k47Var, i2, (byte) 22));
            downloadController.getMessagesStorage().a.c(new ar3(downloadController, k47Var, (byte) 2));
        } else if (i2 == -1) {
            LaunchActivity.F(2);
        }
    }

    public final void c(lb4 lb4Var, File file) {
        Object obj = this.a;
        bc4 bc4Var = this.e;
        if (!lb4Var.y && lb4Var.z) {
            bc4.K.d(new pz2(bc4Var, lb4Var.e1, lb4Var, (byte) 26), 0L);
            return;
        }
        kc4 E = bc4.E(obj);
        if (E != null) {
            lc4 lc4Var = bc4Var.getFileLoader().d;
            lc4Var.getClass();
            if (file != null) {
                lc4Var.h(new pz2(lc4Var, file, E, (byte) 27));
            }
        }
        if (obj instanceof k47) {
            k47 k47Var = (k47) obj;
            if (this.b != null && k47Var.P) {
                er3 downloadController = bc4Var.getDownloadController();
                downloadController.getClass();
                if (k47Var.F0() != null) {
                    gm.c3(new zq3(downloadController, k47Var.F0(), k47Var, (byte) 0));
                }
            }
        }
        if (!lb4Var.y) {
            bc4Var.x.remove(this.c);
            pm5 pm5Var = bc4Var.F;
            if (pm5Var != null) {
                String str = this.c;
                Object obj2 = this.a;
                byte b = this.d;
                pm5Var.b.u.remove(str);
                gm.c3(new v52(pm5Var, file, str, pm5Var.a, obj2, b));
            }
        }
        bc4.K.d(new pz2(bc4Var, lb4Var.e1, lb4Var, (byte) 26), 0L);
    }
}
