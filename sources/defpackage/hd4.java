package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
public final class hd4 implements lk2 {
    public final File a;
    public final c7a b;
    public final kr5 c;
    public final dd4 d;
    public final AtomicBoolean e;
    public final qj7 f;

    public hd4(File file, c7a c7aVar, kr5 kr5Var, dd4 dd4Var) {
        c7aVar.getClass();
        kr5Var.getClass();
        this.a = file;
        this.b = c7aVar;
        this.c = kr5Var;
        this.d = dd4Var;
        this.e = new AtomicBoolean(false);
        this.f = new qj7();
    }

    public final java.lang.Object a(defpackage.q83 r8, defpackage.qx2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd4.a(q83, qx2):java.lang.Object");
    }

    public final java.lang.Object b(defpackage.g93 r10, defpackage.qx2 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd4.b(g93, qx2):java.lang.Object");
    }

    @Override
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
