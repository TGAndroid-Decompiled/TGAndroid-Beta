package org.telegram.messenger;

import java.util.ArrayList;
public final class mf implements Runnable {
    public final int f16777a;
    public final MessagesStorage f16778b;
    public final ArrayList f16779c;
    public final Runnable d;

    public mf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f16777a = i10;
        this.f16778b = messagesStorage;
        this.f16779c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16777a) {
            case 0:
                this.f16778b.lambda$loadMessageAttachPaths$235(this.f16779c, this.d);
                return;
            case 1:
                this.f16778b.lambda$processAnchoredEphemeralMessages$203(this.f16779c, this.d);
                return;
            case 2:
                this.f16778b.lambda$processEphemeralMessages$201(this.f16779c, this.d);
                return;
            case 3:
                this.f16778b.lambda$checkLoadedRemoteFilters$69(this.f16779c, this.d);
                return;
            default:
                this.f16778b.lambda$processEphemeralEditedMessages$202(this.f16779c, this.d);
                return;
        }
    }
}
