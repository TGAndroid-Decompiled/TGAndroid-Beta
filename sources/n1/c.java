package n1;

import gd.i;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kd.j;
import rd.p;
import v7.t7;
public final class c extends j implements p {
    public final int f15040a;
    public int f15041b;
    public Object f15042c;
    public final j d;

    public c(p pVar, id.c cVar, int i10) {
        super(2, cVar);
        this.f15040a = i10;
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
        switch (this.f15040a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.f15042c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.f15042c = obj;
                return cVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f15040a) {
            case 0:
                return ((c) create(bVar, cVar)).invokeSuspend(i.f9620a);
            default:
                return ((c) create(bVar, cVar)).invokeSuspend(i.f9620a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f15040a) {
            case 0:
                jd.a aVar = jd.a.f12970a;
                int i10 = this.f15041b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        t7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t7.b(obj);
                    this.f15041b = 1;
                    obj = this.d.invoke((b) this.f15042c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                b bVar = (b) obj;
                bVar.f15039b.set(true);
                return bVar;
            default:
                jd.a aVar2 = jd.a.f12970a;
                int i11 = this.f15041b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        b bVar2 = (b) this.f15042c;
                        t7.b(obj);
                        return bVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t7.b(obj);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.f15042c).f15038a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar3 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.f15042c = bVar3;
                this.f15041b = 1;
                if (this.d.invoke(bVar3, this) != aVar2) {
                    return bVar3;
                }
                return aVar2;
        }
    }
}
