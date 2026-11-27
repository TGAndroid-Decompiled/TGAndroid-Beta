package defpackage;

import java.io.File;
public final class bj7 implements nr5 {
    public static final sae j = new Object();
    public final mx2 a;
    public final File b;
    public final ji1 c;
    public final String d;
    public final String e;
    public final String f;
    public final xj7 g;
    public final tgb h;
    public final tgb i;

    public bj7(mx2 mx2Var, File file) {
        mx2Var.getClass();
        this.a = mx2Var;
        this.b = file;
        Object obj = ej7.b;
        this.c = new ji1(new a83(file, null, (byte) 1), u24.a, -2, x01.a, (byte) 0);
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = new xj7();
        this.h = new tgb(new yi7(this, (byte) 1));
        this.i = new tgb(new yi7(this, (byte) 0));
    }

    public static void f(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                bg.e(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override
    public final Object a(n83 n83Var) {
        if (this.i.b != qf5.d) {
            return new Integer(yea.b.nativeIncrementAndGetCounterValue(((yea) this.i.getValue()).a));
        }
        return fud.c(this.a, new xi7(this, null, (byte) 1), n83Var);
    }

    @Override
    public final Object b(zw2 zw2Var) {
        if (this.i.b != qf5.d) {
            return new Integer(yea.b.nativeGetCounterValue(((yea) this.i.getValue()).a));
        }
        return fud.c(this.a, new xi7(this, null, (byte) 0), zw2Var);
    }

    @Override
    public final java.lang.Object c(defpackage.ur4 r9, defpackage.zw2 r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj7.c(ur4, zw2):java.lang.Object");
    }

    @Override
    public final mm4 d() {
        return this.c;
    }

    @Override
    public final java.lang.Object e(defpackage.is4 r18, defpackage.zw2 r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj7.e(is4, zw2):java.lang.Object");
    }
}
