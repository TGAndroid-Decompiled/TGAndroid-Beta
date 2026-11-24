package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public final class p83 extends eeb implements fs4 {
    public final byte a;
    public Object b;
    public final Object c;

    public p83(Object obj, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = obj;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                p83 p83Var = new p83((iya) obj2, px2Var, (byte) 0);
                p83Var.b = obj;
                return p83Var;
            case 1:
                p83 p83Var2 = new p83((yq2) obj2, px2Var, (byte) 1);
                p83Var2.b = obj;
                return p83Var2;
            case 2:
                p83 p83Var3 = new p83((rr4) obj2, px2Var, (byte) 2);
                p83Var3.b = obj;
                return p83Var3;
            default:
                p83 p83Var4 = new p83((Set) obj2, px2Var, (byte) 3);
                p83Var4.b = obj;
                return p83Var4;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        switch (b) {
            case 0:
                return ((p83) create((iya) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 1:
                ((p83) create((ky2) obj, (px2) obj2)).invokeSuspend(g7cVar);
                return g7cVar;
            case 2:
                ((p83) create((lj7) obj, (px2) obj2)).invokeSuspend(g7cVar);
                return g7cVar;
            default:
                return ((p83) create((lj7) obj, (px2) obj2)).invokeSuspend(g7cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        boolean z = false;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                tue.b(obj);
                iya iyaVar = (iya) this.b;
                if ((iyaVar instanceof e73) && iyaVar.a <= ((iya) obj2).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                tue.b(obj);
                cy2 c = ((ky2) this.b).c();
                yq2 yq2Var = (yq2) obj2;
                try {
                    hpb hpbVar = new hpb();
                    hpbVar.f = pne.c(pne.b(c), true, hpbVar);
                    while (true) {
                        Unsafe unsafe = fy.a;
                        long j = hpb.h;
                        int intVolatile = unsafe.getIntVolatile(hpbVar, j);
                        if (intVolatile != 0) {
                            if (intVolatile != 2 && intVolatile != 3) {
                                hpb.n(intVolatile);
                                throw null;
                            }
                        } else if (unsafe.compareAndSwapInt(hpbVar, j, intVolatile, 0)) {
                        }
                    }
                    yq2Var.invoke();
                    hpbVar.m();
                    return g7cVar;
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 2:
                tue.b(obj);
                ((rr4) obj2).invoke((lj7) this.b);
                return g7cVar;
            default:
                tue.b(obj);
                Set<ni8> keySet = ((lj7) this.b).a().keySet();
                ArrayList arrayList = new ArrayList(mm2.c(keySet, 10));
                for (ni8 ni8Var : keySet) {
                    arrayList.add(ni8Var.a);
                }
                Set<String> set = (Set) obj2;
                if (set != zha.a) {
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
