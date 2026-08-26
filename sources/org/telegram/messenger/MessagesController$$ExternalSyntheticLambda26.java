package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda26 implements Runnable {
    public final int $r8$classId = 1;
    public final BaseController f$0;
    public final int f$1;
    public final Object f$2;
    public final boolean f$3;
    public final boolean f$4;
    public final int f$5;

    public MessagesController$$ExternalSyntheticLambda26(MediaDataController mediaDataController, boolean z, int i, ArrayList arrayList, boolean z2, int i2) {
        this.f$0 = mediaDataController;
        this.f$3 = z;
        this.f$1 = i;
        this.f$2 = arrayList;
        this.f$4 = z2;
        this.f$5 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesController) this.f$0).lambda$processLoadedMessages$189(this.f$1, (TLRPC.messages_Messages) this.f$2, this.f$3, this.f$4, this.f$5);
                break;
            default:
                ((MediaDataController) this.f$0).lambda$processLoadedRecentDocuments$52(this.f$3, this.f$1, (ArrayList) this.f$2, this.f$4, this.f$5);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda26(MessagesController messagesController, int i, TLRPC.messages_Messages messages_messages, boolean z, boolean z2, int i2) {
        this.f$0 = messagesController;
        this.f$1 = i;
        this.f$2 = messages_messages;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$5 = i2;
    }
}
