package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public final class oo7 extends vw5 implements qp4 {
    public final byte b;
    public final vo7 c;

    public oo7(vo7 vo7Var, byte b) {
        super(1);
        this.b = b;
        this.c = vo7Var;
    }

    @Override
    public final Object invoke(Object obj) {
        Object obj2;
        byte b = this.b;
        g5c g5cVar = g5c.a;
        vo7 vo7Var = this.c;
        Object obj3 = null;
        switch (b) {
            case 0:
                ((fd0) obj).getClass();
                ks ksVar = vo7Var.b;
                ListIterator listIterator = ksVar.listIterator(ksVar.c);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((yn4) previous).a) {
                            obj3 = previous;
                        }
                    }
                }
                yn4 yn4Var = (yn4) obj3;
                vo7Var.c = yn4Var;
                if (yn4Var != null) {
                    go4 go4Var = yn4Var.d;
                    if (go4.K(3)) {
                        Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + go4Var);
                    }
                    go4Var.x();
                    go4Var.y(new fo4(go4Var), false);
                }
                return g5cVar;
            default:
                fd0 fd0Var = (fd0) obj;
                fd0Var.getClass();
                yn4 yn4Var2 = vo7Var.c;
                if (yn4Var2 == null) {
                    ks ksVar2 = vo7Var.b;
                    ListIterator listIterator2 = ksVar2.listIterator(ksVar2.c);
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj2 = listIterator2.previous();
                            if (((yn4) obj2).a) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    yn4Var2 = (yn4) obj2;
                }
                if (yn4Var2 != null) {
                    go4 go4Var2 = yn4Var2.d;
                    if (go4.K(2)) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + go4Var2);
                    }
                    if (go4Var2.h != null) {
                        Iterator it = go4Var2.f(0, 1, new ArrayList(Collections.singletonList(go4Var2.h))).iterator();
                        while (it.hasNext()) {
                            ac3 ac3Var = (ac3) it.next();
                            ac3Var.getClass();
                            if (go4.K(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + fd0Var.c);
                            }
                            ArrayList arrayList = ac3Var.c;
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj4 = arrayList.get(i);
                                i++;
                                ((vka) obj4).getClass();
                                el2.d(null, arrayList2);
                            }
                            List k = yk2.k(yk2.m(arrayList2));
                            int size2 = k.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((uka) k.get(i2)).b(fd0Var, ac3Var.a);
                            }
                        }
                        Iterator it2 = go4Var2.n.iterator();
                        if (it2.hasNext()) {
                            throw ls6.l(it2);
                        }
                    }
                }
                return g5cVar;
        }
    }
}
