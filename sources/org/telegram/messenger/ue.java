package org.telegram.messenger;

import java.util.ArrayList;
public final class ue implements Runnable {
    public final int f18576a = 0;
    public final MessagesStorage f18577b;
    public final boolean f18578c;
    public final ArrayList d;

    public ue(MessagesStorage messagesStorage, ArrayList arrayList, boolean z4) {
        this.f18577b = messagesStorage;
        this.d = arrayList;
        this.f18578c = z4;
    }

    @Override
    public final void run() {
        switch (this.f18576a) {
            case 0:
                this.f18577b.lambda$putEphemeralMessages$204(this.d, this.f18578c);
                return;
            default:
                this.f18577b.lambda$putContacts$146(this.f18578c, this.d);
                return;
        }
    }

    public ue(MessagesStorage messagesStorage, boolean z4, ArrayList arrayList) {
        this.f18577b = messagesStorage;
        this.f18578c = z4;
        this.d = arrayList;
    }
}
