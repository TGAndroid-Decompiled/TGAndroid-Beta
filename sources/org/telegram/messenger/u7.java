package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class u7 {
    public final Object f27131a;
    public final TLRPC.Document f27132b;
    public final String f27133c;
    public final int d;
    public final w7 f27134e;

    public u7(w7 w7Var, Object obj, TLRPC.Document document, String str, int i7) {
        this.f27134e = w7Var;
        this.f27131a = obj;
        this.f27132b = document;
        this.f27133c = str;
        this.d = i7;
    }

    public final void a(org.telegram.messenger.i7 r14, long r15, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.u7.a(org.telegram.messenger.i7, long, long):void");
    }

    public final void b(i7 i7Var, int i7) {
        int i10;
        Object obj = this.f27131a;
        w7 w7Var = this.f27134e;
        ConcurrentHashMap concurrentHashMap = w7Var.f27666x;
        String str = this.f27133c;
        concurrentHashMap.remove(str);
        w7.K.d(new zf(w7Var, i7Var.f24601e1, i7Var, 23), 0L);
        pb pbVar = w7Var.F;
        if (pbVar != null) {
            pbVar.f26259b.f23867u.remove(str);
            i10 = i7;
            g0.g3(new l2.x(pbVar, str, i10, pbVar.f26258a, 1));
        } else {
            i10 = i7;
        }
        if (this.f27132b != null && (obj instanceof gj) && i10 == 0) {
            a6 downloadController = w7Var.getDownloadController();
            gj gjVar = (gj) obj;
            downloadController.getClass();
            g0.g3(new l7(downloadController, gjVar, i10, 2));
            downloadController.getMessagesStorage().f27214a.c(new w5(downloadController, gjVar, 2));
        } else if (i10 == -1) {
            LaunchActivity.D(2);
        }
    }

    public final void c(i7 i7Var, File file) {
        Object obj = this.f27131a;
        w7 w7Var = this.f27134e;
        if (!i7Var.f24642y && i7Var.f24644z) {
            w7.K.d(new zf(w7Var, i7Var.f24601e1, i7Var, 23), 0L);
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
            if (this.f27132b != null && gjVar.P) {
                a6 downloadController = w7Var.getDownloadController();
                downloadController.getClass();
                if (gjVar.F0() != null) {
                    g0.g3(new v5(downloadController, gjVar.F0(), gjVar, 0));
                }
            }
        }
        if (!i7Var.f24642y) {
            w7Var.f27666x.remove(this.f27133c);
            pb pbVar = w7Var.F;
            if (pbVar != null) {
                String str = this.f27133c;
                Object obj2 = this.f27131a;
                int i7 = this.d;
                pbVar.f26259b.f23867u.remove(str);
                g0.g3(new bi.v3(pbVar, file, str, pbVar.f26258a, obj2, i7));
            }
        }
        w7.K.d(new zf(w7Var, i7Var.f24601e1, i7Var, 23), 0L);
    }
}
