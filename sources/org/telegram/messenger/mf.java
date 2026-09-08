package org.telegram.messenger;

import java.util.ArrayList;
public final class mf implements Runnable {
    public final int f18415a;
    public final MessagesStorage f18416b;
    public final ArrayList f18417c;
    public final Runnable d;

    public mf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18415a = i10;
        this.f18416b = messagesStorage;
        this.f18417c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18415a) {
            case 0:
                this.f18416b.lambda$loadMessageAttachPaths$235(this.f18417c, this.d);
                return;
            case 1:
                this.f18416b.lambda$processAnchoredEphemeralMessages$203(this.f18417c, this.d);
                return;
            case 2:
                this.f18416b.lambda$processEphemeralMessages$201(this.f18417c, this.d);
                return;
            case 3:
                this.f18416b.lambda$checkLoadedRemoteFilters$69(this.f18417c, this.d);
                return;
            default:
                this.f18416b.lambda$processEphemeralEditedMessages$202(this.f18417c, this.d);
                return;
        }
    }
}
