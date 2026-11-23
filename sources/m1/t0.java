package m1;

import java.io.File;
import java.io.IOException;
public final class t0 implements m0 {
    public final id.h f20525a;
    public final File f20526b;
    public final ce.b f20527c;
    public final String d;
    public final String f20528e;
    public final String f20529f;
    public final ie.d f20530g;
    public final gd.i h;
    public final gd.i f20531i;

    public t0(id.h context, File file) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(file, "file");
        this.f20525a = context;
        this.f20526b = file;
        Object obj = v0.f20542b;
        this.f20527c = new ce.b(new de.c(file, (id.c) null, 5), id.i.f16317a, -2, be.a.f3105a, 0);
        this.d = ".lock";
        this.f20528e = ".version";
        this.f20529f = "fcntl failed: EAGAIN";
        this.f20530g = new ie.d();
        this.h = b7.h.b(new q0(this, 1));
        this.f20531i = b7.h.b(new q0(this, 0));
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
        if (this.f20531i.f13477b != gd.j.f13479a) {
            return new Integer(z0.f20567b.nativeGetCounterValue(((z0) this.f20531i.getValue()).f20568a));
        }
        return zd.b0.y(this.f20525a, new p0(this, null, 0), cVar);
    }

    @Override
    public final java.lang.Object c(rd.l r9, kd.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: m1.t0.c(rd.l, kd.c):java.lang.Object");
    }

    @Override
    public final ce.c d() {
        return this.f20527c;
    }

    @Override
    public final Object e(a0 a0Var) {
        if (this.f20531i.f13477b != gd.j.f13479a) {
            return new Integer(z0.f20567b.nativeIncrementAndGetCounterValue(((z0) this.f20531i.getValue()).f20568a));
        }
        return zd.b0.y(this.f20525a, new p0(this, null, 1), a0Var);
    }
}
