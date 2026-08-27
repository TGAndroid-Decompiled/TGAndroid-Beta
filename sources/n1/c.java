package n1;

import ad.p;
import h7.k6;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import tc.i;

public final class c extends i implements p {

    public final int f18084a;

    public int f18085b;

    public Object f18086c;
    public final i d;

    public c(p pVar, rc.c cVar, int i10) {
        super(2, cVar);
        this.f18084a = i10;
        switch (i10) {
            case 1:
                this.d = (i) pVar;
                super(2, cVar);
                break;
            default:
                this.d = (i) pVar;
                break;
        }
    }

    @Override
    public final rc.c create(Object obj, rc.c cVar) {
        switch (this.f18084a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.f18086c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.f18086c = obj;
                return cVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        rc.c cVar = (rc.c) obj2;
        switch (this.f18084a) {
            case 0:
                break;
        }
        return ((c) create(bVar, cVar)).invokeSuspend(pc.i.f45696a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f18084a) {
            case 0:
                sc.a aVar = sc.a.f47847a;
                int i10 = this.f18085b;
                if (i10 == 0) {
                    k6.b(obj);
                    b bVar = (b) this.f18086c;
                    this.f18085b = 1;
                    obj = this.d.invoke(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
                }
                b bVar2 = (b) obj;
                bVar2.f18083b.set(true);
                return bVar2;
            default:
                sc.a aVar2 = sc.a.f47847a;
                int i11 = this.f18085b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.f18086c;
                    k6.b(obj);
                    return bVar3;
                }
                k6.b(obj);
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.f18086c).f18082a);
                j.d(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar4 = new b(new LinkedHashMap(mapUnmodifiableMap), false);
                this.f18086c = bVar4;
                this.f18085b = 1;
                return this.d.invoke(bVar4, this) == aVar2 ? aVar2 : bVar4;
        }
    }
}
