package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class aj {
    public long f22923a;
    public boolean f22924b;
    public boolean f22925c;
    public fj h;
    public boolean f22929i;
    public boolean f22930j;
    public final zi f22933m;
    public boolean f22934n;
    public final ArrayList d = new ArrayList();
    public final ArrayList f22926e = new ArrayList();
    public final HashMap f22927f = new HashMap();
    public final a0.h f22928g = new a0.h();
    public int f22931k = -1;
    public int f22932l = 800;

    public aj() {
        ?? obj = new Object();
        obj.f28339n = 1.0f;
        this.f22933m = obj;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.aj.a():void");
    }

    public final fj b(int i7) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f22927f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            fj fjVar = (fj) arrayList.get(i10);
            xi xiVar = (xi) hashMap.get(fjVar);
            if (xiVar != null && (xiVar.f27917l & i7) == i7) {
                return fjVar;
            }
        }
        return null;
    }

    public final fj c() {
        int i7;
        if (this.f22934n) {
            i7 = 10;
        } else {
            i7 = 5;
        }
        return b(i7);
    }

    public final xi d(fj fjVar) {
        if (fjVar == null) {
            return null;
        }
        xi xiVar = (xi) this.f22927f.get(fjVar);
        if (xiVar == null) {
            return (xi) this.f22928g.f(fjVar.e1());
        }
        return xiVar;
    }

    public final float e(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return this.f22932l / f10;
    }
}
