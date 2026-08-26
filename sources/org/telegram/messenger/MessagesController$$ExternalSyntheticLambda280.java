package org.telegram.messenger;

import android.util.SparseIntArray;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;

public final class MessagesController$$ExternalSyntheticLambda280 implements Runnable {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Cloneable f$1;
    public final Cloneable f$2;
    public final Cloneable f$3;
    public final Cloneable f$4;
    public final Cloneable f$5;
    public final Cloneable f$6;
    public final Cloneable f$7;
    public final Object f$8;
    public final Cloneable f$9;

    public MessagesController$$ExternalSyntheticLambda280(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, LongSparseArray longSparseArray3, LongSparseArray longSparseArray4, LongSparseArray longSparseArray5, LongSparseIntArray longSparseIntArray3, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = longSparseIntArray;
        this.f$2 = longSparseIntArray2;
        this.f$3 = sparseIntArray;
        this.f$4 = longSparseArray;
        this.f$5 = longSparseArray2;
        this.f$6 = longSparseArray3;
        this.f$7 = longSparseArray4;
        this.f$8 = longSparseArray5;
        this.f$9 = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesController) this.f$0).lambda$processUpdateArray$416((LongSparseIntArray) this.f$1, (LongSparseIntArray) this.f$2, (SparseIntArray) this.f$3, (LongSparseArray) this.f$4, (LongSparseArray) this.f$5, (LongSparseArray) this.f$6, (LongSparseArray) this.f$7, (LongSparseArray) this.f$8, (LongSparseIntArray) this.f$9);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$processUpdateArray$417((LongSparseIntArray) this.f$1, (LongSparseIntArray) this.f$2, (SparseIntArray) this.f$3, (LongSparseArray) this.f$4, (LongSparseArray) this.f$5, (LongSparseArray) this.f$6, (LongSparseArray) this.f$7, (LongSparseArray) this.f$8, (LongSparseIntArray) this.f$9);
                break;
            default:
                ((NotificationsSettingsActivity) this.f$0).lambda$loadExceptions$1((ArrayList) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$9, (ArrayList) this.f$3, (ArrayList) this.f$4, (ArrayList) this.f$5, (ArrayList) this.f$6, (ArrayList) this.f$7, (Runnable) this.f$8);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda280(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.$r8$classId = 2;
        this.f$0 = notificationsSettingsActivity;
        this.f$1 = arrayList;
        this.f$2 = arrayList2;
        this.f$9 = arrayList3;
        this.f$3 = arrayList4;
        this.f$4 = arrayList5;
        this.f$5 = arrayList6;
        this.f$6 = arrayList7;
        this.f$7 = arrayList8;
        this.f$8 = runnable;
    }
}
