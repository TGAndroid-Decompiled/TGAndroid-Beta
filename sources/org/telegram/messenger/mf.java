package org.telegram.messenger;

import java.util.ArrayList;
public final class mf implements Runnable {
    public final int f16786a;
    public final MessagesStorage f16787b;
    public final ArrayList f16788c;
    public final Runnable d;

    public mf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f16786a = i10;
        this.f16787b = messagesStorage;
        this.f16788c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16786a) {
            case 0:
                this.f16787b.lambda$loadMessageAttachPaths$235(this.f16788c, this.d);
                return;
            case 1:
                this.f16787b.lambda$processAnchoredEphemeralMessages$203(this.f16788c, this.d);
                return;
            case 2:
                this.f16787b.lambda$processEphemeralMessages$201(this.f16788c, this.d);
                return;
            case 3:
                this.f16787b.lambda$checkLoadedRemoteFilters$69(this.f16788c, this.d);
                return;
            default:
                this.f16787b.lambda$processEphemeralEditedMessages$202(this.f16788c, this.d);
                return;
        }
    }
}
