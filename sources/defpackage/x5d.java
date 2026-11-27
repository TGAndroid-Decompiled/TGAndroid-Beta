package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
public final class x5d implements Runnable {
    public final a6d a;
    public final byte b;
    public final a6d c;
    public final Object d;

    public x5d(a6d a6dVar, Object obj, byte b) {
        this.b = b;
        this.c = a6dVar;
        this.a = a6dVar;
        this.d = obj;
    }

    public final void a() {
        xka xkaVar;
        Set set;
        byte b = this.b;
        int i = 0;
        Object obj = this.d;
        a6d a6dVar = this.c;
        switch (b) {
            case 0:
                j05 j05Var = a6dVar.d;
                b6d b6dVar = a6dVar.a.e;
                Context context = a6dVar.c;
                zhc zhcVar = new zhc(j05Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) obj;
                for (d05 d05Var : hashMap.keySet()) {
                    if (d05Var.v() && !((v5d) hashMap.get(d05Var)).c) {
                        arrayList.add(d05Var);
                    } else {
                        arrayList2.add(d05Var);
                    }
                }
                int i2 = -1;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i < size) {
                        i2 = zhcVar.e(context, (d05) arrayList2.get(i));
                        i++;
                        if (i2 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i < size2) {
                        i2 = zhcVar.e(context, (d05) arrayList.get(i));
                        i++;
                        if (i2 != 0) {
                        }
                    }
                }
                if (i2 != 0) {
                    b6dVar.sendMessage(b6dVar.obtainMessage(1, new w5d(this, a6dVar, new ws2(i2, null, null))));
                    return;
                }
                if (a6dVar.y && (xkaVar = a6dVar.w) != null) {
                    xkaVar.a(new gg0(xkaVar));
                }
                for (d05 d05Var2 : hashMap.keySet()) {
                    fg0 fg0Var = (fg0) hashMap.get(d05Var2);
                    if (d05Var2.v() && zhcVar.e(context, d05Var2) != 0) {
                        b6dVar.sendMessage(b6dVar.obtainMessage(1, new t5d(this, a6dVar, fg0Var)));
                    } else {
                        d05Var2.a(fg0Var);
                    }
                }
                return;
            default:
                i6d i6dVar = a6dVar.a;
                d6d d6dVar = i6dVar.o;
                oxb oxbVar = a6dVar.I;
                if (oxbVar == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) oxbVar.a);
                    Map map = (Map) oxbVar.c;
                    for (zn znVar : map.keySet()) {
                        if (!i6dVar.i.containsKey(znVar.b)) {
                            map.get(znVar).getClass();
                            grb.o();
                            return;
                        }
                    }
                    set = hashSet;
                }
                d6dVar.G = set;
                ArrayList arrayList3 = (ArrayList) obj;
                int size3 = arrayList3.size();
                while (i < size3) {
                    ((d05) arrayList3.get(i)).j(a6dVar.F, i6dVar.o.G);
                    i++;
                }
                return;
        }
    }

    @Override
    public final void run() {
        a6d a6dVar = this.a;
        ReentrantLock reentrantLock = a6dVar.b;
        reentrantLock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e) {
                b6d b6dVar = a6dVar.a.e;
                b6dVar.sendMessage(b6dVar.obtainMessage(2, e));
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
