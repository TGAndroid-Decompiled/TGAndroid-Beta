package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
public final class mib implements rn9, jm7 {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public mib(int i, boolean z) {
        this.a = i;
        this.b = z;
        nm7.f(i).a(this, nm7.U1);
    }

    public final synchronized void a(long j, File file, long j2, long j3) {
        kib kibVar = (kib) this.c.get(Long.valueOf(j));
        if (!this.d && kibVar != null && !kibVar.e) {
            e(kibVar);
            kibVar.b = Math.max(kibVar.b, j2 + j3);
            bc4.G(this.a).n(file.getAbsolutePath(), this.b, kibVar.b, 0L, null);
        }
    }

    public final synchronized void b(long j, long j2, File file) {
        kib kibVar = (kib) this.c.get(Long.valueOf(j));
        if (!this.d && kibVar != null && !kibVar.e) {
            e(kibVar);
            kibVar.b = Math.max(kibVar.b, j2);
            kibVar.c = j2;
            bc4.G(this.a).n(file.getAbsolutePath(), this.b, kibVar.b, j2, null);
        }
    }

    public final synchronized void c(long j) {
        kib kibVar = (kib) this.c.remove(Long.valueOf(j));
        if (kibVar == null) {
            return;
        }
        kibVar.e = true;
        if (kibVar.d) {
            bc4.G(this.a).b(kibVar.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void d(boolean z) {
        if (this.d) {
            return;
        }
        this.d = true;
        nm7.f(this.a).n(this, nm7.U1);
        if (z) {
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                kib kibVar = (kib) it.next();
                if (kibVar.d && !kibVar.e) {
                    bc4.G(this.a).b(kibVar.a.getAbsolutePath(), this.b);
                }
                it.remove();
            }
        }
    }

    @Override
    public final synchronized void didReceivedNotification(int r4, int r5, java.lang.Object... r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mib.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(kib kibVar) {
        if (kibVar.d) {
            return;
        }
        kibVar.d = true;
        bc4.G(this.a).g0(kibVar.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
