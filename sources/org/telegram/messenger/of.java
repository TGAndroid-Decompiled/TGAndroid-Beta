package org.telegram.messenger;

import java.util.ArrayList;
public final class of implements Runnable {
    public final int f19196a;
    public final MessagesStorage f19197b;
    public final ArrayList f19198c;
    public final Runnable d;

    public of(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f19196a = i10;
        this.f19197b = messagesStorage;
        this.f19198c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19196a) {
            case 0:
                this.f19197b.lambda$loadMessageAttachPaths$235(this.f19198c, this.d);
                return;
            case 1:
                this.f19197b.lambda$processAnchoredEphemeralMessages$203(this.f19198c, this.d);
                return;
            case 2:
                this.f19197b.lambda$processEphemeralMessages$201(this.f19198c, this.d);
                return;
            case 3:
                this.f19197b.lambda$checkLoadedRemoteFilters$69(this.f19198c, this.d);
                return;
            default:
                this.f19197b.lambda$processEphemeralEditedMessages$202(this.f19198c, this.d);
                return;
        }
    }
}
