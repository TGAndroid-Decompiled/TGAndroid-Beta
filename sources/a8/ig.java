package a8;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.ui.Components.cy0;
public final class ig implements Runnable {
    public final int f551a = 0;
    public final long f552b;
    public final Object f553c;
    public final Object d;

    public ig(kg kgVar, r1 r1Var, long j10) {
        rb rbVar = rb.UNKNOWN_EVENT;
        this.f553c = kgVar;
        this.d = r1Var;
        this.f552b = j10;
    }

    @Override
    public final void run() {
        switch (this.f551a) {
            case 0:
                kg kgVar = (kg) this.f553c;
                rb rbVar = rb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                r1 r1Var = (r1) this.d;
                HashMap hashMap = kgVar.f585j;
                if (!hashMap.containsKey(rbVar)) {
                    g gVar = new g();
                    ?? obj = new Object();
                    if (gVar.isEmpty()) {
                        obj.f508c = gVar;
                        hashMap.put(rbVar, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Long valueOf = Long.valueOf(this.f552b);
                g gVar2 = ((gh) hashMap.get(rbVar)).f508c;
                Collection collection = (Collection) gVar2.get(r1Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (arrayList.add(valueOf)) {
                        gVar2.put(r1Var, arrayList);
                    } else {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                } else {
                    collection.add(valueOf);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (kgVar.d(rbVar, elapsedRealtime)) {
                    kgVar.f584i.put(rbVar, Long.valueOf(elapsedRealtime));
                    sb.m.f48064a.execute(new a5.d(kgVar));
                    return;
                }
                return;
            default:
                y7.ca caVar = (y7.ca) this.f553c;
                y7.q0 q0Var = (y7.q0) this.d;
                HashMap hashMap2 = caVar.f52106j;
                y7.m7 m7Var = y7.m7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap2.containsKey(m7Var)) {
                    y7.i iVar = new y7.i();
                    ?? obj2 = new Object();
                    if (iVar.isEmpty()) {
                        obj2.f52124c = iVar;
                        hashMap2.put(m7Var, obj2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                y7.e eVar = (y7.e) hashMap2.get(m7Var);
                Long valueOf2 = Long.valueOf(this.f552b);
                y7.i iVar2 = eVar.f52124c;
                Collection collection2 = (Collection) iVar2.get(q0Var);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (arrayList2.add(valueOf2)) {
                        eVar.d++;
                        iVar2.put(q0Var, arrayList2);
                    } else {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                } else if (collection2.add(valueOf2)) {
                    eVar.d++;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (caVar.c(m7Var, elapsedRealtime2)) {
                    caVar.f52105i.put(m7Var, Long.valueOf(elapsedRealtime2));
                    sb.m.f48064a.execute(new cy0(caVar, 20));
                    return;
                }
                return;
        }
    }

    public ig(y7.ca caVar, y7.q0 q0Var, long j10) {
        this.f553c = caVar;
        this.d = q0Var;
        this.f552b = j10;
    }
}
