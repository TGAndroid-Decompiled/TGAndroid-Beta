package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public final class t3f implements Runnable {
    public final byte a = 1;
    public final long b;
    public final Object c;
    public final Object d;

    public t3f(sef sefVar, isd isdVar, long j) {
        p5f p5fVar = p5f.UNKNOWN_EVENT;
        this.c = sefVar;
        this.d = isdVar;
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
                z3f z3fVar = (z3f) obj2;
                cpd cpdVar = (cpd) obj;
                HashMap hashMap = z3fVar.j;
                ete eteVar = ete.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap.containsKey(eteVar)) {
                    so2 so2Var = new so2((byte) 2);
                    ?? obj3 = new Object();
                    if (so2Var.isEmpty()) {
                        obj3.c = so2Var;
                        hashMap.put(eteVar, obj3);
                    } else {
                        sc8.e();
                        throw null;
                    }
                }
                j7d j7dVar = (j7d) hashMap.get(eteVar);
                Long valueOf = Long.valueOf(j);
                so2 so2Var2 = j7dVar.c;
                Collection collection = (Collection) so2Var2.get(cpdVar);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (arrayList.add(valueOf)) {
                        j7dVar.d++;
                        so2Var2.put(cpdVar, arrayList);
                    } else {
                        fi7.g("New Collection violated the Collection spec");
                        return;
                    }
                } else if (collection.add(valueOf)) {
                    j7dVar.d++;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (z3fVar.c(eteVar, elapsedRealtime)) {
                    z3fVar.i.put(eteVar, Long.valueOf(elapsedRealtime));
                    yjb.c(1, new bod(z3fVar, (byte) 3));
                    return;
                }
                return;
            default:
                sef sefVar = (sef) obj2;
                p5f p5fVar = p5f.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                isd isdVar = (isd) obj;
                HashMap hashMap2 = sefVar.j;
                if (!hashMap2.containsKey(p5fVar)) {
                    so2 so2Var3 = new so2((byte) 1);
                    ?? obj4 = new Object();
                    if (so2Var3.isEmpty()) {
                        obj4.c = so2Var3;
                        hashMap2.put(p5fVar, obj4);
                    } else {
                        sc8.e();
                        throw null;
                    }
                }
                Long valueOf2 = Long.valueOf(j);
                so2 so2Var4 = ((vhf) hashMap2.get(p5fVar)).c;
                Collection collection2 = (Collection) so2Var4.get(isdVar);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (arrayList2.add(valueOf2)) {
                        so2Var4.put(isdVar, arrayList2);
                    } else {
                        fi7.g("New Collection violated the Collection spec");
                        return;
                    }
                } else {
                    collection2.add(valueOf2);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (sefVar.d(p5fVar, elapsedRealtime2)) {
                    sefVar.i.put(p5fVar, Long.valueOf(elapsedRealtime2));
                    yjb.c(1, new bod(sefVar));
                    return;
                }
                return;
        }
    }

    public t3f(z3f z3fVar, cpd cpdVar, long j) {
        this.c = z3fVar;
        this.d = cpdVar;
        this.b = j;
    }
}
