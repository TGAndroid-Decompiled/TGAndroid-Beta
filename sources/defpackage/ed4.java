package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
public final class ed4 implements tj2 {
    public final File a;
    public final s8a b;
    public final nr5 c;
    public final ad4 d;
    public final AtomicBoolean e;
    public final wj7 f;

    public ed4(File file, s8a s8aVar, nr5 nr5Var, ad4 ad4Var) {
        s8aVar.getClass();
        nr5Var.getClass();
        this.a = file;
        this.b = s8aVar;
        this.c = nr5Var;
        this.d = ad4Var;
        this.e = new AtomicBoolean(false);
        this.f = new wj7();
    }

    public final java.lang.Object a(defpackage.x73 r8, defpackage.ax2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed4.a(x73, ax2):java.lang.Object");
    }

    public final java.lang.Object b(defpackage.n83 r10, defpackage.ax2 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed4.b(n83, ax2):java.lang.Object");
    }

    @Override
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
