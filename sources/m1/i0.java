package m1;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
public final class i0 implements a {
    public final File f19396a;
    public final y0 f19397b;
    public final m0 f19398c;
    public final androidx.lifecycle.k0 d;
    public final AtomicBoolean f19399e;
    public final ie.d f19400f;

    public i0(File file, y0 serializer, m0 coordinator, androidx.lifecycle.k0 k0Var) {
        kotlin.jvm.internal.j.e(serializer, "serializer");
        kotlin.jvm.internal.j.e(coordinator, "coordinator");
        this.f19396a = file;
        this.f19397b = serializer;
        this.f19398c = coordinator;
        this.d = k0Var;
        this.f19399e = new AtomicBoolean(false);
        this.f19400f = new ie.d();
    }

    public final java.lang.Object a(m1.n r8, kd.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: m1.i0.a(m1.n, kd.c):java.lang.Object");
    }

    public final java.lang.Object b(m1.a0 r12, kd.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: m1.i0.b(m1.a0, kd.c):java.lang.Object");
    }

    @Override
    public final void close() {
        this.f19399e.set(true);
        this.d.invoke();
    }
}
