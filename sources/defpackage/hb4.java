package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
public final class hb4 implements xi2 {
    public final File a;
    public final a5a b;
    public final kp5 c;
    public final db4 d;
    public final AtomicBoolean e;
    public final nh7 f;

    public hb4(File file, a5a a5aVar, kp5 kp5Var, db4 db4Var) {
        a5aVar.getClass();
        kp5Var.getClass();
        this.a = file;
        this.b = a5aVar;
        this.c = kp5Var;
        this.d = db4Var;
        this.e = new AtomicBoolean(false);
        this.f = new nh7();
    }

    public final java.lang.Object a(defpackage.e73 r8, defpackage.gw2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb4.a(e73, gw2):java.lang.Object");
    }

    public final java.lang.Object b(defpackage.u73 r10, defpackage.gw2 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb4.b(u73, gw2):java.lang.Object");
    }

    @Override
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
