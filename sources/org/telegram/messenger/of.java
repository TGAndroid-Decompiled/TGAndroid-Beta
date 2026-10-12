package org.telegram.messenger;

import java.util.ArrayList;
public final class of implements Runnable {
    public final int f18484a;
    public final MessagesStorage f18485b;
    public final ArrayList f18486c;
    public final Runnable d;

    public of(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18484a = i10;
        this.f18485b = messagesStorage;
        this.f18486c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18484a) {
            case 0:
                this.f18485b.lambda$loadMessageAttachPaths$235(this.f18486c, this.d);
                return;
            case 1:
                this.f18485b.lambda$processAnchoredEphemeralMessages$203(this.f18486c, this.d);
                return;
            case 2:
                this.f18485b.lambda$processEphemeralMessages$201(this.f18486c, this.d);
                return;
            case 3:
                this.f18485b.lambda$checkLoadedRemoteFilters$69(this.f18486c, this.d);
                return;
            default:
                this.f18485b.lambda$processEphemeralEditedMessages$202(this.f18486c, this.d);
                return;
        }
    }
}
