package h7;

import android.os.SystemClock;
import j7.hb;
import j7.lg;
import j7.wf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public final class ia implements Runnable {
    public final int f9963a = 0;
    public final long f9964b;
    public final Object f9965c;
    public final Object d;

    public ia(ka kaVar, w0 w0Var, long j10) {
        this.f9965c = kaVar;
        this.d = w0Var;
        this.f9964b = j10;
    }

    @Override
    public final void run() {
        switch (this.f9963a) {
            case 0:
                ka kaVar = (ka) this.f9965c;
                w0 w0Var = (w0) this.d;
                HashMap hashMap = kaVar.f10006j;
                t7 t7Var = t7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap.containsKey(t7Var)) {
                    n nVar = new n();
                    ?? obj = new Object();
                    if (nVar.isEmpty()) {
                        obj.f9942c = nVar;
                        hashMap.put(t7Var, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                h hVar = (h) hashMap.get(t7Var);
                Long valueOf = Long.valueOf(this.f9964b);
                n nVar2 = hVar.f9942c;
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
                if (kaVar.c(t7Var, elapsedRealtime)) {
                    kaVar.f10005i.put(t7Var, Long.valueOf(elapsedRealtime));
                    ya.m.f49706a.execute(new androidx.activity.i(kaVar, 22));
                    return;
                }
                return;
            default:
                wf wfVar = (wf) this.f9965c;
                hb hbVar = hb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                j7.i1 i1Var = (j7.i1) this.d;
                HashMap hashMap2 = wfVar.f14173j;
                if (!hashMap2.containsKey(hbVar)) {
                    j7.d dVar = new j7.d();
                    ?? obj2 = new Object();
                    if (dVar.isEmpty()) {
                        obj2.f14018c = dVar;
                        hashMap2.put(hbVar, obj2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Long valueOf2 = Long.valueOf(this.f9964b);
                j7.d dVar2 = ((lg) hashMap2.get(hbVar)).f14018c;
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
                    wfVar.f14172i.put(hbVar, Long.valueOf(elapsedRealtime2));
                    ya.m.f49706a.execute(new androidx.activity.i(wfVar));
                    return;
                }
                return;
        }
    }

    public ia(wf wfVar, j7.i1 i1Var, long j10) {
        hb hbVar = hb.UNKNOWN_EVENT;
        this.f9965c = wfVar;
        this.d = i1Var;
        this.f9964b = j10;
    }
}
