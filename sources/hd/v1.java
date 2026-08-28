package hd;

import g7.g7;
import g7.u6;
import g7.w5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class v1 implements g1, r, z1 {
    public static final AtomicReferenceFieldUpdater f10497a = AtomicReferenceFieldUpdater.newUpdater(v1.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater f10498b = AtomicReferenceFieldUpdater.newUpdater(v1.class, Object.class, "_parentHandle$volatile");
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    public v1(boolean z10) {
        r0 r0Var;
        if (z10) {
            r0Var = f0.f10437j;
        } else {
            r0Var = f0.f10436i;
        }
        this._state$volatile = r0Var;
    }

    public static q D(md.k kVar) {
        while (kVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = md.k.f17658b;
            md.k d = kVar.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (md.k) obj;
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
                if (kVar instanceof w1) {
                    return null;
                }
            }
        }
    }

    public static String J(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (o1Var.d()) {
                return "Cancelling";
            }
            if (o1Var.e()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof b1) {
            if (((b1) obj).isActive()) {
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
            if (K == f0.d) {
                return false;
            }
            if (K == f0.f10433e) {
                return true;
            }
        } while (K == f0.f10434f);
        f(K);
        return true;
    }

    public final Object B(Object obj) {
        Object K;
        v vVar;
        do {
            K = K(u(), obj);
            if (K == f0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof v) {
                    vVar = (v) obj;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    th = vVar.f10495a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (K == f0.f10434f);
        return K;
    }

    public String C() {
        return getClass().getSimpleName();
    }

    public final void E(w1 w1Var, Throwable th) {
        Object f10 = w1Var.f();
        kotlin.jvm.internal.i.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        md.k kVar = (md.k) f10;
        ?? r12 = 0;
        while (!kVar.equals(w1Var)) {
            if (kVar instanceof i1) {
                l1 l1Var = (l1) kVar;
                try {
                    l1Var.a(th);
                } catch (Throwable th2) {
                    if (r12 != 0) {
                        w5.a(r12, th2);
                    } else {
                        r12 = new RuntimeException("Exception in completion handler " + l1Var + " for " + ((Object) this), th2);
                    }
                }
            }
            kVar = kVar.g();
            r12 = r12;
        }
        if (r12 != 0) {
            w(r12);
        }
        j(th);
    }

    public final void H(l1 l1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        md.k kVar = new md.k();
        l1Var.getClass();
        md.k.f17658b.set(kVar, l1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = md.k.f17657a;
        atomicReferenceFieldUpdater2.set(kVar, l1Var);
        loop0: while (true) {
            if (l1Var.f() == l1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(l1Var, l1Var, kVar)) {
                    if (atomicReferenceFieldUpdater2.get(l1Var) != l1Var) {
                        break;
                    }
                }
                kVar.e(l1Var);
                break loop0;
            }
            break;
        }
        md.k g10 = l1Var.g();
        do {
            atomicReferenceFieldUpdater = f10497a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, l1Var, g10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == l1Var);
    }

    public final int I(Object obj) {
        boolean z10 = obj instanceof r0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10497a;
        if (z10) {
            if (!((r0) obj).f10478a) {
                r0 r0Var = f0.f10437j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, r0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        return -1;
                    }
                }
                return 1;
            }
            return 0;
        } else if (obj instanceof a1) {
            w1 w1Var = ((a1) obj).f10410a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w1Var)) {
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
        c1 c1Var;
        o1 o1Var;
        v vVar;
        q qVar;
        if (!(obj instanceof b1)) {
            return f0.d;
        }
        if (((obj instanceof r0) || (obj instanceof l1)) && !(obj instanceof q) && !(obj2 instanceof v)) {
            b1 b1Var = (b1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10497a;
            if (obj2 instanceof b1) {
                c1Var = new c1((b1) obj2);
            } else {
                c1Var = obj2;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, b1Var, c1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                    return f0.f10434f;
                }
            }
            F(obj2);
            m(b1Var, obj2);
            return obj2;
        }
        b1 b1Var2 = (b1) obj;
        w1 t10 = t(b1Var2);
        if (t10 == null) {
            return f0.f10434f;
        }
        q qVar2 = null;
        if (b1Var2 instanceof o1) {
            o1Var = (o1) b1Var2;
        } else {
            o1Var = null;
        }
        if (o1Var == null) {
            o1Var = new o1(t10, null);
        }
        synchronized (o1Var) {
            if (o1Var.e()) {
                return f0.d;
            }
            o1.f10469b.set(o1Var, 1);
            if (o1Var != b1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10497a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, b1Var2, o1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != b1Var2) {
                        return f0.f10434f;
                    }
                }
            }
            boolean d = o1Var.d();
            if (obj2 instanceof v) {
                vVar = (v) obj2;
            } else {
                vVar = null;
            }
            if (vVar != null) {
                o1Var.a(vVar.f10495a);
            }
            Throwable b10 = o1Var.b();
            if (d) {
                b10 = null;
            }
            if (b10 != null) {
                E(t10, b10);
            }
            if (b1Var2 instanceof q) {
                qVar = (q) b1Var2;
            } else {
                qVar = null;
            }
            if (qVar == null) {
                w1 c10 = b1Var2.c();
                if (c10 != null) {
                    qVar2 = D(c10);
                }
            } else {
                qVar2 = qVar;
            }
            if (qVar2 != null) {
                while (f0.n(qVar2.f10472e, false, new n1(this, o1Var, qVar2, obj2), 1) == x1.f10506a) {
                    qVar2 = D(qVar2);
                    if (qVar2 == null) {
                        return o(o1Var, obj2);
                    }
                }
                return f0.f10433e;
            }
            return o(o1Var, obj2);
        }
    }

    public final boolean a(b1 b1Var, w1 w1Var, l1 l1Var) {
        md.k d;
        q1 q1Var = new q1(l1Var, this, b1Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = md.k.f17658b;
            d = w1Var.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(w1Var);
                while (true) {
                    d = (md.k) obj;
                    if (!d.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d);
                }
            }
            md.k.f17658b.set(l1Var, d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = md.k.f17657a;
            atomicReferenceFieldUpdater2.set(l1Var, w1Var);
            q1Var.f10476c = w1Var;
            while (!atomicReferenceFieldUpdater2.compareAndSet(d, w1Var, q1Var)) {
                if (atomicReferenceFieldUpdater2.get(d) != w1Var) {
                    break;
                }
            }
        }
        if (q1Var.a(d) == null) {
            return true;
        }
        return false;
    }

    @Override
    public final p attachChild(r rVar) {
        p0 n10 = f0.n(this, true, new q(rVar), 2);
        kotlin.jvm.internal.i.c(n10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (p) n10;
    }

    @Override
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new h1(k(), null, this);
        }
        i(cancellationException);
    }

    @Override
    public final Object fold(Object obj, zc.p pVar) {
        return pVar.invoke(obj, this);
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override
    public final qc.f get(qc.g gVar) {
        return u6.a(this, gVar);
    }

    @Override
    public final CancellationException getCancellationException() {
        Object u10 = u();
        CancellationException cancellationException = null;
        if (u10 instanceof o1) {
            Throwable b10 = ((o1) u10).b();
            if (b10 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (b10 instanceof CancellationException) {
                    cancellationException = (CancellationException) b10;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = k();
                    }
                    return new h1(concat, b10, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(u10 instanceof b1)) {
            if (u10 instanceof v) {
                Throwable th = ((v) u10).f10495a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new h1(k(), th, this);
                }
                return cancellationException;
            }
            return new h1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    @Override
    public final ed.b getChildren() {
        return new ed.e(new r1(this, null), 0);
    }

    public Object getCompleted() {
        return p();
    }

    public final Throwable getCompletionExceptionOrNull() {
        v vVar;
        Object u10 = u();
        if (!(u10 instanceof b1)) {
            if (u10 instanceof v) {
                vVar = (v) u10;
            } else {
                vVar = null;
            }
            if (vVar == null) {
                return null;
            }
            return vVar.f10495a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override
    public final qc.g getKey() {
        return b0.f10413b;
    }

    @Override
    public final g1 getParent() {
        p pVar = (p) f10498b.get(this);
        if (pVar != null) {
            return pVar.getParent();
        }
        return null;
    }

    public final Object h(qc.c cVar) {
        Object u10;
        do {
            u10 = u();
            if (!(u10 instanceof b1)) {
                if (!(u10 instanceof v)) {
                    return f0.u(u10);
                }
                throw ((v) u10).f10495a;
            }
        } while (I(u10) < 0);
        m1 m1Var = new m1(this, g7.b(cVar));
        m1Var.s();
        m1Var.v(new j(f0.n(this, false, new q0(m1Var, 3), 3), 2));
        Object r10 = m1Var.r();
        rc.a aVar = rc.a.f47127a;
        return r10;
    }

    public final boolean i(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: hd.v1.i(java.lang.Object):boolean");
    }

    @Override
    public final p0 invokeOnCompletion(zc.l lVar) {
        return y(false, true, new d1(lVar));
    }

    @Override
    public boolean isActive() {
        Object u10 = u();
        if ((u10 instanceof b1) && ((b1) u10).isActive()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isCancelled() {
        Object u10 = u();
        if (!(u10 instanceof v)) {
            if (!(u10 instanceof o1) || !((o1) u10).d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean j(Throwable th) {
        if (!z()) {
            boolean z10 = th instanceof CancellationException;
            p pVar = (p) f10498b.get(this);
            if (pVar != null && pVar != x1.f10506a) {
                if (!pVar.b(th) && !z10) {
                    return false;
                }
                return true;
            }
            return z10;
        }
        return true;
    }

    @Override
    public final Object join(qc.c cVar) {
        Object u10;
        oc.i iVar;
        do {
            u10 = u();
            boolean z10 = u10 instanceof b1;
            iVar = oc.i.f19197a;
            if (!z10) {
                f0.h(cVar.getContext());
                return iVar;
            }
        } while (I(u10) < 0);
        m mVar = new m(1, g7.b(cVar));
        mVar.s();
        mVar.v(new j(f0.n(this, false, new q0(mVar, 4), 3), 2));
        Object r10 = mVar.r();
        rc.a aVar = rc.a.f47127a;
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

    public boolean l(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (i(th) && r()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void m(b1 b1Var, Object obj) {
        v vVar;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10498b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar != null) {
            pVar.dispose();
            atomicReferenceFieldUpdater.set(this, x1.f10506a);
        }
        ?? r12 = 0;
        if (obj instanceof v) {
            vVar = (v) obj;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            th = vVar.f10495a;
        } else {
            th = null;
        }
        if (b1Var instanceof l1) {
            try {
                ((l1) b1Var).a(th);
                return;
            } catch (Throwable th2) {
                w(new RuntimeException("Exception in completion handler " + b1Var + " for " + ((Object) this), th2));
                return;
            }
        }
        w1 c10 = b1Var.c();
        if (c10 != null) {
            Object f10 = c10.f();
            kotlin.jvm.internal.i.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            md.k kVar = (md.k) f10;
            while (!kVar.equals(c10)) {
                if (kVar instanceof l1) {
                    l1 l1Var = (l1) kVar;
                    try {
                        l1Var.a(th);
                    } catch (Throwable th3) {
                        if (r12 != 0) {
                            w5.a(r12, th3);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + l1Var + " for " + ((Object) this), th3);
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
    public final qc.h minusKey(qc.g gVar) {
        return u6.b(this, gVar);
    }

    public final Throwable n(Object obj) {
        Throwable th;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        v1 v1Var = (v1) ((z1) obj);
        Object u10 = v1Var.u();
        CancellationException cancellationException = null;
        if (u10 instanceof o1) {
            th = ((o1) u10).b();
        } else if (u10 instanceof v) {
            th = ((v) u10).f10495a;
        } else if (!(u10 instanceof b1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + u10).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            return new h1("Parent job is ".concat(J(u10)), th, v1Var);
        }
        return cancellationException;
    }

    public final Object o(o1 o1Var, Object obj) {
        v vVar;
        Throwable q10;
        Object obj2;
        Throwable th = null;
        if (obj instanceof v) {
            vVar = (v) obj;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            th = vVar.f10495a;
        }
        synchronized (o1Var) {
            o1Var.d();
            ArrayList f10 = o1Var.f(th);
            q10 = q(o1Var, f10);
            if (q10 != null && f10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f10.size()));
                int size = f10.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj3 = f10.get(i9);
                    i9++;
                    Throwable th2 = (Throwable) obj3;
                    if (th2 != q10 && th2 != q10 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        w5.a(q10, th2);
                    }
                }
            }
        }
        if (q10 != null && q10 != th) {
            obj = new v(q10, false);
        }
        if (q10 != null && (j(q10) || v(q10))) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            v.f10494b.compareAndSet((v) obj, 0, 1);
        }
        F(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10497a;
        if (obj instanceof b1) {
            obj2 = new c1((b1) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, o1Var, obj2) && atomicReferenceFieldUpdater.get(this) == o1Var) {
        }
        m(o1Var, obj);
        return obj;
    }

    public final Object p() {
        Object u10 = u();
        if (!(u10 instanceof b1)) {
            if (!(u10 instanceof v)) {
                return f0.u(u10);
            }
            throw ((v) u10).f10495a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override
    public final qc.h plus(qc.h hVar) {
        return u6.c(this, hVar);
    }

    public final Throwable q(o1 o1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!o1Var.d()) {
                return null;
            }
            return new h1(k(), null, this);
        }
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = arrayList.get(i10);
                i10++;
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof e2) {
            int size2 = arrayList.size();
            while (true) {
                if (i9 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i9);
                i9++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof e2)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
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

    public final w1 t(b1 b1Var) {
        w1 c10 = b1Var.c();
        if (c10 == null) {
            if (b1Var instanceof r0) {
                return new md.k();
            }
            if (b1Var instanceof l1) {
                H((l1) b1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + b1Var).toString());
        }
        return c10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C() + '{' + J(u()) + '}');
        sb2.append('@');
        sb2.append(f0.k(this));
        return sb2.toString();
    }

    public final Object u() {
        while (true) {
            Object obj = f10497a.get(this);
            if (!(obj instanceof md.p)) {
                return obj;
            }
            ((md.p) obj).a(this);
        }
    }

    public boolean v(Throwable th) {
        return false;
    }

    public final void x(g1 g1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10498b;
        x1 x1Var = x1.f10506a;
        if (g1Var == null) {
            atomicReferenceFieldUpdater.set(this, x1Var);
            return;
        }
        g1Var.start();
        p attachChild = g1Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (!(u() instanceof b1)) {
            attachChild.dispose();
            atomicReferenceFieldUpdater.set(this, x1Var);
        }
    }

    public final hd.p0 y(boolean r9, boolean r10, hd.e1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: hd.v1.y(boolean, boolean, hd.e1):hd.p0");
    }

    public boolean z() {
        return this instanceof h;
    }

    @Override
    public final p0 invokeOnCompletion(boolean z10, boolean z11, zc.l lVar) {
        return y(z10, z11, new d1(lVar));
    }

    public void G() {
    }

    public void F(Object obj) {
    }

    public void f(Object obj) {
    }

    public void w(androidx.car.app.j jVar) {
        throw jVar;
    }
}
