package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.voip.NativeInstance;
public final class e01 {
    public final NativeInstance a;
    public volatile boolean f;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public volatile Set d = Collections.EMPTY_SET;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public final HashSet j = new HashSet();

    public e01(NativeInstance nativeInstance) {
        this.a = nativeInstance;
    }

    public static java.lang.String c(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e01.c(java.lang.String):java.lang.String");
    }

    public final boolean a(long r11, defpackage.wz0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e01.a(long, wz0):boolean");
    }

    public final void b(String str, Throwable th) {
        if (f11.a) {
            cc4.e("[BroadcastHwVideo] " + str + " falls back to software", th);
        }
        this.c.add(str);
        HashSet hashSet = new HashSet(this.d);
        hashSet.remove(str);
        this.d = hashSet;
        e(str);
    }

    public final void d(long j, int i, long j2) {
        long[] jArr = {j, j2, i};
        CopyOnWriteArrayList copyOnWriteArrayList = this.e;
        copyOnWriteArrayList.add(jArr);
        long nanoTime = System.nanoTime() / 1000000;
        while (copyOnWriteArrayList.size() > 2 && ((long[]) copyOnWriteArrayList.get(1))[1] <= nanoTime) {
            copyOnWriteArrayList.remove(0);
        }
        Iterator it = copyOnWriteArrayList.iterator();
        long[] jArr2 = null;
        while (it.hasNext()) {
            long[] jArr3 = (long[]) it.next();
            if (jArr3[1] > nanoTime) {
                break;
            }
            jArr2 = jArr3;
        }
        if (jArr2 != null) {
            HashSet hashSet = this.j;
            ArrayList arrayList = new ArrayList(hashSet);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                String str = (String) obj;
                HashMap hashMap = this.h;
                Long l = (Long) hashMap.get(str);
                if (l == null || jArr2[0] > l.longValue()) {
                    hashSet.remove(str);
                    hashMap.remove(str);
                    this.i.remove(str);
                    e(str);
                }
            }
        }
    }

    public final void e(String str) {
        d01 d01Var = (d01) this.b.remove(str);
        if (d01Var != null) {
            d01Var.c.post(new b01(d01Var, (byte) 0));
        }
    }
}
