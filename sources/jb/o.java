package jb;

import ce.x;
import java.util.concurrent.atomic.AtomicReference;
import zd.z;
public final class o extends kd.j implements rd.p {
    public final int f17467a;
    public int f17468b;
    public final q f17469c;

    public o(q qVar, id.c cVar, int i7) {
        super(2, cVar);
        this.f17467a = i7;
        this.f17469c = qVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f17467a) {
            case 0:
                return new o(this.f17469c, cVar, 0);
            default:
                return new o(this.f17469c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f17467a) {
            case 0:
                return ((o) create(zVar, cVar)).invokeSuspend(gd.k.f13480a);
            default:
                return ((o) create(zVar, cVar)).invokeSuspend(gd.k.f13480a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f17467a) {
            case 0:
                jd.a aVar = jd.a.f17478a;
                int i7 = this.f17468b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        c8.z.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    c8.z.b(obj);
                    q qVar = this.f17469c;
                    ce.c data = qVar.f17474b.getData();
                    final AtomicReference atomicReference = qVar.f17475c;
                    ce.d dVar = new ce.d() {
                        @Override
                        public final Object a(Object obj2, id.c cVar) {
                            atomicReference.set((i) obj2);
                            jd.a aVar2 = jd.a.f17478a;
                            return gd.k.f13480a;
                        }

                        public final boolean equals(Object obj2) {
                            if ((obj2 instanceof ce.d) && (obj2 instanceof n)) {
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
                    this.f17468b = 1;
                    if (data.J(dVar, this) == aVar) {
                        return aVar;
                    }
                }
                return gd.k.f13480a;
            default:
                jd.a aVar2 = jd.a.f17478a;
                int i10 = this.f17468b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        c8.z.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c8.z.b(obj);
                ce.c data2 = this.f17469c.f17474b.getData();
                this.f17468b = 1;
                Object d = x.d(data2, this);
                if (d == aVar2) {
                    return aVar2;
                }
                return d;
        }
    }
}
