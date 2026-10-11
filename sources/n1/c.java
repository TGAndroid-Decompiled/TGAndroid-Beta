package n1;

import hd.i;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import ld.j;
import sd.p;
import v7.a8;
public final class c extends j implements p {
    public final int f16550a;
    public int f16551b;
    public Object f16552c;
    public final j d;

    public c(p pVar, jd.c cVar, int i10) {
        super(2, cVar);
        this.f16550a = i10;
        switch (i10) {
            case 1:
                this.d = (j) pVar;
                super(2, cVar);
                return;
            default:
                this.d = (j) pVar;
                return;
        }
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        switch (this.f16550a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.f16552c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.f16552c = obj;
                return cVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        jd.c cVar = (jd.c) obj2;
        switch (this.f16550a) {
            case 0:
                return ((c) create(bVar, cVar)).invokeSuspend(i.f11091a);
            default:
                return ((c) create(bVar, cVar)).invokeSuspend(i.f11091a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f16550a) {
            case 0:
                kd.a aVar = kd.a.f14783a;
                int i10 = this.f16551b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a8.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a8.b(obj);
                    this.f16551b = 1;
                    obj = this.d.invoke((b) this.f16552c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                b bVar = (b) obj;
                bVar.f16549b.set(true);
                return bVar;
            default:
                kd.a aVar2 = kd.a.f14783a;
                int i11 = this.f16551b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        b bVar2 = (b) this.f16552c;
                        a8.b(obj);
                        return bVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a8.b(obj);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.f16552c).f16548a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar3 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.f16552c = bVar3;
                this.f16551b = 1;
                if (this.d.invoke(bVar3, this) != aVar2) {
                    return bVar3;
                }
                return aVar2;
        }
    }
}
