package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public final class d73 extends ccb implements eq4 {
    public final byte a;
    public Object b;
    public final Object c;

    public d73(Object obj, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = obj;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                d73 d73Var = new d73((fwa) obj2, fw2Var, (byte) 0);
                d73Var.b = obj;
                return d73Var;
            case 1:
                d73 d73Var2 = new d73((np2) obj2, fw2Var, (byte) 1);
                d73Var2.b = obj;
                return d73Var2;
            case 2:
                d73 d73Var3 = new d73((qp4) obj2, fw2Var, (byte) 2);
                d73Var3.b = obj;
                return d73Var3;
            default:
                d73 d73Var4 = new d73((Set) obj2, fw2Var, (byte) 3);
                d73Var4.b = obj;
                return d73Var4;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        switch (b) {
            case 0:
                return ((d73) create((fwa) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 1:
                ((d73) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5cVar);
                return g5cVar;
            case 2:
                ((d73) create((ih7) obj, (fw2) obj2)).invokeSuspend(g5cVar);
                return g5cVar;
            default:
                return ((d73) create((ih7) obj, (fw2) obj2)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        boolean z = false;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                qse.b(obj);
                fwa fwaVar = (fwa) this.b;
                if ((fwaVar instanceof s53) && fwaVar.a <= ((fwa) obj2).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                qse.b(obj);
                sw2 c = ((ax2) this.b).c();
                np2 np2Var = (np2) obj2;
                try {
                    gnb gnbVar = new gnb();
                    gnbVar.f = nle.c(nle.b(c), true, gnbVar);
                    while (true) {
                        Unsafe unsafe = ex.a;
                        long j = gnb.h;
                        int intVolatile = unsafe.getIntVolatile(gnbVar, j);
                        if (intVolatile != 0) {
                            if (intVolatile != 2 && intVolatile != 3) {
                                gnb.n(intVolatile);
                                throw null;
                            }
                        } else if (unsafe.compareAndSwapInt(gnbVar, j, intVolatile, 0)) {
                        }
                    }
                    np2Var.invoke();
                    gnbVar.m();
                    return g5cVar;
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 2:
                qse.b(obj);
                ((qp4) obj2).invoke((ih7) this.b);
                return g5cVar;
            default:
                qse.b(obj);
                Set<lg8> keySet = ((ih7) this.b).a().keySet();
                ArrayList arrayList = new ArrayList(al2.c(keySet, 10));
                for (lg8 lg8Var : keySet) {
                    arrayList.add(lg8Var.a);
                }
                Set<String> set = (Set) obj2;
                if (set != xfa.a) {
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
