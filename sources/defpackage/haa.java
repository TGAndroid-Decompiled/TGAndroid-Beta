package defpackage;

import java.util.concurrent.atomic.AtomicReference;
public final class haa {
    public final tpb a;
    public final h83 b;
    public final AtomicReference c;

    public haa(cy2 cy2Var, tpb tpbVar, h83 h83Var) {
        cy2Var.getClass();
        tpbVar.getClass();
        h83Var.getClass();
        this.a = tpbVar;
        this.b = h83Var;
        this.c = new AtomicReference();
        srd.b(ibe.a(cy2Var), new faa(this, null, (byte) 0));
    }

    public final v7a a() {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            Object a = lrd.a(new faa(this, null, (byte) 1));
            while (!atomicReference.compareAndSet(null, a) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (v7a) obj;
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l != null && num != null) {
            this.a.getClass();
            if (tpb.a().c - l.longValue() < num.intValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final java.lang.Object c(defpackage.v7a r5, defpackage.qx2 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.haa.c(v7a, qx2):java.lang.Object");
    }
}
