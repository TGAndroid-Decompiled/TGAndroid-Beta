package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class tc implements Runnable {
    public final int f18479a;
    public final NotificationCenter.NotificationCenterDelegate f18480b;
    public final Cloneable f18481c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f18482f;
    public final Cloneable h;
    public final Cloneable f18483n;
    public final Cloneable f18484r;
    public final Object f18485s;
    public final Cloneable v;

    public tc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18479a = i10;
        this.f18480b = messagesController;
        this.f18481c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f18482f = hVar;
        this.h = hVar2;
        this.f18483n = hVar3;
        this.f18484r = hVar4;
        this.f18485s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18479a) {
            case 0:
                ((MessagesController) this.f18480b).lambda$processUpdateArray$420((LongSparseIntArray) this.f18481c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f18482f, (a0.h) this.h, (a0.h) this.f18483n, (a0.h) this.f18484r, (a0.h) this.f18485s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18480b).lambda$processUpdateArray$419((LongSparseIntArray) this.f18481c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f18482f, (a0.h) this.h, (a0.h) this.f18483n, (a0.h) this.f18484r, (a0.h) this.f18485s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18480b, (ArrayList) this.f18481c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f18482f, (ArrayList) this.h, (ArrayList) this.f18483n, (ArrayList) this.f18484r, (Runnable) this.f18485s);
                return;
        }
    }

    public tc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18479a = 2;
        this.f18480b = notificationsSettingsActivity;
        this.f18481c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f18482f = arrayList5;
        this.h = arrayList6;
        this.f18483n = arrayList7;
        this.f18484r = arrayList8;
        this.f18485s = runnable;
    }
}
