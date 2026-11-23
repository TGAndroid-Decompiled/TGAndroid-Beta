package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class bj {
    public long f23110a;
    public boolean f23111b;
    public boolean f23112c;
    public gj h;
    public boolean f23116i;
    public boolean f23117j;
    public final aj f23120m;
    public boolean f23121n;
    public final ArrayList d = new ArrayList();
    public final ArrayList f23113e = new ArrayList();
    public final HashMap f23114f = new HashMap();
    public final a0.h f23115g = new a0.h();
    public int f23118k = -1;
    public int f23119l = 800;

    public bj() {
        ?? obj = new Object();
        obj.f22930n = 1.0f;
        this.f23120m = obj;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bj.a():void");
    }

    public final gj b(int i7) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f23114f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            gj gjVar = (gj) arrayList.get(i10);
            yi yiVar = (yi) hashMap.get(gjVar);
            if (yiVar != null && (yiVar.f28101l & i7) == i7) {
                return gjVar;
            }
        }
        return null;
    }

    public final gj c() {
        int i7;
        if (this.f23121n) {
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
        yi yiVar = (yi) this.f23114f.get(gjVar);
        if (yiVar == null) {
            return (yi) this.f23115g.f(gjVar.e1());
        }
        return yiVar;
    }

    public final float e(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return this.f23119l / f10;
    }
}
