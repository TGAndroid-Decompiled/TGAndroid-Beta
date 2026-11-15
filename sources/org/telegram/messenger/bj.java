package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class bj {
    public long f22707a;
    public boolean f22708b;
    public boolean f22709c;
    public gj h;
    public boolean f22713i;
    public boolean f22714j;
    public final aj f22717m;
    public boolean f22718n;
    public final ArrayList d = new ArrayList();
    public final ArrayList f22710e = new ArrayList();
    public final HashMap f22711f = new HashMap();
    public final a0.h f22712g = new a0.h();
    public int f22715k = -1;
    public int f22716l = 800;

    public bj() {
        ?? obj = new Object();
        obj.f22527n = 1.0f;
        this.f22717m = obj;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bj.a():void");
    }

    public final gj b(int i7) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f22711f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            gj gjVar = (gj) arrayList.get(i10);
            yi yiVar = (yi) hashMap.get(gjVar);
            if (yiVar != null && (yiVar.f27753l & i7) == i7) {
                return gjVar;
            }
        }
        return null;
    }

    public final gj c() {
        int i7;
        if (this.f22718n) {
            i7 = 10;
        } else {
            i7 = 5;
        }
        return b(i7);
    }

    public final yi d(gj gjVar) {
        if (gjVar == null) {
            return null;
        }
        yi yiVar = (yi) this.f22711f.get(gjVar);
        if (yiVar == null) {
            return (yi) this.f22712g.f(gjVar.e1());
        }
        return yiVar;
    }

    public final float e(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return this.f22716l / f10;
    }
}
