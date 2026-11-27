package defpackage;

import java.util.concurrent.atomic.AtomicReference;
public final class wba extends yfb implements is4 {
    public final byte a;
    public boolean b;
    public final yba c;

    public wba(yba ybaVar, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = ybaVar;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        yba ybaVar = this.c;
        switch (b) {
            case 0:
                return new wba(ybaVar, zw2Var, (byte) 0);
            default:
                return new wba(ybaVar, zw2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        ux2 ux2Var = (ux2) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
            case 0:
                return ((wba) create(ux2Var, zw2Var)).invokeSuspend(g9cVar);
            default:
                return ((wba) create(ux2Var, zw2Var)).invokeSuspend(g9cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        yba ybaVar = this.c;
        vx2 vx2Var = vx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        ixe.b(obj);
                    } else {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ixe.b(obj);
                    mm4 data = ybaVar.b.getData();
                    final AtomicReference atomicReference = ybaVar.c;
                    nm4 nm4Var = new nm4() {
                        @Override
                        public final Object c(Object obj2, zw2 zw2Var) {
                            atomicReference.set((l9a) obj2);
                            return g9c.a;
                        }

                        public final boolean equals(Object obj2) {
                            if ((obj2 instanceof nm4) && (obj2 instanceof vba)) {
                                return new ga(atomicReference).equals(new ga(atomicReference));
                            }
                            return false;
                        }

                        public final int hashCode() {
                            int i;
                            AtomicReference atomicReference2 = atomicReference;
                            if (atomicReference2 != null) {
                                i = atomicReference2.hashCode();
                            } else {
                                i = 0;
                            }
                            return ((((((((((AtomicReference.class.hashCode() + (i * 31)) * 31) + 113762) * 31) - 869290769) * 31) + 1237) * 31) + 2) * 31) + 2;
                        }
                    };
                    this.b = true;
                    if (data.k(nm4Var, this) == vx2Var) {
                        return vx2Var;
                    }
                }
                return g9c.a;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        ixe.b(obj);
                        return obj;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                mm4 data2 = ybaVar.b.getData();
                this.b = true;
                Object a = qme.a(data2, this);
                if (a == vx2Var) {
                    return vx2Var;
                }
                return a;
        }
    }
}
