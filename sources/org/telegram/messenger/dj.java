package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class dj {
    public long f22038a;
    public boolean f22039b;
    public boolean f22040c;
    public ij h;
    public boolean f22044i;
    public boolean f22045j;
    public final cj f22048m;
    public boolean f22049n;
    public final ArrayList d = new ArrayList();
    public final ArrayList f22041e = new ArrayList();
    public final HashMap f22042f = new HashMap();
    public final a0.h f22043g = new a0.h();
    public int f22046k = -1;
    public int f22047l = 800;

    public dj() {
        ?? obj = new Object();
        obj.f21875n = 1.0f;
        this.f22048m = obj;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dj.a():void");
    }

    public final ij b(int i7) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f22042f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ij ijVar = (ij) arrayList.get(i10);
            aj ajVar = (aj) hashMap.get(ijVar);
            if (ajVar != null && (ajVar.f21455l & i7) == i7) {
                return ijVar;
            }
        }
        return null;
    }

    public final ij c() {
        int i7;
        if (this.f22049n) {
            i7 = 10;
        } else {
            i7 = 5;
        }
        return b(i7);
    }

    public final aj d(ij ijVar) {
        if (ijVar == null) {
            return null;
        }
        aj ajVar = (aj) this.f22042f.get(ijVar);
        if (ajVar == null) {
            return (aj) this.f22043g.f(ijVar.e1());
        }
        return ajVar;
    }

    public final float e(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return this.f22047l / f10;
    }
}
