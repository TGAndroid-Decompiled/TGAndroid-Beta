package od;

import i7.a7;
import i7.c7;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.a0;
import jd.b0;
import jd.b2;
import jd.c2;
import jd.e0;
import jd.f1;
import jd.g2;
import jd.w0;
public abstract class a {
    public static final fc.a f19501a = new fc.a("NO_DECISION", 2);
    public static final fc.a f19502b = new fc.a("CLOSED", 2);
    public static final fc.a f19503c = new fc.a("UNDEFINED", 2);
    public static final fc.a d = new fc.a("REUSABLE_CLAIMED", 2);
    public static final fc.a f19504e = new fc.a("CONDITION_FALSE", 2);
    public static final fc.a f19505f = new fc.a("NO_THREAD_ELEMENTS", 2);

    public static final Object a(u uVar, long j10, bd.p pVar) {
        while (true) {
            if (uVar.f19536c >= j10 && !uVar.d()) {
                return uVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f19508a;
            Object obj = atomicReferenceFieldUpdater.get(uVar);
            fc.a aVar = f19502b;
            if (obj == aVar) {
                return aVar;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) pVar.invoke(Long.valueOf(uVar.f19536c + 1), uVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                    if (atomicReferenceFieldUpdater.get(uVar) != null) {
                        break;
                    }
                }
                if (uVar.d()) {
                    uVar.e();
                }
            }
            uVar = uVar2;
        }
    }

    public static final u b(Object obj) {
        if (obj != f19502b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(Throwable th2, sc.h hVar) {
        Throwable runtimeException;
        for (kd.b bVar : f.f19511a) {
            try {
                bVar.c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    a7.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            a7.a(th2, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean d(Object obj) {
        if (obj == f19502b) {
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

    public static final void f(sc.h hVar, Object obj) {
        if (obj != f19505f) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                b2[] b2VarArr = zVar.f19545b;
                int length = b2VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                b2 b2Var = b2VarArr[length];
                kotlin.jvm.internal.j.b(null);
                Object obj2 = zVar.f19544a[length];
                throw null;
            }
            Object fold = hVar.fold(null, x.d);
            kotlin.jvm.internal.j.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a4.w.u(fold);
            throw null;
        }
    }

    public static final void g(Object obj, sc.c cVar) {
        Object vVar;
        g2 g2Var;
        if (cVar instanceof h) {
            h hVar = (h) cVar;
            a0 a0Var = hVar.d;
            uc.c cVar2 = hVar.f19514e;
            Throwable a2 = qc.f.a(obj);
            if (a2 == null) {
                vVar = obj;
            } else {
                vVar = new jd.v(a2, false);
            }
            cVar2.getContext();
            if (a0Var.e()) {
                hVar.f19515f = vVar;
                hVar.f11490c = 1;
                a0Var.c(cVar2.getContext(), hVar);
                return;
            }
            w0 a10 = c2.a();
            if (a10.f11536c >= 4294967296L) {
                hVar.f19515f = vVar;
                hVar.f11490c = 1;
                rc.e eVar = a10.f11537e;
                if (eVar == null) {
                    eVar = new rc.e();
                    a10.f11537e = eVar;
                }
                eVar.addLast(hVar);
                return;
            }
            a10.h(true);
            try {
                f1 f1Var = (f1) cVar2.getContext().get(b0.f11447b);
                if (f1Var != null && !f1Var.isActive()) {
                    CancellationException cancellationException = f1Var.getCancellationException();
                    hVar.c(vVar, cancellationException);
                    hVar.resumeWith(c7.a(cancellationException));
                } else {
                    Object obj2 = hVar.h;
                    sc.h context = cVar2.getContext();
                    Object k9 = k(context, obj2);
                    if (k9 != f19505f) {
                        g2Var = e0.v(cVar2, context, k9);
                    } else {
                        g2Var = null;
                    }
                    cVar2.resumeWith(obj);
                    if (g2Var == null || g2Var.M()) {
                        f(context, k9);
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
        throw new UnsupportedOperationException("Method not decompiled: od.a.i(java.lang.String, long, long, long):long");
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

    public static final Object k(sc.h hVar, Object obj) {
        if (obj == null) {
            obj = hVar.fold(0, x.f19539c);
            kotlin.jvm.internal.j.b(obj);
        }
        if (obj == 0) {
            return f19505f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new z(((Number) obj).intValue(), hVar), x.f19540e);
        }
        a4.w.u(obj);
        throw null;
    }
}
