package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

public final class TopicsController$$ExternalSyntheticLambda22 implements Runnable {
    public final int $r8$classId = 1;
    public final BaseController f$0;
    public final Object f$1;
    public final long f$2;
    public final ArrayList f$3;
    public final LongSparseArray f$4;
    public final Object f$5;
    public final Runnable f$6;

    public TopicsController$$ExternalSyntheticLambda22(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j, LongSparseArray longSparseArray, Runnable runnable) {
        this.f$0 = mediaDataController;
        this.f$1 = task;
        this.f$5 = timer;
        this.f$3 = arrayList;
        this.f$2 = j;
        this.f$4 = longSparseArray;
        this.f$6 = runnable;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((TopicsController) this.f$0).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.f$1, this.f$2, this.f$3, this.f$4, (HashSet) this.f$5, this.f$6);
                break;
            default:
                LongSparseArray longSparseArray = this.f$4;
                ((MediaDataController) this.f$0).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.f$1, (Timer) this.f$5, this.f$3, this.f$2, longSparseArray, this.f$6);
                break;
        }
    }

    public TopicsController$$ExternalSyntheticLambda22(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j, ArrayList arrayList, LongSparseArray longSparseArray, HashSet hashSet, Runnable runnable) {
        this.f$0 = topicsController;
        this.f$1 = tL_messages_savedDialogs;
        this.f$2 = j;
        this.f$3 = arrayList;
        this.f$4 = longSparseArray;
        this.f$5 = hashSet;
        this.f$6 = runnable;
    }
}
