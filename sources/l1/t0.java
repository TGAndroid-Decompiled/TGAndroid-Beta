package l1;

import b8.hb;
import java.io.File;
import java.io.IOException;
public final class t0 implements m0 {
    public final fd.h f17634a;
    public final File f17635b;
    public final ae.e f17636c;
    public final String d;
    public final String f17637e;
    public final String f17638f;
    public final fe.d f17639g;
    public final dd.i h;
    public final dd.i f17640i;

    public t0(fd.h context, File file) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(file, "file");
        this.f17634a = context;
        this.f17635b = file;
        Object obj = w0.f17661b;
        this.f17636c = new ae.e(new ae.c(file, (fd.c) null, 5), fd.i.f11567a, -2, yd.a.f59374a, 1);
        this.d = ".lock";
        this.f17637e = ".version";
        this.f17638f = "fcntl failed: EAGAIN";
        this.f17639g = new fe.d();
        this.h = hb.b(new q0(this, 1));
        this.f17640i = hb.b(new q0(this, 0));
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
    public final Object a(a0 a0Var) {
        if (this.f17640i.f8798b != dd.j.f8800a) {
            return new Integer(a1.f17488b.nativeIncrementAndGetCounterValue(((a1) this.f17640i.getValue()).f17489a));
        }
        return wd.b0.y(this.f17634a, new p0(this, null, 1), a0Var);
    }

    @Override
    public final java.lang.Object b(od.l r9, hd.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: l1.t0.b(od.l, hd.c):java.lang.Object");
    }

    @Override
    public final java.lang.Object c(od.p r18, hd.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: l1.t0.c(od.p, hd.c):java.lang.Object");
    }

    @Override
    public final Object d(hd.c cVar) {
        if (this.f17640i.f8798b != dd.j.f8800a) {
            return new Integer(a1.f17488b.nativeGetCounterValue(((a1) this.f17640i.getValue()).f17489a));
        }
        return wd.b0.y(this.f17634a, new p0(this, null, 0), cVar);
    }

    @Override
    public final zd.b e() {
        return this.f17636c;
    }
}
