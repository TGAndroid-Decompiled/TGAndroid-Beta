package defpackage;

import java.io.File;
public final class rg7 implements kp5 {
    public static final c6e j = new Object();
    public final sw2 a;
    public final File b;
    public final bi1 c;
    public final String d;
    public final String e;
    public final String f;
    public final nh7 g;
    public final ycb h;
    public final ycb i;

    public rg7(sw2 sw2Var, File file) {
        sw2Var.getClass();
        this.a = sw2Var;
        this.b = file;
        Object obj = ug7.b;
        this.c = new bi1(new h73(file, null, (byte) 1), z14.a, -2, o01.a, (byte) 0);
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = new nh7();
        this.h = new ycb(new og7(this, (byte) 1));
        this.i = new ycb(new og7(this, (byte) 0));
    }

    public static void f(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                zf.e(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override
    public final Object a(u73 u73Var) {
        if (this.i.b != pd5.d) {
            return new Integer(hba.b.nativeIncrementAndGetCounterValue(((hba) this.i.getValue()).a));
        }
        return ppd.c(this.a, new ng7(this, null, (byte) 1), u73Var);
    }

    @Override
    public final Object b(fw2 fw2Var) {
        if (this.i.b != pd5.d) {
            return new Integer(hba.b.nativeGetCounterValue(((hba) this.i.getValue()).a));
        }
        return ppd.c(this.a, new ng7(this, null, (byte) 0), fw2Var);
    }

    @Override
    public final java.lang.Object c(defpackage.qp4 r9, defpackage.fw2 r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg7.c(qp4, fw2):java.lang.Object");
    }

    @Override
    public final hk4 d() {
        return this.c;
    }

    @Override
    public final java.lang.Object e(defpackage.eq4 r18, defpackage.fw2 r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg7.e(eq4, fw2):java.lang.Object");
    }
}
