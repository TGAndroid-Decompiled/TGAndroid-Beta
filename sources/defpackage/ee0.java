package defpackage;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TimeZone;
public final class ee0 {
    public int a;
    public boolean b;
    public final Serializable c;
    public final Serializable d;
    public final Object e;
    public Object f;

    public ee0(fi2 fi2Var, byte[] bArr) {
        this.f = fi2Var;
        this.a = fi2Var.e;
        this.c = fi2Var.d;
        this.d = fi2Var.f;
        ?? obj = new Object();
        obj.a = 0L;
        obj.b = 0L;
        obj.c = 0;
        if (yce.a == null) {
            synchronized (j5e.a) {
                if (yce.a == null) {
                    yce.a = new yce[0];
                }
            }
        }
        obj.d = yce.a;
        byte[] bArr2 = wed.b;
        obj.e = bArr2;
        obj.f = bArr2;
        obj.h = "";
        obj.n = "";
        obj.r = "";
        obj.s = 180000L;
        obj.w = bArr2;
        obj.x = "";
        obj.y = wed.a;
        obj.E = false;
        this.e = obj;
        this.b = false;
        obj.E = g5d.a(fi2Var.a);
        fi2Var.h.getClass();
        obj.a = System.currentTimeMillis();
        fi2Var.h.getClass();
        obj.b = SystemClock.elapsedRealtime();
        obj.s = TimeZone.getDefault().getOffset(obj.a) / 1000;
        obj.f = bArr;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee0.a():void");
    }

    public final Object b() {
        ArrayList arrayList = (ArrayList) this.d;
        if (((ArrayList) this.c).isEmpty()) {
            return null;
        }
        Object obj = this.f;
        if (this.a >= arrayList.size()) {
            if (this.b) {
                Collections.shuffle(arrayList, (Random) this.e);
                this.a = 0;
            } else {
                this.a = 0;
            }
        }
        int i = this.a;
        this.a = i + 1;
        this.f = arrayList.get(i);
        return obj;
    }

    public ee0(ArrayList arrayList) {
        this.b = true;
        ArrayList arrayList2 = new ArrayList(arrayList == null ? new ArrayList() : arrayList);
        this.c = arrayList2;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.d = arrayList3;
        this.a = 0;
        Random random = new Random();
        this.e = random;
        Collections.shuffle(arrayList3, random);
        this.a = 0;
        b();
    }
}
