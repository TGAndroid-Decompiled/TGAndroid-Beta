package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class TopicsController$$ExternalSyntheticLambda23 implements Runnable {
    public final int $r8$classId;
    public final BaseController f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;
    public final Object f$4;
    public final Runnable f$5;

    public TopicsController$$ExternalSyntheticLambda23(TopicsController topicsController, TLObject tLObject, long j, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, LongSparseArray longSparseArray, Runnable runnable) {
        this.$r8$classId = 0;
        this.f$0 = topicsController;
        this.f$1 = tLObject;
        this.f$2 = j;
        this.f$3 = tL_messages_forumTopics;
        this.f$4 = longSparseArray;
        this.f$5 = runnable;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((TopicsController) this.f$0).lambda$reloadTopics$14((TLObject) this.f$1, this.f$2, (TLRPC.TL_messages_forumTopics) this.f$3, (LongSparseArray) this.f$4, this.f$5);
                break;
            case 1:
                ((TranslateController) this.f$0).lambda$translatePhoto$43((MessageObject) this.f$1, (String) this.f$3, (TranslateController.MessageKey) this.f$4, this.f$5, this.f$2);
                break;
            default:
                ((TranslateController) this.f$0).lambda$translatePhoto$45((MessageObject) this.f$1, (String) this.f$3, (TranslateController.MessageKey) this.f$4, this.f$5, this.f$2);
                break;
        }
    }

    public TopicsController$$ExternalSyntheticLambda23(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = translateController;
        this.f$1 = messageObject;
        this.f$3 = str;
        this.f$4 = messageKey;
        this.f$5 = runnable;
        this.f$2 = j;
    }
}
