package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class ui {
    public long f25699a;
    public boolean f25700b;
    public boolean f25701c;
    public zi h;
    public boolean f25705i;
    public boolean f25706j;
    public final ti f25709m;
    public boolean f25710n;
    public final ArrayList d = new ArrayList();
    public final ArrayList f25702e = new ArrayList();
    public final HashMap f25703f = new HashMap();
    public final a0.h f25704g = new a0.h();
    public int f25707k = -1;
    public int f25708l = 800;

    public ui() {
        ?? obj = new Object();
        obj.f25538n = 1.0f;
        this.f25709m = obj;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.a():void");
    }

    public final zi b(int i3) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f25703f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            zi ziVar = (zi) arrayList.get(i10);
            ri riVar = (ri) hashMap.get(ziVar);
            if (riVar != null && (riVar.f25149l & i3) == i3) {
                return ziVar;
            }
        }
        return null;
    }

    public final zi c() {
        int i3;
        if (this.f25710n) {
            i3 = 10;
        } else {
            i3 = 5;
        }
        return b(i3);
    }

    public final ri d(zi ziVar) {
        if (ziVar == null) {
            return null;
        }
        ri riVar = (ri) this.f25703f.get(ziVar);
        if (riVar == null) {
            return (ri) this.f25704g.f(ziVar.f1());
        }
        return riVar;
    }

    public final float e(int i3, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i3 < i10) {
            f10 += fArr[i3];
            i3++;
        }
        return this.f25708l / f10;
    }
}
