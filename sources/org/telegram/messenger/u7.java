package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class u7 {
    public final Object f25727a;
    public final TLRPC.Document f25728b;
    public final String f25729c;
    public final int d;
    public final w7 f25730e;

    public u7(w7 w7Var, Object obj, TLRPC.Document document, String str, int i7) {
        this.f25730e = w7Var;
        this.f25727a = obj;
        this.f25728b = document;
        this.f25729c = str;
        this.d = i7;
    }

    public final void a(org.telegram.messenger.i7 r14, long r15, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.u7.a(org.telegram.messenger.i7, long, long):void");
    }

    public final void b(i7 i7Var, int i7) {
        int i10;
        Object obj = this.f25727a;
        w7 w7Var = this.f25730e;
        ConcurrentHashMap concurrentHashMap = w7Var.f26261x;
        String str = this.f25729c;
        concurrentHashMap.remove(str);
        w7.J.d(new ng(w7Var, i7Var.f23083e1, i7Var, 23), 0L);
        qb qbVar = w7Var.E;
        if (qbVar != null) {
            qbVar.f24676b.f22627u.remove(str);
            i10 = i7;
            g0.h3(new l2.a0(qbVar, str, i10, qbVar.f24675a, 1));
        } else {
            i10 = i7;
        }
        if (this.f25728b != null && (obj instanceof ij) && i10 == 0) {
            z5 downloadController = w7Var.getDownloadController();
            ij ijVar = (ij) obj;
            downloadController.getClass();
            g0.h3(new k7(downloadController, ijVar, i10, 2));
            downloadController.getMessagesStorage().f26688a.c(new v5(downloadController, ijVar, 2));
        } else if (i10 == -1) {
            LaunchActivity.D(2);
        }
    }

    public final void c(i7 i7Var, File file) {
        Object obj = this.f25727a;
        w7 w7Var = this.f25730e;
        if (!i7Var.f23124y && i7Var.f23126z) {
            w7.J.d(new ng(w7Var, i7Var.f23083e1, i7Var, 23), 0L);
            return;
        }
        e8 E = w7.E(obj);
        if (E != null) {
            f8 f8Var = w7Var.getFileLoader().d;
            f8Var.getClass();
            if (file != null) {
                f8Var.h(new ng(f8Var, file, E, 24));
            }
        }
        if (obj instanceof ij) {
            ij ijVar = (ij) obj;
            if (this.f25728b != null && ijVar.P) {
                z5 downloadController = w7Var.getDownloadController();
                downloadController.getClass();
                if (ijVar.F0() != null) {
                    g0.h3(new u5(downloadController, ijVar.F0(), ijVar, 0));
                }
            }
        }
        if (!i7Var.f23124y) {
            w7Var.f26261x.remove(this.f25729c);
            qb qbVar = w7Var.E;
            if (qbVar != null) {
                String str = this.f25729c;
                Object obj2 = this.f25727a;
                int i7 = this.d;
                qbVar.f24676b.f22627u.remove(str);
                g0.h3(new li.g0(qbVar, file, str, qbVar.f24675a, obj2, i7));
            }
        }
        w7.J.d(new ng(w7Var, i7Var.f23083e1, i7Var, 23), 0L);
    }
}
