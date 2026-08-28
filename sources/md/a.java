package md;

import g7.w5;
import g7.y5;
import hd.a0;
import hd.b0;
import hd.c2;
import hd.d2;
import hd.f0;
import hd.g1;
import hd.h2;
import hd.x0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class a {
    public static final e5.c f17638a = new e5.c("NO_DECISION", 2);
    public static final e5.c f17639b = new e5.c("CLOSED", 2);
    public static final e5.c f17640c = new e5.c("UNDEFINED", 2);
    public static final e5.c d = new e5.c("REUSABLE_CLAIMED", 2);
    public static final e5.c f17641e = new e5.c("CONDITION_FALSE", 2);
    public static final e5.c f17642f = new e5.c("NO_THREAD_ELEMENTS", 2);

    public static final Object a(t tVar, long j10, zc.p pVar) {
        while (true) {
            if (tVar.f17670c >= j10 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f17645a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            e5.c cVar = f17639b;
            if (obj == cVar) {
                return cVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f17670c + 1), tVar);
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
        if (obj != f17639b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(Throwable th, qc.h hVar) {
        Throwable runtimeException;
        for (id.b bVar : f.f17648a) {
            try {
                bVar.c(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    w5.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            w5.a(th, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean d(Object obj) {
        if (obj == f17639b) {
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

    public static final void f(qc.h hVar, Object obj) {
        if (obj != f17642f) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                c2[] c2VarArr = yVar.f17679b;
                int length = c2VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                c2 c2Var = c2VarArr[length];
                kotlin.jvm.internal.i.b(null);
                Object obj2 = yVar.f17678a[length];
                throw null;
            }
            Object fold = hVar.fold(null, w.d);
            kotlin.jvm.internal.i.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            aa.d.v(fold);
            throw null;
        }
    }

    public static final void g(Object obj, qc.c cVar) {
        Object vVar;
        h2 h2Var;
        if (cVar instanceof h) {
            h hVar = (h) cVar;
            a0 a0Var = hVar.d;
            sc.c cVar2 = hVar.f17651e;
            Throwable a2 = oc.f.a(obj);
            if (a2 == null) {
                vVar = obj;
            } else {
                vVar = new hd.v(a2, false);
            }
            cVar2.getContext();
            if (a0Var.e()) {
                hVar.f17652f = vVar;
                hVar.f10459c = 1;
                a0Var.c(cVar2.getContext(), hVar);
                return;
            }
            x0 a3 = d2.a();
            if (a3.f10504c >= 4294967296L) {
                hVar.f17652f = vVar;
                hVar.f10459c = 1;
                pc.e eVar = a3.f10505e;
                if (eVar == null) {
                    eVar = new pc.e();
                    a3.f10505e = eVar;
                }
                eVar.addLast(hVar);
                return;
            }
            a3.h(true);
            try {
                g1 g1Var = (g1) cVar2.getContext().get(b0.f10413b);
                if (g1Var != null && !g1Var.isActive()) {
                    CancellationException cancellationException = g1Var.getCancellationException();
                    hVar.c(vVar, cancellationException);
                    hVar.resumeWith(y5.a(cancellationException));
                } else {
                    Object obj2 = hVar.h;
                    qc.h context = cVar2.getContext();
                    Object k10 = k(context, obj2);
                    if (k10 != f17642f) {
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
                } while (a3.j());
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
        throw new UnsupportedOperationException("Method not decompiled: md.a.i(java.lang.String, long, long, long):long");
    }

    public static int j(int i9, int i10, String str) {
        int i11;
        if ((i10 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        } else {
            i11 = 2097150;
        }
        return (int) i(str, i9, 1, i11);
    }

    public static final Object k(qc.h hVar, Object obj) {
        if (obj == null) {
            obj = hVar.fold(0, w.f17673c);
            kotlin.jvm.internal.i.b(obj);
        }
        if (obj == 0) {
            return f17642f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new y(((Number) obj).intValue(), hVar), w.f17674e);
        }
        aa.d.v(obj);
        throw null;
    }
}
