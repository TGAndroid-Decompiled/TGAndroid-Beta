package n1;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import md.i;
import td.p;
import v7.i8;
public final class c extends i implements p {
    public final int f17000a;
    public int f17001b;
    public Object f17002c;
    public final i d;

    public c(p pVar, kd.c cVar, int i10) {
        super(2, cVar);
        this.f17000a = i10;
        switch (i10) {
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
    public final kd.c create(Object obj, kd.c cVar) {
        switch (this.f17000a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.f17002c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.f17002c = obj;
                return cVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        kd.c cVar = (kd.c) obj2;
        switch (this.f17000a) {
            case 0:
                return ((c) create(bVar, cVar)).invokeSuspend(id.i.f12779a);
            default:
                return ((c) create(bVar, cVar)).invokeSuspend(id.i.f12779a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f17000a) {
            case 0:
                ld.a aVar = ld.a.f15993a;
                int i10 = this.f17001b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        i8.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i8.b(obj);
                    this.f17001b = 1;
                    obj = this.d.invoke((b) this.f17002c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                b bVar = (b) obj;
                bVar.f16999b.set(true);
                return bVar;
            default:
                ld.a aVar2 = ld.a.f15993a;
                int i11 = this.f17001b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        b bVar2 = (b) this.f17002c;
                        i8.b(obj);
                        return bVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i8.b(obj);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.f17002c).f16998a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar3 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.f17002c = bVar3;
                this.f17001b = 1;
                if (this.d.invoke(bVar3, this) != aVar2) {
                    return bVar3;
                }
                return aVar2;
        }
    }
}
