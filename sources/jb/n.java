package jb;

import ce.x;
import java.util.concurrent.atomic.AtomicReference;
import zd.z;
public final class n extends kd.j implements rd.p {
    public final int f16635a;
    public int f16636b;
    public final p f16637c;

    public n(p pVar, id.c cVar, int i7) {
        super(2, cVar);
        this.f16635a = i7;
        this.f16637c = pVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f16635a) {
            case 0:
                return new n(this.f16637c, cVar, 0);
            default:
                return new n(this.f16637c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f16635a) {
            case 0:
                return ((n) create(zVar, cVar)).invokeSuspend(gd.k.f13831a);
            default:
                return ((n) create(zVar, cVar)).invokeSuspend(gd.k.f13831a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f16635a) {
            case 0:
                jd.a aVar = jd.a.f16646a;
                int i7 = this.f16636b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        af.b.c(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    af.b.c(obj);
                    p pVar = this.f16637c;
                    ce.c data = pVar.f16642b.getData();
                    final AtomicReference atomicReference = pVar.f16643c;
                    ce.d dVar = new ce.d() {
                        @Override
                        public final Object a(Object obj2, id.c cVar) {
                            atomicReference.set((i) obj2);
                            jd.a aVar2 = jd.a.f16646a;
                            return gd.k.f13831a;
                        }

                        public final boolean equals(Object obj2) {
                            if ((obj2 instanceof ce.d) && (obj2 instanceof m)) {
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
                    this.f16636b = 1;
                    if (data.B(dVar, this) == aVar) {
                        return aVar;
                    }
                }
                return gd.k.f13831a;
            default:
                jd.a aVar2 = jd.a.f16646a;
                int i10 = this.f16636b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        af.b.c(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                af.b.c(obj);
                ce.c data2 = this.f16637c.f16642b.getData();
                this.f16636b = 1;
                Object d = x.d(data2, this);
                if (d == aVar2) {
                    return aVar2;
                }
                return d;
        }
    }
}
