package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
public final class g1d implements Runnable {
    public final j1d a;
    public final byte b;
    public final j1d c;
    public final Object d;

    public g1d(j1d j1dVar, Object obj, byte b) {
        this.b = b;
        this.c = j1dVar;
        this.a = j1dVar;
        this.d = obj;
    }

    public final void a() {
        eha ehaVar;
        Set set;
        byte b = this.b;
        int i = 0;
        Object obj = this.d;
        j1d j1dVar = this.c;
        switch (b) {
            case 0:
                dy4 dy4Var = j1dVar.d;
                k1d k1dVar = j1dVar.a.e;
                Context context = j1dVar.c;
                aec aecVar = new aec(dy4Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) obj;
                for (xx4 xx4Var : hashMap.keySet()) {
                    if (xx4Var.v() && !((e1d) hashMap.get(xx4Var)).c) {
                        arrayList.add(xx4Var);
                    } else {
                        arrayList2.add(xx4Var);
                    }
                }
                int i2 = -1;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i < size) {
                        i2 = aecVar.e(context, (xx4) arrayList2.get(i));
                        i++;
                        if (i2 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i < size2) {
                        i2 = aecVar.e(context, (xx4) arrayList.get(i));
                        i++;
                        if (i2 != 0) {
                        }
                    }
                }
                if (i2 != 0) {
                    k1dVar.sendMessage(k1dVar.obtainMessage(1, new f1d(this, j1dVar, new ds2(i2, null, null))));
                    return;
                }
                if (j1dVar.y && (ehaVar = j1dVar.w) != null) {
                    ehaVar.a(new fg0(ehaVar));
                }
                for (xx4 xx4Var2 : hashMap.keySet()) {
                    eg0 eg0Var = (eg0) hashMap.get(xx4Var2);
                    if (xx4Var2.v() && aecVar.e(context, xx4Var2) != 0) {
                        k1dVar.sendMessage(k1dVar.obtainMessage(1, new c1d(this, j1dVar, eg0Var)));
                    } else {
                        xx4Var2.a(eg0Var);
                    }
                }
                return;
            default:
                r1d r1dVar = j1dVar.a;
                m1d m1dVar = r1dVar.o;
                ntb ntbVar = j1dVar.I;
                if (ntbVar == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) ntbVar.a);
                    Map map = (Map) ntbVar.c;
                    for (yn ynVar : map.keySet()) {
                        if (!r1dVar.i.containsKey(ynVar.b)) {
                            map.get(ynVar).getClass();
                            fyb.g();
                            return;
                        }
                    }
                    set = hashSet;
                }
                m1dVar.G = set;
                ArrayList arrayList3 = (ArrayList) obj;
                int size3 = arrayList3.size();
                while (i < size3) {
                    ((xx4) arrayList3.get(i)).j(j1dVar.F, r1dVar.o.G);
                    i++;
                }
                return;
        }
    }

    @Override
    public final void run() {
        j1d j1dVar = this.a;
        ReentrantLock reentrantLock = j1dVar.b;
        reentrantLock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e) {
                k1d k1dVar = j1dVar.a.e;
                k1dVar.sendMessage(k1dVar.obtainMessage(2, e));
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
