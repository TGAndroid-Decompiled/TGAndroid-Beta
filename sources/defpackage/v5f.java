package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public final class v5f implements Runnable {
    public final byte a = 0;
    public final long b;
    public final Object c;
    public final Object d;

    public v5f(tgf tgfVar, lud ludVar, long j) {
        r7f r7fVar = r7f.UNKNOWN_EVENT;
        this.c = tgfVar;
        this.d = ludVar;
        this.b = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                b6f b6fVar = (b6f) obj2;
                frd frdVar = (frd) obj;
                HashMap hashMap = b6fVar.j;
                hve hveVar = hve.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap.containsKey(hveVar)) {
                    dq2 dq2Var = new dq2((byte) 2);
                    ?? obj3 = new Object();
                    if (dq2Var.isEmpty()) {
                        obj3.c = dq2Var;
                        hashMap.put(hveVar, obj3);
                    } else {
                        i98.g();
                        throw null;
                    }
                }
                l9d l9dVar = (l9d) hashMap.get(hveVar);
                Long valueOf = Long.valueOf(j);
                dq2 dq2Var2 = l9dVar.c;
                Collection collection = (Collection) dq2Var2.get(frdVar);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (arrayList.add(valueOf)) {
                        l9dVar.d++;
                        dq2Var2.put(frdVar, arrayList);
                    } else {
                        bh7.j("New Collection violated the Collection spec");
                        return;
                    }
                } else if (collection.add(valueOf)) {
                    l9dVar.d++;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (b6fVar.c(hveVar, elapsedRealtime)) {
                    b6fVar.i.put(hveVar, Long.valueOf(elapsedRealtime));
                    mlb.c(1, new eqd(b6fVar, (byte) 3));
                    return;
                }
                return;
            default:
                tgf tgfVar = (tgf) obj2;
                r7f r7fVar = r7f.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                lud ludVar = (lud) obj;
                HashMap hashMap2 = tgfVar.j;
                if (!hashMap2.containsKey(r7fVar)) {
                    dq2 dq2Var3 = new dq2((byte) 1);
                    ?? obj4 = new Object();
                    if (dq2Var3.isEmpty()) {
                        obj4.c = dq2Var3;
                        hashMap2.put(r7fVar, obj4);
                    } else {
                        i98.g();
                        throw null;
                    }
                }
                Long valueOf2 = Long.valueOf(j);
                dq2 dq2Var4 = ((wjf) hashMap2.get(r7fVar)).c;
                Collection collection2 = (Collection) dq2Var4.get(ludVar);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (arrayList2.add(valueOf2)) {
                        dq2Var4.put(ludVar, arrayList2);
                    } else {
                        bh7.j("New Collection violated the Collection spec");
                        return;
                    }
                } else {
                    collection2.add(valueOf2);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (tgfVar.d(r7fVar, elapsedRealtime2)) {
                    tgfVar.i.put(r7fVar, Long.valueOf(elapsedRealtime2));
                    mlb.c(1, new eqd(tgfVar));
                    return;
                }
                return;
        }
    }

    public v5f(b6f b6fVar, frd frdVar, long j) {
        this.c = b6fVar;
        this.d = frdVar;
        this.b = j;
    }
}
