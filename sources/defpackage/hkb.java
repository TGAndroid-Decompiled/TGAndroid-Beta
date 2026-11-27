package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
public final class hkb implements gp9, fn7 {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public hkb(int i, boolean z) {
        this.a = i;
        this.b = z;
        jn7.f(i).a(this, jn7.U1);
    }

    public final synchronized void a(long j, File file, long j2, long j3) {
        fkb fkbVar = (fkb) this.c.get(Long.valueOf(j));
        if (!this.d && fkbVar != null && !fkbVar.e) {
            e(fkbVar);
            fkbVar.b = Math.max(fkbVar.b, j2 + j3);
            xb4.G(this.a).n(file.getAbsolutePath(), this.b, fkbVar.b, 0L, null);
        }
    }

    public final synchronized void b(long j, long j2, File file) {
        fkb fkbVar = (fkb) this.c.get(Long.valueOf(j));
        if (!this.d && fkbVar != null && !fkbVar.e) {
            e(fkbVar);
            fkbVar.b = Math.max(fkbVar.b, j2);
            fkbVar.c = j2;
            xb4.G(this.a).n(file.getAbsolutePath(), this.b, fkbVar.b, j2, null);
        }
    }

    public final synchronized void c(long j) {
        fkb fkbVar = (fkb) this.c.remove(Long.valueOf(j));
        if (fkbVar == null) {
            return;
        }
        fkbVar.e = true;
        if (fkbVar.d) {
            xb4.G(this.a).b(fkbVar.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void d(boolean z) {
        if (this.d) {
            return;
        }
        this.d = true;
        jn7.f(this.a).n(this, jn7.U1);
        if (z) {
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                fkb fkbVar = (fkb) it.next();
                if (fkbVar.d && !fkbVar.e) {
                    xb4.G(this.a).b(fkbVar.a.getAbsolutePath(), this.b);
                }
                it.remove();
            }
        }
    }

    @Override
    public final synchronized void didReceivedNotification(int r4, int r5, java.lang.Object... r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkb.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(fkb fkbVar) {
        if (fkbVar.d) {
            return;
        }
        fkbVar.d = true;
        xb4.G(this.a).g0(fkbVar.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
