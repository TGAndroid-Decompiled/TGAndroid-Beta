package defpackage;

import java.util.List;
public final class src implements j74 {
    public l74 a;
    public wxb b;
    public byte c;
    public long d;
    public qrc e;
    public int f;
    public long g;

    @Override
    public final int b(defpackage.k74 r26, defpackage.m11 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.src.b(k74, m11):int");
    }

    @Override
    public final boolean c(k74 k74Var) {
        return ldd.a((ja3) k74Var);
    }

    @Override
    public final void d(long j, long j2) {
        byte b;
        if (j == 0) {
            b = 0;
        } else {
            b = 4;
        }
        this.c = b;
        qrc qrcVar = this.e;
        if (qrcVar != null) {
            qrcVar.b(j2);
        }
    }

    @Override
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        this.a = l74Var;
        this.b = l74Var.S(0, 1);
        l74Var.z();
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
