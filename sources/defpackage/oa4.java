package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
public class oa4 implements xi2 {
    public final File a;
    public final a5a b;
    public final AtomicBoolean c;

    public oa4(File file, a5a a5aVar) {
        a5aVar.getClass();
        this.a = file;
        this.b = a5aVar;
        this.c = new AtomicBoolean(false);
    }

    public static java.lang.Object a(defpackage.oa4 r7, defpackage.gw2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa4.a(oa4, gw2):java.lang.Object");
    }

    @Override
    public final void close() {
        this.c.set(true);
    }
}
