package defpackage;

import java.io.File;
public final class ui7 implements kr5 {
    public static final f8e j = new Object();
    public final cy2 a;
    public final File b;
    public final ij1 c;
    public final String d;
    public final String e;
    public final String f;
    public final qj7 g;
    public final zeb h;
    public final zeb i;

    public ui7(cy2 cy2Var, File file) {
        cy2Var.getClass();
        this.a = cy2Var;
        this.b = file;
        Object obj = xi7.b;
        this.c = new ij1(new t83(file, null, (byte) 1), k34.a, -2, w11.a, (byte) 0);
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = new qj7();
        this.h = new zeb(new ri7(this, (byte) 1));
        this.i = new zeb(new ri7(this, (byte) 0));
    }

    public static void f(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                zg.e(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override
    public final Object a(g93 g93Var) {
        if (this.i.b != nf5.d) {
            return new Integer(hda.b.nativeIncrementAndGetCounterValue(((hda) this.i.getValue()).a));
        }
        return srd.c(this.a, new qi7(this, null, (byte) 1), g93Var);
    }

    @Override
    public final Object b(px2 px2Var) {
        if (this.i.b != nf5.d) {
            return new Integer(hda.b.nativeGetCounterValue(((hda) this.i.getValue()).a));
        }
        return srd.c(this.a, new qi7(this, null, (byte) 0), px2Var);
    }

    @Override
    public final java.lang.Object c(defpackage.rr4 r9, defpackage.px2 r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui7.c(rr4, px2):java.lang.Object");
    }

    @Override
    public final im4 d() {
        return this.c;
    }

    @Override
    public final java.lang.Object e(defpackage.fs4 r18, defpackage.px2 r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui7.e(fs4, px2):java.lang.Object");
    }
}
