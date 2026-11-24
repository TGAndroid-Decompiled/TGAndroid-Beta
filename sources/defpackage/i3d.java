package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
public final class i3d implements Runnable {
    public final l3d a;
    public final byte b;
    public final l3d c;
    public final Object d;

    public i3d(l3d l3dVar, Object obj, byte b) {
        this.b = b;
        this.c = l3dVar;
        this.a = l3dVar;
        this.d = obj;
    }

    public final void a() {
        gja gjaVar;
        Set set;
        byte b = this.b;
        int i = 0;
        Object obj = this.d;
        l3d l3dVar = this.c;
        switch (b) {
            case 0:
                e05 e05Var = l3dVar.d;
                m3d m3dVar = l3dVar.a.e;
                Context context = l3dVar.c;
                rhb rhbVar = new rhb(e05Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) obj;
                for (zz4 zz4Var : hashMap.keySet()) {
                    if (zz4Var.v() && !((g3d) hashMap.get(zz4Var)).c) {
                        arrayList.add(zz4Var);
                    } else {
                        arrayList2.add(zz4Var);
                    }
                }
                int i2 = -1;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i < size) {
                        i2 = rhbVar.n(context, (zz4) arrayList2.get(i));
                        i++;
                        if (i2 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i < size2) {
                        i2 = rhbVar.n(context, (zz4) arrayList.get(i));
                        i++;
                        if (i2 != 0) {
                        }
                    }
                }
                if (i2 != 0) {
                    m3dVar.sendMessage(m3dVar.obtainMessage(1, new h3d(this, l3dVar, new ot2(i2, null, null))));
                    return;
                }
                if (l3dVar.y && (gjaVar = l3dVar.w) != null) {
                    gjaVar.a(new gh0(gjaVar));
                }
                for (zz4 zz4Var2 : hashMap.keySet()) {
                    fh0 fh0Var = (fh0) hashMap.get(zz4Var2);
                    if (zz4Var2.v() && rhbVar.n(context, zz4Var2) != 0) {
                        m3dVar.sendMessage(m3dVar.obtainMessage(1, new e3d(this, l3dVar, fh0Var)));
                    } else {
                        zz4Var2.a(fh0Var);
                    }
                }
                return;
            default:
                t3d t3dVar = l3dVar.a;
                o3d o3dVar = t3dVar.o;
                ovb ovbVar = l3dVar.I;
                if (ovbVar == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) ovbVar.a);
                    Map map = (Map) ovbVar.c;
                    for (zo zoVar : map.keySet()) {
                        if (!t3dVar.i.containsKey(zoVar.b)) {
                            map.get(zoVar).getClass();
                            rjb.p();
                            return;
                        }
                    }
                    set = hashSet;
                }
                o3dVar.G = set;
                ArrayList arrayList3 = (ArrayList) obj;
                int size3 = arrayList3.size();
                while (i < size3) {
                    ((zz4) arrayList3.get(i)).j(l3dVar.F, t3dVar.o.G);
                    i++;
                }
                return;
        }
    }

    @Override
    public final void run() {
        l3d l3dVar = this.a;
        ReentrantLock reentrantLock = l3dVar.b;
        reentrantLock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e) {
                m3d m3dVar = l3dVar.a.e;
                m3dVar.sendMessage(m3dVar.obtainMessage(2, e));
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
