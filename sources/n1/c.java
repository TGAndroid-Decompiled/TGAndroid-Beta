package n1;

import g7.y5;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import sc.i;
import zc.p;
public final class c extends i implements p {
    public final int f18259a;
    public int f18260b;
    public Object f18261c;
    public final i d;

    public c(p pVar, qc.c cVar, int i9) {
        super(2, cVar);
        this.f18259a = i9;
        switch (i9) {
            case 1:
                this.d = (i) pVar;
                super(2, cVar);
                return;
            default:
                this.d = (i) pVar;
                return;
        }
    }

    @Override
    public final qc.c create(Object obj, qc.c cVar) {
        switch (this.f18259a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.f18261c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.f18261c = obj;
                return cVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        qc.c cVar = (qc.c) obj2;
        switch (this.f18259a) {
            case 0:
                return ((c) create(bVar, cVar)).invokeSuspend(oc.i.f19197a);
            default:
                return ((c) create(bVar, cVar)).invokeSuspend(oc.i.f19197a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f18259a) {
            case 0:
                rc.a aVar = rc.a.f47127a;
                int i9 = this.f18260b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y5.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    y5.b(obj);
                    this.f18260b = 1;
                    obj = this.d.invoke((b) this.f18261c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                b bVar = (b) obj;
                bVar.f18258b.set(true);
                return bVar;
            default:
                rc.a aVar2 = rc.a.f47127a;
                int i10 = this.f18260b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        b bVar2 = (b) this.f18261c;
                        y5.b(obj);
                        return bVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.b(obj);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.f18261c).f18257a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar3 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.f18261c = bVar3;
                this.f18260b = 1;
                if (this.d.invoke(bVar3, this) != aVar2) {
                    return bVar3;
                }
                return aVar2;
        }
    }
}
