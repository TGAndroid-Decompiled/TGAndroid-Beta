package org.telegram.messenger;

import java.util.ArrayList;
public final class mf implements Runnable {
    public final int f16772a;
    public final MessagesStorage f16773b;
    public final ArrayList f16774c;
    public final Runnable d;

    public mf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f16772a = i10;
        this.f16773b = messagesStorage;
        this.f16774c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16772a) {
            case 0:
                this.f16773b.lambda$loadMessageAttachPaths$235(this.f16774c, this.d);
                return;
            case 1:
                this.f16773b.lambda$processAnchoredEphemeralMessages$203(this.f16774c, this.d);
                return;
            case 2:
                this.f16773b.lambda$processEphemeralMessages$201(this.f16774c, this.d);
                return;
            case 3:
                this.f16773b.lambda$checkLoadedRemoteFilters$69(this.f16774c, this.d);
                return;
            default:
                this.f16773b.lambda$processEphemeralEditedMessages$202(this.f16774c, this.d);
                return;
        }
    }
}
