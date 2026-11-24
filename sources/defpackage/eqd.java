package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
public final class eqd implements Runnable {
    public final byte a;
    public final Object b;

    public eqd(tgf tgfVar) {
        this.a = (byte) 6;
        r7f r7fVar = r7f.UNKNOWN_EVENT;
        this.b = tgfVar;
    }

    @Override
    public final void run() {
        long j;
        l3 l3Var;
        l3 l3Var2;
        byte b = this.a;
        double d = 75.0d;
        int i = 3;
        l3 l3Var3 = null;
        long j2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                List list = ((rqd) obj).e;
                if (list != null) {
                    list.isEmpty();
                }
                throw null;
            case 1:
                hue hueVar = (hue) obj;
                pye pyeVar = hueVar.g;
                if (pyeVar != null) {
                    hueVar.a.a((a6f) hueVar.c.b(pyeVar).a(), 223);
                }
                hueVar.e();
                return;
            case 2:
                k7f k7fVar = (k7f) obj;
                HashSet hashSet = k7fVar.f;
                SharedPreferences sharedPreferences = k7fVar.b;
                HashSet hashSet2 = k7fVar.g;
                if (!hashSet.isEmpty()) {
                    if (true != hashSet2.equals(hashSet)) {
                        j = 86400000;
                    } else {
                        j = 172800000;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = k7fVar.h;
                    if (j3 == 0 || currentTimeMillis - j3 >= j) {
                        k7f.i.b("Upload the feature usage report.", new Object[0]);
                        h5f l = k5f.l();
                        String str = k7f.j;
                        l.c();
                        k5f.n((k5f) l.b, str);
                        String str2 = k7fVar.c;
                        l.c();
                        k5f.m((k5f) l.b, str2);
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(hashSet);
                        p4f l2 = s4f.l();
                        l2.c();
                        s4f.n((s4f) l2.b, arrayList);
                        l2.c();
                        s4f.m((s4f) l2.b, (k5f) l.a());
                        y5f m = a6f.m();
                        m.c();
                        a6f.s((a6f) m.b, (s4f) l2.a());
                        k7fVar.a.a((a6f) m.a(), 243);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        if (!hashSet2.equals(hashSet)) {
                            hashSet2.clear();
                            hashSet2.addAll(hashSet);
                            Iterator it = hashSet2.iterator();
                            while (it.hasNext()) {
                                String num = Integer.toString(((m3f) it.next()).a);
                                String h = b10.h("feature_usage_timestamp_reported_feature_", num);
                                if (!sharedPreferences.contains(h)) {
                                    h = b10.h("feature_usage_timestamp_detected_feature_", num);
                                }
                                String h2 = b10.h("feature_usage_timestamp_reported_feature_", num);
                                if (!TextUtils.equals(h, h2)) {
                                    long j4 = j2;
                                    long j5 = sharedPreferences.getLong(h, j4);
                                    edit.remove(h);
                                    if (j5 != j4) {
                                        edit.putLong(h2, j5);
                                    }
                                    j2 = j4;
                                }
                            }
                        }
                        k7fVar.h = currentTimeMillis;
                        edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                b6f b6fVar = (b6f) obj;
                HashMap hashMap = b6fVar.j;
                hve hveVar = hve.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                l9d l9dVar = (l9d) hashMap.get(hveVar);
                if (l9dVar != null) {
                    l9d l9dVar2 = l9dVar;
                    f7d f7dVar = l9dVar2.a;
                    if (f7dVar == null) {
                        l9d l9dVar3 = l9dVar2;
                        f7d f7dVar2 = new f7d(l9dVar3, l9dVar3.c);
                        l9dVar2.a = f7dVar2;
                        f7dVar = f7dVar2;
                    }
                    Iterator it2 = f7dVar.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Object obj2 = (Collection) l9dVar.c.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(3);
                        }
                        List list2 = (List) obj2;
                        if (list2 instanceof RandomAccess) {
                            l3Var = new l3(l9dVar, next, list2, (l3) null);
                        } else {
                            l3Var = new l3(l9dVar, next, list2, (l3) null);
                        }
                        ArrayList arrayList2 = new ArrayList(l3Var);
                        Collections.sort(arrayList2);
                        ?? obj3 = new Object();
                        int size = arrayList2.size();
                        long j6 = 0;
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj4 = arrayList2.get(i2);
                            i2++;
                            j6 = ((Long) obj4).longValue() + j6;
                        }
                        obj3.c = Long.valueOf((j6 / arrayList2.size()) & Long.MAX_VALUE);
                        obj3.a = Long.valueOf(b6f.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        obj3.f = Long.valueOf(b6f.a(arrayList2, d) & Long.MAX_VALUE);
                        obj3.e = Long.valueOf(b6f.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        obj3.d = Long.valueOf(b6f.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        obj3.b = Long.valueOf(b6f.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        wre wreVar = new wre(obj3);
                        int size2 = arrayList2.size();
                        ?? obj5 = new Object();
                        obj5.c = wue.TYPE_THIN;
                        uqd uqdVar = new uqd((byte) 0);
                        uqdVar.c = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        uqdVar.b = (frd) next;
                        uqdVar.d = wreVar;
                        obj5.f = new rrd(uqdVar);
                        b6f b6fVar2 = b6fVar;
                        hve hveVar2 = hveVar;
                        mlb.c(1, new de1(b6fVar2, new ry((eq) obj5, 0), hveVar2, b6fVar.b(), (byte) 3));
                        hveVar = hveVar2;
                        b6fVar = b6fVar2;
                        d = 75.0d;
                    }
                    hashMap.remove(hveVar);
                    return;
                }
                return;
            case 4:
                ((lif) obj).g(false);
                return;
            case 5:
                DataHolder dataHolder = (DataHolder) obj;
                int i3 = dataHolder.e;
                dataHolder.close();
                return;
            default:
                tgf tgfVar = (tgf) obj;
                r7f r7fVar = r7f.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                HashMap hashMap2 = tgfVar.j;
                wjf wjfVar = (wjf) hashMap2.get(r7fVar);
                if (wjfVar != null) {
                    wjf wjfVar2 = wjfVar;
                    z1f z1fVar = wjfVar2.a;
                    if (z1fVar == null) {
                        wjf wjfVar3 = wjfVar2;
                        z1f z1fVar2 = new z1f(wjfVar3, wjfVar3.c);
                        wjfVar2.a = z1fVar2;
                        z1fVar = z1fVar2;
                    }
                    Iterator it3 = z1fVar.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        Object obj6 = (Collection) wjfVar.c.get(next2);
                        if (obj6 == null) {
                            obj6 = new ArrayList(i);
                        }
                        List list3 = (List) obj6;
                        if (list3 instanceof RandomAccess) {
                            l3Var2 = new l3(wjfVar, next2, list3, l3Var3);
                        } else {
                            l3Var2 = new l3(wjfVar, next2, list3, l3Var3);
                        }
                        ArrayList arrayList3 = new ArrayList(l3Var2);
                        Collections.sort(arrayList3);
                        ?? obj7 = new Object();
                        int size3 = arrayList3.size();
                        long j7 = 0;
                        int i4 = 0;
                        while (i4 < size3) {
                            Object obj8 = arrayList3.get(i4);
                            i4++;
                            j7 = ((Long) obj8).longValue() + j7;
                        }
                        obj7.c = Long.valueOf((j7 / arrayList3.size()) & Long.MAX_VALUE);
                        obj7.a = Long.valueOf(tgf.a(arrayList3, 100.0d) & Long.MAX_VALUE);
                        obj7.f = Long.valueOf(tgf.a(arrayList3, 75.0d) & Long.MAX_VALUE);
                        obj7.e = Long.valueOf(tgf.a(arrayList3, 50.0d) & Long.MAX_VALUE);
                        obj7.d = Long.valueOf(tgf.a(arrayList3, 25.0d) & Long.MAX_VALUE);
                        obj7.b = Long.valueOf(tgf.a(arrayList3, 0.0d) & Long.MAX_VALUE);
                        f5f f5fVar = new f5f(obj7);
                        int size4 = arrayList3.size();
                        ?? obj9 = new Object();
                        obj9.c = x6f.TYPE_THIN;
                        uqd uqdVar2 = new uqd((byte) 2);
                        uqdVar2.c = Integer.valueOf(size4 & Integer.MAX_VALUE);
                        uqdVar2.b = (lud) next2;
                        uqdVar2.d = f5fVar;
                        obj9.h = new vud(uqdVar2);
                        tgf tgfVar2 = tgfVar;
                        r7f r7fVar2 = r7fVar;
                        mlb.c(1, new de1(tgfVar2, new ry((ovb) obj9, 0), r7fVar2, tgfVar.c(), (byte) 4));
                        r7fVar = r7fVar2;
                        tgfVar = tgfVar2;
                        l3Var3 = null;
                        i = 3;
                    }
                    hashMap2.remove(r7fVar);
                    return;
                }
                return;
        }
    }

    public eqd(g7d g7dVar, DataHolder dataHolder) {
        this.a = (byte) 5;
        this.b = dataHolder;
    }

    public eqd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
