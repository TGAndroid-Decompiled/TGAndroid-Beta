package ae;

import java.util.ArrayList;
import wd.b0;
public final class e implements g {
    public final fd.h f394a;
    public final int f395b;
    public final yd.a f396c;
    public final int d;
    public final Object f397e;

    public e(Object obj, fd.h hVar, int i3, yd.a aVar, int i10) {
        this.d = i10;
        this.f394a = hVar;
        this.f395b = i3;
        this.f396c = aVar;
        this.f397e = obj;
    }

    @Override
    public Object U(zd.c cVar, hd.c cVar2) {
        Object a10;
        fd.h h;
        switch (this.d) {
            case 0:
                int i3 = this.f395b;
                dd.k kVar = dd.k.f8801a;
                if (i3 == -3) {
                    fd.h context = cVar2.getContext();
                    Boolean bool = Boolean.FALSE;
                    j jVar = new j(10);
                    fd.h hVar = this.f394a;
                    if (!((Boolean) hVar.fold(bool, jVar)).booleanValue()) {
                        h = context.plus(hVar);
                    } else {
                        h = b0.h(context, hVar, false);
                    }
                    if (kotlin.jvm.internal.j.a(h, context)) {
                        a10 = ((zd.b) this.f397e).U(cVar, cVar2);
                        gd.a aVar = gd.a.f12241a;
                        if (a10 != aVar) {
                            a10 = kVar;
                        }
                        if (a10 != aVar) {
                            return kVar;
                        }
                    } else {
                        fd.d dVar = fd.d.f11566a;
                        if (kotlin.jvm.internal.j.a(h.get(dVar), context.get(dVar))) {
                            fd.h context2 = cVar2.getContext();
                            if (!(cVar instanceof o)) {
                                cVar = new q(cVar, context2);
                            }
                            a10 = i.a(h, cVar, be.a.k(h), new d(this, (fd.c) null, 1), cVar2);
                            if (a10 != gd.a.f12241a) {
                                return kVar;
                            }
                        }
                    }
                    return a10;
                }
                a10 = a(cVar, cVar2);
                if (a10 != gd.a.f12241a) {
                    return kVar;
                }
                return a10;
            default:
                return a(cVar, cVar2);
        }
    }

    public final Object a(zd.c cVar, hd.c cVar2) {
        Object e10 = b0.e(new c(cVar, this, (fd.c) null), cVar2);
        if (e10 == gd.a.f12241a) {
            return e10;
        }
        return dd.k.f8801a;
    }

    public final String b() {
        ArrayList arrayList = new ArrayList(4);
        fd.i iVar = fd.i.f11567a;
        fd.h hVar = this.f394a;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i3 = this.f395b;
        if (i3 != -3) {
            arrayList.add("capacity=" + i3);
        }
        yd.a aVar = yd.a.f59374a;
        yd.a aVar2 = this.f396c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + ed.g.g(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override
    public final zd.b h(fd.h hVar, int i3, yd.a aVar) {
        yd.a aVar2;
        fd.h hVar2 = this.f394a;
        fd.h plus = hVar.plus(hVar2);
        yd.a aVar3 = yd.a.f59374a;
        yd.a aVar4 = this.f396c;
        int i10 = this.f395b;
        if (aVar != aVar3) {
            aVar2 = aVar;
        } else {
            if (i10 != -3) {
                if (i3 != -3) {
                    if (i10 != -2) {
                        if (i3 != -2) {
                            i3 += i10;
                            if (i3 < 0) {
                                i3 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i3 = i10;
            }
            aVar2 = aVar4;
        }
        int i11 = i3;
        if (kotlin.jvm.internal.j.a(plus, hVar2) && i11 == i10 && aVar2 == aVar4) {
            return this;
        }
        switch (this.d) {
            case 0:
                return new e((zd.b) this.f397e, plus, i11, aVar2, 0);
            default:
                return new e((c) this.f397e, plus, i11, aVar2, 1);
        }
    }

    public final String toString() {
        switch (this.d) {
            case 0:
                return ((zd.b) this.f397e) + " -> " + b();
            default:
                return "block[" + ((c) this.f397e) + "] -> " + b();
        }
    }
}
