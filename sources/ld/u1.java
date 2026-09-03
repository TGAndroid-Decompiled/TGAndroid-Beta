package ld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k7.b8;
import k7.h8;
import k7.o7;
public class u1 implements f1, r, y1 {
    public static final AtomicReferenceFieldUpdater f12365a = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater f12366b = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_parentHandle$volatile");
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    public u1(boolean z4) {
        q0 q0Var;
        if (z4) {
            q0Var = e0.f12303j;
        } else {
            q0Var = e0.f12302i;
        }
        this._state$volatile = q0Var;
    }

    public static q D(qd.k kVar) {
        while (kVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qd.k.f44839b;
            qd.k d = kVar.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (qd.k) obj;
                    if (!kVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = d;
            }
        }
        while (true) {
            kVar = kVar.g();
            if (!kVar.h()) {
                if (kVar instanceof q) {
                    return (q) kVar;
                }
                if (kVar instanceof v1) {
                    return null;
                }
            }
        }
    }

    public static String J(Object obj) {
        if (obj instanceof n1) {
            n1 n1Var = (n1) obj;
            if (n1Var.d()) {
                return "Cancelling";
            }
            if (n1Var.e()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof a1) {
            if (((a1) obj).isActive()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof v) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public final boolean A(Object obj) {
        Object K;
        do {
            K = K(u(), obj);
            if (K == e0.d) {
                return false;
            }
            if (K == e0.f12299e) {
                return true;
            }
        } while (K == e0.f12300f);
        f(K);
        return true;
    }

    public final Object B(Object obj) {
        Object K;
        v vVar;
        do {
            K = K(u(), obj);
            if (K == e0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th2 = null;
                if (obj instanceof v) {
                    vVar = (v) obj;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    th2 = vVar.f12368a;
                }
                throw new IllegalStateException(str, th2);
            }
        } while (K == e0.f12300f);
        return K;
    }

    public String C() {
        return getClass().getSimpleName();
    }

    public final void E(v1 v1Var, Throwable th2) {
        Object f10 = v1Var.f();
        kotlin.jvm.internal.j.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        qd.k kVar = (qd.k) f10;
        ?? r12 = 0;
        while (!kVar.equals(v1Var)) {
            if (kVar instanceof h1) {
                k1 k1Var = (k1) kVar;
                try {
                    k1Var.a(th2);
                } catch (Throwable th3) {
                    if (r12 != 0) {
                        o7.a(r12, th3);
                    } else {
                        r12 = new RuntimeException("Exception in completion handler " + k1Var + " for " + ((Object) this), th3);
                    }
                }
            }
            kVar = kVar.g();
            r12 = r12;
        }
        if (r12 != 0) {
            w(r12);
        }
        j(th2);
    }

    public final void H(k1 k1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        qd.k kVar = new qd.k();
        k1Var.getClass();
        qd.k.f44839b.set(kVar, k1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = qd.k.f44838a;
        atomicReferenceFieldUpdater2.set(kVar, k1Var);
        loop0: while (true) {
            if (k1Var.f() == k1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(k1Var, k1Var, kVar)) {
                    if (atomicReferenceFieldUpdater2.get(k1Var) != k1Var) {
                        break;
                    }
                }
                kVar.e(k1Var);
                break loop0;
            }
            break;
        }
        qd.k g10 = k1Var.g();
        do {
            atomicReferenceFieldUpdater = f12365a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, k1Var, g10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == k1Var);
    }

    public final int I(Object obj) {
        boolean z4 = obj instanceof q0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12365a;
        if (z4) {
            if (!((q0) obj).f12348a) {
                q0 q0Var = e0.f12303j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        return -1;
                    }
                }
                return 1;
            }
            return 0;
        } else if (obj instanceof z0) {
            v1 v1Var = ((z0) obj).f12381a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, v1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        } else {
            return 0;
        }
    }

    public final Object K(Object obj, Object obj2) {
        b1 b1Var;
        n1 n1Var;
        v vVar;
        q qVar;
        if (!(obj instanceof a1)) {
            return e0.d;
        }
        if (((obj instanceof q0) || (obj instanceof k1)) && !(obj instanceof q) && !(obj2 instanceof v)) {
            a1 a1Var = (a1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12365a;
            if (obj2 instanceof a1) {
                b1Var = new b1((a1) obj2);
            } else {
                b1Var = obj2;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, a1Var, b1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != a1Var) {
                    return e0.f12300f;
                }
            }
            F(obj2);
            m(a1Var, obj2);
            return obj2;
        }
        a1 a1Var2 = (a1) obj;
        v1 t6 = t(a1Var2);
        if (t6 == null) {
            return e0.f12300f;
        }
        q qVar2 = null;
        if (a1Var2 instanceof n1) {
            n1Var = (n1) a1Var2;
        } else {
            n1Var = null;
        }
        if (n1Var == null) {
            n1Var = new n1(t6, null);
        }
        synchronized (n1Var) {
            if (n1Var.e()) {
                return e0.d;
            }
            n1.f12338b.set(n1Var, 1);
            if (n1Var != a1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12365a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, a1Var2, n1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != a1Var2) {
                        return e0.f12300f;
                    }
                }
            }
            boolean d = n1Var.d();
            if (obj2 instanceof v) {
                vVar = (v) obj2;
            } else {
                vVar = null;
            }
            if (vVar != null) {
                n1Var.a(vVar.f12368a);
            }
            Throwable b10 = n1Var.b();
            if (d) {
                b10 = null;
            }
            if (b10 != null) {
                E(t6, b10);
            }
            if (a1Var2 instanceof q) {
                qVar = (q) a1Var2;
            } else {
                qVar = null;
            }
            if (qVar == null) {
                v1 c3 = a1Var2.c();
                if (c3 != null) {
                    qVar2 = D(c3);
                }
            } else {
                qVar2 = qVar;
            }
            if (qVar2 != null) {
                while (e0.n(qVar2.f12347e, false, new m1(this, n1Var, qVar2, obj2), 1) == w1.f12374a) {
                    qVar2 = D(qVar2);
                    if (qVar2 == null) {
                        return o(n1Var, obj2);
                    }
                }
                return e0.f12299e;
            }
            return o(n1Var, obj2);
        }
    }

    public final boolean a(a1 a1Var, v1 v1Var, k1 k1Var) {
        qd.k d;
        p1 p1Var = new p1(k1Var, this, a1Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qd.k.f44839b;
            d = v1Var.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(v1Var);
                while (true) {
                    d = (qd.k) obj;
                    if (!d.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d);
                }
            }
            qd.k.f44839b.set(k1Var, d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = qd.k.f44838a;
            atomicReferenceFieldUpdater2.set(k1Var, v1Var);
            p1Var.f12345c = v1Var;
            while (!atomicReferenceFieldUpdater2.compareAndSet(d, v1Var, p1Var)) {
                if (atomicReferenceFieldUpdater2.get(d) != v1Var) {
                    break;
                }
            }
        }
        if (p1Var.a(d) == null) {
            return true;
        }
        return false;
    }

    @Override
    public final p attachChild(r rVar) {
        o0 n10 = e0.n(this, true, new q(rVar), 2);
        kotlin.jvm.internal.j.c(n10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (p) n10;
    }

    @Override
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new g1(k(), null, this);
        }
        i(cancellationException);
    }

    @Override
    public final Object fold(Object obj, dd.p pVar) {
        return pVar.invoke(obj, this);
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override
    public final uc.f get(uc.g gVar) {
        return b8.a(this, gVar);
    }

    @Override
    public final CancellationException getCancellationException() {
        Object u10 = u();
        CancellationException cancellationException = null;
        if (u10 instanceof n1) {
            Throwable b10 = ((n1) u10).b();
            if (b10 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (b10 instanceof CancellationException) {
                    cancellationException = (CancellationException) b10;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = k();
                    }
                    return new g1(concat, b10, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(u10 instanceof a1)) {
            if (u10 instanceof v) {
                Throwable th2 = ((v) u10).f12368a;
                if (th2 instanceof CancellationException) {
                    cancellationException = (CancellationException) th2;
                }
                if (cancellationException == null) {
                    return new g1(k(), th2, this);
                }
                return cancellationException;
            }
            return new g1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    @Override
    public final id.b getChildren() {
        return new id.e(new q1(this, null), 0);
    }

    public Object getCompleted() {
        return p();
    }

    public final Throwable getCompletionExceptionOrNull() {
        v vVar;
        Object u10 = u();
        if (!(u10 instanceof a1)) {
            if (u10 instanceof v) {
                vVar = (v) u10;
            } else {
                vVar = null;
            }
            if (vVar == null) {
                return null;
            }
            return vVar.f12368a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override
    public final uc.g getKey() {
        return b0.f12283b;
    }

    @Override
    public final f1 getParent() {
        p pVar = (p) f12366b.get(this);
        if (pVar != null) {
            return pVar.getParent();
        }
        return null;
    }

    public final Object h(uc.c cVar) {
        Object u10;
        do {
            u10 = u();
            if (!(u10 instanceof a1)) {
                if (!(u10 instanceof v)) {
                    return e0.u(u10);
                }
                throw ((v) u10).f12368a;
            }
        } while (I(u10) < 0);
        l1 l1Var = new l1(this, h8.b(cVar));
        l1Var.s();
        l1Var.v(new j(e0.n(this, false, new p0(l1Var, 3), 3), 2));
        Object r10 = l1Var.r();
        vc.a aVar = vc.a.f48998a;
        return r10;
    }

    public final boolean i(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: ld.u1.i(java.lang.Object):boolean");
    }

    @Override
    public final o0 invokeOnCompletion(dd.l lVar) {
        return y(false, true, new c1(lVar));
    }

    @Override
    public boolean isActive() {
        Object u10 = u();
        if ((u10 instanceof a1) && ((a1) u10).isActive()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isCancelled() {
        Object u10 = u();
        if (!(u10 instanceof v)) {
            if (!(u10 instanceof n1) || !((n1) u10).d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean j(Throwable th2) {
        if (!z()) {
            boolean z4 = th2 instanceof CancellationException;
            p pVar = (p) f12366b.get(this);
            if (pVar != null && pVar != w1.f12374a) {
                if (!pVar.b(th2) && !z4) {
                    return false;
                }
                return true;
            }
            return z4;
        }
        return true;
    }

    @Override
    public final Object join(uc.c cVar) {
        Object u10;
        sc.i iVar;
        do {
            u10 = u();
            boolean z4 = u10 instanceof a1;
            iVar = sc.i.f47274a;
            if (!z4) {
                e0.h(cVar.getContext());
                return iVar;
            }
        } while (I(u10) < 0);
        m mVar = new m(1, h8.b(cVar));
        mVar.s();
        mVar.v(new j(e0.n(this, false, new p0(mVar, 4), 3), 2));
        Object r10 = mVar.r();
        vc.a aVar = vc.a.f48998a;
        if (r10 != aVar) {
            r10 = iVar;
        }
        if (r10 == aVar) {
            return r10;
        }
        return iVar;
    }

    public String k() {
        return "Job was cancelled";
    }

    public boolean l(Throwable th2) {
        if (!(th2 instanceof CancellationException)) {
            if (i(th2) && r()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void m(a1 a1Var, Object obj) {
        v vVar;
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12366b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar != null) {
            pVar.dispose();
            atomicReferenceFieldUpdater.set(this, w1.f12374a);
        }
        ?? r12 = 0;
        if (obj instanceof v) {
            vVar = (v) obj;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            th2 = vVar.f12368a;
        } else {
            th2 = null;
        }
        if (a1Var instanceof k1) {
            try {
                ((k1) a1Var).a(th2);
                return;
            } catch (Throwable th3) {
                w(new RuntimeException("Exception in completion handler " + a1Var + " for " + ((Object) this), th3));
                return;
            }
        }
        v1 c3 = a1Var.c();
        if (c3 != null) {
            Object f10 = c3.f();
            kotlin.jvm.internal.j.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            qd.k kVar = (qd.k) f10;
            while (!kVar.equals(c3)) {
                if (kVar instanceof k1) {
                    k1 k1Var = (k1) kVar;
                    try {
                        k1Var.a(th2);
                    } catch (Throwable th4) {
                        if (r12 != 0) {
                            o7.a(r12, th4);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + k1Var + " for " + ((Object) this), th4);
                        }
                    }
                }
                kVar = kVar.g();
                r12 = r12;
            }
            if (r12 != 0) {
                w(r12);
            }
        }
    }

    @Override
    public final uc.h minusKey(uc.g gVar) {
        return b8.b(this, gVar);
    }

    public final Throwable n(Object obj) {
        Throwable th2;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        u1 u1Var = (u1) ((y1) obj);
        Object u10 = u1Var.u();
        CancellationException cancellationException = null;
        if (u10 instanceof n1) {
            th2 = ((n1) u10).b();
        } else if (u10 instanceof v) {
            th2 = ((v) u10).f12368a;
        } else if (!(u10 instanceof a1)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + u10).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = th2;
        }
        if (cancellationException == null) {
            return new g1("Parent job is ".concat(J(u10)), th2, u1Var);
        }
        return cancellationException;
    }

    public final Object o(n1 n1Var, Object obj) {
        v vVar;
        Throwable q10;
        Object obj2;
        Throwable th2 = null;
        if (obj instanceof v) {
            vVar = (v) obj;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            th2 = vVar.f12368a;
        }
        synchronized (n1Var) {
            n1Var.d();
            ArrayList f10 = n1Var.f(th2);
            q10 = q(n1Var, f10);
            if (q10 != null && f10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f10.size()));
                int size = f10.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = f10.get(i10);
                    i10++;
                    Throwable th3 = (Throwable) obj3;
                    if (th3 != q10 && th3 != q10 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        o7.a(q10, th3);
                    }
                }
            }
        }
        if (q10 != null && q10 != th2) {
            obj = new v(q10, false);
        }
        if (q10 != null && (j(q10) || v(q10))) {
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            v.f12367b.compareAndSet((v) obj, 0, 1);
        }
        F(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12365a;
        if (obj instanceof a1) {
            obj2 = new b1((a1) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, n1Var, obj2) && atomicReferenceFieldUpdater.get(this) == n1Var) {
        }
        m(n1Var, obj);
        return obj;
    }

    public final Object p() {
        Object u10 = u();
        if (!(u10 instanceof a1)) {
            if (!(u10 instanceof v)) {
                return e0.u(u10);
            }
            throw ((v) u10).f12368a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override
    public final uc.h plus(uc.h hVar) {
        return b8.c(this, hVar);
    }

    public final Throwable q(n1 n1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!n1Var.d()) {
                return null;
            }
            return new g1(k(), null, this);
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                obj = arrayList.get(i11);
                i11++;
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof d2) {
            int size2 = arrayList.size();
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i10);
                i10++;
                Throwable th4 = (Throwable) obj3;
                if (th4 != th3 && (th4 instanceof d2)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean r() {
        return true;
    }

    public boolean s() {
        return this instanceof t;
    }

    @Override
    public final boolean start() {
        int I;
        do {
            I = I(u());
            if (I == 0) {
                return false;
            }
        } while (I != 1);
        return true;
    }

    public final v1 t(a1 a1Var) {
        v1 c3 = a1Var.c();
        if (c3 == null) {
            if (a1Var instanceof q0) {
                return new qd.k();
            }
            if (a1Var instanceof k1) {
                H((k1) a1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + a1Var).toString());
        }
        return c3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C() + '{' + J(u()) + '}');
        sb.append('@');
        sb.append(e0.k(this));
        return sb.toString();
    }

    public final Object u() {
        while (true) {
            Object obj = f12365a.get(this);
            if (!(obj instanceof qd.p)) {
                return obj;
            }
            ((qd.p) obj).a(this);
        }
    }

    public boolean v(Throwable th2) {
        return false;
    }

    public final void x(f1 f1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12366b;
        w1 w1Var = w1.f12374a;
        if (f1Var == null) {
            atomicReferenceFieldUpdater.set(this, w1Var);
            return;
        }
        f1Var.start();
        p attachChild = f1Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (!(u() instanceof a1)) {
            attachChild.dispose();
            atomicReferenceFieldUpdater.set(this, w1Var);
        }
    }

    public final ld.o0 y(boolean r9, boolean r10, ld.d1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: ld.u1.y(boolean, boolean, ld.d1):ld.o0");
    }

    public boolean z() {
        return this instanceof h;
    }

    @Override
    public final o0 invokeOnCompletion(boolean z4, boolean z10, dd.l lVar) {
        return y(z4, z10, new c1(lVar));
    }

    public void G() {
    }

    public void F(Object obj) {
    }

    public void f(Object obj) {
    }

    public void w(a7.b bVar) {
        throw bVar;
    }
}
