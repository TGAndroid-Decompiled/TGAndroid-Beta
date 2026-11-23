package m1;

import java.io.File;
import java.io.IOException;
public final class t0 implements m0 {
    public final id.h f20463a;
    public final File f20464b;
    public final ce.b f20465c;
    public final String d;
    public final String f20466e;
    public final String f20467f;
    public final ie.d f20468g;
    public final gd.i h;
    public final gd.i f20469i;

    public t0(id.h context, File file) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(file, "file");
        this.f20463a = context;
        this.f20464b = file;
        Object obj = v0.f20480b;
        this.f20465c = new ce.b(new de.c(file, (id.c) null, 5), id.i.f16254a, -2, be.a.f3154a, 0);
        this.d = ".lock";
        this.f20466e = ".version";
        this.f20467f = "fcntl failed: EAGAIN";
        this.f20468g = new ie.d();
        this.h = b5.a.c(new q0(this, 1));
        this.f20469i = b5.a.c(new q0(this, 0));
    }

    public static final void f(t0 t0Var, File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override
    public final java.lang.Object a(rd.p r18, kd.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: m1.t0.a(rd.p, kd.c):java.lang.Object");
    }

    @Override
    public final Object b(kd.c cVar) {
        if (this.f20469i.f13514b != gd.j.f13516a) {
            return new Integer(z0.f20505b.nativeGetCounterValue(((z0) this.f20469i.getValue()).f20506a));
        }
        return zd.b0.y(this.f20463a, new p0(this, null, 0), cVar);
    }

    @Override
    public final java.lang.Object c(rd.l r9, kd.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: m1.t0.c(rd.l, kd.c):java.lang.Object");
    }

    @Override
    public final ce.c d() {
        return this.f20465c;
    }

    @Override
    public final Object e(a0 a0Var) {
        if (this.f20469i.f13514b != gd.j.f13516a) {
            return new Integer(z0.f20505b.nativeIncrementAndGetCounterValue(((z0) this.f20469i.getValue()).f20506a));
        }
        return zd.b0.y(this.f20463a, new p0(this, null, 1), a0Var);
    }
}
