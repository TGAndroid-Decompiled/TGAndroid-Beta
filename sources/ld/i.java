package ld;

import h7.k6;
import ia.c0;

public final class i implements c {

    public final kotlin.jvm.internal.o f15557a;

    public final c f15558b;

    public final c0 f15559c;

    public i(kotlin.jvm.internal.o oVar, c cVar, c0 c0Var) {
        this.f15557a = oVar;
        this.f15558b = cVar;
        this.f15559c = c0Var;
    }

    @Override
    public final Object c(Object obj, tc.c cVar) {
        h hVar;
        i iVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.f15556e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f15556e = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objInvoke = hVar.f15555c;
        sc.a aVar = sc.a.f47847a;
        int i11 = hVar.f15556e;
        pc.i iVar2 = pc.i.f45696a;
        if (i11 == 0) {
            k6.b(objInvoke);
            if (this.f15557a.f15251a) {
                hVar.f15556e = 1;
                if (this.f15558b.c(obj, hVar) != aVar) {
                    return iVar2;
                }
            } else {
                hVar.f15553a = this;
                hVar.f15554b = obj;
                hVar.f15556e = 2;
                objInvoke = this.f15559c.invoke(obj, hVar);
                if (objInvoke != aVar) {
                    iVar = this;
                }
            }
            return aVar;
        }
        if (i11 == 1) {
            k6.b(objInvoke);
            return iVar2;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k6.b(objInvoke);
            return iVar2;
        }
        obj = hVar.f15554b;
        iVar = hVar.f15553a;
        k6.b(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            iVar.f15557a.f15251a = true;
            c cVar2 = iVar.f15558b;
            hVar.f15553a = null;
            hVar.f15554b = null;
            hVar.f15556e = 3;
            if (cVar2.c(obj, hVar) == aVar) {
                return aVar;
            }
        }
        return iVar2;
    }
}
