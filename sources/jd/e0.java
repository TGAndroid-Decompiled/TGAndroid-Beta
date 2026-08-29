package jd;

import i7.a7;
import i7.c7;
import i7.r6;
import i7.s6;
import i7.v7;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class e0 {
    public static final fc.a f11460a = new fc.a("RESUME_TOKEN", 2);
    public static final fc.a f11461b = new fc.a("REMOVED_TASK", 2);
    public static final fc.a f11462c = new fc.a("CLOSED_EMPTY", 2);
    public static final fc.a d = new fc.a("COMPLETING_ALREADY", 2);
    public static final fc.a f11463e = new fc.a("COMPLETING_WAITING_CHILDREN", 2);
    public static final fc.a f11464f = new fc.a("COMPLETING_RETRY", 2);
    public static final fc.a f11465g = new fc.a("TOO_LATE_TO_CANCEL", 2);
    public static final fc.a h = new fc.a("SEALED", 2);
    public static final q0 f11466i = new q0(false);
    public static final q0 f11467j = new q0(true);

    public static t a() {
        ?? u1Var = new u1(true);
        u1Var.x(null);
        return u1Var;
    }

    public static final od.e b(sc.h hVar) {
        if (hVar.get(b0.f11447b) == null) {
            hVar = hVar.plus(new i1());
        }
        return new od.e(hVar);
    }

    public static i0 c(c0 c0Var, bd.p pVar) {
        d0 d0Var = d0.f11455a;
        sc.h i10 = i(c0Var.c(), sc.i.f47711a, true);
        qd.e eVar = m0.f11495a;
        if (i10 != eVar && i10.get(sc.d.f47710a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.f11455a;
        ?? aVar = new a(i10, true);
        aVar.L(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object d(h0[] h0VarArr, uc.i iVar) {
        if (h0VarArr.length == 0) {
            return rc.o.f47121a;
        }
        e eVar = new e(h0VarArr);
        m mVar = new m(1, v7.b(iVar));
        mVar.s();
        int length = h0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            h0 h0Var = h0VarArr[i10];
            h0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f11451f = n(h0Var, false, cVar, 3);
            cVarArr[i10] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar2 = cVarArr[i11];
            cVar2.getClass();
            c.f11449n.set(cVar2, dVar);
        }
        if (!(m.h.get(mVar) instanceof x1)) {
            dVar.b();
        } else {
            mVar.v(dVar);
        }
        Object r6 = mVar.r();
        tc.a aVar = tc.a.f48210a;
        return r6;
    }

    public static final void e(sc.h hVar, CancellationException cancellationException) {
        f1 f1Var = (f1) hVar.get(b0.f11447b);
        if (f1Var != null) {
            f1Var.cancel(cancellationException);
        }
    }

    public static final Object f(bd.p pVar, sc.c cVar) {
        od.t tVar = new od.t(cVar, cVar.getContext());
        Object a2 = s6.a(tVar, tVar, pVar);
        tc.a aVar = tc.a.f48210a;
        return a2;
    }

    public static final Object g(long j10, uc.c cVar) {
        if (j10 > 0) {
            m mVar = new m(1, v7.b(cVar));
            mVar.s();
            if (j10 < Long.MAX_VALUE) {
                j(mVar.f11494e).b(j10, mVar);
            }
            Object r6 = mVar.r();
            if (r6 == tc.a.f48210a) {
                return r6;
            }
        }
        return qc.i.f46603a;
    }

    public static final void h(sc.h hVar) {
        f1 f1Var = (f1) hVar.get(b0.f11447b);
        if (f1Var != null && !f1Var.isActive()) {
            throw f1Var.getCancellationException();
        }
    }

    public static final sc.h i(sc.h hVar, sc.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        x xVar = x.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, xVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, xVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        x xVar2 = new x(2, 2);
        sc.i iVar = sc.i.f47711a;
        sc.h hVar3 = (sc.h) hVar.fold(iVar, xVar2);
        sc.h hVar4 = hVar2;
        if (booleanValue2) {
            hVar4 = hVar2.fold(iVar, x.f11539c);
        }
        return hVar3.plus(hVar4);
    }

    public static final j0 j(sc.h hVar) {
        j0 j0Var;
        sc.f fVar = hVar.get(sc.d.f47710a);
        if (fVar instanceof j0) {
            j0Var = (j0) fVar;
        } else {
            j0Var = null;
        }
        if (j0Var == null) {
            return g0.f11480a;
        }
        return j0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(sc.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof od.h)) {
            return new m(1, cVar);
        }
        od.h hVar = (od.h) cVar;
        fc.a aVar = od.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = od.h.f19513n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, aVar);
                mVar2 = null;
                break;
            } else if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, aVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            } else if (obj != aVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (mVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m.h;
            Object obj2 = atomicReferenceFieldUpdater2.get(mVar2);
            if ((obj2 instanceof u) && ((u) obj2).d != null) {
                mVar2.o();
            } else {
                m.f11492f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.f11445a);
                mVar = mVar2;
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new m(2, cVar);
    }

    public static final void m(Throwable th2, sc.h hVar) {
        try {
            kd.b bVar = (kd.b) hVar.get(b0.f11446a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                od.a.c(th2, hVar);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                a7.a(runtimeException, th2);
                th2 = runtimeException;
            }
            od.a.c(th2, hVar);
        }
    }

    public static o0 n(f1 f1Var, boolean z10, k1 k1Var, int i10) {
        boolean z11 = false;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if (f1Var instanceof u1) {
            return ((u1) f1Var).y(z10, z11, k1Var);
        }
        return f1Var.invokeOnCompletion(z10, z11, new kotlin.jvm.internal.h(1, k1Var, d1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final java.lang.Object o(java.util.Collection r4, uc.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: jd.e0.o(java.util.Collection, uc.c):java.lang.Object");
    }

    public static final java.lang.Object p(jd.f1[] r6, uc.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: jd.e0.p(jd.f1[], uc.c):java.lang.Object");
    }

    public static z1 q(c0 c0Var, bd.p pVar) {
        d0 d0Var = d0.f11455a;
        sc.h i10 = i(c0Var.c(), sc.i.f47711a, true);
        qd.e eVar = m0.f11495a;
        if (i10 != eVar && i10.get(sc.d.f47710a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.f11455a;
        ?? aVar = new a(i10, true);
        aVar.L(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object r(Object obj) {
        if (obj instanceof v) {
            return c7.a(((v) obj).f11532a);
        }
        return obj;
    }

    public static final void s(m mVar, sc.c cVar, boolean z10) {
        Object h10;
        g2 g2Var;
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        if (g10 != null) {
            h10 = c7.a(g10);
        } else {
            h10 = mVar.h(obj);
        }
        if (z10) {
            kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            od.h hVar = (od.h) cVar;
            uc.c cVar2 = hVar.f19514e;
            Object obj2 = hVar.h;
            sc.h context = cVar2.getContext();
            Object k9 = od.a.k(context, obj2);
            if (k9 != od.a.f19505f) {
                g2Var = v(cVar2, context, k9);
            } else {
                g2Var = null;
            }
            try {
                cVar2.resumeWith(h10);
                if (g2Var != null && !g2Var.M()) {
                    return;
                }
                od.a.f(context, k9);
                return;
            } catch (Throwable th2) {
                if (g2Var == null || g2Var.M()) {
                    od.a.f(context, k9);
                }
                throw th2;
            }
        }
        cVar.resumeWith(h10);
    }

    public static final String t(sc.c cVar) {
        Object a2;
        if (cVar instanceof od.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th2) {
            a2 = c7.a(th2);
        }
        if (qc.f.a(a2) != null) {
            a2 = cVar.getClass().getName() + '@' + k(cVar);
        }
        return (String) a2;
    }

    public static final Object u(Object obj) {
        b1 b1Var;
        a1 a1Var;
        if (obj instanceof b1) {
            b1Var = (b1) obj;
        } else {
            b1Var = null;
        }
        if (b1Var != null && (a1Var = b1Var.f11448a) != null) {
            return a1Var;
        }
        return obj;
    }

    public static final g2 v(sc.c cVar, sc.h hVar, Object obj) {
        g2 g2Var = null;
        if ((cVar instanceof uc.d) && hVar.get(h2.f11484a) != null) {
            uc.d dVar = (uc.d) cVar;
            while (true) {
                if (!(dVar instanceof k0) && (dVar = dVar.getCallerFrame()) != null) {
                    if (dVar instanceof g2) {
                        g2Var = (g2) dVar;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (g2Var != null) {
                g2Var.N(hVar, obj);
            }
        }
        return g2Var;
    }

    public static final Object w(sc.h hVar, bd.p pVar, sc.c cVar) {
        sc.h i10;
        Object u10;
        sc.h context = cVar.getContext();
        if (!((Boolean) hVar.fold(Boolean.FALSE, x.d)).booleanValue()) {
            i10 = context.plus(hVar);
        } else {
            i10 = i(context, hVar, false);
        }
        h(i10);
        if (i10 == context) {
            od.t tVar = new od.t(cVar, i10);
            u10 = s6.a(tVar, tVar, pVar);
        } else {
            sc.d dVar = sc.d.f47710a;
            if (kotlin.jvm.internal.j.a(i10.get(dVar), context.get(dVar))) {
                g2 g2Var = new g2(cVar, i10);
                sc.h hVar2 = g2Var.f11443c;
                Object k9 = od.a.k(hVar2, null);
                try {
                    Object a2 = s6.a(g2Var, g2Var, pVar);
                    od.a.f(hVar2, k9);
                    u10 = a2;
                } catch (Throwable th2) {
                    od.a.f(hVar2, k9);
                    throw th2;
                }
            } else {
                od.t tVar2 = new od.t(cVar, i10);
                r6.a(pVar, tVar2, tVar2);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k0.f11489e;
                while (true) {
                    int i11 = atomicIntegerFieldUpdater.get(tVar2);
                    if (i11 != 0) {
                        if (i11 == 2) {
                            u10 = u(tVar2.u());
                            if (u10 instanceof v) {
                                throw ((v) u10).f11532a;
                            }
                        } else {
                            throw new IllegalStateException("Already suspended");
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(tVar2, 0, 1)) {
                        u10 = tc.a.f48210a;
                        break;
                    }
                }
            }
        }
        tc.a aVar = tc.a.f48210a;
        return u10;
    }

    public static final Object x(long j10, bd.p pVar, sc.c cVar) {
        Object vVar;
        Object B;
        if (j10 > 0) {
            e2 e2Var = new e2(j10, cVar);
            n(e2Var, false, new p0(j(e2Var.d.getContext()).a(e2Var.f11470e, e2Var, e2Var.f11443c), 0), 3);
            try {
                kotlin.jvm.internal.t.a(2, pVar);
                vVar = pVar.invoke(e2Var, e2Var);
            } catch (Throwable th2) {
                vVar = new v(th2, false);
            }
            Object obj = tc.a.f48210a;
            if (vVar != obj && (B = e2Var.B(vVar)) != f11463e) {
                if (B instanceof v) {
                    Throwable th3 = ((v) B).f11532a;
                    if ((th3 instanceof d2) && ((d2) th3).f11457a == e2Var) {
                        if (vVar instanceof v) {
                            throw ((v) vVar).f11532a;
                        }
                    } else {
                        throw th3;
                    }
                } else {
                    vVar = u(B);
                }
                return vVar;
            }
            return obj;
        }
        throw new d2("Timed out immediately", null);
    }
}
