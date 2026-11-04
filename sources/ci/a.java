package ci;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TimeZone;
public final class a {
    public boolean f4782a;
    public int f4783b;
    public Object f4784c;
    public Object d;
    public Object f4785e;
    public Object f4786f;

    public a(k6.a aVar, byte[] bArr) {
        this.f4786f = aVar;
        this.f4783b = aVar.f16884e;
        this.f4784c = aVar.d;
        this.d = aVar.f16885f;
        ?? obj = new Object();
        obj.f7308a = 0L;
        obj.f7309b = 0L;
        obj.f7310c = 0;
        if (com.google.android.gms.internal.clearcut.w1.f7323a == null) {
            synchronized (com.google.android.gms.internal.clearcut.n1.f7259a) {
                try {
                    if (com.google.android.gms.internal.clearcut.w1.f7323a == null) {
                        com.google.android.gms.internal.clearcut.w1.f7323a = new com.google.android.gms.internal.clearcut.w1[0];
                    }
                } finally {
                }
            }
        }
        obj.d = com.google.android.gms.internal.clearcut.w1.f7323a;
        byte[] bArr2 = com.google.android.gms.internal.clearcut.l1.d;
        obj.f7311e = bArr2;
        obj.f7312f = bArr2;
        obj.h = "";
        obj.f7313n = "";
        obj.f7314r = "";
        obj.f7315s = 180000L;
        obj.f7316w = bArr2;
        obj.f7317x = "";
        obj.f7318y = com.google.android.gms.internal.clearcut.l1.f7251c;
        obj.E = false;
        this.f4785e = obj;
        this.f4782a = false;
        obj.E = com.google.android.gms.internal.clearcut.a.a(aVar.f16881a);
        aVar.h.getClass();
        obj.f7308a = System.currentTimeMillis();
        aVar.h.getClass();
        obj.f7309b = SystemClock.elapsedRealtime();
        obj.f7315s = TimeZone.getDefault().getOffset(obj.f7308a) / 1000;
        obj.f7312f = bArr;
    }

    public com.google.android.gms.common.api.internal.z0 a() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (((com.google.android.gms.common.api.internal.p) this.f4784c) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        p6.m.a("Must set register function", z10);
        if (((com.google.android.gms.common.api.internal.p) this.d) != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        p6.m.a("Must set unregister function", z11);
        if (((com.google.android.gms.common.api.internal.o) this.f4785e) != null) {
            z12 = true;
        }
        p6.m.a("Must set holder", z12);
        com.google.android.gms.common.api.internal.m mVar = ((com.google.android.gms.common.api.internal.o) this.f4785e).f6726b;
        p6.m.h(mVar, "Key must not be null");
        return new com.google.android.gms.common.api.internal.z0(new g2.x(this, (com.google.android.gms.common.api.internal.o) this.f4785e, (m6.c[]) this.f4786f, this.f4782a, this.f4783b), new com.google.android.gms.common.api.internal.z0(this, mVar));
    }

    public void b() {
        throw new UnsupportedOperationException("Method not decompiled: ci.a.b():void");
    }

    public Object c() {
        ArrayList arrayList = (ArrayList) this.d;
        if (((ArrayList) this.f4784c).isEmpty()) {
            return null;
        }
        Object obj = this.f4786f;
        if (this.f4783b >= arrayList.size()) {
            if (this.f4782a) {
                Collections.shuffle(arrayList, (Random) this.f4785e);
                this.f4783b = 0;
            } else {
                this.f4783b = 0;
            }
        }
        int i3 = this.f4783b;
        this.f4783b = i3 + 1;
        this.f4786f = arrayList.get(i3);
        return obj;
    }

    public a(ArrayList arrayList) {
        this.f4782a = true;
        ArrayList arrayList2 = new ArrayList(arrayList == null ? new ArrayList() : arrayList);
        this.f4784c = arrayList2;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.d = arrayList3;
        this.f4783b = 0;
        Random random = new Random();
        this.f4785e = random;
        Collections.shuffle(arrayList3, random);
        this.f4783b = 0;
        c();
    }
}
