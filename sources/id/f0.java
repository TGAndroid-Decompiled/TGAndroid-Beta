package id;

import h7.h7;
import h7.i6;
import h7.k6;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class f0 {

    public static final ec.a f11139a;

    public static final ec.a f11140b;

    public static final ec.a f11141c;
    public static final ec.a d;

    public static final ec.a f11142e;

    public static final ec.a f11143f;

    public static final ec.a f11144g;
    public static final ec.a h;

    public static final r0 f11145i = new r0(false);

    public static final r0 f11146j = new r0(true);

    static {
        int i10 = 3;
        f11139a = new ec.a("RESUME_TOKEN", i10);
        f11140b = new ec.a("REMOVED_TASK", i10);
        f11141c = new ec.a("CLOSED_EMPTY", i10);
        d = new ec.a("COMPLETING_ALREADY", i10);
        f11142e = new ec.a("COMPLETING_WAITING_CHILDREN", i10);
        f11143f = new ec.a("COMPLETING_RETRY", i10);
        f11144g = new ec.a("TOO_LATE_TO_CANCEL", i10);
        h = new ec.a("SEALED", i10);
    }

    public static t a() {
        t tVar = new t(true);
        tVar.x(null);
        return tVar;
    }

    public static final nd.e b(rc.h hVar) {
        if (hVar.get(b0.f11122b) == null) {
            hVar = hVar.plus(new j1());
        }
        return new nd.e(hVar);
    }

    public static j0 c(c0 c0Var, ad.p pVar) {
        d0 d0Var = d0.f11128a;
        rc.h hVarI = i(c0Var.c(), rc.i.f46899a, true);
        pd.e eVar = n0.f11171a;
        if (hVarI != eVar && hVarI.get(rc.d.f46898a) == null) {
            hVarI = hVarI.plus(eVar);
        }
        d0 d0Var2 = d0.f11128a;
        j0 j0Var = new j0(hVarI, true);
        j0Var.L(d0Var, j0Var, pVar);
        return j0Var;
    }

    public static final Object d(i0[] i0VarArr, tc.i iVar) {
        if (i0VarArr.length == 0) {
            return qc.o.f46210a;
        }
        e eVar = new e(i0VarArr);
        m mVar = new m(1, h7.b(iVar));
        mVar.s();
        int length = i0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            i0 i0Var = i0VarArr[i10];
            i0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f11125f = n(i0Var, false, cVar, 3);
            cVarArr[i10] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar2 = cVarArr[i11];
            cVar2.getClass();
            c.f11123n.set(cVar2, dVar);
        }
        if (m.h.get(mVar) instanceof y1) {
            mVar.v(dVar);
        } else {
            dVar.b();
        }
        Object objR = mVar.r();
        sc.a aVar = sc.a.f47847a;
        return objR;
    }

    public static final void e(rc.h hVar, CancellationException cancellationException) {
        g1 g1Var = (g1) hVar.get(b0.f11122b);
        if (g1Var != null) {
            g1Var.cancel(cancellationException);
        }
    }

    public static final Object f(ad.p pVar, rc.c cVar) {
        nd.s sVar = new nd.s(cVar, cVar.getContext());
        Object objA = h7.i0.a(sVar, sVar, pVar);
        sc.a aVar = sc.a.f47847a;
        return objA;
    }

    public static final Object g(long j10, tc.c cVar) {
        if (j10 > 0) {
            m mVar = new m(1, h7.b(cVar));
            mVar.s();
            if (j10 < Long.MAX_VALUE) {
                j(mVar.f11167e).a(j10, mVar);
            }
            Object objR = mVar.r();
            if (objR == sc.a.f47847a) {
                return objR;
            }
        }
        return pc.i.f45696a;
    }

    public static final void h(rc.h hVar) {
        g1 g1Var = (g1) hVar.get(b0.f11122b);
        if (g1Var != null && !g1Var.isActive()) {
            throw g1Var.getCancellationException();
        }
    }

    public static final rc.h i(rc.h hVar, rc.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        x xVar = x.d;
        boolean zBooleanValue = ((Boolean) hVar.fold(bool, xVar)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) hVar2.fold(bool, xVar)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return hVar.plus(hVar2);
        }
        x xVar2 = new x(2, 2);
        rc.i iVar = rc.i.f46899a;
        rc.h hVar3 = (rc.h) hVar.fold(iVar, xVar2);
        Object objFold = hVar2;
        if (zBooleanValue2) {
            objFold = hVar2.fold(iVar, x.f11210c);
        }
        return hVar3.plus((rc.h) objFold);
    }

    public static final k0 j(rc.h hVar) {
        rc.f fVar = hVar.get(rc.d.f46898a);
        k0 k0Var = fVar instanceof k0 ? (k0) fVar : null;
        return k0Var == null ? h0.f11156a : k0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(rc.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof nd.h)) {
            return new m(1, cVar);
        }
        nd.h hVar = (nd.h) cVar;
        ec.a aVar = nd.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.h.f18486n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, aVar);
                mVar2 = null;
                break;
            }
            if (obj instanceof m) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, aVar)) {
                        mVar2 = (m) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(hVar) == obj);
            } else if (obj != aVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (mVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m.h;
            Object obj2 = atomicReferenceFieldUpdater2.get(mVar2);
            if (!(obj2 instanceof u) || ((u) obj2).d == null) {
                m.f11165f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.f11120a);
                mVar = mVar2;
            } else {
                mVar2.o();
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new m(2, cVar);
    }

    public static final void m(Throwable th, rc.h hVar) throws IllegalAccessException, InvocationTargetException {
        try {
            jd.b bVar = (jd.b) hVar.get(b0.f11121a);
            if (bVar != null) {
                bVar.c(th);
            } else {
                nd.a.c(th, hVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                i6.a(runtimeException, th);
                th = runtimeException;
            }
            nd.a.c(th, hVar);
        }
    }

    public static p0 n(g1 g1Var, boolean z10, l1 l1Var, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        return g1Var instanceof v1 ? ((v1) g1Var).y(z10, z11, l1Var) : g1Var.invokeOnCompletion(z10, z11, new k1(1, l1Var, e1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final Object o(Collection collection, tc.c cVar) {
        g gVar;
        Iterator it;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f11152c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f11152c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(cVar);
            }
        } else {
            gVar = new g(cVar);
        }
        Object obj = gVar.f11151b;
        sc.a aVar = sc.a.f47847a;
        int i11 = gVar.f11152c;
        if (i11 == 0) {
            k6.b(obj);
            it = collection.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = gVar.f11150a;
            k6.b(obj);
        }
        while (it.hasNext()) {
            g1 g1Var = (g1) it.next();
            gVar.f11150a = it;
            gVar.f11152c = 1;
            if (g1Var.join(gVar) == aVar) {
                return aVar;
            }
        }
        return pc.i.f45696a;
    }

    public static final java.lang.Object p(id.g1[] r6, tc.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: id.f0.p(id.g1[], tc.c):java.lang.Object");
    }

    public static a2 q(c0 c0Var, ad.p pVar) {
        d0 d0Var = d0.f11128a;
        rc.h hVarI = i(c0Var.c(), rc.i.f46899a, true);
        pd.e eVar = n0.f11171a;
        if (hVarI != eVar && hVarI.get(rc.d.f46898a) == null) {
            hVarI = hVarI.plus(eVar);
        }
        d0 d0Var2 = d0.f11128a;
        a2 a2Var = new a2(hVarI, true);
        a2Var.L(d0Var, a2Var, pVar);
        return a2Var;
    }

    public static final Object r(Object obj) {
        return obj instanceof v ? k6.a(((v) obj).f11204a) : obj;
    }

    public static final void s(m mVar, rc.c cVar, boolean z10) {
        Object obj = m.h.get(mVar);
        Throwable thG = mVar.g(obj);
        Object objA = thG != null ? k6.a(thG) : mVar.h(obj);
        if (!z10) {
            cVar.resumeWith(objA);
            return;
        }
        kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        nd.h hVar = (nd.h) cVar;
        tc.c cVar2 = hVar.f18487e;
        Object obj2 = hVar.h;
        rc.h context = cVar2.getContext();
        Object objK = nd.a.k(context, obj2);
        h2 h2VarV = objK != nd.a.f18478f ? v(cVar2, context, objK) : null;
        try {
            cVar2.resumeWith(objA);
        } finally {
            if (h2VarV == null || h2VarV.M()) {
                nd.a.f(context, objK);
            }
        }
    }

    public static final String t(rc.c cVar) {
        Object objA;
        if (cVar instanceof nd.h) {
            return cVar.toString();
        }
        try {
            objA = cVar + '@' + k(cVar);
        } catch (Throwable th) {
            objA = k6.a(th);
        }
        if (pc.f.a(objA) != null) {
            objA = cVar.getClass().getName() + '@' + k(cVar);
        }
        return (String) objA;
    }

    public static final Object u(Object obj) {
        b1 b1Var;
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return (c1Var == null || (b1Var = c1Var.f11126a) == null) ? obj : b1Var;
    }

    public static final h2 v(rc.c cVar, rc.h hVar, Object obj) {
        h2 h2Var = null;
        if ((cVar instanceof tc.d) && hVar.get(i2.f11160a) != null) {
            tc.d callerFrame = (tc.d) cVar;
            while (!(callerFrame instanceof l0) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof h2) {
                    h2Var = (h2) callerFrame;
                    break;
                }
            }
            if (h2Var != null) {
                h2Var.N(hVar, obj);
            }
        }
        return h2Var;
    }

    public static final Object w(rc.h hVar, ad.p pVar, rc.c cVar) throws Throwable {
        Object objU;
        rc.h context = cVar.getContext();
        rc.h hVarPlus = !((Boolean) hVar.fold(Boolean.FALSE, x.d)).booleanValue() ? context.plus(hVar) : i(context, hVar, false);
        h(hVarPlus);
        if (hVarPlus == context) {
            nd.s sVar = new nd.s(cVar, hVarPlus);
            objU = h7.i0.a(sVar, sVar, pVar);
        } else {
            rc.d dVar = rc.d.f46898a;
            if (kotlin.jvm.internal.j.a(hVarPlus.get(dVar), context.get(dVar))) {
                h2 h2Var = new h2(cVar, hVarPlus);
                rc.h hVar2 = h2Var.f11117c;
                Object objK = nd.a.k(hVar2, null);
                try {
                    Object objA = h7.i0.a(h2Var, h2Var, pVar);
                    nd.a.f(hVar2, objK);
                    objU = objA;
                } catch (Throwable th) {
                    nd.a.f(hVar2, objK);
                    throw th;
                }
            } else {
                l0 l0Var = new l0(cVar, hVarPlus);
                h7.h0.a(pVar, l0Var, l0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l0.f11164e;
                do {
                    int i10 = atomicIntegerFieldUpdater.get(l0Var);
                    if (i10 != 0) {
                        if (i10 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objU = u(l0Var.u());
                        if (objU instanceof v) {
                            throw ((v) objU).f11204a;
                        }
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(l0Var, 0, 1));
                objU = sc.a.f47847a;
            }
        }
        sc.a aVar = sc.a.f47847a;
        return objU;
    }

    public static final Object x(long j10, ad.p pVar, rc.c cVar) throws Throwable {
        Object vVar;
        Object objB;
        if (j10 <= 0) {
            throw new e2("Timed out immediately", null);
        }
        f2 f2Var = new f2(j10, cVar);
        n(f2Var, false, new q0(j(f2Var.d.getContext()).b(f2Var.f11149e, f2Var, f2Var.f11117c), 0), 3);
        try {
            kotlin.jvm.internal.t.a(2, pVar);
            vVar = pVar.invoke(f2Var, f2Var);
        } catch (Throwable th) {
            vVar = new v(th, false);
        }
        Object obj = sc.a.f47847a;
        if (vVar == obj || (objB = f2Var.B(vVar)) == f11142e) {
            return obj;
        }
        if (objB instanceof v) {
            Throwable th2 = ((v) objB).f11204a;
            if (!(th2 instanceof e2) || ((e2) th2).f11134a != f2Var) {
                throw th2;
            }
            if (vVar instanceof v) {
                throw ((v) vVar).f11204a;
            }
        } else {
            vVar = u(objB);
        }
        return vVar;
    }
}
