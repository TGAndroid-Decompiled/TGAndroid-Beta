package ai;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TimeZone;
public final class a {
    public boolean f918a;
    public int f919b;
    public Object f920c;
    public Object d;
    public Object e;
    public Object f921f;

    public a(i6.a aVar, byte[] bArr) {
        this.f921f = aVar;
        this.f919b = aVar.e;
        this.f920c = aVar.d;
        this.d = aVar.f12717f;
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
        this.f918a = false;
        obj.f7042y = com.google.android.gms.internal.clearcut.a.a(aVar.f12714a);
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
        if (((com.google.android.gms.common.api.internal.r) this.f920c) != null) {
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
        return new com.google.android.gms.common.api.internal.f1(new e2.w(this, (com.google.android.gms.common.api.internal.p) this.e, (k6.c[]) this.f921f, this.f918a, this.f919b), new com.google.android.gms.common.api.internal.f1(this, nVar));
    }

    public void b() {
        throw new UnsupportedOperationException("Method not decompiled: ai.a.b():void");
    }

    public Object c() {
        ArrayList arrayList = (ArrayList) this.d;
        if (((ArrayList) this.f920c).isEmpty()) {
            return null;
        }
        Object obj = this.f921f;
        if (this.f919b >= arrayList.size()) {
            if (this.f918a) {
                Collections.shuffle(arrayList, (Random) this.e);
                this.f919b = 0;
            } else {
                this.f919b = 0;
            }
        }
        int i10 = this.f919b;
        this.f919b = i10 + 1;
        this.f921f = arrayList.get(i10);
        return obj;
    }

    public a(ArrayList arrayList) {
        this.f918a = true;
        ArrayList arrayList2 = new ArrayList(arrayList == null ? new ArrayList() : arrayList);
        this.f920c = arrayList2;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.d = arrayList3;
        this.f919b = 0;
        Random random = new Random();
        this.e = random;
        Collections.shuffle(arrayList3, random);
        this.f919b = 0;
        c();
    }
}
