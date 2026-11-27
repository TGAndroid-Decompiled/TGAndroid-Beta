package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public final class k8f implements Runnable {
    public final byte a = 1;
    public final long b;
    public final Object c;
    public final Object d;

    public k8f(ijf ijfVar, ywd ywdVar, long j) {
        gaf gafVar = gaf.UNKNOWN_EVENT;
        this.c = ijfVar;
        this.d = ywdVar;
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
                q8f q8fVar = (q8f) obj2;
                std stdVar = (std) obj;
                HashMap hashMap = q8fVar.j;
                vxe vxeVar = vxe.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap.containsKey(vxeVar)) {
                    lp2 lp2Var = new lp2((byte) 2);
                    ?? obj3 = new Object();
                    if (lp2Var.isEmpty()) {
                        obj3.c = lp2Var;
                        hashMap.put(vxeVar, obj3);
                    } else {
                        iy8.d();
                        throw null;
                    }
                }
                ccd ccdVar = (ccd) hashMap.get(vxeVar);
                Long valueOf = Long.valueOf(j);
                lp2 lp2Var2 = ccdVar.c;
                Collection collection = (Collection) lp2Var2.get(stdVar);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (arrayList.add(valueOf)) {
                        ccdVar.d++;
                        lp2Var2.put(stdVar, arrayList);
                    } else {
                        hz6.e("New Collection violated the Collection spec");
                        return;
                    }
                } else if (collection.add(valueOf)) {
                    ccdVar.d++;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (q8fVar.c(vxeVar, elapsedRealtime)) {
                    q8fVar.i.put(vxeVar, Long.valueOf(elapsedRealtime));
                    xnb.c(1, new dhe(q8fVar, (byte) 2));
                    return;
                }
                return;
            default:
                ijf ijfVar = (ijf) obj2;
                gaf gafVar = gaf.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                ywd ywdVar = (ywd) obj;
                HashMap hashMap2 = ijfVar.j;
                if (!hashMap2.containsKey(gafVar)) {
                    lp2 lp2Var3 = new lp2((byte) 1);
                    ?? obj4 = new Object();
                    if (lp2Var3.isEmpty()) {
                        obj4.c = lp2Var3;
                        hashMap2.put(gafVar, obj4);
                    } else {
                        iy8.d();
                        throw null;
                    }
                }
                Long valueOf2 = Long.valueOf(j);
                lp2 lp2Var4 = ((lmf) hashMap2.get(gafVar)).c;
                Collection collection2 = (Collection) lp2Var4.get(ywdVar);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (arrayList2.add(valueOf2)) {
                        lp2Var4.put(ywdVar, arrayList2);
                    } else {
                        hz6.e("New Collection violated the Collection spec");
                        return;
                    }
                } else {
                    collection2.add(valueOf2);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (ijfVar.d(gafVar, elapsedRealtime2)) {
                    ijfVar.i.put(gafVar, Long.valueOf(elapsedRealtime2));
                    xnb.c(1, new dhe(ijfVar));
                    return;
                }
                return;
        }
    }

    public k8f(q8f q8fVar, std stdVar, long j) {
        this.c = q8fVar;
        this.d = stdVar;
        this.b = j;
    }
}
