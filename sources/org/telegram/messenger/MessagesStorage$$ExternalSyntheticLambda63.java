package org.telegram.messenger;

import java.util.ArrayList;

public final class MessagesStorage$$ExternalSyntheticLambda63 implements Runnable {
    public final int $r8$classId = 1;
    public final MessagesStorage f$0;
    public final boolean f$1;
    public final ArrayList f$2;

    public MessagesStorage$$ExternalSyntheticLambda63(MessagesStorage messagesStorage, ArrayList arrayList, boolean z) {
        this.f$0 = messagesStorage;
        this.f$2 = arrayList;
        this.f$1 = z;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$putContacts$146(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$putEphemeralMessages$204(this.f$2, this.f$1);
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda63(MessagesStorage messagesStorage, boolean z, ArrayList arrayList) {
        this.f$0 = messagesStorage;
        this.f$1 = z;
        this.f$2 = arrayList;
    }
}
