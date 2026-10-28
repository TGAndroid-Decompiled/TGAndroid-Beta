package bi;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TimeZone;
public final class a {
    public boolean f4242a;
    public int f4243b;
    public Object f4244c;
    public Object d;
    public Object e;
    public Object f4245f;

    public a(j6.a aVar, byte[] bArr) {
        this.f4245f = aVar;
        this.f4243b = aVar.e;
        this.f4244c = aVar.d;
        this.d = aVar.f15519f;
        ?? obj = new Object();
        obj.f7134a = 0L;
        obj.f7135b = 0L;
        obj.f7136c = 0;
        if (com.google.android.gms.internal.clearcut.w1.f7148a == null) {
            synchronized (com.google.android.gms.internal.clearcut.n1.f7088a) {
                try {
                    if (com.google.android.gms.internal.clearcut.w1.f7148a == null) {
                        com.google.android.gms.internal.clearcut.w1.f7148a = new com.google.android.gms.internal.clearcut.w1[0];
                    }
                } finally {
                }
            }
        }
        obj.d = com.google.android.gms.internal.clearcut.w1.f7148a;
        byte[] bArr2 = com.google.android.gms.internal.clearcut.l1.d;
        obj.e = bArr2;
        obj.f7137f = bArr2;
        obj.h = "";
        obj.f7138n = "";
        obj.f7139r = "";
        obj.f7140s = 180000L;
        obj.v = bArr2;
        obj.f7141w = "";
        obj.f7142x = com.google.android.gms.internal.clearcut.l1.f7080c;
        obj.f7143y = false;
        this.e = obj;
        this.f4242a = false;
        obj.f7143y = com.google.android.gms.internal.clearcut.a.a(aVar.f15516a);
        aVar.h.getClass();
        obj.f7134a = System.currentTimeMillis();
        aVar.h.getClass();
        obj.f7135b = SystemClock.elapsedRealtime();
        obj.f7140s = TimeZone.getDefault().getOffset(obj.f7134a) / 1000;
        obj.f7137f = bArr;
    }

    public com.google.android.gms.common.api.internal.f1 a() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (((com.google.android.gms.common.api.internal.r) this.f4244c) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o6.l.a("Must set register function", z10);
        if (((com.google.android.gms.common.api.internal.r) this.d) != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        o6.l.a("Must set unregister function", z11);
        if (((com.google.android.gms.common.api.internal.p) this.e) != null) {
            z12 = true;
        }
        o6.l.a("Must set holder", z12);
        com.google.android.gms.common.api.internal.n nVar = ((com.google.android.gms.common.api.internal.p) this.e).f6599c;
        o6.l.i(nVar, "Key must not be null");
        return new com.google.android.gms.common.api.internal.f1(new e2.w(this, (com.google.android.gms.common.api.internal.p) this.e, (l6.c[]) this.f4245f, this.f4242a, this.f4243b), new com.google.android.gms.common.api.internal.f1(this, nVar));
    }

    public void b() {
        throw new UnsupportedOperationException("Method not decompiled: bi.a.b():void");
    }

    public Object c() {
        ArrayList arrayList = (ArrayList) this.d;
        if (((ArrayList) this.f4244c).isEmpty()) {
            return null;
        }
        Object obj = this.f4245f;
        if (this.f4243b >= arrayList.size()) {
            if (this.f4242a) {
                Collections.shuffle(arrayList, (Random) this.e);
                this.f4243b = 0;
            } else {
                this.f4243b = 0;
            }
        }
        int i10 = this.f4243b;
        this.f4243b = i10 + 1;
        this.f4245f = arrayList.get(i10);
        return obj;
    }

    public a(ArrayList arrayList) {
        this.f4242a = true;
        ArrayList arrayList2 = new ArrayList(arrayList == null ? new ArrayList() : arrayList);
        this.f4244c = arrayList2;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.d = arrayList3;
        this.f4243b = 0;
        Random random = new Random();
        this.e = random;
        Collections.shuffle(arrayList3, random);
        this.f4243b = 0;
        c();
    }
}
