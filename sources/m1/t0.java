package m1;

import java.io.File;
import java.io.IOException;
public final class t0 implements m0 {
    public final id.h f20432a;
    public final File f20433b;
    public final ce.b f20434c;
    public final String d;
    public final String f20435e;
    public final String f20436f;
    public final ie.d f20437g;
    public final gd.i h;
    public final gd.i f20438i;

    public t0(id.h context, File file) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(file, "file");
        this.f20432a = context;
        this.f20433b = file;
        Object obj = v0.f20449b;
        this.f20434c = new ce.b(new de.c(file, (id.c) null, 5), id.i.f16226a, -2, be.a.f3135a, 0);
        this.d = ".lock";
        this.f20435e = ".version";
        this.f20436f = "fcntl failed: EAGAIN";
        this.f20437g = new ie.d();
        this.h = b5.a.c(new q0(this, 1));
        this.f20438i = b5.a.c(new q0(this, 0));
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
        if (this.f20438i.f13482b != gd.j.f13484a) {
            return new Integer(z0.f20474b.nativeGetCounterValue(((z0) this.f20438i.getValue()).f20475a));
        }
        return zd.b0.y(this.f20432a, new p0(this, null, 0), cVar);
    }

    @Override
    public final java.lang.Object c(rd.l r9, kd.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: m1.t0.c(rd.l, kd.c):java.lang.Object");
    }

    @Override
    public final ce.c d() {
        return this.f20434c;
    }

    @Override
    public final Object e(a0 a0Var) {
        if (this.f20438i.f13482b != gd.j.f13484a) {
            return new Integer(z0.f20474b.nativeIncrementAndGetCounterValue(((z0) this.f20438i.getValue()).f20475a));
        }
        return zd.b0.y(this.f20432a, new p0(this, null, 1), a0Var);
    }
}
