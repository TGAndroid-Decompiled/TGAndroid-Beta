package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class u7 {
    public final Object f26792a;
    public final TLRPC.Document f26793b;
    public final String f26794c;
    public final int d;
    public final w7 f26795e;

    public u7(w7 w7Var, Object obj, TLRPC.Document document, String str, int i7) {
        this.f26795e = w7Var;
        this.f26792a = obj;
        this.f26793b = document;
        this.f26794c = str;
        this.d = i7;
    }

    public final void a(org.telegram.messenger.i7 r14, long r15, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.u7.a(org.telegram.messenger.i7, long, long):void");
    }

    public final void b(i7 i7Var, int i7) {
        int i10;
        Object obj = this.f26792a;
        w7 w7Var = this.f26795e;
        ConcurrentHashMap concurrentHashMap = w7Var.f27315x;
        String str = this.f26794c;
        concurrentHashMap.remove(str);
        w7.K.d(new mg(w7Var, i7Var.f24307e1, i7Var, 23), 0L);
        pb pbVar = w7Var.F;
        if (pbVar != null) {
            pbVar.f25921b.f23481u.remove(str);
            i10 = i7;
            g0.h3(new l2.x(pbVar, str, i10, pbVar.f25920a, 1));
        } else {
            i10 = i7;
        }
        if (this.f26793b != null && (obj instanceof gj) && i10 == 0) {
            z5 downloadController = w7Var.getDownloadController();
            gj gjVar = (gj) obj;
            downloadController.getClass();
            g0.h3(new l7(downloadController, gjVar, i10, 2));
            downloadController.getMessagesStorage().f27219a.c(new v5(downloadController, gjVar, 2));
        } else if (i10 == -1) {
            LaunchActivity.D(2);
        }
    }

    public final void c(i7 i7Var, File file) {
        Object obj = this.f26792a;
        w7 w7Var = this.f26795e;
        if (!i7Var.f24348y && i7Var.f24350z) {
            w7.K.d(new mg(w7Var, i7Var.f24307e1, i7Var, 23), 0L);
            return;
        }
        e8 E = w7.E(obj);
        if (E != null) {
            f8 f8Var = w7Var.getFileLoader().d;
            f8Var.getClass();
            if (file != null) {
                f8Var.h(new mg(f8Var, file, E, 24));
            }
        }
        if (obj instanceof gj) {
            gj gjVar = (gj) obj;
            if (this.f26793b != null && gjVar.P) {
                z5 downloadController = w7Var.getDownloadController();
                downloadController.getClass();
                if (gjVar.F0() != null) {
                    g0.h3(new u5(downloadController, gjVar.F0(), gjVar, 0));
                }
            }
        }
        if (!i7Var.f24348y) {
            w7Var.f27315x.remove(this.f26794c);
            pb pbVar = w7Var.F;
            if (pbVar != null) {
                String str = this.f26794c;
                Object obj2 = this.f26792a;
                int i7 = this.d;
                pbVar.f25921b.f23481u.remove(str);
                g0.h3(new oi.e0(pbVar, file, str, pbVar.f25920a, obj2, i7));
            }
        }
        w7.K.d(new mg(w7Var, i7Var.f24307e1, i7Var, 23), 0L);
    }
}
