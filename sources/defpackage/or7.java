package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public final class or7 extends az5 implements ur4 {
    public final byte b;
    public final vr7 c;

    public or7(vr7 vr7Var, byte b) {
        super(1);
        this.b = b;
        this.c = vr7Var;
    }

    @Override
    public final Object invoke(Object obj) {
        Object obj2;
        byte b = this.b;
        f9c f9cVar = f9c.a;
        vr7 vr7Var = this.c;
        Object obj3 = null;
        switch (b) {
            case 0:
                ((hd0) obj).getClass();
                ls lsVar = vr7Var.b;
                ListIterator listIterator = lsVar.listIterator(lsVar.c);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((cq4) previous).a) {
                            obj3 = previous;
                        }
                    }
                }
                cq4 cq4Var = (cq4) obj3;
                vr7Var.c = cq4Var;
                if (cq4Var != null) {
                    kq4 kq4Var = cq4Var.d;
                    if (kq4.K(3)) {
                        Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + kq4Var);
                    }
                    kq4Var.x();
                    kq4Var.y(new jq4(kq4Var), false);
                }
                return f9cVar;
            default:
                hd0 hd0Var = (hd0) obj;
                hd0Var.getClass();
                cq4 cq4Var2 = vr7Var.c;
                if (cq4Var2 == null) {
                    ls lsVar2 = vr7Var.b;
                    ListIterator listIterator2 = lsVar2.listIterator(lsVar2.c);
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj2 = listIterator2.previous();
                            if (((cq4) obj2).a) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    cq4Var2 = (cq4) obj2;
                }
                if (cq4Var2 != null) {
                    kq4 kq4Var2 = cq4Var2.d;
                    if (kq4.K(2)) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + kq4Var2);
                    }
                    if (kq4Var2.h != null) {
                        Iterator it = kq4Var2.f(0, 1, new ArrayList(Collections.singletonList(kq4Var2.h))).iterator();
                        while (it.hasNext()) {
                            tc3 tc3Var = (tc3) it.next();
                            tc3Var.getClass();
                            if (kq4.K(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + hd0Var.c);
                            }
                            ArrayList arrayList = tc3Var.c;
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj4 = arrayList.get(i);
                                i++;
                                ((poa) obj4).getClass();
                                yl2.d(null, arrayList2);
                            }
                            List k = sl2.k(sl2.m(arrayList2));
                            int size2 = k.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((ooa) k.get(i2)).b(hd0Var, tc3Var.a);
                            }
                        }
                        Iterator it2 = kq4Var2.n.iterator();
                        if (it2.hasNext()) {
                            throw qu6.l(it2);
                        }
                    }
                }
                return f9cVar;
        }
    }
}
