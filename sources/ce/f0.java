package ce;

import a8.hd;
import a8.jd;
import a8.pe;
import a8.wc;
import a8.xc;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class f0 {
    public static final he.v f6220a = new he.v("RESUME_TOKEN", 0);
    public static final he.v f6221b = new he.v("REMOVED_TASK", 0);
    public static final he.v f6222c = new he.v("CLOSED_EMPTY", 0);
    public static final he.v d = new he.v("COMPLETING_ALREADY", 0);
    public static final he.v e = new he.v("COMPLETING_WAITING_CHILDREN", 0);
    public static final he.v f6223f = new he.v("COMPLETING_RETRY", 0);
    public static final he.v f6224g = new he.v("TOO_LATE_TO_CANCEL", 0);
    public static final he.v h = new he.v("SEALED", 0);
    public static final r0 f6225i = new r0(false);
    public static final r0 f6226j = new r0(true);

    public static t a() {
        ?? v1Var = new v1(true);
        v1Var.x(null);
        return v1Var;
    }

    public static final he.e b(ld.h hVar) {
        if (hVar.get(b0.f6205b) == null) {
            hVar = hVar.plus(new j1());
        }
        return new he.e(hVar);
    }

    public static j0 c(c0 c0Var, ud.p pVar) {
        d0 d0Var = d0.f6210a;
        ld.h i10 = i(c0Var.c(), ld.i.f16987a, true);
        je.e eVar = n0.f6245a;
        if (i10 != eVar && i10.get(ld.d.f16986a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.f6210a;
        ?? aVar = new a(i10, true);
        aVar.L(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object d(i0[] i0VarArr, nd.i iVar) {
        if (i0VarArr.length == 0) {
            return kd.o.f16524a;
        }
        e eVar = new e(i0VarArr);
        m mVar = new m(1, pe.b(iVar));
        mVar.s();
        int length = i0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            i0 i0Var = i0VarArr[i10];
            i0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f6207f = n(i0Var, false, cVar, 3);
            cVarArr[i10] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar2 = cVarArr[i11];
            cVar2.getClass();
            c.f6206n.set(cVar2, dVar);
        }
        if (!(m.h.get(mVar) instanceof y1)) {
            dVar.b();
        } else {
            mVar.v(dVar);
        }
        Object r6 = mVar.r();
        md.a aVar = md.a.f18411a;
        return r6;
    }

    public static final void e(ld.h hVar, CancellationException cancellationException) {
        g1 g1Var = (g1) hVar.get(b0.f6205b);
        if (g1Var != null) {
            g1Var.cancel(cancellationException);
        }
    }

    public static final Object f(ud.p pVar, ld.c cVar) {
        he.s sVar = new he.s(cVar, cVar.getContext());
        Object a2 = xc.a(sVar, sVar, pVar);
        md.a aVar = md.a.f18411a;
        return a2;
    }

    public static final Object g(long j10, nd.c cVar) {
        if (j10 > 0) {
            m mVar = new m(1, pe.b(cVar));
            mVar.s();
            if (j10 < Long.MAX_VALUE) {
                j(mVar.e).a(j10, mVar);
            }
            Object r6 = mVar.r();
            if (r6 == md.a.f18411a) {
                return r6;
            }
        }
        return jd.i.f15579a;
    }

    public static final void h(ld.h hVar) {
        g1 g1Var = (g1) hVar.get(b0.f6205b);
        if (g1Var != null && !g1Var.isActive()) {
            throw g1Var.getCancellationException();
        }
    }

    public static final ld.h i(ld.h hVar, ld.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        x xVar = x.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, xVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, xVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        x xVar2 = new x(2, 2);
        ld.i iVar = ld.i.f16987a;
        ld.h hVar3 = (ld.h) hVar.fold(iVar, xVar2);
        ld.h hVar4 = hVar2;
        if (booleanValue2) {
            hVar4 = hVar2.fold(iVar, x.f6277c);
        }
        return hVar3.plus(hVar4);
    }

    public static final k0 j(ld.h hVar) {
        k0 k0Var;
        ld.f fVar = hVar.get(ld.d.f16986a);
        if (fVar instanceof k0) {
            k0Var = (k0) fVar;
        } else {
            k0Var = null;
        }
        if (k0Var == null) {
            return h0.f6233a;
        }
        return k0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(ld.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof he.h)) {
            return new m(1, cVar);
        }
        he.h hVar = (he.h) cVar;
        he.v vVar = he.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = he.h.f12800n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, vVar);
                mVar2 = null;
                break;
            } else if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, vVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            } else if (obj != vVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (mVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m.h;
            Object obj2 = atomicReferenceFieldUpdater2.get(mVar2);
            if ((obj2 instanceof u) && ((u) obj2).d != null) {
                mVar2.o();
            } else {
                m.f6240f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.f6203a);
                mVar = mVar2;
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new m(2, cVar);
    }

    public static final void m(Throwable th2, ld.h hVar) {
        try {
            de.b bVar = (de.b) hVar.get(b0.f6204a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                he.a.c(th2, hVar);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                hd.a(runtimeException, th2);
                th2 = runtimeException;
            }
            he.a.c(th2, hVar);
        }
    }

    public static p0 n(g1 g1Var, boolean z10, l1 l1Var, int i10) {
        boolean z11 = false;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if (g1Var instanceof v1) {
            return ((v1) g1Var).y(z10, z11, l1Var);
        }
        return g1Var.invokeOnCompletion(z10, z11, new kotlin.jvm.internal.g(1, l1Var, e1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final java.lang.Object o(java.util.Collection r4, nd.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: ce.f0.o(java.util.Collection, nd.c):java.lang.Object");
    }

    public static final java.lang.Object p(ce.g1[] r6, nd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: ce.f0.p(ce.g1[], nd.c):java.lang.Object");
    }

    public static a2 q(c0 c0Var, ud.p pVar) {
        d0 d0Var = d0.f6210a;
        ld.h i10 = i(c0Var.c(), ld.i.f16987a, true);
        je.e eVar = n0.f6245a;
        if (i10 != eVar && i10.get(ld.d.f16986a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.f6210a;
        ?? aVar = new a(i10, true);
        aVar.L(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object r(Object obj) {
        if (obj instanceof v) {
            return jd.a(((v) obj).f6271a);
        }
        return obj;
    }

    public static final void s(m mVar, ld.c cVar, boolean z10) {
        Object h10;
        h2 h2Var;
        Object obj = m.h.get(mVar);
        Throwable g7 = mVar.g(obj);
        if (g7 != null) {
            h10 = jd.a(g7);
        } else {
            h10 = mVar.h(obj);
        }
        if (z10) {
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            he.h hVar = (he.h) cVar;
            nd.c cVar2 = hVar.e;
            Object obj2 = hVar.h;
            ld.h context = cVar2.getContext();
            Object k10 = he.a.k(context, obj2);
            if (k10 != he.a.f12792f) {
                h2Var = v(cVar2, context, k10);
            } else {
                h2Var = null;
            }
            try {
                cVar2.resumeWith(h10);
                if (h2Var != null && !h2Var.M()) {
                    return;
                }
                he.a.f(context, k10);
                return;
            } catch (Throwable th2) {
                if (h2Var == null || h2Var.M()) {
                    he.a.f(context, k10);
                }
                throw th2;
            }
        }
        cVar.resumeWith(h10);
    }

    public static final String t(ld.c cVar) {
        Object a2;
        if (cVar instanceof he.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th2) {
            a2 = jd.a(th2);
        }
        if (jd.f.a(a2) != null) {
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
        if (c1Var != null && (b1Var = c1Var.f6208a) != null) {
            return b1Var;
        }
        return obj;
    }

    public static final h2 v(ld.c cVar, ld.h hVar, Object obj) {
        h2 h2Var = null;
        if ((cVar instanceof nd.d) && hVar.get(i2.f6236a) != null) {
            nd.d dVar = (nd.d) cVar;
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

    public static final Object w(ld.h hVar, ud.p pVar, ld.c cVar) {
        ld.h i10;
        Object u10;
        ld.h context = cVar.getContext();
        if (!((Boolean) hVar.fold(Boolean.FALSE, x.d)).booleanValue()) {
            i10 = context.plus(hVar);
        } else {
            i10 = i(context, hVar, false);
        }
        h(i10);
        if (i10 == context) {
            he.s sVar = new he.s(cVar, i10);
            u10 = xc.a(sVar, sVar, pVar);
        } else {
            ld.d dVar = ld.d.f16986a;
            if (kotlin.jvm.internal.i.a(i10.get(dVar), context.get(dVar))) {
                h2 h2Var = new h2(cVar, i10);
                ld.h hVar2 = h2Var.f6200c;
                Object k10 = he.a.k(hVar2, null);
                try {
                    Object a2 = xc.a(h2Var, h2Var, pVar);
                    he.a.f(hVar2, k10);
                    u10 = a2;
                } catch (Throwable th2) {
                    he.a.f(hVar2, k10);
                    throw th2;
                }
            } else {
                he.s sVar2 = new he.s(cVar, i10);
                wc.a(pVar, sVar2, sVar2);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l0.e;
                while (true) {
                    int i11 = atomicIntegerFieldUpdater.get(sVar2);
                    if (i11 != 0) {
                        if (i11 == 2) {
                            u10 = u(sVar2.u());
                            if (u10 instanceof v) {
                                throw ((v) u10).f6271a;
                            }
                        } else {
                            throw new IllegalStateException("Already suspended");
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(sVar2, 0, 1)) {
                        u10 = md.a.f18411a;
                        break;
                    }
                }
            }
        }
        md.a aVar = md.a.f18411a;
        return u10;
    }

    public static final Object x(long j10, ud.p pVar, ld.c cVar) {
        Object vVar;
        Object B;
        if (j10 > 0) {
            f2 f2Var = new f2(j10, cVar);
            n(f2Var, false, new q0(j(f2Var.d.getContext()).b(f2Var.e, f2Var, f2Var.f6200c), 0), 3);
            try {
                kotlin.jvm.internal.s.a(2, pVar);
                vVar = pVar.invoke(f2Var, f2Var);
            } catch (Throwable th2) {
                vVar = new v(th2, false);
            }
            Object obj = md.a.f18411a;
            if (vVar != obj && (B = f2Var.B(vVar)) != e) {
                if (B instanceof v) {
                    Throwable th3 = ((v) B).f6271a;
                    if ((th3 instanceof e2) && ((e2) th3).f6216a == f2Var) {
                        if (vVar instanceof v) {
                            throw ((v) vVar).f6271a;
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
        throw new e2("Timed out immediately", null);
    }
}
