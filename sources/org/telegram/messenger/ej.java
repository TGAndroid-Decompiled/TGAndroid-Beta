package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class ej {
    public long f15394a;
    public boolean f15395b;
    public boolean f15396c;
    public jj h;
    public boolean f15399i;
    public boolean f15400j;
    public final dj f15403m;
    public boolean f15404n;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final HashMap f15397f = new HashMap();
    public final a0.h f15398g = new a0.h();
    public int f15401k = -1;
    public int f15402l = 800;

    public ej() {
        ?? obj = new Object();
        obj.f15251n = 1.0f;
        this.f15403m = obj;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ej.a():void");
    }

    public final jj b(int i10) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f15397f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            jj jjVar = (jj) arrayList.get(i11);
            bj bjVar = (bj) hashMap.get(jjVar);
            if (bjVar != null && (bjVar.f14783l & i10) == i10) {
                return jjVar;
            }
        }
        return null;
    }

    public final jj c() {
        int i10;
        if (this.f15404n) {
            i10 = 10;
        } else {
            i10 = 5;
        }
        return b(i10);
    }

    public final bj d(jj jjVar) {
        if (jjVar == null) {
            return null;
        }
        bj bjVar = (bj) this.f15397f.get(jjVar);
        if (bjVar == null) {
            return (bj) this.f15398g.f(jjVar.f1());
        }
        return bjVar;
    }

    public final float e(int i10, int i11, float[] fArr) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.f15402l / f7;
    }
}
