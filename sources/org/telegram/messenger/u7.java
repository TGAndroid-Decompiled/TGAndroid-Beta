package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class u7 {
    public final Object f27227a;
    public final TLRPC.Document f27228b;
    public final String f27229c;
    public final int d;
    public final w7 f27230e;

    public u7(w7 w7Var, Object obj, TLRPC.Document document, String str, int i7) {
        this.f27230e = w7Var;
        this.f27227a = obj;
        this.f27228b = document;
        this.f27229c = str;
        this.d = i7;
    }

    public final void a(org.telegram.messenger.i7 r14, long r15, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.u7.a(org.telegram.messenger.i7, long, long):void");
    }

    public final void b(i7 i7Var, int i7) {
        int i10;
        Object obj = this.f27227a;
        w7 w7Var = this.f27230e;
        ConcurrentHashMap concurrentHashMap = w7Var.f27751x;
        String str = this.f27229c;
        concurrentHashMap.remove(str);
        w7.K.d(new yf(w7Var, i7Var.f24725e1, i7Var, 23), 0L);
        ob obVar = w7Var.F;
        if (obVar != null) {
            obVar.f26146b.f23799u.remove(str);
            i10 = i7;
            g0.g3(new l2.y(obVar, str, i10, obVar.f26145a, 1));
        } else {
            i10 = i7;
        }
        if (this.f27228b != null && (obj instanceof fj) && i10 == 0) {
            a6 downloadController = w7Var.getDownloadController();
            fj fjVar = (fj) obj;
            downloadController.getClass();
            g0.g3(new l7(downloadController, fjVar, i10, 2));
            downloadController.getMessagesStorage().f27149a.c(new w5(downloadController, fjVar, 2));
        } else if (i10 == -1) {
            LaunchActivity.D(2);
        }
    }

    public final void c(i7 i7Var, File file) {
        Object obj = this.f27227a;
        w7 w7Var = this.f27230e;
        if (!i7Var.f24766y && i7Var.f24768z) {
            w7.K.d(new yf(w7Var, i7Var.f24725e1, i7Var, 23), 0L);
            return;
        }
        d8 E = w7.E(obj);
        if (E != null) {
            e8 e8Var = w7Var.getFileLoader().d;
            e8Var.getClass();
            if (file != null) {
                e8Var.h(new yf(e8Var, file, E, 24));
            }
        }
        if (obj instanceof fj) {
            fj fjVar = (fj) obj;
            if (this.f27228b != null && fjVar.P) {
                a6 downloadController = w7Var.getDownloadController();
                downloadController.getClass();
                if (fjVar.F0() != null) {
                    g0.g3(new v5(downloadController, fjVar.F0(), fjVar, 0));
                }
            }
        }
        if (!i7Var.f24766y) {
            w7Var.f27751x.remove(this.f27229c);
            ob obVar = w7Var.F;
            if (obVar != null) {
                String str = this.f27229c;
                Object obj2 = this.f27227a;
                int i7 = this.d;
                obVar.f26146b.f23799u.remove(str);
                g0.g3(new bi.v3(obVar, file, str, obVar.f26145a, obj2, i7));
            }
        }
        w7.K.d(new yf(w7Var, i7Var.f24725e1, i7Var, 23), 0L);
    }
}
