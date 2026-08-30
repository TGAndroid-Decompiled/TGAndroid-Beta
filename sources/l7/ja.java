package l7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import n7.ib;
import n7.mg;
import n7.xf;
public final class ja implements Runnable {
    public final int f11512a = 0;
    public final long f11513b;
    public final Object f11514c;
    public final Object d;

    public ja(la laVar, x0 x0Var, long j10) {
        this.f11514c = laVar;
        this.d = x0Var;
        this.f11513b = j10;
    }

    @Override
    public final void run() {
        switch (this.f11512a) {
            case 0:
                la laVar = (la) this.f11514c;
                x0 x0Var = (x0) this.d;
                HashMap hashMap = laVar.f11545j;
                u7 u7Var = u7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap.containsKey(u7Var)) {
                    n nVar = new n();
                    ?? obj = new Object();
                    if (nVar.isEmpty()) {
                        obj.f11479c = nVar;
                        hashMap.put(u7Var, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                h hVar = (h) hashMap.get(u7Var);
                Long valueOf = Long.valueOf(this.f11513b);
                n nVar2 = hVar.f11479c;
                Collection collection = (Collection) nVar2.get(x0Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (arrayList.add(valueOf)) {
                        hVar.d++;
                        nVar2.put(x0Var, arrayList);
                    } else {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                } else if (collection.add(valueOf)) {
                    hVar.d++;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (laVar.c(u7Var, elapsedRealtime)) {
                    laVar.f11544i.put(u7Var, Long.valueOf(elapsedRealtime));
                    cb.o.f2237a.execute(new androidx.activity.i(laVar, 25));
                    return;
                }
                return;
            default:
                xf xfVar = (xf) this.f11514c;
                ib ibVar = ib.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                n7.i1 i1Var = (n7.i1) this.d;
                HashMap hashMap2 = xfVar.f14814j;
                if (!hashMap2.containsKey(ibVar)) {
                    n7.d dVar = new n7.d();
                    ?? obj2 = new Object();
                    if (dVar.isEmpty()) {
                        obj2.f14666c = dVar;
                        hashMap2.put(ibVar, obj2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Long valueOf2 = Long.valueOf(this.f11513b);
                n7.d dVar2 = ((mg) hashMap2.get(ibVar)).f14666c;
                Collection collection2 = (Collection) dVar2.get(i1Var);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (arrayList2.add(valueOf2)) {
                        dVar2.put(i1Var, arrayList2);
                    } else {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                } else {
                    collection2.add(valueOf2);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (xfVar.d(ibVar, elapsedRealtime2)) {
                    xfVar.f14813i.put(ibVar, Long.valueOf(elapsedRealtime2));
                    cb.o.f2237a.execute(new m2.b(xfVar));
                    return;
                }
                return;
        }
    }

    public ja(xf xfVar, n7.i1 i1Var, long j10) {
        ib ibVar = ib.UNKNOWN_EVENT;
        this.f11514c = xfVar;
        this.d = i1Var;
        this.f11513b = j10;
    }
}
