package be;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.g8;
import v7.i8;
import v7.t7;
import v7.u7;
public abstract class f0 {
    public static final com.google.android.gms.internal.clearcut.e f4281a = new com.google.android.gms.internal.clearcut.e("RESUME_TOKEN", 1);
    public static final com.google.android.gms.internal.clearcut.e f4282b = new com.google.android.gms.internal.clearcut.e("REMOVED_TASK", 1);
    public static final com.google.android.gms.internal.clearcut.e f4283c = new com.google.android.gms.internal.clearcut.e("CLOSED_EMPTY", 1);
    public static final com.google.android.gms.internal.clearcut.e d = new com.google.android.gms.internal.clearcut.e("COMPLETING_ALREADY", 1);
    public static final com.google.android.gms.internal.clearcut.e e = new com.google.android.gms.internal.clearcut.e("COMPLETING_WAITING_CHILDREN", 1);
    public static final com.google.android.gms.internal.clearcut.e f4284f = new com.google.android.gms.internal.clearcut.e("COMPLETING_RETRY", 1);
    public static final com.google.android.gms.internal.clearcut.e f4285g = new com.google.android.gms.internal.clearcut.e("TOO_LATE_TO_CANCEL", 1);
    public static final com.google.android.gms.internal.clearcut.e h = new com.google.android.gms.internal.clearcut.e("SEALED", 1);
    public static final r0 f4286i = new r0(false);
    public static final r0 f4287j = new r0(true);

    public static t a() {
        ?? v1Var = new v1(true);
        v1Var.x(null);
        return v1Var;
    }

    public static final ge.e b(kd.h hVar) {
        if (hVar.get(b0.f4266b) == null) {
            hVar = hVar.plus(new j1());
        }
        return new ge.e(hVar);
    }

    public static j0 c(c0 c0Var, td.p pVar) {
        d0 d0Var = d0.f4271a;
        kd.h i10 = i(c0Var.c(), kd.i.f15030a, true);
        ie.e eVar = n0.f4306a;
        if (i10 != eVar && i10.get(kd.d.f15029a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.f4271a;
        ?? aVar = new a(i10, true);
        aVar.L(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object d(i0[] i0VarArr, md.i iVar) {
        if (i0VarArr.length == 0) {
            return jd.o.f14392a;
        }
        e eVar = new e(i0VarArr);
        m mVar = new m(1, w7.n.b(iVar));
        mVar.s();
        int length = i0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            i0 i0Var = i0VarArr[i10];
            i0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f4268f = n(i0Var, false, cVar, 3);
            cVarArr[i10] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar2 = cVarArr[i11];
            cVar2.getClass();
            c.f4267n.set(cVar2, dVar);
        }
        if (!(m.h.get(mVar) instanceof y1)) {
            dVar.b();
        } else {
            mVar.v(dVar);
        }
        Object r10 = mVar.r();
        ld.a aVar = ld.a.f16000a;
        return r10;
    }

    public static final void e(kd.h hVar, CancellationException cancellationException) {
        g1 g1Var = (g1) hVar.get(b0.f4266b);
        if (g1Var != null) {
            g1Var.cancel(cancellationException);
        }
    }

    public static final Object f(td.p pVar, kd.c cVar) {
        ge.s sVar = new ge.s(cVar, cVar.getContext());
        Object a2 = u7.a(sVar, sVar, pVar);
        ld.a aVar = ld.a.f16000a;
        return a2;
    }

    public static final Object g(long j10, md.c cVar) {
        if (j10 > 0) {
            m mVar = new m(1, w7.n.b(cVar));
            mVar.s();
            if (j10 < Long.MAX_VALUE) {
                j(mVar.e).a(j10, mVar);
            }
            Object r10 = mVar.r();
            if (r10 == ld.a.f16000a) {
                return r10;
            }
        }
        return id.i.f12777a;
    }

    public static final void h(kd.h hVar) {
        g1 g1Var = (g1) hVar.get(b0.f4266b);
        if (g1Var != null && !g1Var.isActive()) {
            throw g1Var.getCancellationException();
        }
    }

    public static final kd.h i(kd.h hVar, kd.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        x xVar = x.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, xVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, xVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        x xVar2 = new x(2, 2);
        kd.i iVar = kd.i.f15030a;
        kd.h hVar3 = (kd.h) hVar.fold(iVar, xVar2);
        kd.h hVar4 = hVar2;
        if (booleanValue2) {
            hVar4 = hVar2.fold(iVar, x.f4338c);
        }
        return hVar3.plus(hVar4);
    }

    public static final k0 j(kd.h hVar) {
        k0 k0Var;
        kd.f fVar = hVar.get(kd.d.f15029a);
        if (fVar instanceof k0) {
            k0Var = (k0) fVar;
        } else {
            k0Var = null;
        }
        if (k0Var == null) {
            return h0.f4294a;
        }
        return k0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(kd.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof ge.h)) {
            return new m(1, cVar);
        }
        ge.h hVar = (ge.h) cVar;
        com.google.android.gms.internal.clearcut.e eVar = ge.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ge.h.f11025n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, eVar);
                mVar2 = null;
                break;
            } else if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, eVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            } else if (obj != eVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (mVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m.h;
            Object obj2 = atomicReferenceFieldUpdater2.get(mVar2);
            if ((obj2 instanceof u) && ((u) obj2).d != null) {
                mVar2.o();
            } else {
                m.f4301f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.f4264a);
                mVar = mVar2;
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new m(2, cVar);
    }

    public static final void m(Throwable th2, kd.h hVar) {
        try {
            ce.b bVar = (ce.b) hVar.get(b0.f4265a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                ge.a.c(th2, hVar);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                g8.a(runtimeException, th2);
                th2 = runtimeException;
            }
            ge.a.c(th2, hVar);
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

    public static final java.lang.Object o(java.util.Collection r4, md.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: be.f0.o(java.util.Collection, md.c):java.lang.Object");
    }

    public static final java.lang.Object p(be.g1[] r6, md.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: be.f0.p(be.g1[], md.c):java.lang.Object");
    }

    public static a2 q(c0 c0Var, td.p pVar) {
        d0 d0Var = d0.f4271a;
        kd.h i10 = i(c0Var.c(), kd.i.f15030a, true);
        ie.e eVar = n0.f4306a;
        if (i10 != eVar && i10.get(kd.d.f15029a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.f4271a;
        ?? aVar = new a(i10, true);
        aVar.L(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object r(Object obj) {
        if (obj instanceof v) {
            return i8.a(((v) obj).f4332a);
        }
        return obj;
    }

    public static final void s(m mVar, kd.c cVar, boolean z10) {
        Object h10;
        h2 h2Var;
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        if (g10 != null) {
            h10 = i8.a(g10);
        } else {
            h10 = mVar.h(obj);
        }
        if (z10) {
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            ge.h hVar = (ge.h) cVar;
            md.c cVar2 = hVar.e;
            Object obj2 = hVar.h;
            kd.h context = cVar2.getContext();
            Object k10 = ge.a.k(context, obj2);
            if (k10 != ge.a.f11017f) {
                h2Var = v(cVar2, context, k10);
            } else {
                h2Var = null;
            }
            try {
                cVar2.resumeWith(h10);
                if (h2Var != null && !h2Var.M()) {
                    return;
                }
                ge.a.f(context, k10);
                return;
            } catch (Throwable th2) {
                if (h2Var == null || h2Var.M()) {
                    ge.a.f(context, k10);
                }
                throw th2;
            }
        }
        cVar.resumeWith(h10);
    }

    public static final String t(kd.c cVar) {
        Object a2;
        if (cVar instanceof ge.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th2) {
            a2 = i8.a(th2);
        }
        if (id.f.a(a2) != null) {
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
        if (c1Var != null && (b1Var = c1Var.f4269a) != null) {
            return b1Var;
        }
        return obj;
    }

    public static final h2 v(kd.c cVar, kd.h hVar, Object obj) {
        h2 h2Var = null;
        if ((cVar instanceof md.d) && hVar.get(i2.f4297a) != null) {
            md.d dVar = (md.d) cVar;
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

    public static final Object w(kd.h hVar, td.p pVar, kd.c cVar) {
        kd.h i10;
        Object u10;
        kd.h context = cVar.getContext();
        if (!((Boolean) hVar.fold(Boolean.FALSE, x.d)).booleanValue()) {
            i10 = context.plus(hVar);
        } else {
            i10 = i(context, hVar, false);
        }
        h(i10);
        if (i10 == context) {
            ge.s sVar = new ge.s(cVar, i10);
            u10 = u7.a(sVar, sVar, pVar);
        } else {
            kd.d dVar = kd.d.f15029a;
            if (kotlin.jvm.internal.i.a(i10.get(dVar), context.get(dVar))) {
                h2 h2Var = new h2(cVar, i10);
                kd.h hVar2 = h2Var.f4261c;
                Object k10 = ge.a.k(hVar2, null);
                try {
                    Object a2 = u7.a(h2Var, h2Var, pVar);
                    ge.a.f(hVar2, k10);
                    u10 = a2;
                } catch (Throwable th2) {
                    ge.a.f(hVar2, k10);
                    throw th2;
                }
            } else {
                ge.s sVar2 = new ge.s(cVar, i10);
                t7.a(pVar, sVar2, sVar2);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l0.e;
                while (true) {
                    int i11 = atomicIntegerFieldUpdater.get(sVar2);
                    if (i11 != 0) {
                        if (i11 == 2) {
                            u10 = u(sVar2.u());
                            if (u10 instanceof v) {
                                throw ((v) u10).f4332a;
                            }
                        } else {
                            throw new IllegalStateException("Already suspended");
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(sVar2, 0, 1)) {
                        u10 = ld.a.f16000a;
                        break;
                    }
                }
            }
        }
        ld.a aVar = ld.a.f16000a;
        return u10;
    }

    public static final Object x(long j10, td.p pVar, kd.c cVar) {
        Object vVar;
        Object B;
        if (j10 > 0) {
            f2 f2Var = new f2(j10, cVar);
            n(f2Var, false, new q0(j(f2Var.d.getContext()).b(f2Var.e, f2Var, f2Var.f4261c), 0), 3);
            try {
                kotlin.jvm.internal.s.a(2, pVar);
                vVar = pVar.invoke(f2Var, f2Var);
            } catch (Throwable th2) {
                vVar = new v(th2, false);
            }
            Object obj = ld.a.f16000a;
            if (vVar != obj && (B = f2Var.B(vVar)) != e) {
                if (B instanceof v) {
                    Throwable th3 = ((v) B).f4332a;
                    if ((th3 instanceof e2) && ((e2) th3).f4277a == f2Var) {
                        if (vVar instanceof v) {
                            throw ((v) vVar).f4332a;
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
