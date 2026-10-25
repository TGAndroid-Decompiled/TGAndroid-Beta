package ce;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class m extends m0 implements l, nd.d, j2 {
    public static final AtomicIntegerFieldUpdater f6240f = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater f6241n = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle$volatile");
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    public final ld.c d;
    public final ld.h e;

    public m(int i10, ld.c cVar) {
        super(i10);
        this.d = cVar;
        this.e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f6203a;
    }

    public static Object E(y1 y1Var, Object obj, int i10, ud.l lVar) {
        k kVar;
        if (obj instanceof v) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
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
        he.h hVar;
        ld.c cVar = this.d;
        Throwable th2 = null;
        if (cVar instanceof he.h) {
            hVar = (he.h) cVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = he.h.f12801n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                he.v vVar = he.a.d;
                if (obj == vVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, vVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != vVar) {
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

    public final void B(ud.l lVar, Object obj) {
        C(obj, this.f6242c, lVar);
    }

    public final void C(Object obj, int i10, ud.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
                Object E = E((y1) obj2, obj, i10, lVar);
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
                if (n.f6244c.compareAndSet(nVar, 0, 1)) {
                    if (lVar != null) {
                        l(lVar, nVar.f6271a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void D(a0 a0Var) {
        he.h hVar;
        a0 a0Var2;
        int i10;
        ld.c cVar = this.d;
        if (cVar instanceof he.h) {
            hVar = (he.h) cVar;
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
            i10 = this.f6242c;
        }
        C(jd.i.f15580a, i10, null);
    }

    public final he.v F(ud.l lVar, Object obj) {
        he.v vVar = f0.f6220a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
                Object E = E((y1) obj2, obj, this.f6242c, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                return vVar;
            }
            return null;
        }
    }

    @Override
    public final void a(he.t tVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f6240f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        v(tVar);
    }

    @Override
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof y1)) {
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
                            k kVar = uVar.f6265b;
                            if (kVar != null) {
                                k(kVar, cancellationException);
                            }
                            ud.l lVar = uVar.f6266c;
                            if (lVar != null) {
                                l(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Must be called at most once");
                    }
                    cancellationException2 = cancellationException;
                    u uVar2 = new u(obj2, (k) null, (ud.l) null, cancellationException2, 14);
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
    public final ld.c c() {
        return this.d;
    }

    @Override
    public final he.v d(ud.l lVar, Object obj) {
        return F(lVar, obj);
    }

    @Override
    public final void f(Object obj) {
        p(this.f6242c);
    }

    @Override
    public final Throwable g(Object obj) {
        Throwable g7 = super.g(obj);
        if (g7 != null) {
            return g7;
        }
        return null;
    }

    @Override
    public final nd.d getCallerFrame() {
        ld.c cVar = this.d;
        if (cVar instanceof nd.d) {
            return (nd.d) cVar;
        }
        return null;
    }

    @Override
    public final ld.h getContext() {
        return this.e;
    }

    @Override
    public final Object h(Object obj) {
        if (obj instanceof u) {
            return ((u) obj).f6264a;
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
            f0.m(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3), this.e);
        }
    }

    public final void l(ud.l lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            f0.m(new RuntimeException("Exception in resume onCancellation handler for " + this, th3), this.e);
        }
    }

    public final void m(he.t tVar, Throwable th2) {
        ld.h hVar = this.e;
        int i10 = f6240f.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                tVar.h(i10, hVar);
                return;
            } catch (Throwable th3) {
                f0.m(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3), hVar);
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
            if (!(obj instanceof y1)) {
                return false;
            }
            if ((obj instanceof k) || (obj instanceof he.t)) {
                z10 = true;
            }
            n nVar = new n(this, th2, z10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            y1 y1Var = (y1) obj;
            if (y1Var instanceof k) {
                k((k) obj, th2);
            } else if (y1Var instanceof he.t) {
                m((he.t) obj, th2);
            }
            if (!x()) {
                o();
            }
            p(this.f6242c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6241n;
        p0 p0Var = (p0) atomicReferenceFieldUpdater.get(this);
        if (p0Var == null) {
            return;
        }
        p0Var.dispose();
        atomicReferenceFieldUpdater.set(this, x1.f6281a);
    }

    public final void p(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        boolean z10;
        boolean z11;
        do {
            atomicIntegerFieldUpdater = f6240f;
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
                    ld.c cVar = this.d;
                    if (!z10 && (cVar instanceof he.h)) {
                        if (i10 != 1 && i10 != 2) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        int i13 = this.f6242c;
                        if (i13 == 1 || i13 == 2) {
                            z12 = true;
                        }
                        if (z11 == z12) {
                            he.h hVar = (he.h) cVar;
                            a0 a0Var = hVar.d;
                            ld.h context = hVar.e.getContext();
                            if (a0Var.d()) {
                                a0Var.c(context, this);
                                return;
                            }
                            x0 a2 = d2.a();
                            if (a2.f6280c >= 4294967296L) {
                                kd.e eVar = a2.e;
                                if (eVar == null) {
                                    eVar = new kd.e();
                                    a2.e = eVar;
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
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public Throwable q(v1 v1Var) {
        return v1Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        g1 g1Var;
        boolean x9 = x();
        do {
            atomicIntegerFieldUpdater = f6240f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    if (x9) {
                        A();
                    }
                    Object obj = h.get(this);
                    if (!(obj instanceof v)) {
                        int i12 = this.f6242c;
                        if ((i12 == 1 || i12 == 2) && (g1Var = (g1) this.e.get(b0.f6205b)) != null && !g1Var.isActive()) {
                            CancellationException cancellationException = g1Var.getCancellationException();
                            b(obj, cancellationException);
                            throw cancellationException;
                        }
                        return h(obj);
                    }
                    throw ((v) obj).f6271a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((p0) f6241n.get(this)) == null) {
            t();
        }
        if (x9) {
            A();
        }
        return md.a.f18412a;
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a2 = jd.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        C(obj, this.f6242c, null);
    }

    public final void s() {
        p0 t10 = t();
        if (t10 != null && !(h.get(this) instanceof y1)) {
            t10.dispose();
            f6241n.set(this, x1.f6281a);
        }
    }

    public final p0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g1 g1Var = (g1) this.e.get(b0.f6205b);
        if (g1Var == null) {
            return null;
        }
        p0 n10 = f0.n(g1Var, true, new o(this), 2);
        do {
            atomicReferenceFieldUpdater = f6241n;
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

    public final void u(ud.l lVar) {
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
                z10 = obj instanceof he.t;
            }
            if (!z10) {
                if (obj instanceof v) {
                    v vVar = (v) obj;
                    if (v.f6270b.compareAndSet(vVar, 0, 1)) {
                        if (obj instanceof n) {
                            Throwable th2 = vVar.f6271a;
                            if (y1Var instanceof k) {
                                k((k) y1Var, th2);
                                return;
                            } else {
                                m((he.t) y1Var, th2);
                                return;
                            }
                        }
                        return;
                    }
                    y(y1Var, obj);
                    throw null;
                } else if (obj instanceof u) {
                    u uVar = (u) obj;
                    if (uVar.f6265b == null) {
                        if (!(y1Var instanceof he.t)) {
                            k kVar = (k) y1Var;
                            Throwable th3 = uVar.e;
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
                        y(y1Var, obj);
                        throw null;
                    }
                } else if (!(y1Var instanceof he.t)) {
                    u uVar2 = new u(obj, (k) y1Var, (ud.l) null, (Throwable) null, 28);
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
        if (this.f6242c == 2) {
            ld.c cVar = this.d;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (he.h.f12801n.get((he.h) cVar) != null) {
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
