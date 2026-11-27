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
public final class dhe implements Runnable {
    public final byte a;
    public final Object b;

    public dhe(ijf ijfVar) {
        this.a = (byte) 5;
        gaf gafVar = gaf.UNKNOWN_EVENT;
        this.b = ijfVar;
    }

    @Override
    public final void run() {
        long j;
        m3 m3Var;
        m3 m3Var2;
        byte b = this.a;
        double d = 75.0d;
        m3 m3Var3 = null;
        int i = 3;
        Object obj = this.b;
        switch (b) {
            case 0:
                vwe vweVar = (vwe) obj;
                e1f e1fVar = vweVar.g;
                if (e1fVar != null) {
                    vweVar.a.a((p8f) vweVar.c.b(e1fVar).a(), 223);
                }
                vweVar.e();
                return;
            case 1:
                long j2 = 0;
                z9f z9fVar = (z9f) obj;
                HashSet hashSet = z9fVar.f;
                SharedPreferences sharedPreferences = z9fVar.b;
                HashSet hashSet2 = z9fVar.g;
                if (!hashSet.isEmpty()) {
                    if (true != hashSet2.equals(hashSet)) {
                        j = 86400000;
                    } else {
                        j = 172800000;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = z9fVar.h;
                    if (j3 == 0 || currentTimeMillis - j3 >= j) {
                        z9f.i.b("Upload the feature usage report.", new Object[0]);
                        x7f l = z7f.l();
                        String str = z9f.j;
                        l.c();
                        z7f.n((z7f) l.b, str);
                        String str2 = z9fVar.c;
                        l.c();
                        z7f.m((z7f) l.b, str2);
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(hashSet);
                        e7f l2 = h7f.l();
                        l2.c();
                        h7f.n((h7f) l2.b, arrayList);
                        l2.c();
                        h7f.m((h7f) l2.b, (z7f) l.a());
                        n8f m = p8f.m();
                        m.c();
                        p8f.s((p8f) m.b, (h7f) l2.a());
                        z9fVar.a.a((p8f) m.a(), 243);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        if (!hashSet2.equals(hashSet)) {
                            hashSet2.clear();
                            hashSet2.addAll(hashSet);
                            Iterator it = hashSet2.iterator();
                            while (it.hasNext()) {
                                String num = Integer.toString(((b6f) it.next()).a);
                                String i2 = c00.i("feature_usage_timestamp_reported_feature_", num);
                                if (!sharedPreferences.contains(i2)) {
                                    i2 = c00.i("feature_usage_timestamp_detected_feature_", num);
                                }
                                String i3 = c00.i("feature_usage_timestamp_reported_feature_", num);
                                if (!TextUtils.equals(i2, i3)) {
                                    long j4 = j2;
                                    long j5 = sharedPreferences.getLong(i2, j4);
                                    edit.remove(i2);
                                    if (j5 != j4) {
                                        edit.putLong(i3, j5);
                                    }
                                    j2 = j4;
                                }
                            }
                        }
                        z9fVar.h = currentTimeMillis;
                        edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                q8f q8fVar = (q8f) obj;
                HashMap hashMap = q8fVar.j;
                vxe vxeVar = vxe.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                ccd ccdVar = (ccd) hashMap.get(vxeVar);
                if (ccdVar != null) {
                    ccd ccdVar2 = ccdVar;
                    w9d w9dVar = ccdVar2.a;
                    if (w9dVar == null) {
                        ccd ccdVar3 = ccdVar2;
                        w9d w9dVar2 = new w9d(ccdVar3, ccdVar3.c);
                        ccdVar2.a = w9dVar2;
                        w9dVar = w9dVar2;
                    }
                    Iterator it2 = w9dVar.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Object obj2 = (Collection) ccdVar.c.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(3);
                        }
                        List list = (List) obj2;
                        if (list instanceof RandomAccess) {
                            m3Var = new m3(ccdVar, next, list, (m3) null);
                        } else {
                            m3Var = new m3(ccdVar, next, list, (m3) null);
                        }
                        ArrayList arrayList2 = new ArrayList(m3Var);
                        Collections.sort(arrayList2);
                        ?? obj3 = new Object();
                        int size = arrayList2.size();
                        long j6 = 0;
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj4 = arrayList2.get(i4);
                            i4++;
                            j6 = ((Long) obj4).longValue() + j6;
                        }
                        obj3.c = Long.valueOf((j6 / arrayList2.size()) & Long.MAX_VALUE);
                        obj3.a = Long.valueOf(q8f.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        obj3.f = Long.valueOf(q8f.a(arrayList2, d) & Long.MAX_VALUE);
                        obj3.e = Long.valueOf(q8f.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        obj3.d = Long.valueOf(q8f.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        obj3.b = Long.valueOf(q8f.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        kue kueVar = new kue(obj3);
                        int size2 = arrayList2.size();
                        ?? obj5 = new Object();
                        obj5.c = kxe.TYPE_THIN;
                        htd htdVar = new htd((byte) 0);
                        htdVar.c = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        htdVar.b = (std) next;
                        htdVar.d = kueVar;
                        obj5.f = new eud(htdVar);
                        q8f q8fVar2 = q8fVar;
                        xnb.c(1, new dd1(q8fVar2, new rx((fp) obj5, 0), vxeVar, q8fVar.b(), (byte) 3));
                        q8fVar = q8fVar2;
                        d = 75.0d;
                    }
                    hashMap.remove(vxeVar);
                    return;
                }
                return;
            case 3:
                ((alf) obj).g(false);
                return;
            case 4:
                DataHolder dataHolder = (DataHolder) obj;
                int i5 = dataHolder.e;
                dataHolder.close();
                return;
            default:
                ijf ijfVar = (ijf) obj;
                gaf gafVar = gaf.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                HashMap hashMap2 = ijfVar.j;
                lmf lmfVar = (lmf) hashMap2.get(gafVar);
                if (lmfVar != null) {
                    lmf lmfVar2 = lmfVar;
                    o4f o4fVar = lmfVar2.a;
                    if (o4fVar == null) {
                        lmf lmfVar3 = lmfVar2;
                        o4f o4fVar2 = new o4f(lmfVar3, lmfVar3.c);
                        lmfVar2.a = o4fVar2;
                        o4fVar = o4fVar2;
                    }
                    Iterator it3 = o4fVar.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        Object obj6 = (Collection) lmfVar.c.get(next2);
                        if (obj6 == null) {
                            obj6 = new ArrayList(i);
                        }
                        List list2 = (List) obj6;
                        if (list2 instanceof RandomAccess) {
                            m3Var2 = new m3(lmfVar, next2, list2, m3Var3);
                        } else {
                            m3Var2 = new m3(lmfVar, next2, list2, m3Var3);
                        }
                        ArrayList arrayList3 = new ArrayList(m3Var2);
                        Collections.sort(arrayList3);
                        ?? obj7 = new Object();
                        int size3 = arrayList3.size();
                        long j7 = 0;
                        int i6 = 0;
                        while (i6 < size3) {
                            Object obj8 = arrayList3.get(i6);
                            i6++;
                            j7 = ((Long) obj8).longValue() + j7;
                        }
                        obj7.c = Long.valueOf((j7 / arrayList3.size()) & Long.MAX_VALUE);
                        obj7.a = Long.valueOf(ijf.a(arrayList3, 100.0d) & Long.MAX_VALUE);
                        obj7.f = Long.valueOf(ijf.a(arrayList3, 75.0d) & Long.MAX_VALUE);
                        obj7.e = Long.valueOf(ijf.a(arrayList3, 50.0d) & Long.MAX_VALUE);
                        obj7.d = Long.valueOf(ijf.a(arrayList3, 25.0d) & Long.MAX_VALUE);
                        obj7.b = Long.valueOf(ijf.a(arrayList3, 0.0d) & Long.MAX_VALUE);
                        u7f u7fVar = new u7f(obj7);
                        int size4 = arrayList3.size();
                        ?? obj9 = new Object();
                        obj9.c = m9f.TYPE_THIN;
                        htd htdVar2 = new htd((byte) 2);
                        htdVar2.c = Integer.valueOf(size4 & Integer.MAX_VALUE);
                        htdVar2.b = (ywd) next2;
                        htdVar2.d = u7fVar;
                        obj9.h = new ixd(htdVar2);
                        ijf ijfVar2 = ijfVar;
                        gaf gafVar2 = gafVar;
                        xnb.c(1, new dd1(ijfVar2, new rx((oxb) obj9, 0), gafVar2, ijfVar.c(), (byte) 4));
                        gafVar = gafVar2;
                        ijfVar = ijfVar2;
                        m3Var3 = null;
                        i = 3;
                    }
                    hashMap2.remove(gafVar);
                    return;
                }
                return;
        }
    }

    public dhe(x9d x9dVar, DataHolder dataHolder) {
        this.a = (byte) 4;
        this.b = dataHolder;
    }

    public dhe(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
