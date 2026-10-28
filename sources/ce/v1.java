package ce;

import a8.hd;
import a8.pe;
import a8.yd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class v1 implements g1, r, z1 {
    public static final AtomicReferenceFieldUpdater f6273a = AtomicReferenceFieldUpdater.newUpdater(v1.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater f6274b = AtomicReferenceFieldUpdater.newUpdater(v1.class, Object.class, "_parentHandle$volatile");
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    public v1(boolean z10) {
        r0 r0Var;
        if (z10) {
            r0Var = f0.f6226j;
        } else {
            r0Var = f0.f6225i;
        }
        this._state$volatile = r0Var;
    }

    public static q D(he.k kVar) {
        while (kVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = he.k.f12806b;
            he.k d = kVar.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (he.k) obj;
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
            if (K == f0.e) {
                return true;
            }
        } while (K == f0.f6223f);
        b(K);
        return true;
    }

    public final Object B(Object obj) {
        Object K;
        v vVar;
        do {
            K = K(u(), obj);
            if (K == f0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th2 = null;
                if (obj instanceof v) {
                    vVar = (v) obj;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    th2 = vVar.f6271a;
                }
                throw new IllegalStateException(str, th2);
            }
        } while (K == f0.f6223f);
        return K;
    }

    public String C() {
        return getClass().getSimpleName();
    }

    public final void E(w1 w1Var, Throwable th2) {
        Object f7 = w1Var.f();
        kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        he.k kVar = (he.k) f7;
        ?? r12 = 0;
        while (!kVar.equals(w1Var)) {
            if (kVar instanceof i1) {
                l1 l1Var = (l1) kVar;
                try {
                    l1Var.a(th2);
                } catch (Throwable th3) {
                    if (r12 != 0) {
                        hd.a(r12, th3);
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
        j(th2);
    }

    public final void H(l1 l1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        he.k kVar = new he.k();
        l1Var.getClass();
        he.k.f12806b.set(kVar, l1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = he.k.f12805a;
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
        he.k g7 = l1Var.g();
        do {
            atomicReferenceFieldUpdater = f6273a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, l1Var, g7)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == l1Var);
    }

    public final int I(Object obj) {
        boolean z10 = obj instanceof r0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6273a;
        if (z10) {
            if (!((r0) obj).f6256a) {
                r0 r0Var = f0.f6226j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, r0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        return -1;
                    }
                }
                return 1;
            }
            return 0;
        } else if (obj instanceof a1) {
            w1 w1Var = ((a1) obj).f6202a;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6273a;
            if (obj2 instanceof b1) {
                c1Var = new c1((b1) obj2);
            } else {
                c1Var = obj2;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, b1Var, c1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                    return f0.f6223f;
                }
            }
            F(obj2);
            m(b1Var, obj2);
            return obj2;
        }
        b1 b1Var2 = (b1) obj;
        w1 t10 = t(b1Var2);
        if (t10 == null) {
            return f0.f6223f;
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
            o1.f6250b.set(o1Var, 1);
            if (o1Var != b1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6273a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, b1Var2, o1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != b1Var2) {
                        return f0.f6223f;
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
                o1Var.a(vVar.f6271a);
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
                while (f0.n(qVar2.e, false, new n1(this, o1Var, qVar2, obj2), 1) == x1.f6281a) {
                    qVar2 = D(qVar2);
                    if (qVar2 == null) {
                        return o(o1Var, obj2);
                    }
                }
                return f0.e;
            }
            return o(o1Var, obj2);
        }
    }

    public final boolean a(b1 b1Var, w1 w1Var, l1 l1Var) {
        he.k d;
        q1 q1Var = new q1(l1Var, this, b1Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = he.k.f12806b;
            d = w1Var.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(w1Var);
                while (true) {
                    d = (he.k) obj;
                    if (!d.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d);
                }
            }
            he.k.f12806b.set(l1Var, d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = he.k.f12805a;
            atomicReferenceFieldUpdater2.set(l1Var, w1Var);
            q1Var.f6255c = w1Var;
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
    public final Object fold(Object obj, ud.p pVar) {
        return pVar.invoke(obj, this);
    }

    public void g(Object obj) {
        b(obj);
    }

    @Override
    public final ld.f get(ld.g gVar) {
        return yd.a(this, gVar);
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
                Throwable th2 = ((v) u10).f6271a;
                if (th2 instanceof CancellationException) {
                    cancellationException = (CancellationException) th2;
                }
                if (cancellationException == null) {
                    return new h1(k(), th2, this);
                }
                return cancellationException;
            }
            return new h1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    @Override
    public final zd.b getChildren() {
        return new ae.j(new r1(this, null), 1);
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
            return vVar.f6271a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override
    public final ld.g getKey() {
        return b0.f6205b;
    }

    @Override
    public final g1 getParent() {
        p pVar = (p) f6274b.get(this);
        if (pVar != null) {
            return pVar.getParent();
        }
        return null;
    }

    public final Object h(ld.c cVar) {
        Object u10;
        do {
            u10 = u();
            if (!(u10 instanceof b1)) {
                if (!(u10 instanceof v)) {
                    return f0.u(u10);
                }
                throw ((v) u10).f6271a;
            }
        } while (I(u10) < 0);
        m1 m1Var = new m1(this, pe.b(cVar));
        m1Var.s();
        m1Var.v(new j(f0.n(this, false, new q0(m1Var, 3), 3), 2));
        Object r6 = m1Var.r();
        md.a aVar = md.a.f18411a;
        return r6;
    }

    public final boolean i(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: ce.v1.i(java.lang.Object):boolean");
    }

    @Override
    public final p0 invokeOnCompletion(ud.l lVar) {
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

    public final boolean j(Throwable th2) {
        if (!z()) {
            boolean z10 = th2 instanceof CancellationException;
            p pVar = (p) f6274b.get(this);
            if (pVar != null && pVar != x1.f6281a) {
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
    public final Object join(ld.c cVar) {
        Object u10;
        jd.i iVar;
        do {
            u10 = u();
            boolean z10 = u10 instanceof b1;
            iVar = jd.i.f15579a;
            if (!z10) {
                f0.h(cVar.getContext());
                return iVar;
            }
        } while (I(u10) < 0);
        m mVar = new m(1, pe.b(cVar));
        mVar.s();
        mVar.v(new j(f0.n(this, false, new q0(mVar, 4), 3), 2));
        Object r6 = mVar.r();
        md.a aVar = md.a.f18411a;
        if (r6 != aVar) {
            r6 = iVar;
        }
        if (r6 == aVar) {
            return r6;
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

    public final void m(b1 b1Var, Object obj) {
        v vVar;
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6274b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar != null) {
            pVar.dispose();
            atomicReferenceFieldUpdater.set(this, x1.f6281a);
        }
        ?? r12 = 0;
        if (obj instanceof v) {
            vVar = (v) obj;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            th2 = vVar.f6271a;
        } else {
            th2 = null;
        }
        if (b1Var instanceof l1) {
            try {
                ((l1) b1Var).a(th2);
                return;
            } catch (Throwable th3) {
                w(new RuntimeException("Exception in completion handler " + b1Var + " for " + ((Object) this), th3));
                return;
            }
        }
        w1 c10 = b1Var.c();
        if (c10 != null) {
            Object f7 = c10.f();
            kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            he.k kVar = (he.k) f7;
            while (!kVar.equals(c10)) {
                if (kVar instanceof l1) {
                    l1 l1Var = (l1) kVar;
                    try {
                        l1Var.a(th2);
                    } catch (Throwable th4) {
                        if (r12 != 0) {
                            hd.a(r12, th4);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + l1Var + " for " + ((Object) this), th4);
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
    public final ld.h minusKey(ld.g gVar) {
        return yd.b(this, gVar);
    }

    public final Throwable n(Object obj) {
        Throwable th2;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        v1 v1Var = (v1) ((z1) obj);
        Object u10 = v1Var.u();
        CancellationException cancellationException = null;
        if (u10 instanceof o1) {
            th2 = ((o1) u10).b();
        } else if (u10 instanceof v) {
            th2 = ((v) u10).f6271a;
        } else if (!(u10 instanceof b1)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + u10).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = th2;
        }
        if (cancellationException == null) {
            return new h1("Parent job is ".concat(J(u10)), th2, v1Var);
        }
        return cancellationException;
    }

    public final Object o(o1 o1Var, Object obj) {
        v vVar;
        Throwable q5;
        Object obj2;
        Throwable th2 = null;
        if (obj instanceof v) {
            vVar = (v) obj;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            th2 = vVar.f6271a;
        }
        synchronized (o1Var) {
            o1Var.d();
            ArrayList f7 = o1Var.f(th2);
            q5 = q(o1Var, f7);
            if (q5 != null && f7.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f7.size()));
                int size = f7.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = f7.get(i10);
                    i10++;
                    Throwable th3 = (Throwable) obj3;
                    if (th3 != q5 && th3 != q5 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        hd.a(q5, th3);
                    }
                }
            }
        }
        if (q5 != null && q5 != th2) {
            obj = new v(q5, false);
        }
        if (q5 != null && (j(q5) || v(q5))) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            v.f6270b.compareAndSet((v) obj, 0, 1);
        }
        F(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6273a;
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
            throw ((v) u10).f6271a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override
    public final ld.h plus(ld.h hVar) {
        return yd.c(this, hVar);
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
        if (th3 instanceof e2) {
            int size2 = arrayList.size();
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i10);
                i10++;
                Throwable th4 = (Throwable) obj3;
                if (th4 != th3 && (th4 instanceof e2)) {
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

    public final w1 t(b1 b1Var) {
        w1 c10 = b1Var.c();
        if (c10 == null) {
            if (b1Var instanceof r0) {
                return new he.k();
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
            Object obj = f6273a.get(this);
            if (!(obj instanceof he.p)) {
                return obj;
            }
            ((he.p) obj).a(this);
        }
    }

    public boolean v(Throwable th2) {
        return false;
    }

    public final void x(g1 g1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6274b;
        x1 x1Var = x1.f6281a;
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

    public final ce.p0 y(boolean r9, boolean r10, ce.e1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: ce.v1.y(boolean, boolean, ce.e1):ce.p0");
    }

    public boolean z() {
        return this instanceof h;
    }

    @Override
    public final p0 invokeOnCompletion(boolean z10, boolean z11, ud.l lVar) {
        return y(z10, z11, new d1(lVar));
    }

    public void G() {
    }

    public void F(Object obj) {
    }

    public void b(Object obj) {
    }

    public void w(androidx.car.app.j jVar) {
        throw jVar;
    }
}
