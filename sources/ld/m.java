package ld;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class m extends l0 implements l, wc.d, i2 {
    public static final AtomicIntegerFieldUpdater f11898f = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater f11899n = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle$volatile");
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    public final uc.c d;
    public final uc.h e;

    public m(int i10, uc.c cVar) {
        super(i10);
        this.d = cVar;
        this.e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f11859a;
    }

    public static Object E(x1 x1Var, Object obj, int i10, dd.l lVar) {
        k kVar;
        if (obj instanceof v) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (lVar == null && !(x1Var instanceof k)) {
            return obj;
        }
        if (x1Var instanceof k) {
            kVar = (k) x1Var;
        } else {
            kVar = null;
        }
        return new u(obj, kVar, lVar, (Throwable) null, 16);
    }

    public static void y(x1 x1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + x1Var + ", already has " + obj).toString());
    }

    public final void A() {
        qd.h hVar;
        uc.c cVar = this.d;
        Throwable th2 = null;
        if (cVar instanceof qd.h) {
            hVar = (qd.h) cVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qd.h.f43024n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                i5.c cVar2 = qd.a.d;
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

    public final void B(dd.l lVar, Object obj) {
        C(obj, this.f11896c, lVar);
    }

    public final void C(Object obj, int i10, dd.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof x1) {
                Object E = E((x1) obj2, obj, i10, lVar);
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
                if (n.f11904c.compareAndSet(nVar, 0, 1)) {
                    if (lVar != null) {
                        l(lVar, nVar.f11930a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void D(a0 a0Var) {
        qd.h hVar;
        a0 a0Var2;
        int i10;
        uc.c cVar = this.d;
        if (cVar instanceof qd.h) {
            hVar = (qd.h) cVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            a0Var2 = hVar.d;
        } else {
            a0Var2 = null;
        }
        if (a0Var2 == a0Var) {
            i10 = 4;
        } else {
            i10 = this.f11896c;
        }
        C(sc.i.f44253a, i10, null);
    }

    public final i5.c F(dd.l lVar, Object obj) {
        i5.c cVar = e0.f11873a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof x1) {
                Object E = E((x1) obj2, obj, this.f11896c, lVar);
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
    public final void a(qd.t tVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f11898f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        v(tVar);
    }

    @Override
    public final i5.c b(dd.l lVar, Object obj) {
        return F(lVar, obj);
    }

    @Override
    public final void c(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof x1)) {
                if (!(obj2 instanceof v)) {
                    if (obj2 instanceof u) {
                        u uVar = (u) obj2;
                        if (uVar.e == null) {
                            u a2 = u.a(uVar, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            k kVar = uVar.f11924b;
                            if (kVar != null) {
                                k(kVar, cancellationException);
                            }
                            dd.l lVar = uVar.f11925c;
                            if (lVar != null) {
                                l(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Must be called at most once");
                    }
                    cancellationException2 = cancellationException;
                    u uVar2 = new u(obj2, (k) null, (dd.l) null, cancellationException2, 14);
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
        p(this.f11896c);
    }

    @Override
    public final uc.c f() {
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
    public final wc.d getCallerFrame() {
        uc.c cVar = this.d;
        if (cVar instanceof wc.d) {
            return (wc.d) cVar;
        }
        return null;
    }

    @Override
    public final uc.h getContext() {
        return this.e;
    }

    @Override
    public final Object h(Object obj) {
        if (obj instanceof u) {
            return ((u) obj).f11923a;
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
            e0.m(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3), this.e);
        }
    }

    public final void l(dd.l lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            e0.m(new RuntimeException("Exception in resume onCancellation handler for " + this, th3), this.e);
        }
    }

    public final void m(qd.t tVar, Throwable th2) {
        uc.h hVar = this.e;
        int i10 = f11898f.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                tVar.h(i10, hVar);
                return;
            } catch (Throwable th3) {
                e0.m(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3), hVar);
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    public final boolean n(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z4 = false;
            if (!(obj instanceof x1)) {
                return false;
            }
            n nVar = new n(this, th2, ((obj instanceof k) || (obj instanceof qd.t)) ? true : true);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            x1 x1Var = (x1) obj;
            if (x1Var instanceof k) {
                k((k) obj, th2);
            } else if (x1Var instanceof qd.t) {
                m((qd.t) obj, th2);
            }
            if (!x()) {
                o();
            }
            p(this.f11896c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11899n;
        o0 o0Var = (o0) atomicReferenceFieldUpdater.get(this);
        if (o0Var == null) {
            return;
        }
        o0Var.dispose();
        atomicReferenceFieldUpdater.set(this, w1.f11935a);
    }

    public final void p(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        boolean z4;
        boolean z10;
        do {
            atomicIntegerFieldUpdater = f11898f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 == 1) {
                    boolean z11 = false;
                    if (i10 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    uc.c cVar = this.d;
                    if (!z4 && (cVar instanceof qd.h)) {
                        if (i10 != 1 && i10 != 2) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i13 = this.f11896c;
                        if (z10 == ((i13 == 1 || i13 == 2) ? true : true)) {
                            qd.h hVar = (qd.h) cVar;
                            a0 a0Var = hVar.d;
                            uc.h context = hVar.e.getContext();
                            if (a0Var.e()) {
                                a0Var.c(context, this);
                                return;
                            }
                            w0 a2 = c2.a();
                            if (a2.f11934c >= 4294967296L) {
                                tc.e eVar = a2.e;
                                if (eVar == null) {
                                    eVar = new tc.e();
                                    a2.e = eVar;
                                }
                                eVar.addLast(this);
                                return;
                            }
                            a2.h(true);
                            try {
                                e0.s(this, cVar, true);
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
                    e0.s(this, cVar, z4);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public Throwable q(u1 u1Var) {
        return u1Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        f1 f1Var;
        boolean x10 = x();
        do {
            atomicIntegerFieldUpdater = f11898f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    if (x10) {
                        A();
                    }
                    Object obj = h.get(this);
                    if (!(obj instanceof v)) {
                        int i12 = this.f11896c;
                        if ((i12 == 1 || i12 == 2) && (f1Var = (f1) this.e.get(b0.f11861b)) != null && !f1Var.isActive()) {
                            CancellationException cancellationException = f1Var.getCancellationException();
                            c(obj, cancellationException);
                            throw cancellationException;
                        }
                        return h(obj);
                    }
                    throw ((v) obj).f11930a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((o0) f11899n.get(this)) == null) {
            t();
        }
        if (x10) {
            A();
        }
        return vc.a.f45663a;
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a2 = sc.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        C(obj, this.f11896c, null);
    }

    public final void s() {
        o0 t6 = t();
        if (t6 != null && !(h.get(this) instanceof x1)) {
            t6.dispose();
            f11899n.set(this, w1.f11935a);
        }
    }

    public final o0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f1 f1Var = (f1) this.e.get(b0.f11861b);
        if (f1Var == null) {
            return null;
        }
        o0 n10 = e0.n(f1Var, true, new o(this), 2);
        do {
            atomicReferenceFieldUpdater = f11899n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, n10)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return n10;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(e0.t(this.d));
        sb.append("){");
        Object obj = h.get(this);
        if (obj instanceof x1) {
            str = "Active";
        } else if (obj instanceof n) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(e0.k(this));
        return sb.toString();
    }

    public final void u(dd.l lVar) {
        v(new j(lVar, 1));
    }

    public final void v(x1 x1Var) {
        boolean z4;
        boolean z10;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z11 = true;
            if (obj instanceof k) {
                z4 = true;
            } else {
                z4 = obj instanceof qd.t;
            }
            if (!z4) {
                if (obj instanceof v) {
                    v vVar = (v) obj;
                    if (v.f11929b.compareAndSet(vVar, 0, 1)) {
                        if (obj instanceof n) {
                            Throwable th2 = vVar.f11930a;
                            if (x1Var instanceof k) {
                                k((k) x1Var, th2);
                                return;
                            } else {
                                m((qd.t) x1Var, th2);
                                return;
                            }
                        }
                        return;
                    }
                    y(x1Var, obj);
                    throw null;
                } else if (obj instanceof u) {
                    u uVar = (u) obj;
                    if (uVar.f11924b == null) {
                        if (!(x1Var instanceof qd.t)) {
                            k kVar = (k) x1Var;
                            Throwable th3 = uVar.e;
                            if (th3 != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                k(kVar, th3);
                                return;
                            }
                            u a2 = u.a(uVar, kVar, null, 29);
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                                        z11 = false;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (z11) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        y(x1Var, obj);
                        throw null;
                    }
                } else if (!(x1Var instanceof qd.t)) {
                    u uVar2 = new u(obj, (k) x1Var, (dd.l) null, (Throwable) null, 28);
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                z11 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z11) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                y(x1Var, obj);
                throw null;
            }
        }
    }

    public final boolean w() {
        return h.get(this) instanceof x1;
    }

    public final boolean x() {
        if (this.f11896c == 2) {
            uc.c cVar = this.d;
            kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (qd.h.f43024n.get((qd.h) cVar) != null) {
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
