package org.telegram.messenger;

import java.util.ArrayList;

public final class MessagesStorage$$ExternalSyntheticLambda90 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final ArrayList f$1;
    public final ArrayList f$2;

    public MessagesStorage$$ExternalSyntheticLambda90(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = arrayList;
        this.f$2 = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadTopics$50(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$setDialogsPinned$252(this.f$1, this.f$2);
                break;
        }
    }
}
