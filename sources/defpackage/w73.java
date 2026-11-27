package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public final class w73 extends yfb implements is4 {
    public final byte a;
    public Object b;
    public final Object c;

    public w73(Object obj, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = obj;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                w73 w73Var = new w73((i0b) obj2, zw2Var, (byte) 0);
                w73Var.b = obj;
                return w73Var;
            case 1:
                w73 w73Var2 = new w73((gq2) obj2, zw2Var, (byte) 1);
                w73Var2.b = obj;
                return w73Var2;
            case 2:
                w73 w73Var3 = new w73((ur4) obj2, zw2Var, (byte) 2);
                w73Var3.b = obj;
                return w73Var3;
            default:
                w73 w73Var4 = new w73((Set) obj2, zw2Var, (byte) 3);
                w73Var4.b = obj;
                return w73Var4;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        switch (b) {
            case 0:
                return ((w73) create((i0b) obj, (zw2) obj2)).invokeSuspend(g9cVar);
            case 1:
                ((w73) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9cVar);
                return g9cVar;
            case 2:
                ((w73) create((sj7) obj, (zw2) obj2)).invokeSuspend(g9cVar);
                return g9cVar;
            default:
                return ((w73) create((sj7) obj, (zw2) obj2)).invokeSuspend(g9cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        boolean z = false;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ixe.b(obj);
                i0b i0bVar = (i0b) this.b;
                if ((i0bVar instanceof k63) && i0bVar.a <= ((i0b) obj2).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                ixe.b(obj);
                mx2 c = ((ux2) this.b).c();
                gq2 gq2Var = (gq2) obj2;
                try {
                    frb frbVar = new frb();
                    frbVar.f = gqe.c(gqe.b(c), true, frbVar);
                    while (true) {
                        Unsafe unsafe = fx.a;
                        long j = frb.h;
                        int intVolatile = unsafe.getIntVolatile(frbVar, j);
                        if (intVolatile != 0) {
                            if (intVolatile != 2 && intVolatile != 3) {
                                frb.n(intVolatile);
                                throw null;
                            }
                        } else if (unsafe.compareAndSwapInt(frbVar, j, intVolatile, 0)) {
                        }
                    }
                    gq2Var.invoke();
                    frbVar.m();
                    return g9cVar;
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 2:
                ixe.b(obj);
                ((ur4) obj2).invoke((sj7) this.b);
                return g9cVar;
            default:
                ixe.b(obj);
                Set<zj8> keySet = ((sj7) this.b).a().keySet();
                ArrayList arrayList = new ArrayList(ul2.c(keySet, 10));
                for (zj8 zj8Var : keySet) {
                    arrayList.add(zj8Var.a);
                }
                Set<String> set = (Set) obj2;
                if (set != qja.a) {
                    if (!set.isEmpty()) {
                        for (String str : set) {
                            if (!arrayList.contains(str)) {
                                z = true;
                            }
                        }
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
