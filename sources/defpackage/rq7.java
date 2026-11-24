package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public final class rq7 extends vy5 implements rr4 {
    public final byte b;
    public final yq7 c;

    public rq7(yq7 yq7Var, byte b) {
        super(1);
        this.b = b;
        this.c = yq7Var;
    }

    @Override
    public final Object invoke(Object obj) {
        Object obj2;
        byte b = this.b;
        g7c g7cVar = g7c.a;
        yq7 yq7Var = this.c;
        Object obj3 = null;
        switch (b) {
            case 0:
                ((fe0) obj).getClass();
                lt ltVar = yq7Var.b;
                ListIterator listIterator = ltVar.listIterator(ltVar.c);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((zp4) previous).a) {
                            obj3 = previous;
                        }
                    }
                }
                zp4 zp4Var = (zp4) obj3;
                yq7Var.c = zp4Var;
                if (zp4Var != null) {
                    hq4 hq4Var = zp4Var.d;
                    if (hq4.K(3)) {
                        Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + hq4Var);
                    }
                    hq4Var.x();
                    hq4Var.y(new gq4(hq4Var), false);
                }
                return g7cVar;
            default:
                fe0 fe0Var = (fe0) obj;
                fe0Var.getClass();
                zp4 zp4Var2 = yq7Var.c;
                if (zp4Var2 == null) {
                    lt ltVar2 = yq7Var.b;
                    ListIterator listIterator2 = ltVar2.listIterator(ltVar2.c);
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj2 = listIterator2.previous();
                            if (((zp4) obj2).a) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    zp4Var2 = (zp4) obj2;
                }
                if (zp4Var2 != null) {
                    hq4 hq4Var2 = zp4Var2.d;
                    if (hq4.K(2)) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + hq4Var2);
                    }
                    if (hq4Var2.h != null) {
                        Iterator it = hq4Var2.f(0, 1, new ArrayList(Collections.singletonList(hq4Var2.h))).iterator();
                        while (it.hasNext()) {
                            md3 md3Var = (md3) it.next();
                            md3Var.getClass();
                            if (hq4.K(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + fe0Var.c);
                            }
                            ArrayList arrayList = md3Var.c;
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj4 = arrayList.get(i);
                                i++;
                                ((wma) obj4).getClass();
                                qm2.d(null, arrayList2);
                            }
                            List k = km2.k(km2.m(arrayList2));
                            int size2 = k.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((vma) k.get(i2)).b(fe0Var, md3Var.a);
                            }
                        }
                        Iterator it2 = hq4Var2.n.iterator();
                        if (it2.hasNext()) {
                            throw kt6.l(it2);
                        }
                    }
                }
                return g7cVar;
        }
    }
}
