package org.telegram.messenger;

import java.util.ArrayList;
public final class of implements Runnable {
    public final int f18030a;
    public final MessagesStorage f18031b;
    public final ArrayList f18032c;
    public final Runnable d;

    public of(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18030a = i10;
        this.f18031b = messagesStorage;
        this.f18032c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18030a) {
            case 0:
                this.f18031b.lambda$loadMessageAttachPaths$235(this.f18032c, this.d);
                return;
            case 1:
                this.f18031b.lambda$processAnchoredEphemeralMessages$203(this.f18032c, this.d);
                return;
            case 2:
                this.f18031b.lambda$processEphemeralMessages$201(this.f18032c, this.d);
                return;
            case 3:
                this.f18031b.lambda$checkLoadedRemoteFilters$69(this.f18032c, this.d);
                return;
            default:
                this.f18031b.lambda$processEphemeralEditedMessages$202(this.f18032c, this.d);
                return;
        }
    }
}
