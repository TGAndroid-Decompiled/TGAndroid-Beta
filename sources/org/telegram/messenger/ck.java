package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class ck implements Runnable {
    public final int f23291a;
    public final gs f23292b;
    public final Cloneable f23293c;
    public final Cloneable d;
    public final Cloneable f23294e;
    public final Cloneable f23295f;
    public final Cloneable h;
    public final Cloneable f23296n;
    public final Cloneable f23297r;
    public final Object f23298s;
    public final Cloneable f23299w;

    public ck(np npVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i7) {
        this.f23291a = i7;
        this.f23292b = npVar;
        this.f23293c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f23294e = sparseIntArray;
        this.f23295f = hVar;
        this.h = hVar2;
        this.f23296n = hVar3;
        this.f23297r = hVar4;
        this.f23298s = hVar5;
        this.f23299w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ck.run():void");
    }

    public ck(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f23291a = 2;
        this.f23292b = notificationsSettingsActivity;
        this.f23293c = arrayList;
        this.d = arrayList2;
        this.f23299w = arrayList3;
        this.f23294e = arrayList4;
        this.f23295f = arrayList5;
        this.h = arrayList6;
        this.f23296n = arrayList7;
        this.f23297r = arrayList8;
        this.f23298s = runnable;
    }
}
