package ae;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.a8;
import v7.p7;
import v7.q7;
import v7.y7;
public abstract class g0 {
    public static final da.a f450a = new da.a("RESUME_TOKEN");
    public static final da.a f451b = new da.a("REMOVED_TASK");
    public static final da.a f452c = new da.a("CLOSED_EMPTY");
    public static final da.a d = new da.a("COMPLETING_ALREADY");
    public static final da.a f453e = new da.a("COMPLETING_WAITING_CHILDREN");
    public static final da.a f454f = new da.a("COMPLETING_RETRY");
    public static final da.a f455g = new da.a("TOO_LATE_TO_CANCEL");
    public static final da.a h = new da.a("SEALED");
    public static final s0 f456i = new s0(false);
    public static final s0 f457j = new s0(true);

    public static t a() {
        ?? w1Var = new w1(true);
        w1Var.x(null);
        return w1Var;
    }

    public static final fe.e b(jd.h hVar) {
        if (hVar.get(c0.f433b) == null) {
            hVar = hVar.plus(new k1());
        }
        return new fe.e(hVar);
    }

    public static k0 c(d0 d0Var, sd.p pVar) {
        e0 e0Var = e0.f438a;
        jd.h i10 = i(d0Var.c(), jd.i.f14129a, true);
        he.e eVar = o0.f480a;
        if (i10 != eVar && i10.get(jd.d.f14128a) == null) {
            i10 = i10.plus(eVar);
        }
        e0 e0Var2 = e0.f438a;
        ?? aVar = new a(i10, true);
        aVar.L(e0Var, aVar, pVar);
        return aVar;
    }

    public static final Object d(j0[] j0VarArr, ld.j jVar) {
        if (j0VarArr.length == 0) {
            return id.o.f12114a;
        }
        e eVar = new e(j0VarArr);
        m mVar = new m(1, w7.h.b(jVar));
        mVar.s();
        int length = j0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            j0 j0Var = j0VarArr[i10];
            j0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f431f = n(j0Var, false, cVar, 3);
            cVarArr[i10] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar2 = cVarArr[i11];
            cVar2.getClass();
            c.f429n.set(cVar2, dVar);
        }
        if (!(m.h.get(mVar) instanceof z1)) {
            dVar.b();
        } else {
            mVar.v(dVar);
        }
        Object r10 = mVar.r();
        kd.a aVar = kd.a.f14784a;
        return r10;
    }

    public static final void e(jd.h hVar, CancellationException cancellationException) {
        h1 h1Var = (h1) hVar.get(c0.f433b);
        if (h1Var != null) {
            h1Var.cancel(cancellationException);
        }
    }

    public static final Object f(sd.p pVar, jd.c cVar) {
        fe.s sVar = new fe.s(cVar, cVar.getContext());
        Object a2 = q7.a(sVar, sVar, pVar);
        kd.a aVar = kd.a.f14784a;
        return a2;
    }

    public static final Object g(long j3, ld.c cVar) {
        if (j3 > 0) {
            m mVar = new m(1, w7.h.b(cVar));
            mVar.s();
            if (j3 < Long.MAX_VALUE) {
                j(mVar.f474e).b(j3, mVar);
            }
            Object r10 = mVar.r();
            if (r10 == kd.a.f14784a) {
                return r10;
            }
        }
        return hd.i.f11092a;
    }

    public static final void h(jd.h hVar) {
        h1 h1Var = (h1) hVar.get(c0.f433b);
        if (h1Var != null && !h1Var.isActive()) {
            throw h1Var.getCancellationException();
        }
    }

    public static final jd.h i(jd.h hVar, jd.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        y yVar = y.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, yVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, yVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        y yVar2 = new y(2, 2);
        jd.i iVar = jd.i.f14129a;
        jd.h hVar3 = (jd.h) hVar.fold(iVar, yVar2);
        jd.h hVar4 = hVar2;
        if (booleanValue2) {
            hVar4 = hVar2.fold(iVar, y.f518c);
        }
        return hVar3.plus(hVar4);
    }

    public static final l0 j(jd.h hVar) {
        l0 l0Var;
        jd.f fVar = hVar.get(jd.d.f14128a);
        if (fVar instanceof l0) {
            l0Var = (l0) fVar;
        } else {
            l0Var = null;
        }
        if (l0Var == null) {
            return i0.f465a;
        }
        return l0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(jd.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof fe.h)) {
            return new m(1, cVar);
        }
        fe.h hVar = (fe.h) cVar;
        da.a aVar = fe.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.h.f9895n;
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
                m.f472f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.f426a);
                mVar = mVar2;
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new m(2, cVar);
    }

    public static final void m(Throwable th2, jd.h hVar) {
        try {
            be.b bVar = (be.b) hVar.get(c0.f432a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                fe.a.c(th2, hVar);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                y7.a(runtimeException, th2);
                th2 = runtimeException;
            }
            fe.a.c(th2, hVar);
        }
    }

    public static q0 n(h1 h1Var, boolean z10, m1 m1Var, int i10) {
        boolean z11 = false;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if (h1Var instanceof w1) {
            return ((w1) h1Var).y(z10, z11, m1Var);
        }
        return h1Var.invokeOnCompletion(z10, z11, new kotlin.jvm.internal.g(1, m1Var, f1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final java.lang.Object o(java.util.Collection r4, ld.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: ae.g0.o(java.util.Collection, ld.c):java.lang.Object");
    }

    public static final java.lang.Object p(ae.h1[] r6, ld.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: ae.g0.p(ae.h1[], ld.c):java.lang.Object");
    }

    public static b2 q(d0 d0Var, sd.p pVar) {
        e0 e0Var = e0.f438a;
        jd.h i10 = i(d0Var.c(), jd.i.f14129a, true);
        he.e eVar = o0.f480a;
        if (i10 != eVar && i10.get(jd.d.f14128a) == null) {
            i10 = i10.plus(eVar);
        }
        e0 e0Var2 = e0.f438a;
        ?? aVar = new a(i10, true);
        aVar.L(e0Var, aVar, pVar);
        return aVar;
    }

    public static final Object r(Object obj) {
        if (obj instanceof v) {
            return a8.a(((v) obj).f509a);
        }
        return obj;
    }

    public static final void s(m mVar, jd.c cVar, boolean z10) {
        Object h10;
        i2 i2Var;
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        if (g10 != null) {
            h10 = a8.a(g10);
        } else {
            h10 = mVar.h(obj);
        }
        if (z10) {
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            fe.h hVar = (fe.h) cVar;
            ld.c cVar2 = hVar.f9896e;
            Object obj2 = hVar.h;
            jd.h context = cVar2.getContext();
            Object k10 = fe.a.k(context, obj2);
            if (k10 != fe.a.f9887f) {
                i2Var = v(cVar2, context, k10);
            } else {
                i2Var = null;
            }
            try {
                cVar2.resumeWith(h10);
                if (i2Var != null && !i2Var.M()) {
                    return;
                }
                fe.a.f(context, k10);
                return;
            } catch (Throwable th2) {
                if (i2Var == null || i2Var.M()) {
                    fe.a.f(context, k10);
                }
                throw th2;
            }
        }
        cVar.resumeWith(h10);
    }

    public static final String t(jd.c cVar) {
        Object a2;
        if (cVar instanceof fe.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th2) {
            a2 = a8.a(th2);
        }
        if (hd.f.a(a2) != null) {
            a2 = cVar.getClass().getName() + '@' + k(cVar);
        }
        return (String) a2;
    }

    public static final Object u(Object obj) {
        d1 d1Var;
        c1 c1Var;
        if (obj instanceof d1) {
            d1Var = (d1) obj;
        } else {
            d1Var = null;
        }
        if (d1Var != null && (c1Var = d1Var.f435a) != null) {
            return c1Var;
        }
        return obj;
    }

    public static final i2 v(jd.c cVar, jd.h hVar, Object obj) {
        i2 i2Var = null;
        if ((cVar instanceof ld.d) && hVar.get(j2.f470a) != null) {
            ld.d dVar = (ld.d) cVar;
            while (true) {
                if (!(dVar instanceof m0) && (dVar = dVar.getCallerFrame()) != null) {
                    if (dVar instanceof i2) {
                        i2Var = (i2) dVar;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (i2Var != null) {
                i2Var.N(hVar, obj);
            }
        }
        return i2Var;
    }

    public static final Object w(jd.h hVar, sd.p pVar, jd.c cVar) {
        jd.h i10;
        Object u10;
        jd.h context = cVar.getContext();
        if (!((Boolean) hVar.fold(Boolean.FALSE, y.d)).booleanValue()) {
            i10 = context.plus(hVar);
        } else {
            i10 = i(context, hVar, false);
        }
        h(i10);
        if (i10 == context) {
            fe.s sVar = new fe.s(cVar, i10);
            u10 = q7.a(sVar, sVar, pVar);
        } else {
            jd.d dVar = jd.d.f14128a;
            if (kotlin.jvm.internal.i.a(i10.get(dVar), context.get(dVar))) {
                i2 i2Var = new i2(cVar, i10);
                jd.h hVar2 = i2Var.f422c;
                Object k10 = fe.a.k(hVar2, null);
                try {
                    Object a2 = q7.a(i2Var, i2Var, pVar);
                    fe.a.f(hVar2, k10);
                    u10 = a2;
                } catch (Throwable th2) {
                    fe.a.f(hVar2, k10);
                    throw th2;
                }
            } else {
                fe.s sVar2 = new fe.s(cVar, i10);
                p7.a(pVar, sVar2, sVar2);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m0.f475e;
                while (true) {
                    int i11 = atomicIntegerFieldUpdater.get(sVar2);
                    if (i11 != 0) {
                        if (i11 == 2) {
                            u10 = u(sVar2.u());
                            if (u10 instanceof v) {
                                throw ((v) u10).f509a;
                            }
                        } else {
                            throw new IllegalStateException("Already suspended");
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(sVar2, 0, 1)) {
                        u10 = kd.a.f14784a;
                        break;
                    }
                }
            }
        }
        kd.a aVar = kd.a.f14784a;
        return u10;
    }

    public static final Object x(long j3, sd.p pVar, jd.c cVar) {
        Object vVar;
        Object B;
        if (j3 > 0) {
            g2 g2Var = new g2(j3, cVar);
            n(g2Var, false, new r0(j(g2Var.d.getContext()).a(g2Var.f460e, g2Var, g2Var.f422c), 0), 3);
            try {
                kotlin.jvm.internal.s.a(2, pVar);
                vVar = pVar.invoke(g2Var, g2Var);
            } catch (Throwable th2) {
                vVar = new v(th2, false);
            }
            Object obj = kd.a.f14784a;
            if (vVar != obj && (B = g2Var.B(vVar)) != f453e) {
                if (B instanceof v) {
                    Throwable th3 = ((v) B).f509a;
                    if ((th3 instanceof f2) && ((f2) th3).f446a == g2Var) {
                        if (vVar instanceof v) {
                            throw ((v) vVar).f509a;
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
        throw new f2("Timed out immediately", null);
    }
}
