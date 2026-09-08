package ee;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.r7;
import v7.t7;
import zd.a0;
import zd.b0;
import zd.b2;
import zd.c2;
import zd.e0;
import zd.f1;
import zd.g2;
import zd.w0;
public abstract class a {
    public static final d9.f f9088a = new d9.f("NO_DECISION", 1);
    public static final d9.f f9089b = new d9.f("CLOSED", 1);
    public static final d9.f f9090c = new d9.f("UNDEFINED", 1);
    public static final d9.f d = new d9.f("REUSABLE_CLAIMED", 1);
    public static final d9.f f9091e = new d9.f("CONDITION_FALSE", 1);
    public static final d9.f f9092f = new d9.f("NO_THREAD_ELEMENTS", 1);

    public static final Object a(t tVar, long j3, rd.p pVar) {
        while (true) {
            if (tVar.f9120c >= j3 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f9095a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            d9.f fVar = f9089b;
            if (obj == fVar) {
                return fVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f9120c + 1), tVar);
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
        if (obj != f9089b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(id.h hVar, Throwable th2) {
        Throwable runtimeException;
        for (ae.b bVar : f.f9098a) {
            try {
                bVar.c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    r7.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            r7.a(th2, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean d(Object obj) {
        if (obj == f9089b) {
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

    public static final void f(id.h hVar, Object obj) {
        if (obj != f9092f) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                b2[] b2VarArr = yVar.f9129b;
                int length = b2VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                b2 b2Var = b2VarArr[length];
                kotlin.jvm.internal.i.b(null);
                Object obj2 = yVar.f9128a[length];
                throw null;
            }
            Object fold = hVar.fold(null, w.d);
            kotlin.jvm.internal.i.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a4.a.y(fold);
            throw null;
        }
    }

    public static final void g(Object obj, id.c cVar) {
        Object vVar;
        g2 g2Var;
        if (cVar instanceof h) {
            h hVar = (h) cVar;
            a0 a0Var = hVar.d;
            kd.c cVar2 = hVar.f9101e;
            Throwable a2 = gd.f.a(obj);
            if (a2 == null) {
                vVar = obj;
            } else {
                vVar = new zd.v(a2, false);
            }
            cVar2.getContext();
            if (a0Var.e()) {
                hVar.f9102f = vVar;
                hVar.f51596c = 1;
                a0Var.c(cVar2.getContext(), hVar);
                return;
            }
            w0 a10 = c2.a();
            if (a10.f51642c >= 4294967296L) {
                hVar.f9102f = vVar;
                hVar.f51596c = 1;
                hd.e eVar = a10.f51643e;
                if (eVar == null) {
                    eVar = new hd.e();
                    a10.f51643e = eVar;
                }
                eVar.addLast(hVar);
                return;
            }
            a10.h(true);
            try {
                f1 f1Var = (f1) cVar2.getContext().get(b0.f51553b);
                if (f1Var != null && !f1Var.isActive()) {
                    CancellationException cancellationException = f1Var.getCancellationException();
                    hVar.c(vVar, cancellationException);
                    hVar.resumeWith(t7.a(cancellationException));
                } else {
                    Object obj2 = hVar.h;
                    id.h context = cVar2.getContext();
                    Object k10 = k(context, obj2);
                    if (k10 != f9092f) {
                        g2Var = e0.v(cVar2, context, k10);
                    } else {
                        g2Var = null;
                    }
                    cVar2.resumeWith(obj);
                    if (g2Var == null || g2Var.M()) {
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

    public static final long i(java.lang.String r21, long r22, long r24, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: ee.a.i(java.lang.String, long, long, long):long");
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

    public static final Object k(id.h hVar, Object obj) {
        if (obj == null) {
            obj = hVar.fold(0, w.f9123c);
            kotlin.jvm.internal.i.b(obj);
        }
        if (obj == 0) {
            return f9092f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new y(((Number) obj).intValue(), hVar), w.f9124e);
        }
        a4.a.y(obj);
        throw null;
    }
}
