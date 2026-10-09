package ae;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class m extends n0 implements l, ld.d, k2 {
    public static final AtomicIntegerFieldUpdater f472f = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater f473n = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle$volatile");
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    public final jd.c d;
    public final jd.h f474e;

    public m(int i10, jd.c cVar) {
        super(i10);
        this.d = cVar;
        this.f474e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f426a;
    }

    public static Object E(z1 z1Var, Object obj, int i10, sd.l lVar) {
        k kVar;
        if (obj instanceof v) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (lVar == null && !(z1Var instanceof k)) {
            return obj;
        }
        if (z1Var instanceof k) {
            kVar = (k) z1Var;
        } else {
            kVar = null;
        }
        return new u(obj, kVar, lVar, (Throwable) null, 16);
    }

    public static void y(z1 z1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + z1Var + ", already has " + obj).toString());
    }

    public final void A() {
        fe.h hVar;
        jd.c cVar = this.d;
        Throwable th2 = null;
        if (cVar instanceof fe.h) {
            hVar = (fe.h) cVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.h.f9895n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                da.a aVar = fe.a.d;
                if (obj == aVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                            break;
                        }
                    }
                    break loop0;
                } else if (obj instanceof Throwable) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                } else {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (th2 != null) {
                o();
                n(th2);
            }
        }
    }

    public final void B(sd.l lVar, Object obj) {
        C(obj, this.f477c, lVar);
    }

    public final void C(Object obj, int i10, sd.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof z1) {
                Object E = E((z1) obj2, obj, i10, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                p(i10);
                return;
            }
            if (obj2 instanceof n) {
                n nVar = (n) obj2;
                if (n.f476c.compareAndSet(nVar, 0, 1)) {
                    if (lVar != null) {
                        l(lVar, nVar.f509a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void D(b0 b0Var) {
        fe.h hVar;
        b0 b0Var2;
        int i10;
        jd.c cVar = this.d;
        if (cVar instanceof fe.h) {
            hVar = (fe.h) cVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            b0Var2 = hVar.d;
        } else {
            b0Var2 = null;
        }
        if (b0Var2 == b0Var) {
            i10 = 4;
        } else {
            i10 = this.f477c;
        }
        C(hd.i.f11092a, i10, null);
    }

    public final da.a F(sd.l lVar, Object obj) {
        da.a aVar = g0.f450a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof z1) {
                Object E = E((z1) obj2, obj, this.f477c, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                return aVar;
            }
            return null;
        }
    }

    @Override
    public final da.a a(sd.l lVar, Object obj) {
        return F(lVar, obj);
    }

    @Override
    public final void b(fe.t tVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f472f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        v(tVar);
    }

    @Override
    public final void c(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof z1)) {
                if (!(obj2 instanceof v)) {
                    if (obj2 instanceof u) {
                        u uVar = (u) obj2;
                        if (uVar.f505e == null) {
                            u a2 = u.a(uVar, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            k kVar = uVar.f503b;
                            if (kVar != null) {
                                k(kVar, cancellationException);
                            }
                            sd.l lVar = uVar.f504c;
                            if (lVar != null) {
                                l(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Must be called at most once");
                    }
                    cancellationException2 = cancellationException;
                    u uVar2 = new u(obj2, (k) null, (sd.l) null, cancellationException2, 14);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, uVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    return;
                    cancellationException = cancellationException2;
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed");
            }
        }
    }

    @Override
    public final void e(Object obj) {
        p(this.f477c);
    }

    @Override
    public final jd.c f() {
        return this.d;
    }

    @Override
    public final Throwable g(Object obj) {
        Throwable g10 = super.g(obj);
        if (g10 != null) {
            return g10;
        }
        return null;
    }

    @Override
    public final ld.d getCallerFrame() {
        jd.c cVar = this.d;
        if (cVar instanceof ld.d) {
            return (ld.d) cVar;
        }
        return null;
    }

    @Override
    public final jd.h getContext() {
        return this.f474e;
    }

    @Override
    public final Object h(Object obj) {
        if (obj instanceof u) {
            return ((u) obj).f502a;
        }
        return obj;
    }

    @Override
    public final Object j() {
        return h.get(this);
    }

    public final void k(k kVar, Throwable th2) {
        try {
            kVar.a(th2);
        } catch (Throwable th3) {
            g0.m(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3), this.f474e);
        }
    }

    public final void l(sd.l lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            g0.m(new RuntimeException("Exception in resume onCancellation handler for " + this, th3), this.f474e);
        }
    }

    public final void m(fe.t tVar, Throwable th2) {
        jd.h hVar = this.f474e;
        int i10 = f472f.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                tVar.h(i10, hVar);
                return;
            } catch (Throwable th3) {
                g0.m(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3), hVar);
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    public final boolean n(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = false;
            if (!(obj instanceof z1)) {
                return false;
            }
            if ((obj instanceof k) || (obj instanceof fe.t)) {
                z10 = true;
            }
            n nVar = new n(this, th2, z10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            z1 z1Var = (z1) obj;
            if (z1Var instanceof k) {
                k((k) obj, th2);
            } else if (z1Var instanceof fe.t) {
                m((fe.t) obj, th2);
            }
            if (!x()) {
                o();
            }
            p(this.f477c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f473n;
        q0 q0Var = (q0) atomicReferenceFieldUpdater.get(this);
        if (q0Var == null) {
            return;
        }
        q0Var.dispose();
        atomicReferenceFieldUpdater.set(this, y1.f523a);
    }

    public final void p(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        boolean z10;
        boolean z11;
        do {
            atomicIntegerFieldUpdater = f472f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 == 1) {
                    boolean z12 = false;
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jd.c cVar = this.d;
                    if (!z10 && (cVar instanceof fe.h)) {
                        if (i10 != 1 && i10 != 2) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        int i13 = this.f477c;
                        if (i13 == 1 || i13 == 2) {
                            z12 = true;
                        }
                        if (z11 == z12) {
                            fe.h hVar = (fe.h) cVar;
                            b0 b0Var = hVar.d;
                            jd.h context = hVar.f9896e.getContext();
                            if (b0Var.e()) {
                                b0Var.c(context, this);
                                return;
                            }
                            y0 a2 = e2.a();
                            if (a2.f521c >= 4294967296L) {
                                id.e eVar = a2.f522e;
                                if (eVar == null) {
                                    eVar = new id.e();
                                    a2.f522e = eVar;
                                }
                                eVar.addLast(this);
                                return;
                            }
                            a2.h(true);
                            try {
                                g0.s(this, cVar, true);
                                do {
                                } while (a2.j());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    g0.s(this, cVar, z10);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public Throwable q(w1 w1Var) {
        return w1Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        h1 h1Var;
        boolean x10 = x();
        do {
            atomicIntegerFieldUpdater = f472f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    if (x10) {
                        A();
                    }
                    Object obj = h.get(this);
                    if (!(obj instanceof v)) {
                        int i12 = this.f477c;
                        if ((i12 == 1 || i12 == 2) && (h1Var = (h1) this.f474e.get(c0.f433b)) != null && !h1Var.isActive()) {
                            CancellationException cancellationException = h1Var.getCancellationException();
                            c(obj, cancellationException);
                            throw cancellationException;
                        }
                        return h(obj);
                    }
                    throw ((v) obj).f509a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((q0) f473n.get(this)) == null) {
            t();
        }
        if (x10) {
            A();
        }
        return kd.a.f14784a;
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a2 = hd.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        C(obj, this.f477c, null);
    }

    public final void s() {
        q0 t10 = t();
        if (t10 != null && !(h.get(this) instanceof z1)) {
            t10.dispose();
            f473n.set(this, y1.f523a);
        }
    }

    public final q0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h1 h1Var = (h1) this.f474e.get(c0.f433b);
        if (h1Var == null) {
            return null;
        }
        q0 n10 = g0.n(h1Var, true, new o(this), 2);
        do {
            atomicReferenceFieldUpdater = f473n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, n10)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return n10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(g0.t(this.d));
        sb2.append("){");
        Object obj = h.get(this);
        if (obj instanceof z1) {
            str = "Active";
        } else if (obj instanceof n) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(g0.k(this));
        return sb2.toString();
    }

    public final void u(sd.l lVar) {
        v(new j(lVar, 1));
    }

    public final void v(z1 z1Var) {
        boolean z10;
        boolean z11;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, z1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z12 = true;
            if (obj instanceof k) {
                z10 = true;
            } else {
                z10 = obj instanceof fe.t;
            }
            if (!z10) {
                if (obj instanceof v) {
                    v vVar = (v) obj;
                    if (v.f508b.compareAndSet(vVar, 0, 1)) {
                        if (obj instanceof n) {
                            Throwable th2 = vVar.f509a;
                            if (z1Var instanceof k) {
                                k((k) z1Var, th2);
                                return;
                            } else {
                                m((fe.t) z1Var, th2);
                                return;
                            }
                        }
                        return;
                    }
                    y(z1Var, obj);
                    throw null;
                } else if (obj instanceof u) {
                    u uVar = (u) obj;
                    if (uVar.f503b == null) {
                        if (!(z1Var instanceof fe.t)) {
                            k kVar = (k) z1Var;
                            Throwable th3 = uVar.f505e;
                            if (th3 != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                k(kVar, th3);
                                return;
                            }
                            u a2 = u.a(uVar, kVar, null, 29);
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                                        z12 = false;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (z12) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        y(z1Var, obj);
                        throw null;
                    }
                } else if (!(z1Var instanceof fe.t)) {
                    u uVar2 = new u(obj, (k) z1Var, (sd.l) null, (Throwable) null, 28);
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                z12 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z12) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                y(z1Var, obj);
                throw null;
            }
        }
    }

    public final boolean w() {
        return h.get(this) instanceof z1;
    }

    public final boolean x() {
        if (this.f477c == 2) {
            jd.c cVar = this.d;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (fe.h.f9895n.get((fe.h) cVar) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
