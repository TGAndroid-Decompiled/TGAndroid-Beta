package org.telegram.messenger;

import java.util.ArrayList;
public final class ue implements Runnable {
    public final int f20203a = 0;
    public final MessagesStorage f20204b;
    public final boolean f20205c;
    public final ArrayList d;

    public ue(MessagesStorage messagesStorage, ArrayList arrayList, boolean z4) {
        this.f20204b = messagesStorage;
        this.d = arrayList;
        this.f20205c = z4;
    }

    @Override
    public final void run() {
        switch (this.f20203a) {
            case 0:
                this.f20204b.lambda$putEphemeralMessages$204(this.d, this.f20205c);
                return;
            default:
                this.f20204b.lambda$putContacts$146(this.f20205c, this.d);
                return;
        }
    }

    public ue(MessagesStorage messagesStorage, boolean z4, ArrayList arrayList) {
        this.f20204b = messagesStorage;
        this.f20205c = z4;
        this.d = arrayList;
    }
}
