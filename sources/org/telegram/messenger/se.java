package org.telegram.messenger;

import java.util.ArrayList;
public final class se implements Runnable {
    public final int f18406a = 0;
    public final MessagesStorage f18407b;
    public final boolean f18408c;
    public final ArrayList d;

    public se(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f18407b = messagesStorage;
        this.d = arrayList;
        this.f18408c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18406a) {
            case 0:
                this.f18407b.lambda$putEphemeralMessages$204(this.d, this.f18408c);
                return;
            default:
                this.f18407b.lambda$putContacts$146(this.f18408c, this.d);
                return;
        }
    }

    public se(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f18407b = messagesStorage;
        this.f18408c = z10;
        this.d = arrayList;
    }
}
