package ce;

import java.util.ArrayList;
import zd.b0;
public final class b implements de.e {
    public final id.h f6090a;
    public final int f6091b;
    public final be.a f6092c;
    public final int d;
    public final Object f6093e;

    public b(Object obj, id.h hVar, int i7, be.a aVar, int i10) {
        this.d = i10;
        this.f6090a = hVar;
        this.f6091b = i7;
        this.f6092c = aVar;
        this.f6093e = obj;
    }

    @Override
    public Object B(d dVar, kd.c cVar) {
        Object a10;
        id.h h;
        switch (this.d) {
            case 1:
                int i7 = this.f6091b;
                gd.k kVar = gd.k.f13829a;
                if (i7 == -3) {
                    id.h context = cVar.getContext();
                    Boolean bool = Boolean.FALSE;
                    b1.e eVar = new b1.e(10);
                    id.h hVar = this.f6090a;
                    if (!((Boolean) hVar.fold(bool, eVar)).booleanValue()) {
                        h = context.plus(hVar);
                    } else {
                        h = b0.h(context, hVar, false);
                    }
                    if (kotlin.jvm.internal.j.a(h, context)) {
                        a10 = ((c) this.f6093e).B(dVar, cVar);
                        jd.a aVar = jd.a.f16646a;
                        if (a10 != aVar) {
                            a10 = kVar;
                        }
                        if (a10 != aVar) {
                            return kVar;
                        }
                    } else {
                        id.d dVar2 = id.d.f15455a;
                        if (kotlin.jvm.internal.j.a(h.get(dVar2), context.get(dVar2))) {
                            id.h context2 = cVar.getContext();
                            if (!(dVar instanceof de.l)) {
                                dVar = new o(dVar, context2);
                            }
                            a10 = de.g.a(h, dVar, ee.a.k(h), new be.l(this, (id.c) null, 2), cVar);
                            if (a10 != jd.a.f16646a) {
                                return kVar;
                            }
                        }
                    }
                    return a10;
                }
                a10 = a(dVar, cVar);
                if (a10 != jd.a.f16646a) {
                    return kVar;
                }
                return a10;
            default:
                return a(dVar, cVar);
        }
    }

    @Override
    public final c P(id.h hVar, int i7, be.a aVar) {
        be.a aVar2;
        id.h hVar2 = this.f6090a;
        id.h plus = hVar.plus(hVar2);
        be.a aVar3 = be.a.f3182a;
        be.a aVar4 = this.f6092c;
        int i10 = this.f6091b;
        if (aVar != aVar3) {
            aVar2 = aVar;
        } else {
            if (i10 != -3) {
                if (i7 != -3) {
                    if (i10 != -2) {
                        if (i7 != -2) {
                            i7 += i10;
                            if (i7 < 0) {
                                i7 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i7 = i10;
            }
            aVar2 = aVar4;
        }
        int i11 = i7;
        if (kotlin.jvm.internal.j.a(plus, hVar2) && i11 == i10 && aVar2 == aVar4) {
            return this;
        }
        switch (this.d) {
            case 0:
                return new b((de.c) this.f6093e, plus, i11, aVar2, 0);
            default:
                return new b((c) this.f6093e, plus, i11, aVar2, 1);
        }
    }

    public final Object a(d dVar, kd.c cVar) {
        Object e10 = b0.e(new de.c(dVar, this, (id.c) null), cVar);
        if (e10 == jd.a.f16646a) {
            return e10;
        }
        return gd.k.f13829a;
    }

    public final String b() {
        ArrayList arrayList = new ArrayList(4);
        id.i iVar = id.i.f15456a;
        id.h hVar = this.f6090a;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i7 = this.f6091b;
        if (i7 != -3) {
            arrayList.add("capacity=" + i7);
        }
        be.a aVar = be.a.f3182a;
        be.a aVar2 = this.f6092c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + hd.f.g(arrayList, ", ", null, null, null, 62) + ']';
    }

    public final String toString() {
        switch (this.d) {
            case 0:
                return "block[" + ((de.c) this.f6093e) + "] -> " + b();
            default:
                return ((c) this.f6093e) + " -> " + b();
        }
    }
}
