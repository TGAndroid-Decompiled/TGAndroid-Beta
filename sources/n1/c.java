package n1;

import bd.p;
import i7.c7;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import uc.i;
public final class c extends i implements p {
    public final int f17085a;
    public int f17086b;
    public Object f17087c;
    public final i d;

    public c(p pVar, sc.c cVar, int i10) {
        super(2, cVar);
        this.f17085a = i10;
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
    public final sc.c create(Object obj, sc.c cVar) {
        switch (this.f17085a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.f17087c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.f17087c = obj;
                return cVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        sc.c cVar = (sc.c) obj2;
        switch (this.f17085a) {
            case 0:
                return ((c) create(bVar, cVar)).invokeSuspend(qc.i.f46603a);
            default:
                return ((c) create(bVar, cVar)).invokeSuspend(qc.i.f46603a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f17085a) {
            case 0:
                tc.a aVar = tc.a.f48210a;
                int i10 = this.f17086b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        c7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    c7.b(obj);
                    this.f17086b = 1;
                    obj = this.d.invoke((b) this.f17087c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                b bVar = (b) obj;
                bVar.f17084b.set(true);
                return bVar;
            default:
                tc.a aVar2 = tc.a.f48210a;
                int i11 = this.f17086b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        b bVar2 = (b) this.f17087c;
                        c7.b(obj);
                        return bVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c7.b(obj);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) this.f17087c).f17083a);
                j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                b bVar3 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.f17087c = bVar3;
                this.f17086b = 1;
                if (this.d.invoke(bVar3, this) != aVar2) {
                    return bVar3;
                }
                return aVar2;
        }
    }
}
