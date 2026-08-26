package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessagesStorage$$ExternalSyntheticLambda136 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final long f$3;
    public final int f$4;

    public MessagesStorage$$ExternalSyntheticLambda136(int i, int i2, long j, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.$r8$classId = 4;
        this.f$0 = messagesStorage;
        this.f$3 = j;
        this.f$2 = arrayList;
        this.f$1 = i;
        this.f$4 = i2;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesStorage) this.f$0).lambda$updateTopicData$49(this.f$1, (TLRPC.TL_forumTopic) this.f$2, this.f$3, this.f$4);
                break;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.f$0, (TLRPC.User) this.f$2, this.f$1, this.f$3, this.f$4);
                break;
            case 2:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.f$0, (TLRPC.Chat) this.f$2, this.f$1, this.f$3, this.f$4);
                break;
            case 3:
                ((MediaDataController) this.f$0).lambda$putStickersToCache$102((ArrayList) this.f$2, this.f$1, this.f$4, this.f$3);
                break;
            default:
                ((MessagesStorage) this.f$0).lambda$markMessagesContentAsRead$218(this.f$3, (ArrayList) this.f$2, this.f$1, this.f$4);
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda136(AccountInstance accountInstance, TLObject tLObject, int i, long j, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = accountInstance;
        this.f$2 = tLObject;
        this.f$1 = i;
        this.f$3 = j;
        this.f$4 = i2;
    }

    public MessagesStorage$$ExternalSyntheticLambda136(MediaDataController mediaDataController, ArrayList arrayList, int i, int i2, long j) {
        this.$r8$classId = 3;
        this.f$0 = mediaDataController;
        this.f$2 = arrayList;
        this.f$1 = i;
        this.f$4 = i2;
        this.f$3 = j;
    }

    public MessagesStorage$$ExternalSyntheticLambda136(MessagesStorage messagesStorage, int i, TLRPC.TL_forumTopic tL_forumTopic, long j, int i2) {
        this.$r8$classId = 0;
        this.f$0 = messagesStorage;
        this.f$1 = i;
        this.f$2 = tL_forumTopic;
        this.f$3 = j;
        this.f$4 = i2;
    }
}
