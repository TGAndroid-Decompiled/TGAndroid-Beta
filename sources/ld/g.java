package ld;

import h7.k6;
import kotlin.jvm.internal.q;

public final class g implements c {

    public final c f15551a;

    public final q f15552b;

    public g(c cVar, q qVar) {
        this.f15551a = cVar;
        this.f15552b = qVar;
    }

    @Override
    public final Object c(Object obj, tc.c cVar) throws Throwable {
        f fVar;
        g gVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.d = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj2 = fVar.f15549b;
        sc.a aVar = sc.a.f47847a;
        int i11 = fVar.d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = fVar.f15548a;
            try {
                k6.b(obj2);
                return pc.i.f45696a;
            } catch (Throwable th) {
                th = th;
                gVar.f15552b.f15253a = th;
                throw th;
            }
        }
        k6.b(obj2);
        try {
            c cVar2 = this.f15551a;
            fVar.f15548a = this;
            fVar.d = 1;
            if (cVar2.c(obj, fVar) == aVar) {
                return aVar;
            }
            return pc.i.f45696a;
        } catch (Throwable th2) {
            th = th2;
            gVar = this;
            gVar.f15552b.f15253a = th;
            throw th;
        }
    }
}
