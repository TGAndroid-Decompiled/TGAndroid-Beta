package id;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class m extends m0 implements l, tc.d, j2 {

    public static final AtomicIntegerFieldUpdater f11165f = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");

    public static final AtomicReferenceFieldUpdater f11166n = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle$volatile");
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    public final rc.c d;

    public final rc.h f11167e;

    public m(int i10, rc.c cVar) {
        super(i10);
        this.d = cVar;
        this.f11167e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f11120a;
    }

    public static Object E(y1 y1Var, Object obj, int i10, ad.l lVar) {
        if (obj instanceof v) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (lVar != null || (y1Var instanceof k)) {
            return new u(obj, y1Var instanceof k ? (k) y1Var : null, lVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(y1 y1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + y1Var + ", already has " + obj).toString());
    }

    public final void A() throws IllegalAccessException, InvocationTargetException {
        rc.c cVar = this.d;
        Throwable th = null;
        nd.h hVar = cVar instanceof nd.h ? (nd.h) cVar : null;
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.h.f18486n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                ec.a aVar = nd.a.d;
                if (obj != aVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(hVar) == aVar);
            }
            if (th == null) {
                return;
            }
            o();
            n(th);
        }
    }

    public final void B(ad.l lVar, Object obj) throws IllegalAccessException, InvocationTargetException {
        C(obj, this.f11168c, lVar);
    }

    public final void C(Object obj, int i10, ad.l lVar) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof y1)) {
                if (obj2 instanceof n) {
                    n nVar = (n) obj2;
                    if (n.f11170c.compareAndSet(nVar, 0, 1)) {
                        if (lVar != null) {
                            l(lVar, nVar.f11204a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objE = E((y1) obj2, obj, i10, lVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                    if (!x()) {
                        o();
                    }
                    p(i10);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void D(a0 a0Var) throws IllegalAccessException, InvocationTargetException {
        rc.c cVar = this.d;
        nd.h hVar = cVar instanceof nd.h ? (nd.h) cVar : null;
        C(pc.i.f45696a, (hVar != null ? hVar.d : null) == a0Var ? 4 : this.f11168c, null);
    }

    public final ec.a F(ad.l lVar, Object obj) {
        ec.a aVar = f0.f11139a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof y1)) {
                return null;
            }
            Object objE = E((y1) obj2, obj, this.f11168c, lVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                    if (!x()) {
                        o();
                    }
                    return aVar;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override
    public final void a(nd.t tVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f11165f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        v(tVar);
    }

    @Override
    public final ec.a b(ad.l lVar, Object obj) {
        return F(lVar, obj);
    }

    @Override
    public final void c(Object obj, CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof v) {
                return;
            }
            if (!(obj2 instanceof u)) {
                cancellationException2 = cancellationException;
                u uVar = new u(obj2, (k) null, (ad.l) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, uVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            u uVar2 = (u) obj2;
            if (uVar2.f11199e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            u uVarA = u.a(uVar2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, uVarA)) {
                    k kVar = uVar2.f11197b;
                    if (kVar != null) {
                        k(kVar, cancellationException);
                    }
                    ad.l lVar = uVar2.f11198c;
                    if (lVar != null) {
                        l(lVar, cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override
    public final void e(Object obj) {
        p(this.f11168c);
    }

    @Override
    public final rc.c f() {
        return this.d;
    }

    @Override
    public final Throwable g(Object obj) {
        Throwable thG = super.g(obj);
        if (thG != null) {
            return thG;
        }
        return null;
    }

    @Override
    public final tc.d getCallerFrame() {
        rc.c cVar = this.d;
        if (cVar instanceof tc.d) {
            return (tc.d) cVar;
        }
        return null;
    }

    @Override
    public final rc.h getContext() {
        return this.f11167e;
    }

    @Override
    public final Object h(Object obj) {
        return obj instanceof u ? ((u) obj).f11196a : obj;
    }

    @Override
    public final Object j() {
        return h.get(this);
    }

    public final void k(k kVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            kVar.a(th);
        } catch (Throwable th2) {
            f0.m(new a7.c("Exception in invokeOnCancellation handler for " + this, th2), this.f11167e);
        }
    }

    public final void l(ad.l lVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            f0.m(new a7.c("Exception in resume onCancellation handler for " + this, th2), this.f11167e);
        }
    }

    public final void m(nd.t tVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        rc.h hVar = this.f11167e;
        int i10 = f11165f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.h(i10, hVar);
        } catch (Throwable th2) {
            f0.m(new a7.c("Exception in invokeOnCancellation handler for " + this, th2), hVar);
        }
    }

    public final boolean n(Throwable th) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y1)) {
                return false;
            }
            n nVar = new n(this, th, (obj instanceof k) || (obj instanceof nd.t));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    y1 y1Var = (y1) obj;
                    if (y1Var instanceof k) {
                        k((k) obj, th);
                    } else if (y1Var instanceof nd.t) {
                        m((nd.t) obj, th);
                    }
                    if (!x()) {
                        o();
                    }
                    p(this.f11168c);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11166n;
        p0 p0Var = (p0) atomicReferenceFieldUpdater.get(this);
        if (p0Var == null) {
            return;
        }
        p0Var.dispose();
        atomicReferenceFieldUpdater.set(this, x1.f11215a);
    }

    public final void p(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f11165f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z10 = i10 == 4;
                rc.c cVar = this.d;
                if (!z10 && (cVar instanceof nd.h)) {
                    boolean z11 = i10 == 1 || i10 == 2;
                    int i13 = this.f11168c;
                    if (z11 == (i13 == 1 || i13 == 2)) {
                        nd.h hVar = (nd.h) cVar;
                        a0 a0Var = hVar.d;
                        rc.h context = hVar.f18487e.getContext();
                        if (a0Var.e()) {
                            a0Var.c(context, this);
                            return;
                        }
                        x0 x0VarA = d2.a();
                        if (x0VarA.f11213c >= 4294967296L) {
                            qc.e eVar = x0VarA.f11214e;
                            if (eVar == null) {
                                eVar = new qc.e();
                                x0VarA.f11214e = eVar;
                            }
                            eVar.addLast(this);
                            return;
                        }
                        x0VarA.h(true);
                        try {
                            f0.s(this, cVar, true);
                            do {
                            } while (x0VarA.j());
                        } catch (Throwable th) {
                            try {
                                i(th, null);
                            } finally {
                                x0VarA.f(true);
                            }
                        }
                        return;
                    }
                }
                f0.s(this, cVar, z10);
                return;
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
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = f11165f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zX) {
                    A();
                }
                Object obj = h.get(this);
                if (obj instanceof v) {
                    throw ((v) obj).f11204a;
                }
                int i12 = this.f11168c;
                if ((i12 != 1 && i12 != 2) || (g1Var = (g1) this.f11167e.get(b0.f11122b)) == null || g1Var.isActive()) {
                    return h(obj);
                }
                CancellationException cancellationException = g1Var.getCancellationException();
                c(obj, cancellationException);
                throw cancellationException;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((p0) f11166n.get(this)) == null) {
            t();
        }
        if (zX) {
            A();
        }
        return sc.a.f47847a;
    }

    @Override
    public final void resumeWith(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thA = pc.f.a(obj);
        if (thA != null) {
            obj = new v(thA, false);
        }
        C(obj, this.f11168c, null);
    }

    public final void s() {
        p0 p0VarT = t();
        if (p0VarT == null || (h.get(this) instanceof y1)) {
            return;
        }
        p0VarT.dispose();
        f11166n.set(this, x1.f11215a);
    }

    public final p0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g1 g1Var = (g1) this.f11167e.get(b0.f11122b);
        if (g1Var == null) {
            return null;
        }
        p0 p0VarN = f0.n(g1Var, true, new o(this), 2);
        do {
            atomicReferenceFieldUpdater = f11166n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, p0VarN)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return p0VarN;
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
        } else {
            str = obj instanceof n ? "Cancelled" : "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(f0.k(this));
        return sb2.toString();
    }

    public final void u(ad.l lVar) {
        v(new j(lVar, 1));
    }

    public final void v(y1 y1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, y1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            boolean z10 = true;
            if (obj instanceof k ? true : obj instanceof nd.t) {
                y(y1Var, obj);
                throw null;
            }
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (!v.f11203b.compareAndSet(vVar, 0, 1)) {
                    y(y1Var, obj);
                    throw null;
                }
                if (obj instanceof n) {
                    Throwable th = vVar.f11204a;
                    if (y1Var instanceof k) {
                        k((k) y1Var, th);
                        return;
                    } else {
                        m((nd.t) y1Var, th);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof u) {
                u uVar = (u) obj;
                if (uVar.f11197b != null) {
                    y(y1Var, obj);
                    throw null;
                }
                if (y1Var instanceof nd.t) {
                    return;
                }
                k kVar = (k) y1Var;
                Throwable th2 = uVar.f11199e;
                if (th2 != null) {
                    k(kVar, th2);
                    return;
                }
                u uVarA = u.a(uVar, kVar, null, 29);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVarA)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                if (y1Var instanceof nd.t) {
                    return;
                }
                u uVar2 = new u(obj, (k) y1Var, (ad.l) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    public final boolean w() {
        return h.get(this) instanceof y1;
    }

    public final boolean x() {
        if (this.f11168c != 2) {
            return false;
        }
        rc.c cVar = this.d;
        kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return nd.h.f18486n.get((nd.h) cVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
