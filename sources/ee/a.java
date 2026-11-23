package ee;

import a8.p0;
import c8.z;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.a1;
import zd.a2;
import zd.b0;
import zd.t0;
import zd.u1;
import zd.v1;
import zd.x;
import zd.y;
public abstract class a {
    public static final t f10909a = new t("CLOSED", 0);
    public static final t f10910b = new t("UNDEFINED", 0);
    public static final t f10911c = new t("REUSABLE_CLAIMED", 0);
    public static final t d = new t("NO_THREAD_ELEMENTS", 0);
    public static final b1.e f10912e = new b1.e(5);
    public static final b1.e f10913f = new b1.e(6);
    public static final b1.e f10914g = new b1.e(7);

    public static final void a(int i7) {
        if (i7 >= 1) {
            return;
        }
        throw new IllegalArgumentException(i5.c.i(i7, "Expected positive parallelism level, but got ").toString());
    }

    public static final Object b(r rVar, long j3, rd.p pVar) {
        while (true) {
            if (rVar.f10940c >= j3 && !rVar.d()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f10915a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            t tVar = f10909a;
            if (obj == tVar) {
                return tVar;
            }
            r rVar2 = (r) ((b) obj);
            if (rVar2 == null) {
                rVar2 = (r) pVar.invoke(Long.valueOf(rVar.f10940c + 1), rVar);
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
        if (obj != f10909a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(id.h hVar, Throwable th2) {
        Throwable runtimeException;
        for (ae.b bVar : d.f10918a) {
            try {
                bVar.c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    b5.a.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            b5.a.a(th2, new e(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean e(Object obj) {
        if (obj == f10909a) {
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

    public static final void g(id.h hVar, Object obj) {
        if (obj != d) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                u1[] u1VarArr = wVar.f10948b;
                int length = u1VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                u1 u1Var = u1VarArr[length];
                kotlin.jvm.internal.j.b(null);
                Object obj2 = wVar.f10947a[length];
                throw null;
            }
            Object fold = hVar.fold(null, f10913f);
            kotlin.jvm.internal.j.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            p0.A(fold);
            throw null;
        }
    }

    public static final void h(id.c cVar, Object obj) {
        Object vVar;
        a2 a2Var;
        if (cVar instanceof f) {
            f fVar = (f) cVar;
            x xVar = fVar.d;
            kd.c cVar2 = fVar.f10921e;
            Throwable a10 = gd.g.a(obj);
            if (a10 == null) {
                vVar = obj;
            } else {
                vVar = new zd.v(a10, false);
            }
            if (xVar.d(cVar2.getContext())) {
                fVar.f10922f = vVar;
                fVar.f61864c = 1;
                xVar.c(cVar2.getContext(), fVar);
                return;
            }
            t0 a11 = v1.a();
            if (a11.f61897c >= 4294967296L) {
                fVar.f10922f = vVar;
                fVar.f61864c = 1;
                hd.d dVar = a11.f61898e;
                if (dVar == null) {
                    dVar = new hd.d();
                    a11.f61898e = dVar;
                }
                dVar.addLast(fVar);
                return;
            }
            a11.i(true);
            try {
                a1 a1Var = (a1) cVar2.getContext().get(y.f61915b);
                if (a1Var != null && !a1Var.isActive()) {
                    fVar.resumeWith(z.a(a1Var.getCancellationException()));
                } else {
                    Object obj2 = fVar.h;
                    id.h context = cVar2.getContext();
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
        throw new UnsupportedOperationException("Method not decompiled: ee.a.i(java.lang.String, long, long, long):long");
    }

    public static int j(int i7, int i10, String str) {
        int i11;
        if ((i10 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        } else {
            i11 = 2097150;
        }
        return (int) i(str, i7, 1, i11);
    }

    public static final Object k(id.h hVar) {
        Object fold = hVar.fold(0, f10912e);
        kotlin.jvm.internal.j.b(fold);
        return fold;
    }

    public static final Object l(id.h hVar, Object obj) {
        if (obj == null) {
            obj = k(hVar);
        }
        if (obj == 0) {
            return d;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new w(((Number) obj).intValue(), hVar), f10914g);
        }
        p0.A(obj);
        throw null;
    }
}
