package bi;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TimeZone;
public final class a {
    public boolean f3412a;
    public int f3413b;
    public Object f3414c;
    public Object d;
    public Object f3415e;
    public Object f3416f;

    public a(l6.a aVar, byte[] bArr) {
        this.f3416f = aVar;
        this.f3413b = aVar.f18182e;
        this.f3414c = aVar.d;
        this.d = aVar.f18183f;
        ?? obj = new Object();
        obj.f7253a = 0L;
        obj.f7254b = 0L;
        obj.f7255c = 0;
        if (com.google.android.gms.internal.clearcut.x1.f7269a == null) {
            synchronized (com.google.android.gms.internal.clearcut.o1.f7205a) {
                try {
                    if (com.google.android.gms.internal.clearcut.x1.f7269a == null) {
                        com.google.android.gms.internal.clearcut.x1.f7269a = new com.google.android.gms.internal.clearcut.x1[0];
                    }
                } finally {
                }
            }
        }
        obj.d = com.google.android.gms.internal.clearcut.x1.f7269a;
        byte[] bArr2 = com.google.android.gms.internal.clearcut.m1.d;
        obj.f7256e = bArr2;
        obj.f7257f = bArr2;
        obj.h = "";
        obj.f7258n = "";
        obj.f7259r = "";
        obj.f7260s = 180000L;
        obj.f7261w = bArr2;
        obj.f7262x = "";
        obj.f7263y = com.google.android.gms.internal.clearcut.m1.f7197c;
        obj.D = false;
        this.f3415e = obj;
        this.f3412a = false;
        obj.D = com.google.android.gms.internal.clearcut.a.a(aVar.f18179a);
        aVar.h.getClass();
        obj.f7253a = System.currentTimeMillis();
        aVar.h.getClass();
        obj.f7254b = SystemClock.elapsedRealtime();
        obj.f7260s = TimeZone.getDefault().getOffset(obj.f7253a) / 1000;
        obj.f7257f = bArr;
    }

    public com.google.android.gms.common.api.internal.y0 a() {
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (((com.google.android.gms.common.api.internal.p) this.f3414c) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        q6.m.a("Must set register function", z9);
        if (((com.google.android.gms.common.api.internal.p) this.d) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        q6.m.a("Must set unregister function", z10);
        if (((com.google.android.gms.common.api.internal.o) this.f3415e) != null) {
            z11 = true;
        }
        q6.m.a("Must set holder", z11);
        com.google.android.gms.common.api.internal.m mVar = ((com.google.android.gms.common.api.internal.o) this.f3415e).f6669b;
        q6.m.h(mVar, "Key must not be null");
        return new com.google.android.gms.common.api.internal.y0(new h2.w(this, (com.google.android.gms.common.api.internal.o) this.f3415e, (n6.c[]) this.f3416f, this.f3412a, this.f3413b), new com.google.android.gms.common.api.internal.y0(this, mVar));
    }

    public void b() {
        throw new UnsupportedOperationException("Method not decompiled: bi.a.b():void");
    }

    public Object c() {
        ArrayList arrayList = (ArrayList) this.d;
        if (((ArrayList) this.f3414c).isEmpty()) {
            return null;
        }
        Object obj = this.f3416f;
        if (this.f3413b >= arrayList.size()) {
            if (this.f3412a) {
                Collections.shuffle(arrayList, (Random) this.f3415e);
                this.f3413b = 0;
            } else {
                this.f3413b = 0;
            }
        }
        int i7 = this.f3413b;
        this.f3413b = i7 + 1;
        this.f3416f = arrayList.get(i7);
        return obj;
    }

    public a(ArrayList arrayList) {
        this.f3412a = true;
        ArrayList arrayList2 = new ArrayList(arrayList == null ? new ArrayList() : arrayList);
        this.f3414c = arrayList2;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.d = arrayList3;
        this.f3413b = 0;
        Random random = new Random();
        this.f3415e = random;
        Collections.shuffle(arrayList3, random);
        this.f3413b = 0;
        c();
    }
}
