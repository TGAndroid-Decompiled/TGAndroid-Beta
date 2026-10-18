package ai;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TimeZone;
public final class a {
    public boolean f920a;
    public int f921b;
    public Object f922c;
    public Object d;
    public Object e;
    public Object f923f;

    public a(i6.a aVar, byte[] bArr) {
        this.f923f = aVar;
        this.f921b = aVar.e;
        this.f922c = aVar.d;
        this.d = aVar.f12717f;
        ?? obj = new Object();
        obj.f7034a = 0L;
        obj.f7035b = 0L;
        obj.f7036c = 0;
        if (com.google.android.gms.internal.clearcut.y1.f7046a == null) {
            synchronized (com.google.android.gms.internal.clearcut.p1.f6986a) {
                try {
                    if (com.google.android.gms.internal.clearcut.y1.f7046a == null) {
                        com.google.android.gms.internal.clearcut.y1.f7046a = new com.google.android.gms.internal.clearcut.y1[0];
                    }
                } finally {
                }
            }
        }
        obj.d = com.google.android.gms.internal.clearcut.y1.f7046a;
        byte[] bArr2 = com.google.android.gms.internal.clearcut.n1.d;
        obj.e = bArr2;
        obj.f7037f = bArr2;
        obj.h = "";
        obj.f7038n = "";
        obj.f7039r = "";
        obj.f7040s = 180000L;
        obj.v = bArr2;
        obj.f7041w = "";
        obj.f7042x = com.google.android.gms.internal.clearcut.n1.f6978c;
        obj.f7043y = false;
        this.e = obj;
        this.f920a = false;
        obj.f7043y = com.google.android.gms.internal.clearcut.a.a(aVar.f12714a);
        aVar.h.getClass();
        obj.f7034a = System.currentTimeMillis();
        aVar.h.getClass();
        obj.f7035b = SystemClock.elapsedRealtime();
        obj.f7040s = TimeZone.getDefault().getOffset(obj.f7034a) / 1000;
        obj.f7037f = bArr;
    }

    public com.google.android.gms.common.api.internal.f1 a() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (((com.google.android.gms.common.api.internal.r) this.f922c) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.a("Must set register function", z10);
        if (((com.google.android.gms.common.api.internal.r) this.d) != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        n6.l.a("Must set unregister function", z11);
        if (((com.google.android.gms.common.api.internal.p) this.e) != null) {
            z12 = true;
        }
        n6.l.a("Must set holder", z12);
        com.google.android.gms.common.api.internal.n nVar = ((com.google.android.gms.common.api.internal.p) this.e).f6480c;
        n6.l.i(nVar, "Key must not be null");
        return new com.google.android.gms.common.api.internal.f1(new e2.w(this, (com.google.android.gms.common.api.internal.p) this.e, (k6.c[]) this.f923f, this.f920a, this.f921b), new com.google.android.gms.common.api.internal.f1(this, nVar));
    }

    public void b() {
        throw new UnsupportedOperationException("Method not decompiled: ai.a.b():void");
    }

    public Object c() {
        ArrayList arrayList = (ArrayList) this.d;
        if (((ArrayList) this.f922c).isEmpty()) {
            return null;
        }
        Object obj = this.f923f;
        if (this.f921b >= arrayList.size()) {
            if (this.f920a) {
                Collections.shuffle(arrayList, (Random) this.e);
                this.f921b = 0;
            } else {
                this.f921b = 0;
            }
        }
        int i10 = this.f921b;
        this.f921b = i10 + 1;
        this.f923f = arrayList.get(i10);
        return obj;
    }

    public a(ArrayList arrayList) {
        this.f920a = true;
        ArrayList arrayList2 = new ArrayList(arrayList == null ? new ArrayList() : arrayList);
        this.f922c = arrayList2;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.d = arrayList3;
        this.f921b = 0;
        Random random = new Random();
        this.e = random;
        Collections.shuffle(arrayList3, random);
        this.f921b = 0;
        c();
    }
}
