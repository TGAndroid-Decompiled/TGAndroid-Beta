package nd;

import h7.i6;
import h7.k6;
import id.a0;
import id.b0;
import id.c2;
import id.d2;
import id.f0;
import id.g1;
import id.h2;
import id.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class a {

    public static final ec.a f18474a = new ec.a("NO_DECISION", 3);

    public static final ec.a f18475b = new ec.a("CLOSED", 3);

    public static final ec.a f18476c = new ec.a("UNDEFINED", 3);
    public static final ec.a d = new ec.a("REUSABLE_CLAIMED", 3);

    public static final ec.a f18477e = new ec.a("CONDITION_FALSE", 3);

    public static final ec.a f18478f = new ec.a("NO_THREAD_ELEMENTS", 3);

    public static final Object a(t tVar, long j10, ad.p pVar) {
        while (true) {
            if (tVar.f18506c >= j10 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f18481a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            ec.a aVar = f18475b;
            if (obj == aVar) {
                return aVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f18506c + 1), tVar);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                        if (tVar.d()) {
                            tVar.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(tVar) == null);
            }
            tVar = tVar2;
        }
    }

    public static final t b(Object obj) {
        if (obj != f18475b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(Throwable th, rc.h hVar) {
        Throwable runtimeException;
        Iterator it = f.f18484a.iterator();
        while (it.hasNext()) {
            try {
                ((jd.b) it.next()).c(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    i6.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            i6.a(th, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean d(Object obj) {
        return obj == f18475b;
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

    public static final void f(rc.h hVar, Object obj) {
        if (obj == f18478f) {
            return;
        }
        if (!(obj instanceof y)) {
            Object objFold = hVar.fold(null, w.d);
            kotlin.jvm.internal.j.c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a9.p.t(objFold);
            throw null;
        }
        y yVar = (y) obj;
        c2[] c2VarArr = yVar.f18515b;
        int length = c2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        c2 c2Var = c2VarArr[length];
        kotlin.jvm.internal.j.b(null);
        Object obj2 = yVar.f18514a[length];
        throw null;
    }

    public static final void g(Object obj, rc.c cVar) {
        if (!(cVar instanceof h)) {
            cVar.resumeWith(obj);
            return;
        }
        h hVar = (h) cVar;
        a0 a0Var = hVar.d;
        tc.c cVar2 = hVar.f18487e;
        Throwable thA = pc.f.a(obj);
        Object vVar = thA == null ? obj : new id.v(thA, false);
        cVar2.getContext();
        if (a0Var.e()) {
            hVar.f18488f = vVar;
            hVar.f11168c = 1;
            a0Var.c(cVar2.getContext(), hVar);
            return;
        }
        x0 x0VarA = d2.a();
        if (x0VarA.f11213c >= 4294967296L) {
            hVar.f18488f = vVar;
            hVar.f11168c = 1;
            qc.e eVar = x0VarA.f11214e;
            if (eVar == null) {
                eVar = new qc.e();
                x0VarA.f11214e = eVar;
            }
            eVar.addLast(hVar);
            return;
        }
        x0VarA.h(true);
        try {
            g1 g1Var = (g1) cVar2.getContext().get(b0.f11122b);
            if (g1Var == null || g1Var.isActive()) {
                Object obj2 = hVar.h;
                rc.h context = cVar2.getContext();
                Object objK = k(context, obj2);
                h2 h2VarV = objK != f18478f ? f0.v(cVar2, context, objK) : null;
                try {
                    cVar2.resumeWith(obj);
                    if (h2VarV == null || h2VarV.M()) {
                        f(context, objK);
                    }
                } catch (Throwable th) {
                    if (h2VarV == null || h2VarV.M()) {
                        f(context, objK);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationException = g1Var.getCancellationException();
                hVar.c(vVar, cancellationException);
                hVar.resumeWith(k6.a(cancellationException));
            }
            while (x0VarA.j()) {
            }
        } catch (Throwable th2) {
            try {
                hVar.i(th2, null);
            } finally {
                x0VarA.f(true);
            }
        }
    }

    public static final long i(String str, long j10, long j11, long j12) {
        String property;
        Long lValueOf;
        boolean z10;
        long j13;
        long j14;
        int iDigit;
        long j15;
        long j16;
        int i10 = v.f18508a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j10;
        }
        int length = property.length();
        if (length != 0) {
            int i11 = 0;
            char cCharAt = property.charAt(0);
            long j17 = -9223372036854775807L;
            if (cCharAt >= '0') {
                z10 = false;
                j13 = 0;
                j14 = -256204778801521550L;
                while (true) {
                    if (i11 >= length) {
                        if (!z10) {
                            lValueOf = Long.valueOf(-j13);
                            break;
                        }
                        lValueOf = Long.valueOf(j13);
                        break;
                    }
                    iDigit = Character.digit((int) property.charAt(i11), 10);
                    if (iDigit >= 0) {
                        if (j13 < j14) {
                            if (j14 == -256204778801521550L) {
                                j14 = j17 / ((long) 10);
                                if (j13 < j14) {
                                }
                            }
                        }
                        j15 = j13 * ((long) 10);
                        j16 = iDigit;
                        if (j15 >= j17 + j16) {
                            j13 = j15 - j16;
                            i11++;
                            length = length;
                        }
                    }
                }
            } else {
                z10 = true;
                if (length != 1) {
                    if (cCharAt == '+') {
                        i11 = 1;
                        z10 = false;
                        j13 = 0;
                        j14 = -256204778801521550L;
                        while (true) {
                            if (i11 >= length) {
                                if (!z10) {
                                    lValueOf = Long.valueOf(-j13);
                                    break;
                                }
                                lValueOf = Long.valueOf(j13);
                                break;
                            }
                            iDigit = Character.digit((int) property.charAt(i11), 10);
                            if (iDigit >= 0) {
                                if (j13 < j14) {
                                    if (j14 == -256204778801521550L) {
                                        j14 = j17 / ((long) 10);
                                        if (j13 < j14) {
                                        }
                                    }
                                }
                                j15 = j13 * ((long) 10);
                                j16 = iDigit;
                                if (j15 >= j17 + j16) {
                                    j13 = j15 - j16;
                                    i11++;
                                    length = length;
                                }
                            }
                        }
                    } else if (cCharAt == '-') {
                        j17 = Long.MIN_VALUE;
                        i11 = 1;
                        j13 = 0;
                        j14 = -256204778801521550L;
                        while (true) {
                            if (i11 >= length) {
                                if (!z10) {
                                    lValueOf = Long.valueOf(-j13);
                                    break;
                                }
                                lValueOf = Long.valueOf(j13);
                                break;
                            }
                            iDigit = Character.digit((int) property.charAt(i11), 10);
                            if (iDigit >= 0) {
                                if (j13 < j14) {
                                    if (j14 == -256204778801521550L) {
                                        j14 = j17 / ((long) 10);
                                        if (j13 < j14) {
                                        }
                                    }
                                }
                                j15 = j13 * ((long) 10);
                                j16 = iDigit;
                                if (j15 >= j17 + j16) {
                                    j13 = j15 - j16;
                                    i11++;
                                    length = length;
                                }
                            }
                        }
                    }
                }
            }
            lValueOf = null;
            break;
        } else {
            lValueOf = null;
            break;
        }
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int j(int i10, int i11, String str) {
        return (int) i(str, i10, 1, (i11 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(rc.h hVar, Object obj) {
        if (obj == null) {
            obj = hVar.fold(0, w.f18509c);
            kotlin.jvm.internal.j.b(obj);
        }
        if (obj == 0) {
            return f18478f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new y(((Number) obj).intValue(), hVar), w.f18510e);
        }
        a9.p.t(obj);
        throw null;
    }
}
