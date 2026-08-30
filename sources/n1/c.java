package n1;

import dd.p;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import k7.p7;
import kotlin.jvm.internal.j;
import wc.i;
public final class c extends i implements p {
    public final int f14210a;
    public int f14211b;
    public Object f14212c;
    public final i d;

    public c(p pVar, uc.c cVar, int i10) {
        super(2, cVar);
        this.f14210a = i10;
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
    public final uc.c create(Object obj, uc.c cVar) {
        switch (this.f14210a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.f14212c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.f14212c = obj;
                return cVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        uc.c cVar = (uc.c) obj2;
        switch (this.f14210a) {
            case 0:
                return ((c) create(bVar, cVar)).invokeSuspend(sc.i.f44253a);
            default:
                return ((c) create(bVar, cVar)).invokeSuspend(sc.i.f44253a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f14210a) {
            case 0:
                vc.a aVar = vc.a.f45663a;
                int i10 = this.f14211b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    p7.b(obj);
                    this.f14211b = 1;
                    obj = this.d.invoke((b) this.f14212c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                b bVar = (b) obj;
                bVar.f14209b.set(true);
                return bVar;
            default:
                vc.a aVar2 = vc.a.f45663a;
                int i11 = this.f14211b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        b bVar2 = (b) this.f14212c;
                        p7.b(obj);
                        return bVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p7.b(obj);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.f14212c).f14208a);
                j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar3 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.f14212c = bVar3;
                this.f14211b = 1;
                if (this.d.invoke(bVar3, this) != aVar2) {
                    return bVar3;
                }
                return aVar2;
        }
    }
}
