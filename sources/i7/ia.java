package i7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import k7.hb;
import k7.lg;
import k7.wf;

public final class ia implements Runnable {

    public final int f10672a = 0;

    public final long f10673b;

    public final Object f10674c;
    public final Object d;

    public ia(ka kaVar, w0 w0Var, long j10) {
        this.f10674c = kaVar;
        this.d = w0Var;
        this.f10673b = j10;
    }

    @Override
    public final void run() {
        switch (this.f10672a) {
            case 0:
                ka kaVar = (ka) this.f10674c;
                w0 w0Var = (w0) this.d;
                HashMap map = kaVar.f10715j;
                t7 t7Var = t7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!map.containsKey(t7Var)) {
                    n nVar = new n();
                    h hVar = new h();
                    if (!nVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    hVar.f10651c = nVar;
                    map.put(t7Var, hVar);
                }
                h hVar2 = (h) map.get(t7Var);
                Long lValueOf = Long.valueOf(this.f10673b);
                n nVar2 = hVar2.f10651c;
                Collection collection = (Collection) nVar2.get(w0Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(lValueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    hVar2.d++;
                    nVar2.put(w0Var, arrayList);
                } else if (collection.add(lValueOf)) {
                    hVar2.d++;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (kaVar.c(t7Var, jElapsedRealtime)) {
                    kaVar.f10714i.put(t7Var, Long.valueOf(jElapsedRealtime));
                    za.m.f50301a.execute(new a8.b(kaVar, 23));
                    return;
                }
                return;
            default:
                wf wfVar = (wf) this.f10674c;
                hb hbVar = hb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                k7.i1 i1Var = (k7.i1) this.d;
                HashMap map2 = wfVar.f15027j;
                if (!map2.containsKey(hbVar)) {
                    k7.d dVar = new k7.d();
                    lg lgVar = new lg();
                    if (!dVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    lgVar.f14872c = dVar;
                    map2.put(hbVar, lgVar);
                }
                lg lgVar2 = (lg) map2.get(hbVar);
                Long lValueOf2 = Long.valueOf(this.f10673b);
                k7.d dVar2 = lgVar2.f14872c;
                Collection collection2 = (Collection) dVar2.get(i1Var);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (!arrayList2.add(lValueOf2)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    dVar2.put(i1Var, arrayList2);
                } else {
                    collection2.add(lValueOf2);
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (wfVar.d(hbVar, jElapsedRealtime2)) {
                    wfVar.f15026i.put(hbVar, Long.valueOf(jElapsedRealtime2));
                    za.m.f50301a.execute(new a8.b(wfVar));
                    return;
                }
                return;
        }
    }

    public ia(wf wfVar, k7.i1 i1Var, long j10) {
        hb hbVar = hb.UNKNOWN_EVENT;
        this.f10674c = wfVar;
        this.d = i1Var;
        this.f10673b = j10;
    }
}
