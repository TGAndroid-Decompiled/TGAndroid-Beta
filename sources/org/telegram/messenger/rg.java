package org.telegram.messenger;

import java.util.ArrayList;
public final class rg implements Runnable {
    public final int f21129a = 1;
    public final MessagesStorage f21130b;
    public final ArrayList f21131c;
    public final boolean d;

    public rg(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f21130b = messagesStorage;
        this.f21131c = arrayList;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f21129a) {
            case 0:
                this.f21130b.lambda$putContacts$150(this.d, this.f21131c);
                return;
            default:
                this.f21130b.lambda$putEphemeralMessages$208(this.f21131c, this.d);
                return;
        }
    }

    public rg(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f21130b = messagesStorage;
        this.d = z10;
        this.f21131c = arrayList;
    }
}
