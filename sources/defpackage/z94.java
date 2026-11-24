package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class z94 {
    public final Object a;
    public final TLRPC.Document b;
    public final String c;
    public final byte d;
    public final ba4 e;

    public z94(ba4 ba4Var, Object obj, TLRPC.Document document, String str, int i) {
        this.e = ba4Var;
        this.a = obj;
        this.b = document;
        this.c = str;
        this.d = i;
    }

    public final void a(defpackage.l94 r14, long r15, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z94.a(l94, long, long):void");
    }

    public final void b(l94 l94Var, int i) {
        int i2;
        Object obj = this.a;
        ba4 ba4Var = this.e;
        ConcurrentHashMap concurrentHashMap = ba4Var.x;
        String str = this.c;
        concurrentHashMap.remove(str);
        ba4.K.d(new mg3(ba4Var, l94Var.e1, l94Var, (byte) 24), 0L);
        pk5 pk5Var = ba4Var.F;
        if (pk5Var != null) {
            pk5Var.b.u.remove(str);
            i2 = i;
            gl.c3(new mp1(pk5Var, str, i2, pk5Var.a, (byte) 6));
        } else {
            i2 = i;
        }
        if (this.b != null && (obj instanceof k27) && i2 == 0) {
            up3 downloadController = ba4Var.getDownloadController();
            k27 k27Var = (k27) obj;
            downloadController.getClass();
            gl.c3(new va7(downloadController, k27Var, i2, (byte) 22));
            downloadController.getMessagesStorage().a.c(new qp3(downloadController, k27Var, (byte) 2));
        } else if (i2 == -1) {
            LaunchActivity.E(2);
        }
    }

    public final void c(l94 l94Var, File file) {
        Object obj = this.a;
        ba4 ba4Var = this.e;
        if (!l94Var.y && l94Var.z) {
            ba4.K.d(new mg3(ba4Var, l94Var.e1, l94Var, (byte) 24), 0L);
            return;
        }
        ka4 E = ba4.E(obj);
        if (E != null) {
            la4 la4Var = ba4Var.getFileLoader().d;
            la4Var.getClass();
            if (file != null) {
                la4Var.h(new mg3(la4Var, file, E, (byte) 25));
            }
        }
        if (obj instanceof k27) {
            k27 k27Var = (k27) obj;
            if (this.b != null && k27Var.P) {
                up3 downloadController = ba4Var.getDownloadController();
                downloadController.getClass();
                if (k27Var.F0() != null) {
                    gl.c3(new pp3(downloadController, k27Var.F0(), k27Var, (byte) 0));
                }
            }
        }
        if (!l94Var.y) {
            ba4Var.x.remove(this.c);
            pk5 pk5Var = ba4Var.F;
            if (pk5Var != null) {
                String str = this.c;
                Object obj2 = this.a;
                byte b = this.d;
                pk5Var.b.u.remove(str);
                gl.c3(new k42(pk5Var, file, str, pk5Var.a, obj2, b));
            }
        }
        ba4.K.d(new mg3(ba4Var, l94Var.e1, l94Var, (byte) 24), 0L);
    }
}
