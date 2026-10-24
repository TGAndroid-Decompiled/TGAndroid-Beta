package org.telegram.messenger;

import java.util.ArrayList;
public final class se implements Runnable {
    public final int f19584a = 0;
    public final MessagesStorage f19585b;
    public final boolean f19586c;
    public final ArrayList d;

    public se(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f19585b = messagesStorage;
        this.d = arrayList;
        this.f19586c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19584a) {
            case 0:
                this.f19585b.lambda$putEphemeralMessages$204(this.d, this.f19586c);
                return;
            default:
                this.f19585b.lambda$putContacts$146(this.f19586c, this.d);
                return;
        }
    }

    public se(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f19585b = messagesStorage;
        this.f19586c = z10;
        this.d = arrayList;
    }
}
