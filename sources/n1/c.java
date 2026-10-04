package n1;

import gd.i;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kd.j;
import rd.p;
import v7.t7;
public final class c extends j implements p {
    public final int f16492a;
    public int f16493b;
    public Object f16494c;
    public final j d;

    public c(p pVar, id.c cVar, int i10) {
        super(2, cVar);
        this.f16492a = i10;
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
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f16492a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.f16494c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.f16494c = obj;
                return cVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f16492a) {
            case 0:
                return ((c) create(bVar, cVar)).invokeSuspend(i.f10452a);
            default:
                return ((c) create(bVar, cVar)).invokeSuspend(i.f10452a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f16492a) {
            case 0:
                jd.a aVar = jd.a.f14087a;
                int i10 = this.f16493b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        t7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t7.b(obj);
                    this.f16493b = 1;
                    obj = this.d.invoke((b) this.f16494c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                b bVar = (b) obj;
                bVar.f16491b.set(true);
                return bVar;
            default:
                jd.a aVar2 = jd.a.f14087a;
                int i11 = this.f16493b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        b bVar2 = (b) this.f16494c;
                        t7.b(obj);
                        return bVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t7.b(obj);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.f16494c).f16490a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar3 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.f16494c = bVar3;
                this.f16493b = 1;
                if (this.d.invoke(bVar3, this) != aVar2) {
                    return bVar3;
                }
                return aVar2;
        }
    }
}
