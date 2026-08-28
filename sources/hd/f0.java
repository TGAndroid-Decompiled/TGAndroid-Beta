package hd;

import g7.g7;
import g7.w5;
import g7.y5;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class f0 {
    public static final e5.c f10430a = new e5.c("RESUME_TOKEN", 2);
    public static final e5.c f10431b = new e5.c("REMOVED_TASK", 2);
    public static final e5.c f10432c = new e5.c("CLOSED_EMPTY", 2);
    public static final e5.c d = new e5.c("COMPLETING_ALREADY", 2);
    public static final e5.c f10433e = new e5.c("COMPLETING_WAITING_CHILDREN", 2);
    public static final e5.c f10434f = new e5.c("COMPLETING_RETRY", 2);
    public static final e5.c f10435g = new e5.c("TOO_LATE_TO_CANCEL", 2);
    public static final e5.c h = new e5.c("SEALED", 2);
    public static final r0 f10436i = new r0(false);
    public static final r0 f10437j = new r0(true);

    public static t a() {
        ?? v1Var = new v1(true);
        v1Var.x(null);
        return v1Var;
    }

    public static final md.e b(qc.h hVar) {
        if (hVar.get(b0.f10413b) == null) {
            hVar = hVar.plus(new j1());
        }
        return new md.e(hVar);
    }

    public static j0 c(c0 c0Var, zc.p pVar) {
        d0 d0Var = d0.f10419a;
        qc.h i9 = i(c0Var.c(), qc.i.f46140a, true);
        od.e eVar = n0.f10462a;
        if (i9 != eVar && i9.get(qc.d.f46139a) == null) {
            i9 = i9.plus(eVar);
        }
        d0 d0Var2 = d0.f10419a;
        ?? aVar = new a(i9, true);
        aVar.L(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object d(i0[] i0VarArr, sc.i iVar) {
        if (i0VarArr.length == 0) {
            return pc.o.f45540a;
        }
        e eVar = new e(i0VarArr);
        m mVar = new m(1, g7.b(iVar));
        mVar.s();
        int length = i0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i9 = 0; i9 < length; i9++) {
            i0 i0Var = i0VarArr[i9];
            i0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f10416f = n(i0Var, false, cVar, 3);
            cVarArr[i9] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i10 = 0; i10 < length; i10++) {
            c cVar2 = cVarArr[i10];
            cVar2.getClass();
            c.f10414n.set(cVar2, dVar);
        }
        if (!(m.h.get(mVar) instanceof y1)) {
            dVar.b();
        } else {
            mVar.v(dVar);
        }
        Object r10 = mVar.r();
        rc.a aVar = rc.a.f47127a;
        return r10;
    }

    public static final void e(qc.h hVar, CancellationException cancellationException) {
        g1 g1Var = (g1) hVar.get(b0.f10413b);
        if (g1Var != null) {
            g1Var.cancel(cancellationException);
        }
    }

    public static final Object f(zc.p pVar, qc.c cVar) {
        md.s sVar = new md.s(cVar, cVar.getContext());
        Object a2 = g7.g0.a(sVar, sVar, pVar);
        rc.a aVar = rc.a.f47127a;
        return a2;
    }

    public static final Object g(long j10, sc.c cVar) {
        if (j10 > 0) {
            m mVar = new m(1, g7.b(cVar));
            mVar.s();
            if (j10 < Long.MAX_VALUE) {
                j(mVar.f10458e).b(j10, mVar);
            }
            Object r10 = mVar.r();
            if (r10 == rc.a.f47127a) {
                return r10;
            }
        }
        return oc.i.f19197a;
    }

    public static final void h(qc.h hVar) {
        g1 g1Var = (g1) hVar.get(b0.f10413b);
        if (g1Var != null && !g1Var.isActive()) {
            throw g1Var.getCancellationException();
        }
    }

    public static final qc.h i(qc.h hVar, qc.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        x xVar = x.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, xVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, xVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        x xVar2 = new x(2, 2);
        qc.i iVar = qc.i.f46140a;
        qc.h hVar3 = (qc.h) hVar.fold(iVar, xVar2);
        qc.h hVar4 = hVar2;
        if (booleanValue2) {
            hVar4 = hVar2.fold(iVar, x.f10501c);
        }
        return hVar3.plus(hVar4);
    }

    public static final k0 j(qc.h hVar) {
        k0 k0Var;
        qc.f fVar = hVar.get(qc.d.f46139a);
        if (fVar instanceof k0) {
            k0Var = (k0) fVar;
        } else {
            k0Var = null;
        }
        if (k0Var == null) {
            return h0.f10447a;
        }
        return k0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(qc.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof md.h)) {
            return new m(1, cVar);
        }
        md.h hVar = (md.h) cVar;
        e5.c cVar2 = md.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = md.h.f17650n;
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
                m.f10456f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.f10411a);
                mVar = mVar2;
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new m(2, cVar);
    }

    public static final void m(Throwable th, qc.h hVar) {
        try {
            id.b bVar = (id.b) hVar.get(b0.f10412a);
            if (bVar != null) {
                bVar.c(th);
            } else {
                md.a.c(th, hVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                w5.a(runtimeException, th);
                th = runtimeException;
            }
            md.a.c(th, hVar);
        }
    }

    public static p0 n(g1 g1Var, boolean z10, l1 l1Var, int i9) {
        boolean z11 = false;
        if ((i9 & 1) != 0) {
            z10 = false;
        }
        if ((i9 & 2) != 0) {
            z11 = true;
        }
        if (g1Var instanceof v1) {
            return ((v1) g1Var).y(z10, z11, l1Var);
        }
        return g1Var.invokeOnCompletion(z10, z11, new kotlin.jvm.internal.g(1, l1Var, e1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final java.lang.Object o(java.util.Collection r4, sc.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: hd.f0.o(java.util.Collection, sc.c):java.lang.Object");
    }

    public static final java.lang.Object p(hd.g1[] r6, sc.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: hd.f0.p(hd.g1[], sc.c):java.lang.Object");
    }

    public static a2 q(c0 c0Var, zc.p pVar) {
        d0 d0Var = d0.f10419a;
        qc.h i9 = i(c0Var.c(), qc.i.f46140a, true);
        od.e eVar = n0.f10462a;
        if (i9 != eVar && i9.get(qc.d.f46139a) == null) {
            i9 = i9.plus(eVar);
        }
        d0 d0Var2 = d0.f10419a;
        ?? aVar = new a(i9, true);
        aVar.L(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object r(Object obj) {
        if (obj instanceof v) {
            return y5.a(((v) obj).f10495a);
        }
        return obj;
    }

    public static final void s(m mVar, qc.c cVar, boolean z10) {
        Object h10;
        h2 h2Var;
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        if (g10 != null) {
            h10 = y5.a(g10);
        } else {
            h10 = mVar.h(obj);
        }
        if (z10) {
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            md.h hVar = (md.h) cVar;
            sc.c cVar2 = hVar.f17651e;
            Object obj2 = hVar.h;
            qc.h context = cVar2.getContext();
            Object k10 = md.a.k(context, obj2);
            if (k10 != md.a.f17642f) {
                h2Var = v(cVar2, context, k10);
            } else {
                h2Var = null;
            }
            try {
                cVar2.resumeWith(h10);
                if (h2Var != null && !h2Var.M()) {
                    return;
                }
                md.a.f(context, k10);
                return;
            } catch (Throwable th) {
                if (h2Var == null || h2Var.M()) {
                    md.a.f(context, k10);
                }
                throw th;
            }
        }
        cVar.resumeWith(h10);
    }

    public static final String t(qc.c cVar) {
        Object a2;
        if (cVar instanceof md.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th) {
            a2 = y5.a(th);
        }
        if (oc.f.a(a2) != null) {
            a2 = cVar.getClass().getName() + '@' + k(cVar);
        }
        return (String) a2;
    }

    public static final Object u(Object obj) {
        c1 c1Var;
        b1 b1Var;
        if (obj instanceof c1) {
            c1Var = (c1) obj;
        } else {
            c1Var = null;
        }
        if (c1Var != null && (b1Var = c1Var.f10417a) != null) {
            return b1Var;
        }
        return obj;
    }

    public static final h2 v(qc.c cVar, qc.h hVar, Object obj) {
        h2 h2Var = null;
        if ((cVar instanceof sc.d) && hVar.get(i2.f10451a) != null) {
            sc.d dVar = (sc.d) cVar;
            while (true) {
                if (!(dVar instanceof l0) && (dVar = dVar.getCallerFrame()) != null) {
                    if (dVar instanceof h2) {
                        h2Var = (h2) dVar;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (h2Var != null) {
                h2Var.N(hVar, obj);
            }
        }
        return h2Var;
    }

    public static final Object w(qc.h hVar, zc.p pVar, qc.c cVar) {
        qc.h i9;
        Object u10;
        qc.h context = cVar.getContext();
        if (!((Boolean) hVar.fold(Boolean.FALSE, x.d)).booleanValue()) {
            i9 = context.plus(hVar);
        } else {
            i9 = i(context, hVar, false);
        }
        h(i9);
        if (i9 == context) {
            md.s sVar = new md.s(cVar, i9);
            u10 = g7.g0.a(sVar, sVar, pVar);
        } else {
            qc.d dVar = qc.d.f46139a;
            if (kotlin.jvm.internal.i.a(i9.get(dVar), context.get(dVar))) {
                h2 h2Var = new h2(cVar, i9);
                qc.h hVar2 = h2Var.f10408c;
                Object k10 = md.a.k(hVar2, null);
                try {
                    Object a2 = g7.g0.a(h2Var, h2Var, pVar);
                    md.a.f(hVar2, k10);
                    u10 = a2;
                } catch (Throwable th) {
                    md.a.f(hVar2, k10);
                    throw th;
                }
            } else {
                md.s sVar2 = new md.s(cVar, i9);
                g7.f0.a(pVar, sVar2, sVar2);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l0.f10455e;
                while (true) {
                    int i10 = atomicIntegerFieldUpdater.get(sVar2);
                    if (i10 != 0) {
                        if (i10 == 2) {
                            u10 = u(sVar2.u());
                            if (u10 instanceof v) {
                                throw ((v) u10).f10495a;
                            }
                        } else {
                            throw new IllegalStateException("Already suspended");
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(sVar2, 0, 1)) {
                        u10 = rc.a.f47127a;
                        break;
                    }
                }
            }
        }
        rc.a aVar = rc.a.f47127a;
        return u10;
    }

    public static final Object x(long j10, zc.p pVar, qc.c cVar) {
        Object vVar;
        Object B;
        if (j10 > 0) {
            f2 f2Var = new f2(j10, cVar);
            n(f2Var, false, new q0(j(f2Var.d.getContext()).a(f2Var.f10440e, f2Var, f2Var.f10408c), 0), 3);
            try {
                kotlin.jvm.internal.s.a(2, pVar);
                vVar = pVar.invoke(f2Var, f2Var);
            } catch (Throwable th) {
                vVar = new v(th, false);
            }
            Object obj = rc.a.f47127a;
            if (vVar != obj && (B = f2Var.B(vVar)) != f10433e) {
                if (B instanceof v) {
                    Throwable th2 = ((v) B).f10495a;
                    if ((th2 instanceof e2) && ((e2) th2).f10425a == f2Var) {
                        if (vVar instanceof v) {
                            throw ((v) vVar).f10495a;
                        }
                    } else {
                        throw th2;
                    }
                } else {
                    vVar = u(B);
                }
                return vVar;
            }
            return obj;
        }
        throw new e2("Timed out immediately", null);
    }
}
