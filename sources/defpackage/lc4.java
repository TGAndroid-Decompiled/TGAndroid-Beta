package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
public class lc4 implements tj2 {
    public final File a;
    public final s8a b;
    public final AtomicBoolean c;

    public lc4(File file, s8a s8aVar) {
        s8aVar.getClass();
        this.a = file;
        this.b = s8aVar;
        this.c = new AtomicBoolean(false);
    }

    public static java.lang.Object a(defpackage.lc4 r7, defpackage.ax2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc4.a(lc4, ax2):java.lang.Object");
    }

    @Override
    public final void close() {
        this.c.set(true);
    }
}
