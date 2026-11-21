package m1;

import java.io.File;
import java.io.IOException;
public final class t0 implements m0 {
    public final id.h f20460a;
    public final File f20461b;
    public final ce.b f20462c;
    public final String d;
    public final String f20463e;
    public final String f20464f;
    public final ie.d f20465g;
    public final gd.i h;
    public final gd.i f20466i;

    public t0(id.h context, File file) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(file, "file");
        this.f20460a = context;
        this.f20461b = file;
        Object obj = v0.f20477b;
        this.f20462c = new ce.b(new de.c(file, (id.c) null, 5), id.i.f16251a, -2, be.a.f3147a, 0);
        this.d = ".lock";
        this.f20463e = ".version";
        this.f20464f = "fcntl failed: EAGAIN";
        this.f20465g = new ie.d();
        this.h = b5.a.c(new q0(this, 1));
        this.f20466i = b5.a.c(new q0(this, 0));
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
        if (this.f20466i.f13511b != gd.j.f13513a) {
            return new Integer(z0.f20502b.nativeGetCounterValue(((z0) this.f20466i.getValue()).f20503a));
        }
        return zd.b0.y(this.f20460a, new p0(this, null, 0), cVar);
    }

    @Override
    public final java.lang.Object c(rd.l r9, kd.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: m1.t0.c(rd.l, kd.c):java.lang.Object");
    }

    @Override
    public final ce.c d() {
        return this.f20462c;
    }

    @Override
    public final Object e(a0 a0Var) {
        if (this.f20466i.f13511b != gd.j.f13513a) {
            return new Integer(z0.f20502b.nativeIncrementAndGetCounterValue(((z0) this.f20466i.getValue()).f20503a));
        }
        return zd.b0.y(this.f20460a, new p0(this, null, 1), a0Var);
    }
}
