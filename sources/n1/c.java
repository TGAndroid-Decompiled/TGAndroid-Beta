package n1;

import a8.jd;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import nd.i;
import ud.p;
public final class c extends i implements p {
    public final int f18575a;
    public int f18576b;
    public Object f18577c;
    public final i d;

    public c(p pVar, ld.c cVar, int i10) {
        super(2, cVar);
        this.f18575a = i10;
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
    public final ld.c create(Object obj, ld.c cVar) {
        switch (this.f18575a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.f18577c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.f18577c = obj;
                return cVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        ld.c cVar = (ld.c) obj2;
        switch (this.f18575a) {
            case 0:
                return ((c) create(bVar, cVar)).invokeSuspend(jd.i.f15580a);
            default:
                return ((c) create(bVar, cVar)).invokeSuspend(jd.i.f15580a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f18575a) {
            case 0:
                md.a aVar = md.a.f18412a;
                int i10 = this.f18576b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        jd.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    jd.b(obj);
                    this.f18576b = 1;
                    obj = this.d.invoke((b) this.f18577c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                b bVar = (b) obj;
                bVar.f18574b.set(true);
                return bVar;
            default:
                md.a aVar2 = md.a.f18412a;
                int i11 = this.f18576b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        b bVar2 = (b) this.f18577c;
                        jd.b(obj);
                        return bVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jd.b(obj);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.f18577c).f18573a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar3 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.f18577c = bVar3;
                this.f18576b = 1;
                if (this.d.invoke(bVar3, this) != aVar2) {
                    return bVar3;
                }
                return aVar2;
        }
    }
}
