package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class dj {
    public long f22034a;
    public boolean f22035b;
    public boolean f22036c;
    public ij h;
    public boolean f22040i;
    public boolean f22041j;
    public final cj f22044m;
    public boolean f22045n;
    public final ArrayList d = new ArrayList();
    public final ArrayList f22037e = new ArrayList();
    public final HashMap f22038f = new HashMap();
    public final a0.h f22039g = new a0.h();
    public int f22042k = -1;
    public int f22043l = 800;

    public dj() {
        ?? obj = new Object();
        obj.f21871n = 1.0f;
        this.f22044m = obj;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dj.a():void");
    }

    public final ij b(int i7) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f22038f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ij ijVar = (ij) arrayList.get(i10);
            aj ajVar = (aj) hashMap.get(ijVar);
            if (ajVar != null && (ajVar.f21450l & i7) == i7) {
                return ijVar;
            }
        }
        return null;
    }

    public final ij c() {
        int i7;
        if (this.f22045n) {
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
        aj ajVar = (aj) this.f22038f.get(ijVar);
        if (ajVar == null) {
            return (aj) this.f22039g.f(ijVar.f1());
        }
        return ajVar;
    }

    public final float e(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return this.f22043l / f10;
    }
}
