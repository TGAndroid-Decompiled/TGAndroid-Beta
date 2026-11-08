package m1;

import a8.ab;
import java.io.File;
import java.io.IOException;
public final class t0 implements m0 {
    public final id.h f19474a;
    public final File f19475b;
    public final ce.b f19476c;
    public final String d;
    public final String f19477e;
    public final String f19478f;
    public final ie.d f19479g;
    public final gd.i h;
    public final gd.i f19480i;

    public t0(id.h context, File file) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(file, "file");
        this.f19474a = context;
        this.f19475b = file;
        Object obj = v0.f19491b;
        this.f19476c = new ce.b(new de.c(file, (id.c) null, 5), id.i.f15456a, -2, be.a.f3182a, 0);
        this.d = ".lock";
        this.f19477e = ".version";
        this.f19478f = "fcntl failed: EAGAIN";
        this.f19479g = new ie.d();
        this.h = ab.b(new q0(this, 1));
        this.f19480i = ab.b(new q0(this, 0));
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
        if (this.f19480i.f13826b != gd.j.f13828a) {
            return new Integer(z0.f19516b.nativeGetCounterValue(((z0) this.f19480i.getValue()).f19517a));
        }
        return zd.b0.y(this.f19474a, new p0(this, null, 0), cVar);
    }

    @Override
    public final java.lang.Object c(rd.l r9, kd.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: m1.t0.c(rd.l, kd.c):java.lang.Object");
    }

    @Override
    public final ce.c d() {
        return this.f19476c;
    }

    @Override
    public final Object e(a0 a0Var) {
        if (this.f19480i.f13826b != gd.j.f13828a) {
            return new Integer(z0.f19516b.nativeIncrementAndGetCounterValue(((z0) this.f19480i.getValue()).f19517a));
        }
        return zd.b0.y(this.f19474a, new p0(this, null, 1), a0Var);
    }
}
