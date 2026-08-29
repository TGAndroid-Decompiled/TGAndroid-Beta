package j7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import l7.hb;
import l7.lg;
import l7.wf;
public final class ja implements Runnable {
    public final int f11059a = 0;
    public final long f11060b;
    public final Object f11061c;
    public final Object d;

    public ja(la laVar, w0 w0Var, long j10) {
        this.f11061c = laVar;
        this.d = w0Var;
        this.f11060b = j10;
    }

    @Override
    public final void run() {
        switch (this.f11059a) {
            case 0:
                la laVar = (la) this.f11061c;
                w0 w0Var = (w0) this.d;
                HashMap hashMap = laVar.f11095j;
                u7 u7Var = u7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap.containsKey(u7Var)) {
                    n nVar = new n();
                    ?? obj = new Object();
                    if (nVar.isEmpty()) {
                        obj.f11024c = nVar;
                        hashMap.put(u7Var, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                h hVar = (h) hashMap.get(u7Var);
                Long valueOf = Long.valueOf(this.f11060b);
                n nVar2 = hVar.f11024c;
                Collection collection = (Collection) nVar2.get(w0Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (arrayList.add(valueOf)) {
                        hVar.d++;
                        nVar2.put(w0Var, arrayList);
                    } else {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                } else if (collection.add(valueOf)) {
                    hVar.d++;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (laVar.c(u7Var, elapsedRealtime)) {
                    laVar.f11094i.put(u7Var, Long.valueOf(elapsedRealtime));
                    ab.q.f333a.execute(new ag.q1(laVar, 25));
                    return;
                }
                return;
            default:
                wf wfVar = (wf) this.f11061c;
                hb hbVar = hb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                l7.i1 i1Var = (l7.i1) this.d;
                HashMap hashMap2 = wfVar.f15032j;
                if (!hashMap2.containsKey(hbVar)) {
                    l7.d dVar = new l7.d();
                    ?? obj2 = new Object();
                    if (dVar.isEmpty()) {
                        obj2.f14877c = dVar;
                        hashMap2.put(hbVar, obj2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Long valueOf2 = Long.valueOf(this.f11060b);
                l7.d dVar2 = ((lg) hashMap2.get(hbVar)).f14877c;
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
                if (wfVar.d(hbVar, elapsedRealtime2)) {
                    wfVar.f15031i.put(hbVar, Long.valueOf(elapsedRealtime2));
                    ab.q.f333a.execute(new ag.q1(wfVar));
                    return;
                }
                return;
        }
    }

    public ja(wf wfVar, l7.i1 i1Var, long j10) {
        hb hbVar = hb.UNKNOWN_EVENT;
        this.f11061c = wfVar;
        this.d = i1Var;
        this.f11060b = j10;
    }
}
