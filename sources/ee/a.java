package ee;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.s7;
import v7.u7;
import zd.a0;
import zd.b0;
import zd.b2;
import zd.c2;
import zd.e0;
import zd.f1;
import zd.g2;
import zd.w0;
public abstract class a {
    public static final v f7471a = new v("NO_DECISION", 0);
    public static final v f7472b = new v("CLOSED", 0);
    public static final v f7473c = new v("UNDEFINED", 0);
    public static final v d = new v("REUSABLE_CLAIMED", 0);
    public static final v e = new v("CONDITION_FALSE", 0);
    public static final v f7474f = new v("NO_THREAD_ELEMENTS", 0);

    public static final Object a(t tVar, long j3, rd.p pVar) {
        while (true) {
            if (tVar.f7499c >= j3 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f7477a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            v vVar = f7472b;
            if (obj == vVar) {
                return vVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f7499c + 1), tVar);
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
        if (obj != f7472b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(id.h hVar, Throwable th2) {
        Throwable runtimeException;
        for (ae.b bVar : f.f7480a) {
            try {
                bVar.c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    s7.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            s7.a(th2, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean d(Object obj) {
        if (obj == f7472b) {
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
        if (obj != f7474f) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                b2[] b2VarArr = zVar.f7509b;
                int length = b2VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                b2 b2Var = b2VarArr[length];
                kotlin.jvm.internal.i.b(null);
                Object obj2 = zVar.f7508a[length];
                throw null;
            }
            Object fold = hVar.fold(null, x.d);
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
            kd.c cVar2 = hVar.e;
            Throwable a2 = gd.f.a(obj);
            if (a2 == null) {
                vVar = obj;
            } else {
                vVar = new zd.v(a2, false);
            }
            cVar2.getContext();
            if (a0Var.e()) {
                hVar.f7483f = vVar;
                hVar.f48023c = 1;
                a0Var.c(cVar2.getContext(), hVar);
                return;
            }
            w0 a10 = c2.a();
            if (a10.f48061c >= 4294967296L) {
                hVar.f7483f = vVar;
                hVar.f48023c = 1;
                hd.e eVar = a10.e;
                if (eVar == null) {
                    eVar = new hd.e();
                    a10.e = eVar;
                }
                eVar.addLast(hVar);
                return;
            }
            a10.h(true);
            try {
                f1 f1Var = (f1) cVar2.getContext().get(b0.f47988b);
                if (f1Var != null && !f1Var.isActive()) {
                    CancellationException cancellationException = f1Var.getCancellationException();
                    hVar.c(vVar, cancellationException);
                    hVar.resumeWith(u7.a(cancellationException));
                } else {
                    Object obj2 = hVar.h;
                    id.h context = cVar2.getContext();
                    Object k10 = k(context, obj2);
                    if (k10 != f7474f) {
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
            obj = hVar.fold(0, x.f7504c);
            kotlin.jvm.internal.i.b(obj);
        }
        if (obj == 0) {
            return f7474f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new z(((Number) obj).intValue(), hVar), x.e);
        }
        a4.a.y(obj);
        throw null;
    }
}
