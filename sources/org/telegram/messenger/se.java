package org.telegram.messenger;

import java.util.ArrayList;
public final class se implements Runnable {
    public final int f19515a = 0;
    public final MessagesStorage f19516b;
    public final boolean f19517c;
    public final ArrayList d;

    public se(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f19516b = messagesStorage;
        this.d = arrayList;
        this.f19517c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19515a) {
            case 0:
                this.f19516b.lambda$putEphemeralMessages$204(this.d, this.f19517c);
                return;
            default:
                this.f19516b.lambda$putContacts$146(this.f19517c, this.d);
                return;
        }
    }

    public se(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f19516b = messagesStorage;
        this.f19517c = z10;
        this.d = arrayList;
    }
}
