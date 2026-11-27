package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class vb4 {
    public final Object a;
    public final TLRPC.Document b;
    public final String c;
    public final byte d;
    public final xb4 e;

    public vb4(xb4 xb4Var, Object obj, TLRPC.Document document, String str, int i) {
        this.e = xb4Var;
        this.a = obj;
        this.b = document;
        this.c = str;
        this.d = i;
    }

    public final void a(defpackage.hb4 r14, long r15, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb4.a(hb4, long, long):void");
    }

    public final void b(hb4 hb4Var, int i) {
        int i2;
        Object obj = this.a;
        xb4 xb4Var = this.e;
        ConcurrentHashMap concurrentHashMap = xb4Var.x;
        String str = this.c;
        concurrentHashMap.remove(str);
        xb4.K.d(new cv2(xb4Var, hb4Var.e1, hb4Var, (byte) 28), 0L);
        sm5 sm5Var = xb4Var.F;
        if (sm5Var != null) {
            sm5Var.b.u.remove(str);
            i2 = i;
            hl.c3(new aq1(sm5Var, str, i2, sm5Var.a, (byte) 6));
        } else {
            i2 = i;
        }
        if (this.b != null && (obj instanceof r47) && i2 == 0) {
            lq3 downloadController = xb4Var.getDownloadController();
            r47 r47Var = (r47) obj;
            downloadController.getClass();
            hl.c3(new bf7(downloadController, r47Var, i2, (byte) 22));
            downloadController.getMessagesStorage().a.c(new gq3(downloadController, r47Var, (byte) 0));
        } else if (i2 == -1) {
            LaunchActivity.F(2);
        }
    }

    public final void c(hb4 hb4Var, File file) {
        Object obj = this.a;
        xb4 xb4Var = this.e;
        if (!hb4Var.y && hb4Var.z) {
            xb4.K.d(new cv2(xb4Var, hb4Var.e1, hb4Var, (byte) 28), 0L);
            return;
        }
        hc4 E = xb4.E(obj);
        if (E != null) {
            ic4 ic4Var = xb4Var.getFileLoader().d;
            ic4Var.getClass();
            if (file != null) {
                ic4Var.h(new cv2(ic4Var, file, E, (byte) 29));
            }
        }
        if (obj instanceof r47) {
            r47 r47Var = (r47) obj;
            if (this.b != null && r47Var.P) {
                lq3 downloadController = xb4Var.getDownloadController();
                downloadController.getClass();
                if (r47Var.F0() != null) {
                    hl.c3(new iq3(downloadController, r47Var.F0(), r47Var, (byte) 1));
                }
            }
        }
        if (!hb4Var.y) {
            xb4Var.x.remove(this.c);
            sm5 sm5Var = xb4Var.F;
            if (sm5Var != null) {
                String str = this.c;
                Object obj2 = this.a;
                byte b = this.d;
                sm5Var.b.u.remove(str);
                hl.c3(new a52(sm5Var, file, str, sm5Var.a, obj2, b));
            }
        }
        xb4.K.d(new cv2(xb4Var, hb4Var.e1, hb4Var, (byte) 28), 0L);
    }
}
