package hd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class m extends m0 implements l, sc.d, j2 {
    public static final AtomicIntegerFieldUpdater f10456f = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater f10457n = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle$volatile");
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    public final qc.c d;
    public final qc.h f10458e;

    public m(int i9, qc.c cVar) {
        super(i9);
        this.d = cVar;
        this.f10458e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f10411a;
    }

    public static Object E(y1 y1Var, Object obj, int i9, zc.l lVar) {
        k kVar;
        if (obj instanceof v) {
            return obj;
        }
        if (i9 != 1 && i9 != 2) {
            return obj;
        }
        if (lVar == null && !(y1Var instanceof k)) {
            return obj;
        }
        if (y1Var instanceof k) {
            kVar = (k) y1Var;
        } else {
            kVar = null;
        }
        return new u(obj, kVar, lVar, (Throwable) null, 16);
    }

    public static void y(y1 y1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + y1Var + ", already has " + obj).toString());
    }

    public final void A() {
        md.h hVar;
        qc.c cVar = this.d;
        Throwable th = null;
        if (cVar instanceof md.h) {
            hVar = (md.h) cVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = md.h.f17650n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                e5.c cVar2 = md.a.d;
                if (obj == cVar2) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, cVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != cVar2) {
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
                    th = (Throwable) obj;
                } else {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (th != null) {
                o();
                n(th);
            }
        }
    }

    public final void B(zc.l lVar, Object obj) {
        C(obj, this.f10459c, lVar);
    }

    public final void C(Object obj, int i9, zc.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
                Object E = E((y1) obj2, obj, i9, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                p(i9);
                return;
            }
            if (obj2 instanceof n) {
                n nVar = (n) obj2;
                if (n.f10461c.compareAndSet(nVar, 0, 1)) {
                    if (lVar != null) {
                        l(lVar, nVar.f10495a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void D(a0 a0Var) {
        md.h hVar;
        a0 a0Var2;
        int i9;
        qc.c cVar = this.d;
        if (cVar instanceof md.h) {
            hVar = (md.h) cVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            a0Var2 = hVar.d;
        } else {
            a0Var2 = null;
        }
        if (a0Var2 == a0Var) {
            i9 = 4;
        } else {
            i9 = this.f10459c;
        }
        C(oc.i.f19197a, i9, null);
    }

    public final e5.c F(zc.l lVar, Object obj) {
        e5.c cVar = f0.f10430a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
                Object E = E((y1) obj2, obj, this.f10459c, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                return cVar;
            }
            return null;
        }
    }

    @Override
    public final void a(md.t tVar, int i9) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f10456f;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i9));
        v(tVar);
    }

    @Override
    public final e5.c b(zc.l lVar, Object obj) {
        return F(lVar, obj);
    }

    @Override
    public final void c(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof y1)) {
                if (!(obj2 instanceof v)) {
                    if (obj2 instanceof u) {
                        u uVar = (u) obj2;
                        if (uVar.f10490e == null) {
                            u a2 = u.a(uVar, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            k kVar = uVar.f10488b;
                            if (kVar != null) {
                                k(kVar, cancellationException);
                            }
                            zc.l lVar = uVar.f10489c;
                            if (lVar != null) {
                                l(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Must be called at most once");
                    }
                    cancellationException2 = cancellationException;
                    u uVar2 = new u(obj2, (k) null, (zc.l) null, cancellationException2, 14);
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
        p(this.f10459c);
    }

    @Override
    public final qc.c f() {
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
    public final sc.d getCallerFrame() {
        qc.c cVar = this.d;
        if (cVar instanceof sc.d) {
            return (sc.d) cVar;
        }
        return null;
    }

    @Override
    public final qc.h getContext() {
        return this.f10458e;
    }

    @Override
    public final Object h(Object obj) {
        if (obj instanceof u) {
            return ((u) obj).f10487a;
        }
        return obj;
    }

    @Override
    public final Object j() {
        return h.get(this);
    }

    public final void k(k kVar, Throwable th) {
        try {
            kVar.a(th);
        } catch (Throwable th2) {
            f0.m(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2), this.f10458e);
        }
    }

    public final void l(zc.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            f0.m(new RuntimeException("Exception in resume onCancellation handler for " + this, th2), this.f10458e);
        }
    }

    public final void m(md.t tVar, Throwable th) {
        qc.h hVar = this.f10458e;
        int i9 = f10456f.get(this) & 536870911;
        if (i9 != 536870911) {
            try {
                tVar.h(i9, hVar);
                return;
            } catch (Throwable th2) {
                f0.m(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2), hVar);
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    public final boolean n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = false;
            if (!(obj instanceof y1)) {
                return false;
            }
            n nVar = new n(this, th, ((obj instanceof k) || (obj instanceof md.t)) ? true : true);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            y1 y1Var = (y1) obj;
            if (y1Var instanceof k) {
                k((k) obj, th);
            } else if (y1Var instanceof md.t) {
                m((md.t) obj, th);
            }
            if (!x()) {
                o();
            }
            p(this.f10459c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10457n;
        p0 p0Var = (p0) atomicReferenceFieldUpdater.get(this);
        if (p0Var == null) {
            return;
        }
        p0Var.dispose();
        atomicReferenceFieldUpdater.set(this, x1.f10506a);
    }

    public final void p(int i9) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean z10;
        boolean z11;
        do {
            atomicIntegerFieldUpdater = f10456f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    boolean z12 = false;
                    if (i9 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qc.c cVar = this.d;
                    if (!z10 && (cVar instanceof md.h)) {
                        if (i9 != 1 && i9 != 2) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        int i12 = this.f10459c;
                        if (z11 == ((i12 == 1 || i12 == 2) ? true : true)) {
                            md.h hVar = (md.h) cVar;
                            a0 a0Var = hVar.d;
                            qc.h context = hVar.f17651e.getContext();
                            if (a0Var.e()) {
                                a0Var.c(context, this);
                                return;
                            }
                            x0 a2 = d2.a();
                            if (a2.f10504c >= 4294967296L) {
                                pc.e eVar = a2.f10505e;
                                if (eVar == null) {
                                    eVar = new pc.e();
                                    a2.f10505e = eVar;
                                }
                                eVar.addLast(this);
                                return;
                            }
                            a2.h(true);
                            try {
                                f0.s(this, cVar, true);
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
                    f0.s(this, cVar, z10);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable q(v1 v1Var) {
        return v1Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        g1 g1Var;
        boolean x10 = x();
        do {
            atomicIntegerFieldUpdater = f10456f;
            i9 = atomicIntegerFieldUpdater.get(this);
            int i10 = i9 >> 29;
            if (i10 != 0) {
                if (i10 == 2) {
                    if (x10) {
                        A();
                    }
                    Object obj = h.get(this);
                    if (!(obj instanceof v)) {
                        int i11 = this.f10459c;
                        if ((i11 == 1 || i11 == 2) && (g1Var = (g1) this.f10458e.get(b0.f10413b)) != null && !g1Var.isActive()) {
                            CancellationException cancellationException = g1Var.getCancellationException();
                            c(obj, cancellationException);
                            throw cancellationException;
                        }
                        return h(obj);
                    }
                    throw ((v) obj).f10495a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 536870912 + (536870911 & i9)));
        if (((p0) f10457n.get(this)) == null) {
            t();
        }
        if (x10) {
            A();
        }
        return rc.a.f47127a;
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a2 = oc.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        C(obj, this.f10459c, null);
    }

    public final void s() {
        p0 t10 = t();
        if (t10 != null && !(h.get(this) instanceof y1)) {
            t10.dispose();
            f10457n.set(this, x1.f10506a);
        }
    }

    public final p0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g1 g1Var = (g1) this.f10458e.get(b0.f10413b);
        if (g1Var == null) {
            return null;
        }
        p0 n10 = f0.n(g1Var, true, new o(this), 2);
        do {
            atomicReferenceFieldUpdater = f10457n;
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
        sb2.append(f0.t(this.d));
        sb2.append("){");
        Object obj = h.get(this);
        if (obj instanceof y1) {
            str = "Active";
        } else if (obj instanceof n) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(f0.k(this));
        return sb2.toString();
    }

    public final void u(zc.l lVar) {
        v(new j(lVar, 1));
    }

    public final void v(y1 y1Var) {
        boolean z10;
        boolean z11;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, y1Var)) {
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
                z10 = obj instanceof md.t;
            }
            if (!z10) {
                if (obj instanceof v) {
                    v vVar = (v) obj;
                    if (v.f10494b.compareAndSet(vVar, 0, 1)) {
                        if (obj instanceof n) {
                            Throwable th = vVar.f10495a;
                            if (y1Var instanceof k) {
                                k((k) y1Var, th);
                                return;
                            } else {
                                m((md.t) y1Var, th);
                                return;
                            }
                        }
                        return;
                    }
                    y(y1Var, obj);
                    throw null;
                } else if (obj instanceof u) {
                    u uVar = (u) obj;
                    if (uVar.f10488b == null) {
                        if (!(y1Var instanceof md.t)) {
                            k kVar = (k) y1Var;
                            Throwable th2 = uVar.f10490e;
                            if (th2 != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                k(kVar, th2);
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
                        y(y1Var, obj);
                        throw null;
                    }
                } else if (!(y1Var instanceof md.t)) {
                    u uVar2 = new u(obj, (k) y1Var, (zc.l) null, (Throwable) null, 28);
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
                y(y1Var, obj);
                throw null;
            }
        }
    }

    public final boolean w() {
        return h.get(this) instanceof y1;
    }

    public final boolean x() {
        if (this.f10459c == 2) {
            qc.c cVar = this.d;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (md.h.f17650n.get((md.h) cVar) != null) {
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
