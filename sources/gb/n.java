package gb;

import b8.ib;
import java.util.concurrent.atomic.AtomicReference;
import wd.z;
import zd.v;
public final class n extends hd.j implements od.p {
    public final int f12230a;
    public int f12231b;
    public final p f12232c;

    public n(p pVar, fd.c cVar, int i3) {
        super(2, cVar);
        this.f12230a = i3;
        this.f12232c = pVar;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.f12230a) {
            case 0:
                return new n(this.f12232c, cVar, 0);
            default:
                return new n(this.f12232c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        fd.c cVar = (fd.c) obj2;
        switch (this.f12230a) {
            case 0:
                return ((n) create(zVar, cVar)).invokeSuspend(dd.k.f8801a);
            default:
                return ((n) create(zVar, cVar)).invokeSuspend(dd.k.f8801a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f12230a) {
            case 0:
                gd.a aVar = gd.a.f12241a;
                int i3 = this.f12231b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ib.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ib.b(obj);
                    p pVar = this.f12232c;
                    zd.b data = pVar.f12237b.getData();
                    final AtomicReference atomicReference = pVar.f12238c;
                    zd.c cVar = new zd.c() {
                        @Override
                        public final Object b(Object obj2, fd.c cVar2) {
                            atomicReference.set((i) obj2);
                            gd.a aVar2 = gd.a.f12241a;
                            return dd.k.f8801a;
                        }

                        public final boolean equals(Object obj2) {
                            if ((obj2 instanceof zd.c) && (obj2 instanceof m)) {
                                return new kotlin.jvm.internal.a(atomicReference).equals(new kotlin.jvm.internal.a(atomicReference));
                            }
                            return false;
                        }

                        public final int hashCode() {
                            int i10;
                            AtomicReference atomicReference2 = atomicReference;
                            if (atomicReference2 != null) {
                                i10 = atomicReference2.hashCode();
                            } else {
                                i10 = 0;
                            }
                            return ((((((((((AtomicReference.class.hashCode() + (i10 * 31)) * 31) + 113762) * 31) - 869290769) * 31) + 1237) * 31) + 2) * 31) + 2;
                        }
                    };
                    this.f12231b = 1;
                    if (data.U(cVar, this) == aVar) {
                        return aVar;
                    }
                }
                return dd.k.f8801a;
            default:
                gd.a aVar2 = gd.a.f12241a;
                int i10 = this.f12231b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ib.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.b(obj);
                zd.b data2 = this.f12232c.f12237b.getData();
                this.f12231b = 1;
                Object d = v.d(data2, this);
                if (d == aVar2) {
                    return aVar2;
                }
                return d;
        }
    }
}
