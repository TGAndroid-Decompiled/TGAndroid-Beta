package a8;

import android.os.SystemClock;
import c8.jg;
import c8.uf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public final class ra implements Runnable {
    public final int f624a = 0;
    public final long f625b;
    public final Object f626c;
    public final Object d;

    public ra(ua uaVar, e1 e1Var, long j3) {
        this.f626c = uaVar;
        this.d = e1Var;
        this.f625b = j3;
    }

    @Override
    public final void run() {
        switch (this.f624a) {
            case 0:
                ua uaVar = (ua) this.f626c;
                e1 e1Var = (e1) this.d;
                HashMap hashMap = uaVar.f675j;
                a8 a8Var = a8.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap.containsKey(a8Var)) {
                    o oVar = new o();
                    ?? obj = new Object();
                    if (oVar.isEmpty()) {
                        obj.f486c = oVar;
                        hashMap.put(a8Var, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                i iVar = (i) hashMap.get(a8Var);
                Long valueOf = Long.valueOf(this.f625b);
                o oVar2 = iVar.f486c;
                Collection collection = (Collection) oVar2.get(e1Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (arrayList.add(valueOf)) {
                        iVar.d++;
                        oVar2.put(e1Var, arrayList);
                    } else {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                } else if (collection.add(valueOf)) {
                    iVar.d++;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (uaVar.c(a8Var, elapsedRealtime)) {
                    uaVar.f674i.put(a8Var, Long.valueOf(elapsedRealtime));
                    pb.n.f55585a.execute(new sa(uaVar, 0));
                    return;
                }
                return;
            default:
                uf ufVar = (uf) this.f626c;
                c8.fb fbVar = c8.fb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                c8.h1 h1Var = (c8.h1) this.d;
                HashMap hashMap2 = ufVar.f5041j;
                if (!hashMap2.containsKey(fbVar)) {
                    c8.d dVar = new c8.d();
                    ?? obj2 = new Object();
                    if (dVar.isEmpty()) {
                        obj2.f4881c = dVar;
                        hashMap2.put(fbVar, obj2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Long valueOf2 = Long.valueOf(this.f625b);
                c8.d dVar2 = ((jg) hashMap2.get(fbVar)).f4881c;
                Collection collection2 = (Collection) dVar2.get(h1Var);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (arrayList2.add(valueOf2)) {
                        dVar2.put(h1Var, arrayList2);
                    } else {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                } else {
                    collection2.add(valueOf2);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (ufVar.d(fbVar, elapsedRealtime2)) {
                    ufVar.f5040i.put(fbVar, Long.valueOf(elapsedRealtime2));
                    pb.n.f55585a.execute(new sa(ufVar));
                    return;
                }
                return;
        }
    }

    public ra(uf ufVar, c8.h1 h1Var, long j3) {
        c8.fb fbVar = c8.fb.UNKNOWN_EVENT;
        this.f626c = ufVar;
        this.d = h1Var;
        this.f625b = j3;
    }
}
