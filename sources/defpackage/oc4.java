package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
public class oc4 implements lk2 {
    public final File a;
    public final c7a b;
    public final AtomicBoolean c;

    public oc4(File file, c7a c7aVar) {
        c7aVar.getClass();
        this.a = file;
        this.b = c7aVar;
        this.c = new AtomicBoolean(false);
    }

    public static java.lang.Object a(defpackage.oc4 r7, defpackage.qx2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc4.a(oc4, qx2):java.lang.Object");
    }

    @Override
    public final void close() {
        this.c.set(true);
    }
}
