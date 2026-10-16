package org.telegram.messenger;

import java.util.ArrayList;
public final class of implements Runnable {
    public final int f17727a;
    public final MessagesStorage f17728b;
    public final ArrayList f17729c;
    public final Runnable d;

    public of(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f17727a = i10;
        this.f17728b = messagesStorage;
        this.f17729c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17727a) {
            case 0:
                this.f17728b.lambda$loadMessageAttachPaths$235(this.f17729c, this.d);
                return;
            case 1:
                this.f17728b.lambda$processAnchoredEphemeralMessages$203(this.f17729c, this.d);
                return;
            case 2:
                this.f17728b.lambda$processEphemeralMessages$201(this.f17729c, this.d);
                return;
            case 3:
                this.f17728b.lambda$checkLoadedRemoteFilters$69(this.f17729c, this.d);
                return;
            default:
                this.f17728b.lambda$processEphemeralEditedMessages$202(this.f17729c, this.d);
                return;
        }
    }
}
