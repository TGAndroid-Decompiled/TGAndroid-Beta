package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class u7 {
    public final Object f27167a;
    public final TLRPC.Document f27168b;
    public final String f27169c;
    public final int d;
    public final w7 f27170e;

    public u7(w7 w7Var, Object obj, TLRPC.Document document, String str, int i7) {
        this.f27170e = w7Var;
        this.f27167a = obj;
        this.f27168b = document;
        this.f27169c = str;
        this.d = i7;
    }

    public final void a(org.telegram.messenger.i7 r14, long r15, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.u7.a(org.telegram.messenger.i7, long, long):void");
    }

    public final void b(i7 i7Var, int i7) {
        int i10;
        Object obj = this.f27167a;
        w7 w7Var = this.f27170e;
        ConcurrentHashMap concurrentHashMap = w7Var.f27702x;
        String str = this.f27169c;
        concurrentHashMap.remove(str);
        w7.K.d(new zf(w7Var, i7Var.f24637e1, i7Var, 23), 0L);
        pb pbVar = w7Var.F;
        if (pbVar != null) {
            pbVar.f26295b.f23903u.remove(str);
            i10 = i7;
            g0.g3(new l2.x(pbVar, str, i10, pbVar.f26294a, 1));
        } else {
            i10 = i7;
        }
        if (this.f27168b != null && (obj instanceof gj) && i10 == 0) {
            a6 downloadController = w7Var.getDownloadController();
            gj gjVar = (gj) obj;
            downloadController.getClass();
            g0.g3(new l7(downloadController, gjVar, i10, 2));
            downloadController.getMessagesStorage().f27250a.c(new w5(downloadController, gjVar, 2));
        } else if (i10 == -1) {
            LaunchActivity.D(2);
        }
    }

    public final void c(i7 i7Var, File file) {
        Object obj = this.f27167a;
        w7 w7Var = this.f27170e;
        if (!i7Var.f24678y && i7Var.f24680z) {
            w7.K.d(new zf(w7Var, i7Var.f24637e1, i7Var, 23), 0L);
            return;
        }
        e8 E = w7.E(obj);
        if (E != null) {
            f8 f8Var = w7Var.getFileLoader().d;
            f8Var.getClass();
            if (file != null) {
                f8Var.h(new zf(f8Var, file, E, 24));
            }
        }
        if (obj instanceof gj) {
            gj gjVar = (gj) obj;
            if (this.f27168b != null && gjVar.P) {
                a6 downloadController = w7Var.getDownloadController();
                downloadController.getClass();
                if (gjVar.F0() != null) {
                    g0.g3(new v5(downloadController, gjVar.F0(), gjVar, 0));
                }
            }
        }
        if (!i7Var.f24678y) {
            w7Var.f27702x.remove(this.f27169c);
            pb pbVar = w7Var.F;
            if (pbVar != null) {
                String str = this.f27169c;
                Object obj2 = this.f27167a;
                int i7 = this.d;
                pbVar.f26295b.f23903u.remove(str);
                g0.g3(new bi.t3(pbVar, file, str, pbVar.f26294a, obj2, i7));
            }
        }
        w7.K.d(new zf(w7Var, i7Var.f24637e1, i7Var, 23), 0L);
    }
}
