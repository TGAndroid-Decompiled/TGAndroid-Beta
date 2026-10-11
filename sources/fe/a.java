package fe;

import ae.b0;
import ae.c0;
import ae.d2;
import ae.e2;
import ae.g0;
import ae.h1;
import ae.i2;
import ae.y0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.a8;
import v7.y7;
public abstract class a {
    public static final da.a f9882a = new da.a("NO_DECISION");
    public static final da.a f9883b = new da.a("CLOSED");
    public static final da.a f9884c = new da.a("UNDEFINED");
    public static final da.a d = new da.a("REUSABLE_CLAIMED");
    public static final da.a f9885e = new da.a("CONDITION_FALSE");
    public static final da.a f9886f = new da.a("NO_THREAD_ELEMENTS");

    public static final Object a(t tVar, long j3, sd.p pVar) {
        while (true) {
            if (tVar.f9914c >= j3 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f9889a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            da.a aVar = f9883b;
            if (obj == aVar) {
                return aVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f9914c + 1), tVar);
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
        if (obj != f9883b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(Throwable th2, jd.h hVar) {
        Throwable runtimeException;
        for (be.b bVar : f.f9892a) {
            try {
                bVar.c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    y7.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            y7.a(th2, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean d(Object obj) {
        if (obj == f9883b) {
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

    public static final void f(jd.h hVar, Object obj) {
        if (obj != f9886f) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                d2[] d2VarArr = yVar.f9923b;
                int length = d2VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                d2 d2Var = d2VarArr[length];
                kotlin.jvm.internal.i.b(null);
                Object obj2 = yVar.f9922a[length];
                throw null;
            }
            Object fold = hVar.fold(null, w.d);
            kotlin.jvm.internal.i.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a1.g.z(fold);
            throw null;
        }
    }

    public static final void g(Object obj, jd.c cVar) {
        Object vVar;
        i2 i2Var;
        if (cVar instanceof h) {
            h hVar = (h) cVar;
            b0 b0Var = hVar.d;
            ld.c cVar2 = hVar.f9895e;
            Throwable a2 = hd.f.a(obj);
            if (a2 == null) {
                vVar = obj;
            } else {
                vVar = new ae.v(a2, false);
            }
            cVar2.getContext();
            if (b0Var.e()) {
                hVar.f9896f = vVar;
                hVar.f477c = 1;
                b0Var.c(cVar2.getContext(), hVar);
                return;
            }
            y0 a10 = e2.a();
            if (a10.f521c >= 4294967296L) {
                hVar.f9896f = vVar;
                hVar.f477c = 1;
                id.e eVar = a10.f522e;
                if (eVar == null) {
                    eVar = new id.e();
                    a10.f522e = eVar;
                }
                eVar.addLast(hVar);
                return;
            }
            a10.h(true);
            try {
                h1 h1Var = (h1) cVar2.getContext().get(c0.f433b);
                if (h1Var != null && !h1Var.isActive()) {
                    CancellationException cancellationException = h1Var.getCancellationException();
                    hVar.c(vVar, cancellationException);
                    hVar.resumeWith(a8.a(cancellationException));
                } else {
                    Object obj2 = hVar.h;
                    jd.h context = cVar2.getContext();
                    Object k10 = k(context, obj2);
                    if (k10 != f9886f) {
                        i2Var = g0.v(cVar2, context, k10);
                    } else {
                        i2Var = null;
                    }
                    cVar2.resumeWith(obj);
                    if (i2Var == null || i2Var.M()) {
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
        throw new UnsupportedOperationException("Method not decompiled: fe.a.i(java.lang.String, long, long, long):long");
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

    public static final Object k(jd.h hVar, Object obj) {
        if (obj == null) {
            obj = hVar.fold(0, w.f9917c);
            kotlin.jvm.internal.i.b(obj);
        }
        if (obj == 0) {
            return f9886f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new y(((Number) obj).intValue(), hVar), w.f9918e);
        }
        a1.g.z(obj);
        throw null;
    }
}
