package m1;

import java.io.File;
import java.io.IOException;
public final class t0 implements m0 {
    public final id.h f20435a;
    public final File f20436b;
    public final ce.b f20437c;
    public final String d;
    public final String f20438e;
    public final String f20439f;
    public final ie.d f20440g;
    public final gd.i h;
    public final gd.i f20441i;

    public t0(id.h context, File file) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(file, "file");
        this.f20435a = context;
        this.f20436b = file;
        Object obj = v0.f20452b;
        this.f20437c = new ce.b(new de.c(file, (id.c) null, 5), id.i.f16229a, -2, be.a.f3134a, 0);
        this.d = ".lock";
        this.f20438e = ".version";
        this.f20439f = "fcntl failed: EAGAIN";
        this.f20440g = new ie.d();
        this.h = b5.a.c(new q0(this, 1));
        this.f20441i = b5.a.c(new q0(this, 0));
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
        if (this.f20441i.f13485b != gd.j.f13487a) {
            return new Integer(z0.f20477b.nativeGetCounterValue(((z0) this.f20441i.getValue()).f20478a));
        }
        return zd.b0.y(this.f20435a, new p0(this, null, 0), cVar);
    }

    @Override
    public final java.lang.Object c(rd.l r9, kd.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: m1.t0.c(rd.l, kd.c):java.lang.Object");
    }

    @Override
    public final ce.c d() {
        return this.f20437c;
    }

    @Override
    public final Object e(a0 a0Var) {
        if (this.f20441i.f13485b != gd.j.f13487a) {
            return new Integer(z0.f20477b.nativeIncrementAndGetCounterValue(((z0) this.f20441i.getValue()).f20478a));
        }
        return zd.b0.y(this.f20435a, new p0(this, null, 1), a0Var);
    }
}
