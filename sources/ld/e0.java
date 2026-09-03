package ld;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k7.g7;
import k7.g8;
import k7.h7;
import k7.n7;
import k7.p7;
public abstract class e0 {
    public static final o3.c f11983a = new o3.c("RESUME_TOKEN", 14);
    public static final o3.c f11984b = new o3.c("REMOVED_TASK", 14);
    public static final o3.c f11985c = new o3.c("CLOSED_EMPTY", 14);
    public static final o3.c d = new o3.c("COMPLETING_ALREADY", 14);
    public static final o3.c e = new o3.c("COMPLETING_WAITING_CHILDREN", 14);
    public static final o3.c f11986f = new o3.c("COMPLETING_RETRY", 14);
    public static final o3.c f11987g = new o3.c("TOO_LATE_TO_CANCEL", 14);
    public static final o3.c h = new o3.c("SEALED", 14);
    public static final q0 f11988i = new q0(false);
    public static final q0 f11989j = new q0(true);

    public static t a() {
        ?? u1Var = new u1(true);
        u1Var.x(null);
        return u1Var;
    }

    public static final qd.e b(uc.h hVar) {
        if (hVar.get(b0.f11971b) == null) {
            hVar = hVar.plus(new i1());
        }
        return new qd.e(hVar);
    }

    public static i0 c(c0 c0Var, dd.p pVar) {
        d0 d0Var = d0.f11978a;
        uc.h i10 = i(c0Var.c(), uc.i.f45281a, true);
        sd.e eVar = m0.f12010a;
        if (i10 != eVar && i10.get(uc.d.f45280a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.f11978a;
        ?? aVar = new a(i10, true);
        aVar.L(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object d(h0[] h0VarArr, wc.i iVar) {
        if (h0VarArr.length == 0) {
            return tc.o.f44712a;
        }
        e eVar = new e(h0VarArr);
        m mVar = new m(1, g8.b(iVar));
        mVar.s();
        int length = h0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            h0 h0Var = h0VarArr[i10];
            h0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f11974f = n(h0Var, false, cVar, 3);
            cVarArr[i10] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar2 = cVarArr[i11];
            cVar2.getClass();
            c.f11973n.set(cVar2, dVar);
        }
        if (!(m.h.get(mVar) instanceof x1)) {
            dVar.b();
        } else {
            mVar.v(dVar);
        }
        Object r10 = mVar.r();
        vc.a aVar = vc.a.f45727a;
        return r10;
    }

    public static final void e(uc.h hVar, CancellationException cancellationException) {
        f1 f1Var = (f1) hVar.get(b0.f11971b);
        if (f1Var != null) {
            f1Var.cancel(cancellationException);
        }
    }

    public static final Object f(dd.p pVar, uc.c cVar) {
        qd.s sVar = new qd.s(cVar, cVar.getContext());
        Object a2 = h7.a(sVar, sVar, pVar);
        vc.a aVar = vc.a.f45727a;
        return a2;
    }

    public static final Object g(long j10, wc.c cVar) {
        if (j10 > 0) {
            m mVar = new m(1, g8.b(cVar));
            mVar.s();
            if (j10 < Long.MAX_VALUE) {
                j(mVar.e).b(j10, mVar);
            }
            Object r10 = mVar.r();
            if (r10 == vc.a.f45727a) {
                return r10;
            }
        }
        return sc.i.f44318a;
    }

    public static final void h(uc.h hVar) {
        f1 f1Var = (f1) hVar.get(b0.f11971b);
        if (f1Var != null && !f1Var.isActive()) {
            throw f1Var.getCancellationException();
        }
    }

    public static final uc.h i(uc.h hVar, uc.h hVar2, boolean z4) {
        Boolean bool = Boolean.FALSE;
        x xVar = x.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, xVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, xVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        x xVar2 = new x(2, 2);
        uc.i iVar = uc.i.f45281a;
        uc.h hVar3 = (uc.h) hVar.fold(iVar, xVar2);
        uc.h hVar4 = hVar2;
        if (booleanValue2) {
            hVar4 = hVar2.fold(iVar, x.f12046c);
        }
        return hVar3.plus(hVar4);
    }

    public static final j0 j(uc.h hVar) {
        j0 j0Var;
        uc.f fVar = hVar.get(uc.d.f45280a);
        if (fVar instanceof j0) {
            j0Var = (j0) fVar;
        } else {
            j0Var = null;
        }
        if (j0Var == null) {
            return g0.f11999a;
        }
        return j0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(uc.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof qd.h)) {
            return new m(1, cVar);
        }
        qd.h hVar = (qd.h) cVar;
        o3.c cVar2 = qd.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qd.h.f43054n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, cVar2);
                mVar2 = null;
                break;
            } else if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, cVar2)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            } else if (obj != cVar2 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (mVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m.h;
            Object obj2 = atomicReferenceFieldUpdater2.get(mVar2);
            if ((obj2 instanceof u) && ((u) obj2).d != null) {
                mVar2.o();
            } else {
                m.f12008f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.f11969a);
                mVar = mVar2;
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new m(2, cVar);
    }

    public static final void m(Throwable th2, uc.h hVar) {
        try {
            md.b bVar = (md.b) hVar.get(b0.f11970a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                qd.a.c(th2, hVar);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                n7.a(runtimeException, th2);
                th2 = runtimeException;
            }
            qd.a.c(th2, hVar);
        }
    }

    public static o0 n(f1 f1Var, boolean z4, k1 k1Var, int i10) {
        boolean z10 = false;
        if ((i10 & 1) != 0) {
            z4 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if (f1Var instanceof u1) {
            return ((u1) f1Var).y(z4, z10, k1Var);
        }
        return f1Var.invokeOnCompletion(z4, z10, new kotlin.jvm.internal.h(1, k1Var, d1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final java.lang.Object o(java.util.Collection r4, wc.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: ld.e0.o(java.util.Collection, wc.c):java.lang.Object");
    }

    public static final java.lang.Object p(ld.f1[] r6, wc.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: ld.e0.p(ld.f1[], wc.c):java.lang.Object");
    }

    public static z1 q(c0 c0Var, dd.p pVar) {
        d0 d0Var = d0.f11978a;
        uc.h i10 = i(c0Var.c(), uc.i.f45281a, true);
        sd.e eVar = m0.f12010a;
        if (i10 != eVar && i10.get(uc.d.f45280a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.f11978a;
        ?? aVar = new a(i10, true);
        aVar.L(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object r(Object obj) {
        if (obj instanceof v) {
            return p7.a(((v) obj).f12040a);
        }
        return obj;
    }

    public static final void s(m mVar, uc.c cVar, boolean z4) {
        Object h9;
        g2 g2Var;
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        if (g10 != null) {
            h9 = p7.a(g10);
        } else {
            h9 = mVar.h(obj);
        }
        if (z4) {
            kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            qd.h hVar = (qd.h) cVar;
            wc.c cVar2 = hVar.e;
            Object obj2 = hVar.h;
            uc.h context = cVar2.getContext();
            Object k10 = qd.a.k(context, obj2);
            if (k10 != qd.a.f43046f) {
                g2Var = v(cVar2, context, k10);
            } else {
                g2Var = null;
            }
            try {
                cVar2.resumeWith(h9);
                if (g2Var != null && !g2Var.M()) {
                    return;
                }
                qd.a.f(context, k10);
                return;
            } catch (Throwable th2) {
                if (g2Var == null || g2Var.M()) {
                    qd.a.f(context, k10);
                }
                throw th2;
            }
        }
        cVar.resumeWith(h9);
    }

    public static final String t(uc.c cVar) {
        Object a2;
        if (cVar instanceof qd.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th2) {
            a2 = p7.a(th2);
        }
        if (sc.f.a(a2) != null) {
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
        if (b1Var != null && (a1Var = b1Var.f11972a) != null) {
            return a1Var;
        }
        return obj;
    }

    public static final g2 v(uc.c cVar, uc.h hVar, Object obj) {
        g2 g2Var = null;
        if ((cVar instanceof wc.d) && hVar.get(h2.f12001a) != null) {
            wc.d dVar = (wc.d) cVar;
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

    public static final Object w(uc.h hVar, dd.p pVar, uc.c cVar) {
        uc.h i10;
        Object u10;
        uc.h context = cVar.getContext();
        if (!((Boolean) hVar.fold(Boolean.FALSE, x.d)).booleanValue()) {
            i10 = context.plus(hVar);
        } else {
            i10 = i(context, hVar, false);
        }
        h(i10);
        if (i10 == context) {
            qd.s sVar = new qd.s(cVar, i10);
            u10 = h7.a(sVar, sVar, pVar);
        } else {
            uc.d dVar = uc.d.f45280a;
            if (kotlin.jvm.internal.j.a(i10.get(dVar), context.get(dVar))) {
                g2 g2Var = new g2(cVar, i10);
                uc.h hVar2 = g2Var.f11967c;
                Object k10 = qd.a.k(hVar2, null);
                try {
                    Object a2 = h7.a(g2Var, g2Var, pVar);
                    qd.a.f(hVar2, k10);
                    u10 = a2;
                } catch (Throwable th2) {
                    qd.a.f(hVar2, k10);
                    throw th2;
                }
            } else {
                qd.s sVar2 = new qd.s(cVar, i10);
                g7.a(pVar, sVar2, sVar2);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k0.e;
                while (true) {
                    int i11 = atomicIntegerFieldUpdater.get(sVar2);
                    if (i11 != 0) {
                        if (i11 == 2) {
                            u10 = u(sVar2.u());
                            if (u10 instanceof v) {
                                throw ((v) u10).f12040a;
                            }
                        } else {
                            throw new IllegalStateException("Already suspended");
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(sVar2, 0, 1)) {
                        u10 = vc.a.f45727a;
                        break;
                    }
                }
            }
        }
        vc.a aVar = vc.a.f45727a;
        return u10;
    }

    public static final Object x(long j10, dd.p pVar, uc.c cVar) {
        Object vVar;
        Object B;
        if (j10 > 0) {
            e2 e2Var = new e2(j10, cVar);
            n(e2Var, false, new p0(j(e2Var.d.getContext()).a(e2Var.e, e2Var, e2Var.f11967c), 0), 3);
            try {
                kotlin.jvm.internal.t.a(2, pVar);
                vVar = pVar.invoke(e2Var, e2Var);
            } catch (Throwable th2) {
                vVar = new v(th2, false);
            }
            Object obj = vc.a.f45727a;
            if (vVar != obj && (B = e2Var.B(vVar)) != e) {
                if (B instanceof v) {
                    Throwable th3 = ((v) B).f12040a;
                    if ((th3 instanceof d2) && ((d2) th3).f11980a == e2Var) {
                        if (vVar instanceof v) {
                            throw ((v) vVar).f12040a;
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
