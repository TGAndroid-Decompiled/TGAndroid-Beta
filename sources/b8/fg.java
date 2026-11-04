package b8;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public final class fg implements Runnable {
    public final int f2608a = 0;
    public final long f2609b;
    public final Object f2610c;
    public final Object d;

    public fg(hg hgVar, p1 p1Var, long j10) {
        ob obVar = ob.UNKNOWN_EVENT;
        this.f2610c = hgVar;
        this.d = p1Var;
        this.f2609b = j10;
    }

    @Override
    public final void run() {
        switch (this.f2608a) {
            case 0:
                hg hgVar = (hg) this.f2610c;
                ob obVar = ob.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                p1 p1Var = (p1) this.d;
                HashMap hashMap = hgVar.f2665j;
                if (!hashMap.containsKey(obVar)) {
                    g gVar = new g();
                    ?? obj = new Object();
                    if (gVar.isEmpty()) {
                        obj.f2554c = gVar;
                        hashMap.put(obVar, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Long valueOf = Long.valueOf(this.f2609b);
                g gVar2 = ((dh) hashMap.get(obVar)).f2554c;
                Collection collection = (Collection) gVar2.get(p1Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (arrayList.add(valueOf)) {
                        gVar2.put(p1Var, arrayList);
                    } else {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                } else {
                    collection.add(valueOf);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (hgVar.d(obVar, elapsedRealtime)) {
                    hgVar.f2664i.put(obVar, Long.valueOf(elapsedRealtime));
                    mb.m.f19245a.execute(new a3.o(hgVar));
                    return;
                }
                return;
            default:
                z7.da daVar = (z7.da) this.f2610c;
                z7.r0 r0Var = (z7.r0) this.d;
                HashMap hashMap2 = daVar.f59848j;
                z7.n7 n7Var = z7.n7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                if (!hashMap2.containsKey(n7Var)) {
                    z7.i iVar = new z7.i();
                    ?? obj2 = new Object();
                    if (iVar.isEmpty()) {
                        obj2.f59849c = iVar;
                        hashMap2.put(n7Var, obj2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                z7.e eVar = (z7.e) hashMap2.get(n7Var);
                Long valueOf2 = Long.valueOf(this.f2609b);
                z7.i iVar2 = eVar.f59849c;
                Collection collection2 = (Collection) iVar2.get(r0Var);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (arrayList2.add(valueOf2)) {
                        eVar.d++;
                        iVar2.put(r0Var, arrayList2);
                    } else {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                } else if (collection2.add(valueOf2)) {
                    eVar.d++;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (daVar.c(n7Var, elapsedRealtime2)) {
                    daVar.f59847i.put(n7Var, Long.valueOf(elapsedRealtime2));
                    mb.m.f19245a.execute(new wi.i0(daVar, 3));
                    return;
                }
                return;
        }
    }

    public fg(z7.da daVar, z7.r0 r0Var, long j10) {
        this.f2610c = daVar;
        this.d = r0Var;
        this.f2609b = j10;
    }
}
