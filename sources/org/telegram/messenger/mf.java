package org.telegram.messenger;

import java.util.ArrayList;
public final class mf implements Runnable {
    public final int f18388a;
    public final MessagesStorage f18389b;
    public final ArrayList f18390c;
    public final Runnable d;

    public mf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18388a = i10;
        this.f18389b = messagesStorage;
        this.f18390c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18388a) {
            case 0:
                this.f18389b.lambda$loadMessageAttachPaths$235(this.f18390c, this.d);
                return;
            case 1:
                this.f18389b.lambda$processAnchoredEphemeralMessages$203(this.f18390c, this.d);
                return;
            case 2:
                this.f18389b.lambda$processEphemeralMessages$201(this.f18390c, this.d);
                return;
            case 3:
                this.f18389b.lambda$checkLoadedRemoteFilters$69(this.f18390c, this.d);
                return;
            default:
                this.f18389b.lambda$processEphemeralEditedMessages$202(this.f18390c, this.d);
                return;
        }
    }
}
