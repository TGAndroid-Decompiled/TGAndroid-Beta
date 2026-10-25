package he;

import a8.hd;
import a8.jd;
import ce.a0;
import ce.b0;
import ce.c2;
import ce.d2;
import ce.f0;
import ce.g1;
import ce.h2;
import ce.x0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class a {
    public static final v f12790a = new v("NO_DECISION", 0);
    public static final v f12791b = new v("CLOSED", 0);
    public static final v f12792c = new v("UNDEFINED", 0);
    public static final v d = new v("REUSABLE_CLAIMED", 0);
    public static final v e = new v("CONDITION_FALSE", 0);
    public static final v f12793f = new v("NO_THREAD_ELEMENTS", 0);

    public static final Object a(t tVar, long j10, ud.p pVar) {
        while (true) {
            if (tVar.f12818c >= j10 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f12796a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            v vVar = f12791b;
            if (obj == vVar) {
                return vVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f12818c + 1), tVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                    if (atomicReferenceFieldUpdater.get(tVar) != null) {
                        break;
                    }
                }
                if (tVar.d()) {
                    tVar.e();
                }
            }
            tVar = tVar2;
        }
    }

    public static final t b(Object obj) {
        if (obj != f12791b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(Throwable th2, ld.h hVar) {
        Throwable runtimeException;
        for (de.b bVar : f.f12799a) {
            try {
                bVar.c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    hd.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            hd.a(th2, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean d(Object obj) {
        if (obj == f12791b) {
            return true;
        }
        return false;
    }

    public static final Object e(Object obj, Object obj2) {
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

    public static final void f(ld.h hVar, Object obj) {
        if (obj != f12793f) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                c2[] c2VarArr = zVar.f12828b;
                int length = c2VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                c2 c2Var = c2VarArr[length];
                kotlin.jvm.internal.i.b(null);
                Object obj2 = zVar.f12827a[length];
                throw null;
            }
            Object fold = hVar.fold(null, x.d);
            kotlin.jvm.internal.i.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a1.g.B(fold);
            throw null;
        }
    }

    public static final void g(Object obj, ld.c cVar) {
        Object vVar;
        h2 h2Var;
        if (cVar instanceof h) {
            h hVar = (h) cVar;
            a0 a0Var = hVar.d;
            nd.c cVar2 = hVar.e;
            Throwable a2 = jd.f.a(obj);
            if (a2 == null) {
                vVar = obj;
            } else {
                vVar = new ce.v(a2, false);
            }
            cVar2.getContext();
            if (a0Var.d()) {
                hVar.f12802f = vVar;
                hVar.f6242c = 1;
                a0Var.c(cVar2.getContext(), hVar);
                return;
            }
            x0 a10 = d2.a();
            if (a10.f6280c >= 4294967296L) {
                hVar.f12802f = vVar;
                hVar.f6242c = 1;
                kd.e eVar = a10.e;
                if (eVar == null) {
                    eVar = new kd.e();
                    a10.e = eVar;
                }
                eVar.addLast(hVar);
                return;
            }
            a10.h(true);
            try {
                g1 g1Var = (g1) cVar2.getContext().get(b0.f6205b);
                if (g1Var != null && !g1Var.isActive()) {
                    CancellationException cancellationException = g1Var.getCancellationException();
                    hVar.b(vVar, cancellationException);
                    hVar.resumeWith(jd.a(cancellationException));
                } else {
                    Object obj2 = hVar.h;
                    ld.h context = cVar2.getContext();
                    Object k10 = k(context, obj2);
                    if (k10 != f12793f) {
                        h2Var = f0.v(cVar2, context, k10);
                    } else {
                        h2Var = null;
                    }
                    cVar2.resumeWith(obj);
                    if (h2Var == null || h2Var.M()) {
                        f(context, k10);
                    }
                }
                do {
                } while (a10.j());
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
        throw new UnsupportedOperationException("Method not decompiled: he.a.i(java.lang.String, long, long, long):long");
    }

    public static int j(int i10, int i11, String str) {
        int i12;
        if ((i11 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = 2097150;
        }
        return (int) i(str, i10, 1, i12);
    }

    public static final Object k(ld.h hVar, Object obj) {
        if (obj == null) {
            obj = hVar.fold(0, x.f12823c);
            kotlin.jvm.internal.i.b(obj);
        }
        if (obj == 0) {
            return f12793f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new z(((Number) obj).intValue(), hVar), x.e);
        }
        a1.g.B(obj);
        throw null;
    }
}
