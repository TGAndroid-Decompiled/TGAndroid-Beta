package ld;

import h7.i6;
import h7.k6;
import ia.v;
import id.b0;
import id.g1;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.q;

public abstract class n {

    public static final ec.a f15570a = new ec.a("NONE", 3);

    public static final ec.a f15571b = new ec.a("PENDING", 3);

    public static final Serializable a(b bVar, c cVar, tc.c cVar2) {
        e eVar;
        q qVar;
        g1 g1Var;
        CancellationException cancellationException;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i10 = eVar.f15547c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f15547c = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(cVar2);
            }
        } else {
            eVar = new e(cVar2);
        }
        Object obj = eVar.f15546b;
        sc.a aVar = sc.a.f47847a;
        int i11 = eVar.f15547c;
        if (i11 == 0) {
            k6.b(obj);
            q qVar2 = new q();
            try {
                c gVar = new g(cVar, qVar2);
                eVar.f15545a = qVar2;
                eVar.f15547c = 1;
                if (bVar.q(gVar, eVar) == aVar) {
                    return aVar;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                qVar = qVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = eVar.f15545a;
            try {
                k6.b(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) qVar.f15253a;
        if ((th3 != null && th3.equals(th)) || ((g1Var = (g1) eVar.getContext().get(b0.f11122b)) != null && g1Var.isCancelled() && (cancellationException = g1Var.getCancellationException()) != null && cancellationException.equals(th))) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            i6.a(th3, th);
            throw th3;
        }
        i6.a(th, th3);
        throw th;
    }

    public static final Object b(b bVar, tc.c cVar) {
        j jVar;
        q qVar;
        md.a e9;
        v vVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i10 = jVar.d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.d = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(cVar);
            }
        } else {
            jVar = new j(cVar);
        }
        Object obj = jVar.f15562c;
        Object obj2 = sc.a.f47847a;
        int i11 = jVar.d;
        ec.a aVar = md.e.f18027a;
        if (i11 == 0) {
            k6.b(obj);
            q qVar2 = new q();
            qVar2.f15253a = aVar;
            v vVar2 = new v(qVar2, 1);
            try {
                jVar.f15560a = qVar2;
                jVar.f15561b = vVar2;
                jVar.d = 1;
                if (bVar.q(vVar2, jVar) == obj2) {
                    return obj2;
                }
                qVar = qVar2;
            } catch (md.a e10) {
                qVar = qVar2;
                e9 = e10;
                vVar = vVar2;
                if (e9.f18020a != vVar) {
                    throw e9;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = jVar.f15561b;
            qVar = jVar.f15560a;
            try {
                k6.b(obj);
            } catch (md.a e11) {
                e9 = e11;
                if (e9.f18020a != vVar) {
                    throw e9;
                }
            }
        }
        Object obj3 = qVar.f15253a;
        if (obj3 != aVar) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }
}
