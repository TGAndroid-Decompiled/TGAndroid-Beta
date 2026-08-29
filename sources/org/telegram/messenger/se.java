package org.telegram.messenger;

import java.util.ArrayList;
public final class se implements Runnable {
    public final int f21557a = 0;
    public final MessagesStorage f21558b;
    public final boolean f21559c;
    public final ArrayList d;

    public se(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f21558b = messagesStorage;
        this.d = arrayList;
        this.f21559c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21557a) {
            case 0:
                this.f21558b.lambda$putEphemeralMessages$204(this.d, this.f21559c);
                return;
            default:
                this.f21558b.lambda$putContacts$146(this.f21559c, this.d);
                return;
        }
    }

    public se(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f21558b = messagesStorage;
        this.f21559c = z10;
        this.d = arrayList;
    }
}
