package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class bj {
    public long f23074a;
    public boolean f23075b;
    public boolean f23076c;
    public gj h;
    public boolean f23080i;
    public boolean f23081j;
    public final aj f23084m;
    public boolean f23085n;
    public final ArrayList d = new ArrayList();
    public final ArrayList f23077e = new ArrayList();
    public final HashMap f23078f = new HashMap();
    public final a0.h f23079g = new a0.h();
    public int f23082k = -1;
    public int f23083l = 800;

    public bj() {
        ?? obj = new Object();
        obj.f22894n = 1.0f;
        this.f23084m = obj;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bj.a():void");
    }

    public final gj b(int i7) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f23078f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            gj gjVar = (gj) arrayList.get(i10);
            yi yiVar = (yi) hashMap.get(gjVar);
            if (yiVar != null && (yiVar.f28065l & i7) == i7) {
                return gjVar;
            }
        }
        return null;
    }

    public final gj c() {
        int i7;
        if (this.f23085n) {
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
        yi yiVar = (yi) this.f23078f.get(gjVar);
        if (yiVar == null) {
            return (yi) this.f23079g.f(gjVar.e1());
        }
        return yiVar;
    }

    public final float e(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return this.f23083l / f10;
    }
}
