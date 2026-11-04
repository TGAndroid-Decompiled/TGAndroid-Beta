package l1;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
public final class i0 implements a {
    public final File f17558a;
    public final z0 f17559b;
    public final m0 f17560c;
    public final androidx.lifecycle.k0 d;
    public final AtomicBoolean f17561e;
    public final fe.d f17562f;

    public i0(File file, z0 serializer, m0 coordinator, androidx.lifecycle.k0 k0Var) {
        kotlin.jvm.internal.j.e(serializer, "serializer");
        kotlin.jvm.internal.j.e(coordinator, "coordinator");
        this.f17558a = file;
        this.f17559b = serializer;
        this.f17560c = coordinator;
        this.d = k0Var;
        this.f17561e = new AtomicBoolean(false);
        this.f17562f = new fe.d();
    }

    public final java.lang.Object a(l1.n r8, hd.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: l1.i0.a(l1.n, hd.c):java.lang.Object");
    }

    public final java.lang.Object b(l1.a0 r12, hd.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: l1.i0.b(l1.a0, hd.c):java.lang.Object");
    }

    @Override
    public final void close() {
        this.f17561e.set(true);
        this.d.invoke();
    }
}
