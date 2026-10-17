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
        this.d = aVar.f12719f;
        ?? obj = new Object();
        obj.f7033a = 0L;
        obj.f7034b = 0L;
        obj.f7035c = 0;
        if (com.google.android.gms.internal.clearcut.y1.f7045a == null) {
            synchronized (com.google.android.gms.internal.clearcut.p1.f6985a) {
                try {
                    if (com.google.android.gms.internal.clearcut.y1.f7045a == null) {
                        com.google.android.gms.internal.clearcut.y1.f7045a = new com.google.android.gms.internal.clearcut.y1[0];
                    }
                } finally {
                }
            }
        }
        obj.d = com.google.android.gms.internal.clearcut.y1.f7045a;
        byte[] bArr2 = com.google.android.gms.internal.clearcut.n1.d;
        obj.e = bArr2;
        obj.f7036f = bArr2;
        obj.h = "";
        obj.f7037n = "";
        obj.f7038r = "";
        obj.f7039s = 180000L;
        obj.v = bArr2;
        obj.f7040w = "";
        obj.f7041x = com.google.android.gms.internal.clearcut.n1.f6977c;
        obj.f7042y = false;
        this.e = obj;
        this.f920a = false;
        obj.f7042y = com.google.android.gms.internal.clearcut.a.a(aVar.f12716a);
        aVar.h.getClass();
        obj.f7033a = System.currentTimeMillis();
        aVar.h.getClass();
        obj.f7034b = SystemClock.elapsedRealtime();
        obj.f7039s = TimeZone.getDefault().getOffset(obj.f7033a) / 1000;
        obj.f7036f = bArr;
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
        com.google.android.gms.common.api.internal.n nVar = ((com.google.android.gms.common.api.internal.p) this.e).f6479c;
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
