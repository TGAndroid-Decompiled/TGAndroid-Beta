package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class u7 {
    public final Object f25659a;
    public final TLRPC.Document f25660b;
    public final String f25661c;
    public final int d;
    public final w7 f25662e;

    public u7(w7 w7Var, Object obj, TLRPC.Document document, String str, int i3) {
        this.f25662e = w7Var;
        this.f25659a = obj;
        this.f25660b = document;
        this.f25661c = str;
        this.d = i3;
    }

    public final void a(org.telegram.messenger.i7 r14, long r15, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.u7.a(org.telegram.messenger.i7, long, long):void");
    }

    public final void b(i7 i7Var, int i3) {
        int i10;
        Object obj = this.f25659a;
        w7 w7Var = this.f25662e;
        ConcurrentHashMap concurrentHashMap = w7Var.f26175x;
        String str = this.f25661c;
        concurrentHashMap.remove(str);
        w7.K.e(new fg(w7Var, i7Var.f23473e1, i7Var, 23), 0L);
        jb jbVar = w7Var.F;
        if (jbVar != null) {
            jbVar.f23659b.f26775u.remove(str);
            i10 = i3;
            g0.h3(new k2.a0(jbVar, str, i10, jbVar.f23658a, 1));
        } else {
            i10 = i3;
        }
        if (this.f25660b != null && (obj instanceof zi) && i10 == 0) {
            z5 downloadController = w7Var.getDownloadController();
            zi ziVar = (zi) obj;
            downloadController.getClass();
            g0.h3(new k7(downloadController, ziVar, i10, 2));
            downloadController.getMessagesStorage().f24934a.c(new v5(downloadController, ziVar, 2));
        } else if (i10 == -1) {
            LaunchActivity.D(2);
        }
    }

    public final void c(i7 i7Var, File file) {
        Object obj = this.f25659a;
        w7 w7Var = this.f25662e;
        if (!i7Var.f23514y && i7Var.f23516z) {
            w7.K.e(new fg(w7Var, i7Var.f23473e1, i7Var, 23), 0L);
            return;
        }
        e8 E = w7.E(obj);
        if (E != null) {
            f8 f8Var = w7Var.getFileLoader().d;
            f8Var.getClass();
            if (file != null) {
                f8Var.h(new fg(f8Var, file, E, 24));
            }
        }
        if (obj instanceof zi) {
            zi ziVar = (zi) obj;
            if (this.f25660b != null && ziVar.P) {
                z5 downloadController = w7Var.getDownloadController();
                downloadController.getClass();
                if (ziVar.F0() != null) {
                    g0.h3(new u5(downloadController, ziVar.F0(), ziVar, 0));
                }
            }
        }
        if (!i7Var.f23514y) {
            w7Var.f26175x.remove(this.f25661c);
            jb jbVar = w7Var.F;
            if (jbVar != null) {
                String str = this.f25661c;
                Object obj2 = this.f25659a;
                int i3 = this.d;
                jbVar.f23659b.f26775u.remove(str);
                g0.h3(new mi.g0(jbVar, file, str, jbVar.f23658a, obj2, i3));
            }
        }
        w7.K.e(new fg(w7Var, i7Var.f23473e1, i7Var, 23), 0L);
    }
}
