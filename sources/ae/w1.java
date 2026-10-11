package ae;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.v8;
import v7.y7;
public class w1 implements h1, r, a2 {
    public static final AtomicReferenceFieldUpdater f514a = AtomicReferenceFieldUpdater.newUpdater(w1.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater f515b = AtomicReferenceFieldUpdater.newUpdater(w1.class, Object.class, "_parentHandle$volatile");
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    public w1(boolean z10) {
        s0 s0Var;
        if (z10) {
            s0Var = g0.f457j;
        } else {
            s0Var = g0.f456i;
        }
        this._state$volatile = s0Var;
    }

    public static q D(fe.k kVar) {
        while (kVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.k.f9902b;
            fe.k d = kVar.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (fe.k) obj;
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
                if (kVar instanceof x1) {
                    return null;
                }
            }
        }
    }

    public static String J(Object obj) {
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (p1Var.d()) {
                return "Cancelling";
            }
            if (p1Var.e()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof c1) {
            if (((c1) obj).isActive()) {
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
            if (K == g0.d) {
                return false;
            }
            if (K == g0.f453e) {
                return true;
            }
        } while (K == g0.f454f);
        f(K);
        return true;
    }

    public final Object B(Object obj) {
        Object K;
        v vVar;
        do {
            K = K(u(), obj);
            if (K == g0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th2 = null;
                if (obj instanceof v) {
                    vVar = (v) obj;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    th2 = vVar.f509a;
                }
                throw new IllegalStateException(str, th2);
            }
        } while (K == g0.f454f);
        return K;
    }

    public String C() {
        return getClass().getSimpleName();
    }

    public final void E(x1 x1Var, Throwable th2) {
        Object f7 = x1Var.f();
        kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        fe.k kVar = (fe.k) f7;
        ?? r12 = 0;
        while (!kVar.equals(x1Var)) {
            if (kVar instanceof j1) {
                m1 m1Var = (m1) kVar;
                try {
                    m1Var.a(th2);
                } catch (Throwable th3) {
                    if (r12 != 0) {
                        y7.a(r12, th3);
                    } else {
                        r12 = new RuntimeException("Exception in completion handler " + m1Var + " for " + ((Object) this), th3);
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

    public final void H(m1 m1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        fe.k kVar = new fe.k();
        m1Var.getClass();
        fe.k.f9902b.set(kVar, m1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = fe.k.f9901a;
        atomicReferenceFieldUpdater2.set(kVar, m1Var);
        loop0: while (true) {
            if (m1Var.f() == m1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(m1Var, m1Var, kVar)) {
                    if (atomicReferenceFieldUpdater2.get(m1Var) != m1Var) {
                        break;
                    }
                }
                kVar.e(m1Var);
                break loop0;
            }
            break;
        }
        fe.k g10 = m1Var.g();
        do {
            atomicReferenceFieldUpdater = f514a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, m1Var, g10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == m1Var);
    }

    public final int I(Object obj) {
        boolean z10 = obj instanceof s0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f514a;
        if (z10) {
            if (!((s0) obj).f495a) {
                s0 s0Var = g0.f457j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, s0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        return -1;
                    }
                }
                return 1;
            }
            return 0;
        } else if (obj instanceof b1) {
            x1 x1Var = ((b1) obj).f428a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x1Var)) {
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
        d1 d1Var;
        p1 p1Var;
        v vVar;
        q qVar;
        if (!(obj instanceof c1)) {
            return g0.d;
        }
        if (((obj instanceof s0) || (obj instanceof m1)) && !(obj instanceof q) && !(obj2 instanceof v)) {
            c1 c1Var = (c1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f514a;
            if (obj2 instanceof c1) {
                d1Var = new d1((c1) obj2);
            } else {
                d1Var = obj2;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1Var, d1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != c1Var) {
                    return g0.f454f;
                }
            }
            F(obj2);
            m(c1Var, obj2);
            return obj2;
        }
        c1 c1Var2 = (c1) obj;
        x1 t10 = t(c1Var2);
        if (t10 == null) {
            return g0.f454f;
        }
        q qVar2 = null;
        if (c1Var2 instanceof p1) {
            p1Var = (p1) c1Var2;
        } else {
            p1Var = null;
        }
        if (p1Var == null) {
            p1Var = new p1(t10, null);
        }
        synchronized (p1Var) {
            if (p1Var.e()) {
                return g0.d;
            }
            p1.f486b.set(p1Var, 1);
            if (p1Var != c1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f514a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, c1Var2, p1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != c1Var2) {
                        return g0.f454f;
                    }
                }
            }
            boolean d = p1Var.d();
            if (obj2 instanceof v) {
                vVar = (v) obj2;
            } else {
                vVar = null;
            }
            if (vVar != null) {
                p1Var.a(vVar.f509a);
            }
            Throwable b10 = p1Var.b();
            if (d) {
                b10 = null;
            }
            if (b10 != null) {
                E(t10, b10);
            }
            if (c1Var2 instanceof q) {
                qVar = (q) c1Var2;
            } else {
                qVar = null;
            }
            if (qVar == null) {
                x1 c10 = c1Var2.c();
                if (c10 != null) {
                    qVar2 = D(c10);
                }
            } else {
                qVar2 = qVar;
            }
            if (qVar2 != null) {
                while (g0.n(qVar2.f489e, false, new o1(this, p1Var, qVar2, obj2), 1) == y1.f523a) {
                    qVar2 = D(qVar2);
                    if (qVar2 == null) {
                        return o(p1Var, obj2);
                    }
                }
                return g0.f453e;
            }
            return o(p1Var, obj2);
        }
    }

    @Override
    public final p attachChild(r rVar) {
        q0 n10 = g0.n(this, true, new q(rVar), 2);
        kotlin.jvm.internal.i.c(n10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (p) n10;
    }

    public final boolean b(c1 c1Var, x1 x1Var, m1 m1Var) {
        fe.k d;
        r1 r1Var = new r1(m1Var, this, c1Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.k.f9902b;
            d = x1Var.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(x1Var);
                while (true) {
                    d = (fe.k) obj;
                    if (!d.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d);
                }
            }
            fe.k.f9902b.set(m1Var, d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = fe.k.f9901a;
            atomicReferenceFieldUpdater2.set(m1Var, x1Var);
            r1Var.f493c = x1Var;
            while (!atomicReferenceFieldUpdater2.compareAndSet(d, x1Var, r1Var)) {
                if (atomicReferenceFieldUpdater2.get(d) != x1Var) {
                    break;
                }
            }
        }
        if (r1Var.a(d) == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new i1(k(), null, this);
        }
        i(cancellationException);
    }

    @Override
    public final Object fold(Object obj, sd.p pVar) {
        return pVar.invoke(obj, this);
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override
    public final jd.f get(jd.g gVar) {
        return v8.a(this, gVar);
    }

    @Override
    public final CancellationException getCancellationException() {
        Object u10 = u();
        CancellationException cancellationException = null;
        if (u10 instanceof p1) {
            Throwable b10 = ((p1) u10).b();
            if (b10 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (b10 instanceof CancellationException) {
                    cancellationException = (CancellationException) b10;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = k();
                    }
                    return new i1(concat, b10, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(u10 instanceof c1)) {
            if (u10 instanceof v) {
                Throwable th2 = ((v) u10).f509a;
                if (th2 instanceof CancellationException) {
                    cancellationException = (CancellationException) th2;
                }
                if (cancellationException == null) {
                    return new i1(k(), th2, this);
                }
                return cancellationException;
            }
            return new i1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    @Override
    public final xd.b getChildren() {
        return new xd.e(new s1(this, null), 0);
    }

    public Object getCompleted() {
        return p();
    }

    public final Throwable getCompletionExceptionOrNull() {
        v vVar;
        Object u10 = u();
        if (!(u10 instanceof c1)) {
            if (u10 instanceof v) {
                vVar = (v) u10;
            } else {
                vVar = null;
            }
            if (vVar == null) {
                return null;
            }
            return vVar.f509a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override
    public final jd.g getKey() {
        return c0.f433b;
    }

    @Override
    public final h1 getParent() {
        p pVar = (p) f515b.get(this);
        if (pVar != null) {
            return pVar.getParent();
        }
        return null;
    }

    public final Object h(jd.c cVar) {
        Object u10;
        do {
            u10 = u();
            if (!(u10 instanceof c1)) {
                if (!(u10 instanceof v)) {
                    return g0.u(u10);
                }
                throw ((v) u10).f509a;
            }
        } while (I(u10) < 0);
        n1 n1Var = new n1(this, w7.h.b(cVar));
        n1Var.s();
        n1Var.v(new j(g0.n(this, false, new r0(n1Var, 3), 3), 2));
        Object r10 = n1Var.r();
        kd.a aVar = kd.a.f14783a;
        return r10;
    }

    public final boolean i(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: ae.w1.i(java.lang.Object):boolean");
    }

    @Override
    public final q0 invokeOnCompletion(sd.l lVar) {
        return y(false, true, new e1(lVar));
    }

    @Override
    public boolean isActive() {
        Object u10 = u();
        if ((u10 instanceof c1) && ((c1) u10).isActive()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isCancelled() {
        Object u10 = u();
        if (!(u10 instanceof v)) {
            if (!(u10 instanceof p1) || !((p1) u10).d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean j(Throwable th2) {
        if (!z()) {
            boolean z10 = th2 instanceof CancellationException;
            p pVar = (p) f515b.get(this);
            if (pVar != null && pVar != y1.f523a) {
                if (!pVar.b(th2) && !z10) {
                    return false;
                }
                return true;
            }
            return z10;
        }
        return true;
    }

    @Override
    public final Object join(jd.c cVar) {
        Object u10;
        hd.i iVar;
        do {
            u10 = u();
            boolean z10 = u10 instanceof c1;
            iVar = hd.i.f11091a;
            if (!z10) {
                g0.h(cVar.getContext());
                return iVar;
            }
        } while (I(u10) < 0);
        m mVar = new m(1, w7.h.b(cVar));
        mVar.s();
        mVar.v(new j(g0.n(this, false, new r0(mVar, 4), 3), 2));
        Object r10 = mVar.r();
        kd.a aVar = kd.a.f14783a;
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

    public final void m(c1 c1Var, Object obj) {
        v vVar;
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f515b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar != null) {
            pVar.dispose();
            atomicReferenceFieldUpdater.set(this, y1.f523a);
        }
        ?? r12 = 0;
        if (obj instanceof v) {
            vVar = (v) obj;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            th2 = vVar.f509a;
        } else {
            th2 = null;
        }
        if (c1Var instanceof m1) {
            try {
                ((m1) c1Var).a(th2);
                return;
            } catch (Throwable th3) {
                w(new RuntimeException("Exception in completion handler " + c1Var + " for " + ((Object) this), th3));
                return;
            }
        }
        x1 c10 = c1Var.c();
        if (c10 != null) {
            Object f7 = c10.f();
            kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            fe.k kVar = (fe.k) f7;
            while (!kVar.equals(c10)) {
                if (kVar instanceof m1) {
                    m1 m1Var = (m1) kVar;
                    try {
                        m1Var.a(th2);
                    } catch (Throwable th4) {
                        if (r12 != 0) {
                            y7.a(r12, th4);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + m1Var + " for " + ((Object) this), th4);
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
    public final jd.h minusKey(jd.g gVar) {
        return v8.b(this, gVar);
    }

    public final Throwable n(Object obj) {
        Throwable th2;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        w1 w1Var = (w1) ((a2) obj);
        Object u10 = w1Var.u();
        CancellationException cancellationException = null;
        if (u10 instanceof p1) {
            th2 = ((p1) u10).b();
        } else if (u10 instanceof v) {
            th2 = ((v) u10).f509a;
        } else if (!(u10 instanceof c1)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + u10).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = th2;
        }
        if (cancellationException == null) {
            return new i1("Parent job is ".concat(J(u10)), th2, w1Var);
        }
        return cancellationException;
    }

    public final Object o(p1 p1Var, Object obj) {
        v vVar;
        Throwable q6;
        Object obj2;
        Throwable th2 = null;
        if (obj instanceof v) {
            vVar = (v) obj;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            th2 = vVar.f509a;
        }
        synchronized (p1Var) {
            p1Var.d();
            ArrayList f7 = p1Var.f(th2);
            q6 = q(p1Var, f7);
            if (q6 != null && f7.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f7.size()));
                int size = f7.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = f7.get(i10);
                    i10++;
                    Throwable th3 = (Throwable) obj3;
                    if (th3 != q6 && th3 != q6 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        y7.a(q6, th3);
                    }
                }
            }
        }
        if (q6 != null && q6 != th2) {
            obj = new v(q6, false);
        }
        if (q6 != null && (j(q6) || v(q6))) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            v.f508b.compareAndSet((v) obj, 0, 1);
        }
        F(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f514a;
        if (obj instanceof c1) {
            obj2 = new d1((c1) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, p1Var, obj2) && atomicReferenceFieldUpdater.get(this) == p1Var) {
        }
        m(p1Var, obj);
        return obj;
    }

    public final Object p() {
        Object u10 = u();
        if (!(u10 instanceof c1)) {
            if (!(u10 instanceof v)) {
                return g0.u(u10);
            }
            throw ((v) u10).f509a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override
    public final jd.h plus(jd.h hVar) {
        return v8.c(this, hVar);
    }

    public final Throwable q(p1 p1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!p1Var.d()) {
                return null;
            }
            return new i1(k(), null, this);
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
        if (th3 instanceof f2) {
            int size2 = arrayList.size();
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i10);
                i10++;
                Throwable th4 = (Throwable) obj3;
                if (th4 != th3 && (th4 instanceof f2)) {
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

    public final x1 t(c1 c1Var) {
        x1 c10 = c1Var.c();
        if (c10 == null) {
            if (c1Var instanceof s0) {
                return new fe.k();
            }
            if (c1Var instanceof m1) {
                H((m1) c1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + c1Var).toString());
        }
        return c10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C() + '{' + J(u()) + '}');
        sb2.append('@');
        sb2.append(g0.k(this));
        return sb2.toString();
    }

    public final Object u() {
        while (true) {
            Object obj = f514a.get(this);
            if (!(obj instanceof fe.p)) {
                return obj;
            }
            ((fe.p) obj).a(this);
        }
    }

    public boolean v(Throwable th2) {
        return false;
    }

    public final void x(h1 h1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f515b;
        y1 y1Var = y1.f523a;
        if (h1Var == null) {
            atomicReferenceFieldUpdater.set(this, y1Var);
            return;
        }
        h1Var.start();
        p attachChild = h1Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (!(u() instanceof c1)) {
            attachChild.dispose();
            atomicReferenceFieldUpdater.set(this, y1Var);
        }
    }

    public final ae.q0 y(boolean r9, boolean r10, ae.f1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: ae.w1.y(boolean, boolean, ae.f1):ae.q0");
    }

    public boolean z() {
        return this instanceof h;
    }

    @Override
    public final q0 invokeOnCompletion(boolean z10, boolean z11, sd.l lVar) {
        return y(z10, z11, new e1(lVar));
    }

    public void G() {
    }

    public void F(Object obj) {
    }

    public void f(Object obj) {
    }

    public void w(x xVar) {
        throw xVar;
    }
}
