package org.telegram.messenger;

import java.util.ArrayList;
public final class nf implements Runnable {
    public final int f19058a;
    public final MessagesStorage f19059b;
    public final ArrayList f19060c;
    public final Runnable d;

    public nf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f19058a = i10;
        this.f19059b = messagesStorage;
        this.f19060c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19058a) {
            case 0:
                this.f19059b.lambda$loadMessageAttachPaths$235(this.f19060c, this.d);
                return;
            case 1:
                this.f19059b.lambda$processAnchoredEphemeralMessages$203(this.f19060c, this.d);
                return;
            case 2:
                this.f19059b.lambda$processEphemeralMessages$201(this.f19060c, this.d);
                return;
            case 3:
                this.f19059b.lambda$checkLoadedRemoteFilters$69(this.f19060c, this.d);
                return;
            default:
                this.f19059b.lambda$processEphemeralEditedMessages$202(this.f19060c, this.d);
                return;
        }
    }
}
