package n1;

import ed.j;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import ld.p;
public final class c extends j implements p {
    public final int f13411a;
    public int f13412b;
    public Object f13413c;
    public final j d;

    public c(p pVar, cd.c cVar, int i10) {
        super(2, cVar);
        this.f13411a = i10;
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
    public final cd.c create(Object obj, cd.c cVar) {
        switch (this.f13411a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.f13413c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.f13413c = obj;
                return cVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        cd.c cVar = (cd.c) obj2;
        switch (this.f13411a) {
            case 0:
                return ((c) create(bVar, cVar)).invokeSuspend(ad.j.f401a);
            default:
                return ((c) create(bVar, cVar)).invokeSuspend(ad.j.f401a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f13411a) {
            case 0:
                dd.a aVar = dd.a.f5864a;
                int i10 = this.f13412b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        l9.b.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    l9.b.b(obj);
                    this.f13412b = 1;
                    obj = this.d.invoke((b) this.f13413c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                b bVar = (b) obj;
                bVar.f13410b.set(true);
                return bVar;
            default:
                dd.a aVar2 = dd.a.f5864a;
                int i11 = this.f13412b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        b bVar2 = (b) this.f13413c;
                        l9.b.b(obj);
                        return bVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l9.b.b(obj);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.f13413c).f13409a);
                i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar3 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.f13413c = bVar3;
                this.f13412b = 1;
                if (this.d.invoke(bVar3, this) != aVar2) {
                    return bVar3;
                }
                return aVar2;
        }
    }
}
