package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class u7 {
    public final Object f27129a;
    public final TLRPC.Document f27130b;
    public final String f27131c;
    public final int d;
    public final w7 f27132e;

    public u7(w7 w7Var, Object obj, TLRPC.Document document, String str, int i7) {
        this.f27132e = w7Var;
        this.f27129a = obj;
        this.f27130b = document;
        this.f27131c = str;
        this.d = i7;
    }

    public final void a(org.telegram.messenger.i7 r14, long r15, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.u7.a(org.telegram.messenger.i7, long, long):void");
    }

    public final void b(i7 i7Var, int i7) {
        int i10;
        Object obj = this.f27129a;
        w7 w7Var = this.f27132e;
        ConcurrentHashMap concurrentHashMap = w7Var.f27656x;
        String str = this.f27131c;
        concurrentHashMap.remove(str);
        w7.K.d(new yf(w7Var, i7Var.f24599e1, i7Var, 23), 0L);
        ob obVar = w7Var.F;
        if (obVar != null) {
            obVar.f26049b.f23694u.remove(str);
            i10 = i7;
            g0.g3(new l2.x(obVar, str, i10, obVar.f26048a, 1));
        } else {
            i10 = i7;
        }
        if (this.f27130b != null && (obj instanceof fj) && i10 == 0) {
            a6 downloadController = w7Var.getDownloadController();
            fj fjVar = (fj) obj;
            downloadController.getClass();
            g0.g3(new l7(downloadController, fjVar, i10, 2));
            downloadController.getMessagesStorage().f27052a.c(new w5(downloadController, fjVar, 2));
        } else if (i10 == -1) {
            LaunchActivity.D(2);
        }
    }

    public final void c(i7 i7Var, File file) {
        Object obj = this.f27129a;
        w7 w7Var = this.f27132e;
        if (!i7Var.f24640y && i7Var.f24642z) {
            w7.K.d(new yf(w7Var, i7Var.f24599e1, i7Var, 23), 0L);
            return;
        }
        e8 E = w7.E(obj);
        if (E != null) {
            f8 f8Var = w7Var.getFileLoader().d;
            f8Var.getClass();
            if (file != null) {
                f8Var.h(new yf(f8Var, file, E, 24));
            }
        }
        if (obj instanceof fj) {
            fj fjVar = (fj) obj;
            if (this.f27130b != null && fjVar.P) {
                a6 downloadController = w7Var.getDownloadController();
                downloadController.getClass();
                if (fjVar.F0() != null) {
                    g0.g3(new v5(downloadController, fjVar.F0(), fjVar, 0));
                }
            }
        }
        if (!i7Var.f24640y) {
            w7Var.f27656x.remove(this.f27131c);
            ob obVar = w7Var.F;
            if (obVar != null) {
                String str = this.f27131c;
                Object obj2 = this.f27129a;
                int i7 = this.d;
                obVar.f26049b.f23694u.remove(str);
                g0.g3(new bi.p3(obVar, file, str, obVar.f26048a, obj2, i7));
            }
        }
        w7.K.d(new yf(w7Var, i7Var.f24599e1, i7Var, 23), 0L);
    }
}
