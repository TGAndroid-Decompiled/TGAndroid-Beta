package org.telegram.messenger;

import java.util.ArrayList;
public final class oe implements Runnable {
    public final int f19172a = 0;
    public final MessagesStorage f19173b;
    public final boolean f19174c;
    public final ArrayList d;

    public oe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f19173b = messagesStorage;
        this.d = arrayList;
        this.f19174c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19172a) {
            case 0:
                this.f19173b.lambda$putEphemeralMessages$204(this.d, this.f19174c);
                return;
            default:
                this.f19173b.lambda$putContacts$146(this.f19174c, this.d);
                return;
        }
    }

    public oe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f19173b = messagesStorage;
        this.f19174c = z10;
        this.d = arrayList;
    }
}
