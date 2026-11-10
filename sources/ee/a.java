package ee;

import a8.la;
import a8.p0;
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
    public static final com.google.android.gms.internal.clearcut.e f10768a = new com.google.android.gms.internal.clearcut.e("CLOSED", 1);
    public static final com.google.android.gms.internal.clearcut.e f10769b = new com.google.android.gms.internal.clearcut.e("UNDEFINED", 1);
    public static final com.google.android.gms.internal.clearcut.e f10770c = new com.google.android.gms.internal.clearcut.e("REUSABLE_CLAIMED", 1);
    public static final com.google.android.gms.internal.clearcut.e d = new com.google.android.gms.internal.clearcut.e("NO_THREAD_ELEMENTS", 1);
    public static final b1.e f10771e = new b1.e(5);
    public static final b1.e f10772f = new b1.e(6);
    public static final b1.e f10773g = new b1.e(7);

    public static final void a(int i7) {
        if (i7 >= 1) {
            return;
        }
        throw new IllegalArgumentException(jg.g.j(i7, "Expected positive parallelism level, but got ").toString());
    }

    public static final Object b(r rVar, long j3, rd.p pVar) {
        while (true) {
            if (rVar.f10799c >= j3 && !rVar.d()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f10774a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            com.google.android.gms.internal.clearcut.e eVar = f10768a;
            if (obj == eVar) {
                return eVar;
            }
            r rVar2 = (r) ((b) obj);
            if (rVar2 == null) {
                rVar2 = (r) pVar.invoke(Long.valueOf(rVar.f10799c + 1), rVar);
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
        if (obj != f10768a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(id.h hVar, Throwable th2) {
        Throwable runtimeException;
        for (ae.b bVar : d.f10777a) {
            try {
                bVar.c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    la.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            la.a(th2, new e(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean e(Object obj) {
        if (obj == f10768a) {
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
            if (obj instanceof v) {
                v vVar = (v) obj;
                u1[] u1VarArr = vVar.f10805b;
                int length = u1VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                u1 u1Var = u1VarArr[length];
                kotlin.jvm.internal.j.b(null);
                Object obj2 = vVar.f10804a[length];
                throw null;
            }
            Object fold = hVar.fold(null, f10772f);
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
            kd.c cVar2 = fVar.f10780e;
            Throwable a10 = gd.g.a(obj);
            if (a10 == null) {
                vVar = obj;
            } else {
                vVar = new zd.v(a10, false);
            }
            if (xVar.d(cVar2.getContext())) {
                fVar.f10781f = vVar;
                fVar.f60088c = 1;
                xVar.c(cVar2.getContext(), fVar);
                return;
            }
            t0 a11 = v1.a();
            if (a11.f60121c >= 4294967296L) {
                fVar.f10781f = vVar;
                fVar.f60088c = 1;
                hd.d dVar = a11.f60122e;
                if (dVar == null) {
                    dVar = new hd.d();
                    a11.f60122e = dVar;
                }
                dVar.addLast(fVar);
                return;
            }
            a11.i(true);
            try {
                a1 a1Var = (a1) cVar2.getContext().get(y.f60139b);
                if (a1Var != null && !a1Var.isActive()) {
                    fVar.resumeWith(af.b.b(a1Var.getCancellationException()));
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
        Object fold = hVar.fold(0, f10771e);
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
            return hVar.fold(new v(((Number) obj).intValue(), hVar), f10773g);
        }
        p0.A(obj);
        throw null;
    }
}
