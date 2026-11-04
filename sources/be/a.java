package be;

import b8.gb;
import b8.ib;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.p1;
import wd.a1;
import wd.a2;
import wd.b0;
import wd.t0;
import wd.u1;
import wd.v1;
import wd.x;
import wd.y;
public abstract class a {
    public static final t f3251a = new t("CLOSED", 0);
    public static final t f3252b = new t("UNDEFINED", 0);
    public static final t f3253c = new t("REUSABLE_CLAIMED", 0);
    public static final t d = new t("NO_THREAD_ELEMENTS", 0);
    public static final ae.j f3254e = new ae.j(2);
    public static final ae.j f3255f = new ae.j(3);
    public static final ae.j f3256g = new ae.j(4);

    public static final void a(int i3) {
        if (i3 >= 1) {
            return;
        }
        throw new IllegalArgumentException(p1.i(i3, "Expected positive parallelism level, but got ").toString());
    }

    public static final Object b(r rVar, long j10, od.p pVar) {
        while (true) {
            if (rVar.f3282c >= j10 && !rVar.d()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f3257a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            t tVar = f3251a;
            if (obj == tVar) {
                return tVar;
            }
            r rVar2 = (r) ((b) obj);
            if (rVar2 == null) {
                rVar2 = (r) pVar.invoke(Long.valueOf(rVar.f3282c + 1), rVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                    if (atomicReferenceFieldUpdater.get(rVar) != null) {
                        break;
                    }
                }
                if (rVar.d()) {
                    rVar.e();
                }
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f3251a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(fd.h hVar, Throwable th2) {
        Throwable runtimeException;
        for (xd.b bVar : d.f3260a) {
            try {
                bVar.c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    gb.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            gb.a(th2, new e(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean e(Object obj) {
        if (obj == f3251a) {
            return true;
        }
        return false;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(fd.h hVar, Object obj) {
        if (obj != d) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                u1[] u1VarArr = wVar.f3290b;
                int length = u1VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                u1 u1Var = u1VarArr[length];
                kotlin.jvm.internal.j.b(null);
                Object obj2 = wVar.f3289a[length];
                throw null;
            }
            Object fold = hVar.fold(null, f3255f);
            kotlin.jvm.internal.j.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a1.g.z(fold);
            throw null;
        }
    }

    public static final void h(fd.c cVar, Object obj) {
        Object vVar;
        a2 a2Var;
        if (cVar instanceof f) {
            f fVar = (f) cVar;
            x xVar = fVar.d;
            hd.c cVar2 = fVar.f3263e;
            Throwable a10 = dd.g.a(obj);
            if (a10 == null) {
                vVar = obj;
            } else {
                vVar = new wd.v(a10, false);
            }
            if (xVar.e(cVar2.getContext())) {
                fVar.f3264f = vVar;
                fVar.f57500c = 1;
                xVar.c(cVar2.getContext(), fVar);
                return;
            }
            t0 a11 = v1.a();
            if (a11.f57533c >= 4294967296L) {
                fVar.f3264f = vVar;
                fVar.f57500c = 1;
                ed.e eVar = a11.f57534e;
                if (eVar == null) {
                    eVar = new ed.e();
                    a11.f57534e = eVar;
                }
                eVar.addLast(fVar);
                return;
            }
            a11.i(true);
            try {
                a1 a1Var = (a1) cVar2.getContext().get(y.f57551b);
                if (a1Var != null && !a1Var.isActive()) {
                    fVar.resumeWith(ib.a(a1Var.getCancellationException()));
                } else {
                    Object obj2 = fVar.h;
                    fd.h context = cVar2.getContext();
                    Object l10 = l(context, obj2);
                    if (l10 != d) {
                        a2Var = b0.x(cVar2, context, l10);
                    } else {
                        a2Var = null;
                    }
                    cVar2.resumeWith(obj);
                    if (a2Var == null || a2Var.T()) {
                        g(context, l10);
                    }
                }
                do {
                } while (a11.k());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        cVar.resumeWith(obj);
    }

    public static final long i(java.lang.String r22, long r23, long r25, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: be.a.i(java.lang.String, long, long, long):long");
    }

    public static int j(int i3, int i10, String str) {
        int i11;
        if ((i10 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        } else {
            i11 = 2097150;
        }
        return (int) i(str, i3, 1, i11);
    }

    public static final Object k(fd.h hVar) {
        Object fold = hVar.fold(0, f3254e);
        kotlin.jvm.internal.j.b(fold);
        return fold;
    }

    public static final Object l(fd.h hVar, Object obj) {
        if (obj == null) {
            obj = k(hVar);
        }
        if (obj == 0) {
            return d;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new w(((Number) obj).intValue(), hVar), f3256g);
        }
        a1.g.z(obj);
        throw null;
    }
}
