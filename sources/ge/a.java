package ge;

import be.a0;
import be.b0;
import be.c2;
import be.d2;
import be.f0;
import be.g1;
import be.h2;
import be.x0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.g8;
import v7.i8;
public abstract class a {
    public static final a6.i f10104a = new a6.i("NO_DECISION", 22);
    public static final a6.i f10105b = new a6.i("CLOSED", 22);
    public static final a6.i f10106c = new a6.i("UNDEFINED", 22);
    public static final a6.i d = new a6.i("REUSABLE_CLAIMED", 22);
    public static final a6.i e = new a6.i("CONDITION_FALSE", 22);
    public static final a6.i f10107f = new a6.i("NO_THREAD_ELEMENTS", 22);

    public static final Object a(t tVar, long j10, td.p pVar) {
        while (true) {
            if (tVar.f10132c >= j10 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f10110a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            a6.i iVar = f10105b;
            if (obj == iVar) {
                return iVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f10132c + 1), tVar);
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
        if (obj != f10105b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(Throwable th2, kd.h hVar) {
        Throwable runtimeException;
        for (ce.b bVar : f.f10113a) {
            try {
                bVar.c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    g8.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            g8.a(th2, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean d(Object obj) {
        if (obj == f10105b) {
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

    public static final void f(kd.h hVar, Object obj) {
        if (obj != f10107f) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                c2[] c2VarArr = yVar.f10140b;
                int length = c2VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                c2 c2Var = c2VarArr[length];
                kotlin.jvm.internal.i.b(null);
                Object obj2 = yVar.f10139a[length];
                throw null;
            }
            Object fold = hVar.fold(null, w.d);
            kotlin.jvm.internal.i.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a1.g.z(fold);
            throw null;
        }
    }

    public static final void g(Object obj, kd.c cVar) {
        Object vVar;
        h2 h2Var;
        if (cVar instanceof h) {
            h hVar = (h) cVar;
            a0 a0Var = hVar.d;
            md.c cVar2 = hVar.e;
            Throwable a2 = id.f.a(obj);
            if (a2 == null) {
                vVar = obj;
            } else {
                vVar = new be.v(a2, false);
            }
            cVar2.getContext();
            if (a0Var.d()) {
                hVar.f10116f = vVar;
                hVar.f2686c = 1;
                a0Var.c(cVar2.getContext(), hVar);
                return;
            }
            x0 a10 = d2.a();
            if (a10.f2724c >= 4294967296L) {
                hVar.f10116f = vVar;
                hVar.f2686c = 1;
                jd.e eVar = a10.e;
                if (eVar == null) {
                    eVar = new jd.e();
                    a10.e = eVar;
                }
                eVar.addLast(hVar);
                return;
            }
            a10.h(true);
            try {
                g1 g1Var = (g1) cVar2.getContext().get(b0.f2649b);
                if (g1Var != null && !g1Var.isActive()) {
                    CancellationException cancellationException = g1Var.getCancellationException();
                    hVar.b(vVar, cancellationException);
                    hVar.resumeWith(i8.a(cancellationException));
                } else {
                    Object obj2 = hVar.h;
                    kd.h context = cVar2.getContext();
                    Object k10 = k(context, obj2);
                    if (k10 != f10107f) {
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
        throw new UnsupportedOperationException("Method not decompiled: ge.a.i(java.lang.String, long, long, long):long");
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

    public static final Object k(kd.h hVar, Object obj) {
        if (obj == null) {
            obj = hVar.fold(0, w.f10135c);
            kotlin.jvm.internal.i.b(obj);
        }
        if (obj == 0) {
            return f10107f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new y(((Number) obj).intValue(), hVar), w.e);
        }
        a1.g.z(obj);
        throw null;
    }
}
