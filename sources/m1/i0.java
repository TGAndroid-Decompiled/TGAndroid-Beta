package m1;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
public final class i0 implements a {
    public final File f20450a;
    public final y0 f20451b;
    public final m0 f20452c;
    public final androidx.lifecycle.k0 d;
    public final AtomicBoolean f20453e;
    public final ie.d f20454f;

    public i0(File file, y0 serializer, m0 coordinator, androidx.lifecycle.k0 k0Var) {
        kotlin.jvm.internal.j.e(serializer, "serializer");
        kotlin.jvm.internal.j.e(coordinator, "coordinator");
        this.f20450a = file;
        this.f20451b = serializer;
        this.f20452c = coordinator;
        this.d = k0Var;
        this.f20453e = new AtomicBoolean(false);
        this.f20454f = new ie.d();
    }

    public final java.lang.Object a(m1.n r8, kd.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: m1.i0.a(m1.n, kd.c):java.lang.Object");
    }

    public final java.lang.Object b(m1.a0 r12, kd.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: m1.i0.b(m1.a0, kd.c):java.lang.Object");
    }

    @Override
    public final void close() {
        this.f20453e.set(true);
        this.d.invoke();
    }
}
