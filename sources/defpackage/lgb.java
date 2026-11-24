package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
public final class lgb implements rl9, gk7 {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public lgb(int i, boolean z) {
        this.a = i;
        this.b = z;
        kk7.f(i).a(this, kk7.T1);
    }

    public final synchronized void a(long j, File file, long j2, long j3) {
        jgb jgbVar = (jgb) this.c.get(Long.valueOf(j));
        if (!this.d && jgbVar != null && !jgbVar.e) {
            e(jgbVar);
            jgbVar.b = Math.max(jgbVar.b, j2 + j3);
            ba4.G(this.a).n(file.getAbsolutePath(), this.b, jgbVar.b, 0L, null);
        }
    }

    public final synchronized void b(long j, long j2, File file) {
        jgb jgbVar = (jgb) this.c.get(Long.valueOf(j));
        if (!this.d && jgbVar != null && !jgbVar.e) {
            e(jgbVar);
            jgbVar.b = Math.max(jgbVar.b, j2);
            jgbVar.c = j2;
            ba4.G(this.a).n(file.getAbsolutePath(), this.b, jgbVar.b, j2, null);
        }
    }

    public final synchronized void c(long j) {
        jgb jgbVar = (jgb) this.c.remove(Long.valueOf(j));
        if (jgbVar == null) {
            return;
        }
        jgbVar.e = true;
        if (jgbVar.d) {
            ba4.G(this.a).b(jgbVar.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void d(boolean z) {
        if (this.d) {
            return;
        }
        this.d = true;
        kk7.f(this.a).n(this, kk7.T1);
        if (z) {
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                jgb jgbVar = (jgb) it.next();
                if (jgbVar.d && !jgbVar.e) {
                    ba4.G(this.a).b(jgbVar.a.getAbsolutePath(), this.b);
                }
                it.remove();
            }
        }
    }

    @Override
    public final synchronized void didReceivedNotification(int r4, int r5, java.lang.Object... r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgb.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(jgb jgbVar) {
        if (jgbVar.d) {
            return;
        }
        jgbVar.d = true;
        ba4.G(this.a).g0(jgbVar.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
