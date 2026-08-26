package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class MessagesStorage$$ExternalSyntheticLambda168 implements Runnable {
    public final int $r8$classId = 1;
    public final BaseController f$0;
    public final int f$1;
    public final Object f$2;
    public final long f$3;
    public final long f$4;
    public final int f$5;
    public final int f$6;
    public final boolean f$7;

    public MessagesStorage$$ExternalSyntheticLambda168(MediaDataController mediaDataController, int i, ArrayList arrayList, boolean z, long j, int i2, int i3, long j2) {
        this.f$0 = mediaDataController;
        this.f$1 = i;
        this.f$2 = arrayList;
        this.f$7 = z;
        this.f$3 = j;
        this.f$5 = i2;
        this.f$6 = i3;
        this.f$4 = j2;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesStorage) this.f$0).lambda$putMessages$238(this.f$1, (TLRPC.messages_Messages) this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
                break;
            default:
                ((MediaDataController) this.f$0).lambda$putMediaDatabase$140(this.f$1, (ArrayList) this.f$2, this.f$7, this.f$3, this.f$5, this.f$6, this.f$4);
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda168(MessagesStorage messagesStorage, int i, TLRPC.messages_Messages messages_messages, long j, long j2, int i2, int i3, boolean z) {
        this.f$0 = messagesStorage;
        this.f$1 = i;
        this.f$2 = messages_messages;
        this.f$3 = j;
        this.f$4 = j2;
        this.f$5 = i2;
        this.f$6 = i3;
        this.f$7 = z;
    }
}
