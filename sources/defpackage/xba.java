package defpackage;

import java.util.concurrent.atomic.AtomicReference;
public final class xba {
    public final srb a;
    public final o73 b;
    public final AtomicReference c;

    public xba(mx2 mx2Var, srb srbVar, o73 o73Var) {
        mx2Var.getClass();
        srbVar.getClass();
        o73Var.getClass();
        this.a = srbVar;
        this.b = o73Var;
        this.c = new AtomicReference();
        fud.b(xde.a(mx2Var), new vba(this, null, (byte) 0));
    }

    public final l9a a() {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            Object a = ytd.a(new vba(this, null, (byte) 1));
            while (!atomicReference.compareAndSet(null, a) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (l9a) obj;
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l != null && num != null) {
            this.a.getClass();
            if (srb.a().c - l.longValue() < num.intValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final java.lang.Object c(defpackage.l9a r5, defpackage.ax2 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xba.c(l9a, ax2):java.lang.Object");
    }
}
