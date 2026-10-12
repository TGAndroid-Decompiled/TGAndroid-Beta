package org.telegram.messenger;

import java.util.ArrayList;
public final class se implements Runnable {
    public final int f18894a = 0;
    public final MessagesStorage f18895b;
    public final boolean f18896c;
    public final ArrayList d;

    public se(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f18895b = messagesStorage;
        this.d = arrayList;
        this.f18896c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18894a) {
            case 0:
                this.f18895b.lambda$putEphemeralMessages$204(this.d, this.f18896c);
                return;
            default:
                this.f18895b.lambda$putContacts$146(this.f18896c, this.d);
                return;
        }
    }

    public se(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f18895b = messagesStorage;
        this.f18896c = z10;
        this.d = arrayList;
    }
}
