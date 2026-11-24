package defpackage;

import java.util.concurrent.atomic.AtomicReference;
public final class h8a {
    public final snb a;
    public final v63 b;
    public final AtomicReference c;

    public h8a(sw2 sw2Var, snb snbVar, v63 v63Var) {
        sw2Var.getClass();
        snbVar.getClass();
        v63Var.getClass();
        this.a = snbVar;
        this.b = v63Var;
        this.c = new AtomicReference();
        ppd.b(h9e.a(sw2Var), new f8a(this, null, (byte) 0));
    }

    public final t5a a() {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            Object a = ipd.a(new f8a(this, null, (byte) 1));
            while (!atomicReference.compareAndSet(null, a) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (t5a) obj;
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l != null && num != null) {
            this.a.getClass();
            if (snb.a().c - l.longValue() < num.intValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final java.lang.Object c(defpackage.t5a r5, defpackage.gw2 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8a.c(t5a, gw2):java.lang.Object");
    }
}
