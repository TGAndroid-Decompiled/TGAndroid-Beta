package a8;

import android.os.SystemClock;
import c8.jg;
import c8.uf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public final class ra implements Runnable {
    public final int f623a = 0;
    public final long f624b;
    public final Object f625c;
    public final Object d;

    public ra(ua uaVar, e1 e1Var, long j3) {
        this.f625c = uaVar;
        this.d = e1Var;
        this.f624b = j3;
    }

    @Override
    public final void run() {
        switch (this.f623a) {
            case 0:
                ua uaVar = (ua) this.f625c;
                e1 e1Var = (e1) this.d;
                HashMap hashMap = uaVar.f674j;
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
                Long valueOf = Long.valueOf(this.f624b);
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
                    uaVar.f673i.put(a8Var, Long.valueOf(elapsedRealtime));
                    pb.n.f55663a.execute(new sa(uaVar, 0));
                    return;
                }
                return;
            default:
                uf ufVar = (uf) this.f625c;
                c8.fb fbVar = c8.fb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                c8.h1 h1Var = (c8.h1) this.d;
                HashMap hashMap2 = ufVar.f5006j;
                if (!hashMap2.containsKey(fbVar)) {
                    c8.d dVar = new c8.d();
                    ?? obj2 = new Object();
                    if (dVar.isEmpty()) {
                        obj2.f4842c = dVar;
                        hashMap2.put(fbVar, obj2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Long valueOf2 = Long.valueOf(this.f624b);
                c8.d dVar2 = ((jg) hashMap2.get(fbVar)).f4842c;
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
                    ufVar.f5005i.put(fbVar, Long.valueOf(elapsedRealtime2));
                    pb.n.f55663a.execute(new sa(ufVar));
                    return;
                }
                return;
        }
    }

    public ra(uf ufVar, c8.h1 h1Var, long j3) {
        c8.fb fbVar = c8.fb.UNKNOWN_EVENT;
        this.f625c = ufVar;
        this.d = h1Var;
        this.f624b = j3;
    }
}
