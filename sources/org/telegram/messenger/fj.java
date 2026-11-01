package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class fj {
    public long f15735a;
    public boolean f15736b;
    public boolean f15737c;
    public kj h;
    public boolean f15740i;
    public boolean f15741j;
    public final ej f15744m;
    public boolean f15745n;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final HashMap f15738f = new HashMap();
    public final a0.h f15739g = new a0.h();
    public int f15742k = -1;
    public int f15743l = 800;

    public fj() {
        ?? obj = new Object();
        obj.f15581n = 1.0f;
        this.f15744m = obj;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fj.a():void");
    }

    public final kj b(int i10) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f15738f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            kj kjVar = (kj) arrayList.get(i11);
            cj cjVar = (cj) hashMap.get(kjVar);
            if (cjVar != null && (cjVar.f15166l & i10) == i10) {
                return kjVar;
            }
        }
        return null;
    }

    public final kj c() {
        int i10;
        if (this.f15745n) {
            i10 = 10;
        } else {
            i10 = 5;
        }
        return b(i10);
    }

    public final cj d(kj kjVar) {
        if (kjVar == null) {
            return null;
        }
        cj cjVar = (cj) this.f15738f.get(kjVar);
        if (cjVar == null) {
            return (cj) this.f15739g.f(kjVar.f1());
        }
        return cjVar;
    }

    public final float e(int i10, int i11, float[] fArr) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.f15743l / f7;
    }
}
