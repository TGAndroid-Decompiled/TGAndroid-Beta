package id;

import h7.h7;
import h7.i6;
import h7.y6;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class v1 implements g1, r, z1 {

    public static final AtomicReferenceFieldUpdater f11206a = AtomicReferenceFieldUpdater.newUpdater(v1.class, Object.class, "_state$volatile");

    public static final AtomicReferenceFieldUpdater f11207b = AtomicReferenceFieldUpdater.newUpdater(v1.class, Object.class, "_parentHandle$volatile");
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    public v1(boolean z10) {
        this._state$volatile = z10 ? f0.f11146j : f0.f11145i;
    }

    public static q D(nd.k kVar) {
        while (kVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.k.f18494b;
            nd.k kVarD = kVar.d();
            if (kVarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (nd.k) obj;
                    if (!kVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = kVarD;
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
        if (!(obj instanceof o1)) {
            if (obj instanceof b1) {
                return ((b1) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof v ? "Cancelled" : "Completed";
        }
        o1 o1Var = (o1) obj;
        if (o1Var.d()) {
            return "Cancelling";
        }
        return o1Var.e() ? "Completing" : "Active";
    }

    public final boolean A(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objK;
        do {
            objK = K(u(), obj);
            if (objK == f0.d) {
                return false;
            }
            if (objK == f0.f11142e) {
                return true;
            }
        } while (objK == f0.f11143f);
        f(objK);
        return true;
    }

    public final Object B(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objK;
        do {
            objK = K(u(), obj);
            if (objK == f0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                v vVar = obj instanceof v ? (v) obj : null;
                throw new IllegalStateException(str, vVar != null ? vVar.f11204a : null);
            }
        } while (objK == f0.f11143f);
        return objK;
    }

    public String C() {
        return getClass().getSimpleName();
    }

    public final void E(w1 w1Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Object objF = w1Var.f();
        kotlin.jvm.internal.j.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        a7.c cVar = null;
        for (nd.k kVarG = (nd.k) objF; !kVarG.equals(w1Var); kVarG = kVarG.g()) {
            if (kVarG instanceof i1) {
                l1 l1Var = (l1) kVarG;
                try {
                    l1Var.a(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        i6.a(cVar, th2);
                    } else {
                        cVar = new a7.c("Exception in completion handler " + l1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            w(cVar);
        }
        j(th);
    }

    public final void H(l1 l1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        w1 w1Var = new w1();
        l1Var.getClass();
        nd.k.f18494b.set(w1Var, l1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = nd.k.f18493a;
        atomicReferenceFieldUpdater2.set(w1Var, l1Var);
        loop0: while (l1Var.f() == l1Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(l1Var, l1Var, w1Var)) {
                    w1Var.e(l1Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(l1Var) == l1Var);
        }
        nd.k kVarG = l1Var.g();
        do {
            atomicReferenceFieldUpdater = f11206a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, l1Var, kVarG)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == l1Var);
    }

    public final int I(Object obj) {
        boolean z10 = obj instanceof r0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11206a;
        if (z10) {
            if (((r0) obj).f11187a) {
                return 0;
            }
            r0 r0Var = f0.f11146j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, r0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof a1)) {
            return 0;
        }
        w1 w1Var = ((a1) obj).f11119a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object K(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        if (!(obj instanceof b1)) {
            return f0.d;
        }
        if (((obj instanceof r0) || (obj instanceof l1)) && !(obj instanceof q) && !(obj2 instanceof v)) {
            b1 b1Var = (b1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11206a;
            Object c1Var = obj2 instanceof b1 ? new c1((b1) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, b1Var, c1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                    return f0.f11143f;
                }
            }
            F(obj2);
            m(b1Var, obj2);
            return obj2;
        }
        b1 b1Var2 = (b1) obj;
        w1 w1VarT = t(b1Var2);
        if (w1VarT == null) {
            return f0.f11143f;
        }
        q qVarD = null;
        o1 o1Var = b1Var2 instanceof o1 ? (o1) b1Var2 : null;
        if (o1Var == null) {
            o1Var = new o1(w1VarT, null);
        }
        synchronized (o1Var) {
            if (o1Var.e()) {
                return f0.d;
            }
            o1.f11178b.set(o1Var, 1);
            if (o1Var != b1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11206a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, b1Var2, o1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != b1Var2) {
                        return f0.f11143f;
                    }
                }
            }
            boolean zD = o1Var.d();
            v vVar = obj2 instanceof v ? (v) obj2 : null;
            if (vVar != null) {
                o1Var.a(vVar.f11204a);
            }
            Throwable thB = o1Var.b();
            if (zD) {
                thB = null;
            }
            if (thB != null) {
                E(w1VarT, thB);
            }
            q qVar = b1Var2 instanceof q ? (q) b1Var2 : null;
            if (qVar == null) {
                w1 w1VarC = b1Var2.c();
                if (w1VarC != null) {
                    qVarD = D(w1VarC);
                }
            } else {
                qVarD = qVar;
            }
            if (qVarD != null) {
                while (f0.n(qVarD.f11181e, false, new n1(this, o1Var, qVarD, obj2), 1) == x1.f11215a) {
                    qVarD = D(qVarD);
                    if (qVarD == null) {
                    }
                }
                return f0.f11142e;
            }
            return o(o1Var, obj2);
        }
    }

    public final boolean a(b1 b1Var, w1 w1Var, l1 l1Var) {
        nd.k kVarD;
        q1 q1Var = new q1(l1Var, this, b1Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.k.f18494b;
            kVarD = w1Var.d();
            if (kVarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(w1Var);
                while (true) {
                    kVarD = (nd.k) obj;
                    if (!kVarD.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVarD);
                }
            }
            nd.k.f18494b.set(l1Var, kVarD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = nd.k.f18493a;
            atomicReferenceFieldUpdater2.set(l1Var, w1Var);
            q1Var.f11185c = w1Var;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(kVarD, w1Var, q1Var)) {
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(kVarD) == w1Var);
        }
        return q1Var.a(kVarD) == null;
    }

    @Override
    public final p attachChild(r rVar) {
        p0 p0VarN = f0.n(this, true, new q(rVar), 2);
        kotlin.jvm.internal.j.c(p0VarN, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (p) p0VarN;
    }

    @Override
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new h1(k(), null, this);
        }
        i(cancellationException);
    }

    @Override
    public final Object fold(Object obj, ad.p pVar) {
        return pVar.invoke(obj, this);
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override
    public final rc.f get(rc.g gVar) {
        return y6.a(this, gVar);
    }

    @Override
    public final CancellationException getCancellationException() {
        CancellationException cancellationException;
        Object objU = u();
        if (!(objU instanceof o1)) {
            if (objU instanceof b1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objU instanceof v)) {
                return new h1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((v) objU).f11204a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new h1(k(), th, this) : cancellationException;
        }
        Throwable thB = ((o1) objU).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = k();
        }
        return new h1(strConcat, thB, this);
    }

    @Override
    public final fd.b getChildren() {
        return new fd.e(new r1(this, null), 0);
    }

    public Object getCompleted() {
        return p();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object objU = u();
        if (objU instanceof b1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        v vVar = objU instanceof v ? (v) objU : null;
        if (vVar != null) {
            return vVar.f11204a;
        }
        return null;
    }

    @Override
    public final rc.g getKey() {
        return b0.f11122b;
    }

    @Override
    public final g1 getParent() {
        p pVar = (p) f11207b.get(this);
        if (pVar != null) {
            return pVar.getParent();
        }
        return null;
    }

    public final Object h(rc.c cVar) throws Throwable {
        Object objU;
        do {
            objU = u();
            if (!(objU instanceof b1)) {
                if (objU instanceof v) {
                    throw ((v) objU).f11204a;
                }
                return f0.u(objU);
            }
        } while (I(objU) < 0);
        m1 m1Var = new m1(this, h7.b(cVar));
        m1Var.s();
        m1Var.v(new j(f0.n(this, false, new q0(m1Var, 3), 3), 2));
        Object objR = m1Var.r();
        sc.a aVar = sc.a.f47847a;
        return objR;
    }

    public final boolean i(Object obj) {
        Throwable thN;
        Object objU;
        boolean z10;
        Throwable thB;
        ec.a aVar;
        b1 b1Var;
        w1 w1VarT;
        o1 o1Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objK;
        Object objK2 = f0.d;
        if (s()) {
            do {
                Object objU2 = u();
                if (!(objU2 instanceof b1) || ((objU2 instanceof o1) && ((o1) objU2).e())) {
                    objK2 = f0.d;
                    break;
                }
                objK2 = K(objU2, new v(n(obj), false));
            } while (objK2 == f0.f11143f);
            if (objK2 != f0.f11142e) {
                if (objK2 == f0.d) {
                    thN = null;
                    loop1: while (true) {
                        objU = u();
                        if (objU instanceof o1) {
                            synchronized (objU) {
                                if (o1.d.get((o1) objU) == f0.h) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    aVar = f0.f11144g;
                                } else {
                                    boolean zD = ((o1) objU).d();
                                    if (thN == null) {
                                        thN = n(obj);
                                    }
                                    ((o1) objU).a(thN);
                                    thB = zD ? null : ((o1) objU).b();
                                    if (thB != null) {
                                        E(((o1) objU).f11180a, thB);
                                    }
                                    aVar = f0.d;
                                }
                            }
                        } else if (objU instanceof b1) {
                            if (thN == null) {
                                thN = n(obj);
                            }
                            b1Var = (b1) objU;
                            if (b1Var.isActive()) {
                                w1VarT = t(b1Var);
                                if (w1VarT == null) {
                                    continue;
                                } else {
                                    o1Var = new o1(w1VarT, thN);
                                    atomicReferenceFieldUpdater = f11206a;
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, b1Var, o1Var)) {
                                            E(w1VarT, thN);
                                            aVar = f0.d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                                        }
                                    }
                                }
                            } else {
                                objK = K(objU, new v(thN, false));
                                if (objK != f0.d) {
                                    throw new IllegalStateException(("Cannot happen in " + objU).toString());
                                }
                                if (objK != f0.f11143f) {
                                    objK2 = objK;
                                    break;
                                }
                            }
                        } else {
                            aVar = f0.f11144g;
                        }
                        objK2 = aVar;
                        break;
                    }
                }
                if (objK2 != f0.d && objK2 != f0.f11142e) {
                    if (objK2 == f0.f11144g) {
                        return false;
                    }
                    f(objK2);
                    return true;
                }
            }
        } else {
            if (objK2 == f0.d) {
                thN = null;
                loop1: while (true) {
                    objU = u();
                    if (objU instanceof o1) {
                        synchronized (objU) {
                            if (o1.d.get((o1) objU) == f0.h) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                aVar = f0.f11144g;
                            } else {
                                boolean zD2 = ((o1) objU).d();
                                if (thN == null) {
                                    thN = n(obj);
                                }
                                ((o1) objU).a(thN);
                                if (zD2) {
                                }
                                if (thB != null) {
                                    E(((o1) objU).f11180a, thB);
                                }
                                aVar = f0.d;
                            }
                        }
                    } else if (objU instanceof b1) {
                        if (thN == null) {
                            thN = n(obj);
                        }
                        b1Var = (b1) objU;
                        if (b1Var.isActive()) {
                            w1VarT = t(b1Var);
                            if (w1VarT == null) {
                                continue;
                            } else {
                                o1Var = new o1(w1VarT, thN);
                                atomicReferenceFieldUpdater = f11206a;
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, b1Var, o1Var)) {
                                        E(w1VarT, thN);
                                        aVar = f0.d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                                    }
                                }
                            }
                        } else {
                            objK = K(objU, new v(thN, false));
                            if (objK != f0.d) {
                                throw new IllegalStateException(("Cannot happen in " + objU).toString());
                            }
                            if (objK != f0.f11143f) {
                                objK2 = objK;
                                break;
                            }
                        }
                    } else {
                        aVar = f0.f11144g;
                    }
                    objK2 = aVar;
                    break;
                }
            }
            if (objK2 != f0.d) {
                if (objK2 == f0.f11144g) {
                    return false;
                }
                f(objK2);
                return true;
            }
        }
        return true;
    }

    @Override
    public final p0 invokeOnCompletion(ad.l lVar) {
        return y(false, true, new d1(lVar));
    }

    @Override
    public boolean isActive() {
        Object objU = u();
        return (objU instanceof b1) && ((b1) objU).isActive();
    }

    @Override
    public final boolean isCancelled() {
        Object objU = u();
        if (objU instanceof v) {
            return true;
        }
        return (objU instanceof o1) && ((o1) objU).d();
    }

    public final boolean j(Throwable th) {
        if (z()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        p pVar = (p) f11207b.get(this);
        if (pVar == null || pVar == x1.f11215a) {
            return z10;
        }
        return pVar.b(th) || z10;
    }

    @Override
    public final Object join(rc.c cVar) {
        Object objU;
        pc.i iVar;
        do {
            objU = u();
            boolean z10 = objU instanceof b1;
            iVar = pc.i.f45696a;
            if (!z10) {
                f0.h(cVar.getContext());
                return iVar;
            }
        } while (I(objU) < 0);
        m mVar = new m(1, h7.b(cVar));
        mVar.s();
        mVar.v(new j(f0.n(this, false, new q0(mVar, 4), 3), 2));
        Object objR = mVar.r();
        sc.a aVar = sc.a.f47847a;
        if (objR != aVar) {
            objR = iVar;
        }
        return objR == aVar ? objR : iVar;
    }

    public String k() {
        return "Job was cancelled";
    }

    public boolean l(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return i(th) && r();
    }

    public final void m(b1 b1Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11207b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar != null) {
            pVar.dispose();
            atomicReferenceFieldUpdater.set(this, x1.f11215a);
        }
        a7.c cVar = null;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th = vVar != null ? vVar.f11204a : null;
        if (b1Var instanceof l1) {
            try {
                ((l1) b1Var).a(th);
                return;
            } catch (Throwable th2) {
                w(new a7.c("Exception in completion handler " + b1Var + " for " + this, th2));
                return;
            }
        }
        w1 w1VarC = b1Var.c();
        if (w1VarC != null) {
            Object objF = w1VarC.f();
            kotlin.jvm.internal.j.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (nd.k kVarG = (nd.k) objF; !kVarG.equals(w1VarC); kVarG = kVarG.g()) {
                if (kVarG instanceof l1) {
                    l1 l1Var = (l1) kVarG;
                    try {
                        l1Var.a(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            i6.a(cVar, th3);
                        } else {
                            cVar = new a7.c("Exception in completion handler " + l1Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                w(cVar);
            }
        }
    }

    @Override
    public final rc.h minusKey(rc.g gVar) {
        return y6.b(this, gVar);
    }

    public final Throwable n(Object obj) {
        Throwable thB;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        v1 v1Var = (v1) ((z1) obj);
        Object objU = v1Var.u();
        if (objU instanceof o1) {
            thB = ((o1) objU).b();
        } else if (objU instanceof v) {
            thB = ((v) objU).f11204a;
        } else {
            if (objU instanceof b1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objU).toString());
            }
            thB = null;
        }
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        return cancellationException == null ? new h1("Parent job is ".concat(J(objU)), thB, v1Var) : cancellationException;
    }

    public final Object o(o1 o1Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thQ;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th = vVar != null ? vVar.f11204a : null;
        synchronized (o1Var) {
            o1Var.d();
            ArrayList arrayListF = o1Var.f(th);
            thQ = q(o1Var, arrayListF);
            if (thQ != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                int size = arrayListF.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayListF.get(i10);
                    i10++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thQ && th2 != thQ && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        i6.a(thQ, th2);
                    }
                }
            }
        }
        if (thQ != null && thQ != th) {
            obj = new v(thQ, false);
        }
        if (thQ != null && (j(thQ) || v(thQ))) {
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            v.f11203b.compareAndSet((v) obj, 0, 1);
        }
        F(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11206a;
        Object c1Var = obj instanceof b1 ? new c1((b1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, o1Var, c1Var) && atomicReferenceFieldUpdater.get(this) == o1Var) {
        }
        m(o1Var, obj);
        return obj;
    }

    public final Object p() throws Throwable {
        Object objU = u();
        if (objU instanceof b1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objU instanceof v) {
            throw ((v) objU).f11204a;
        }
        return f0.u(objU);
    }

    @Override
    public final rc.h plus(rc.h hVar) {
        return y6.c(this, hVar);
    }

    public final Throwable q(o1 o1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (o1Var.d()) {
                return new h1(k(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        do {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof e2) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj3 = arrayList.get(i10);
                i10++;
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
        w1 w1VarC = b1Var.c();
        if (w1VarC != null) {
            return w1VarC;
        }
        if (b1Var instanceof r0) {
            return new w1();
        }
        if (b1Var instanceof l1) {
            H((l1) b1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + b1Var).toString());
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
            Object obj = f11206a.get(this);
            if (!(obj instanceof nd.p)) {
                return obj;
            }
            ((nd.p) obj).a(this);
        }
    }

    public boolean v(Throwable th) {
        return false;
    }

    public final void x(g1 g1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11207b;
        x1 x1Var = x1.f11215a;
        if (g1Var == null) {
            atomicReferenceFieldUpdater.set(this, x1Var);
            return;
        }
        g1Var.start();
        p pVarAttachChild = g1Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, pVarAttachChild);
        if (u() instanceof b1) {
            return;
        }
        pVarAttachChild.dispose();
        atomicReferenceFieldUpdater.set(this, x1Var);
    }

    public final p0 y(boolean z10, boolean z11, e1 e1Var) {
        l1 q0Var;
        Throwable thB;
        if (z10) {
            q0Var = e1Var instanceof i1 ? (i1) e1Var : null;
            if (q0Var == null) {
                q0Var = new f1(e1Var);
            }
        } else {
            q0Var = e1Var instanceof l1 ? (l1) e1Var : null;
            if (q0Var == null) {
                q0Var = new q0(e1Var, 1);
            }
        }
        q0Var.d = this;
        loop0: while (true) {
            Object objU = u();
            if (objU instanceof r0) {
                r0 r0Var = (r0) objU;
                if (r0Var.f11187a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11206a;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, objU, q0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != objU) {
                        }
                    }
                    break loop0;
                }
                w1 w1Var = new w1();
                b1 a1Var = r0Var.f11187a ? w1Var : new a1(w1Var);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11206a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, r0Var, a1Var) && atomicReferenceFieldUpdater2.get(this) == r0Var) {
                }
            } else {
                if (!(objU instanceof b1)) {
                    if (z11) {
                        v vVar = objU instanceof v ? (v) objU : null;
                        e1Var.a(vVar != null ? vVar.f11204a : null);
                    }
                    return x1.f11215a;
                }
                b1 b1Var = (b1) objU;
                w1 w1VarC = b1Var.c();
                if (w1VarC == null) {
                    H((l1) objU);
                } else {
                    p0 p0Var = x1.f11215a;
                    if (z10 && (objU instanceof o1)) {
                        synchronized (objU) {
                            try {
                                thB = ((o1) objU).b();
                                if (thB == null || ((e1Var instanceof q) && !((o1) objU).e())) {
                                    if (a((b1) objU, w1VarC, q0Var)) {
                                        if (thB == null) {
                                            return q0Var;
                                        }
                                        p0Var = q0Var;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thB != null) {
                            if (z11) {
                                e1Var.a(thB);
                            }
                            return p0Var;
                        }
                        if (a(b1Var, w1VarC, q0Var)) {
                            break;
                            break;
                        }
                    } else {
                        thB = null;
                        if (thB != null) {
                            if (z11) {
                                e1Var.a(thB);
                            }
                            return p0Var;
                        }
                        if (a(b1Var, w1VarC, q0Var)) {
                            break;
                        }
                    }
                }
            }
        }
        return q0Var;
    }

    public boolean z() {
        return this instanceof h;
    }

    @Override
    public final p0 invokeOnCompletion(boolean z10, boolean z11, ad.l lVar) {
        return y(z10, z11, new d1(lVar));
    }

    public void G() {
    }

    public void F(Object obj) {
    }

    public void f(Object obj) {
    }

    public void w(a7.c cVar) {
        throw cVar;
    }
}
