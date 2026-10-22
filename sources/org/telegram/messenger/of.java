package org.telegram.messenger;

import java.util.ArrayList;
public final class of implements Runnable {
    public final int f19133a;
    public final MessagesStorage f19134b;
    public final ArrayList f19135c;
    public final Runnable d;

    public of(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f19133a = i10;
        this.f19134b = messagesStorage;
        this.f19135c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19133a) {
            case 0:
                this.f19134b.lambda$loadMessageAttachPaths$235(this.f19135c, this.d);
                return;
            case 1:
                this.f19134b.lambda$processAnchoredEphemeralMessages$203(this.f19135c, this.d);
                return;
            case 2:
                this.f19134b.lambda$processEphemeralMessages$201(this.f19135c, this.d);
                return;
            case 3:
                this.f19134b.lambda$checkLoadedRemoteFilters$69(this.f19135c, this.d);
                return;
            default:
                this.f19134b.lambda$processEphemeralEditedMessages$202(this.f19135c, this.d);
                return;
        }
    }
}
