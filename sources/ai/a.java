package ai;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TimeZone;
public final class a {
    public boolean f919a;
    public int f920b;
    public Object f921c;
    public Object d;
    public Object e;
    public Object f922f;

    public a(i6.a aVar, byte[] bArr) {
        this.f922f = aVar;
        this.f920b = aVar.e;
        this.f921c = aVar.d;
        this.d = aVar.f12747f;
        ?? obj = new Object();
        obj.f7043a = 0L;
        obj.f7044b = 0L;
        obj.f7045c = 0;
        if (com.google.android.gms.internal.clearcut.y1.f7055a == null) {
            synchronized (com.google.android.gms.internal.clearcut.p1.f6995a) {
                try {
                    if (com.google.android.gms.internal.clearcut.y1.f7055a == null) {
                        com.google.android.gms.internal.clearcut.y1.f7055a = new com.google.android.gms.internal.clearcut.y1[0];
                    }
                } finally {
                }
            }
        }
        obj.d = com.google.android.gms.internal.clearcut.y1.f7055a;
        byte[] bArr2 = com.google.android.gms.internal.clearcut.n1.d;
        obj.e = bArr2;
        obj.f7046f = bArr2;
        obj.h = "";
        obj.f7047n = "";
        obj.f7048r = "";
        obj.f7049s = 180000L;
        obj.v = bArr2;
        obj.f7050w = "";
        obj.f7051x = com.google.android.gms.internal.clearcut.n1.f6987c;
        obj.f7052y = false;
        this.e = obj;
        this.f919a = false;
        obj.f7052y = com.google.android.gms.internal.clearcut.a.a(aVar.f12744a);
        aVar.h.getClass();
        obj.f7043a = System.currentTimeMillis();
        aVar.h.getClass();
        obj.f7044b = SystemClock.elapsedRealtime();
        obj.f7049s = TimeZone.getDefault().getOffset(obj.f7043a) / 1000;
        obj.f7046f = bArr;
    }

    public com.google.android.gms.common.api.internal.f1 a() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (((com.google.android.gms.common.api.internal.r) this.f921c) != null) {
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
        com.google.android.gms.common.api.internal.n nVar = ((com.google.android.gms.common.api.internal.p) this.e).f6489c;
        n6.l.i(nVar, "Key must not be null");
        return new com.google.android.gms.common.api.internal.f1(new e2.w(this, (com.google.android.gms.common.api.internal.p) this.e, (k6.c[]) this.f922f, this.f919a, this.f920b), new com.google.android.gms.common.api.internal.f1(this, nVar));
    }

    public void b() {
        throw new UnsupportedOperationException("Method not decompiled: ai.a.b():void");
    }

    public Object c() {
        ArrayList arrayList = (ArrayList) this.d;
        if (((ArrayList) this.f921c).isEmpty()) {
            return null;
        }
        Object obj = this.f922f;
        if (this.f920b >= arrayList.size()) {
            if (this.f919a) {
                Collections.shuffle(arrayList, (Random) this.e);
                this.f920b = 0;
            } else {
                this.f920b = 0;
            }
        }
        int i10 = this.f920b;
        this.f920b = i10 + 1;
        this.f922f = arrayList.get(i10);
        return obj;
    }

    public a(ArrayList arrayList) {
        this.f919a = true;
        ArrayList arrayList2 = new ArrayList(arrayList == null ? new ArrayList() : arrayList);
        this.f921c = arrayList2;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.d = arrayList3;
        this.f920b = 0;
        Random random = new Random();
        this.e = random;
        Collections.shuffle(arrayList3, random);
        this.f920b = 0;
        c();
    }
}
