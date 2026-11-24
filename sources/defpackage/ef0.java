package defpackage;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TimeZone;
public final class ef0 {
    public int a;
    public boolean b;
    public final Serializable c;
    public final Serializable d;
    public final Object e;
    public Object f;

    public ef0(tj2 tj2Var, byte[] bArr) {
        this.f = tj2Var;
        this.a = tj2Var.e;
        this.c = tj2Var.d;
        this.d = tj2Var.f;
        ?? obj = new Object();
        obj.a = 0L;
        obj.b = 0L;
        obj.c = 0;
        if (zee.a == null) {
            synchronized (m7e.a) {
                if (zee.a == null) {
                    zee.a = new zee[0];
                }
            }
        }
        obj.d = zee.a;
        byte[] bArr2 = xgd.b;
        obj.e = bArr2;
        obj.f = bArr2;
        obj.h = "";
        obj.n = "";
        obj.r = "";
        obj.s = 180000L;
        obj.w = bArr2;
        obj.x = "";
        obj.y = xgd.a;
        obj.E = false;
        this.e = obj;
        this.b = false;
        obj.E = i7d.a(tj2Var.a);
        tj2Var.h.getClass();
        obj.a = System.currentTimeMillis();
        tj2Var.h.getClass();
        obj.b = SystemClock.elapsedRealtime();
        obj.s = TimeZone.getDefault().getOffset(obj.a) / 1000;
        obj.f = bArr;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef0.a():void");
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

    public ef0(ArrayList arrayList) {
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
