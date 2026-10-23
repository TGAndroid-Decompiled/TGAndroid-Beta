package org.telegram.messenger;

import java.util.ArrayList;
public final class nf implements Runnable {
    public final int f19124a;
    public final MessagesStorage f19125b;
    public final ArrayList f19126c;
    public final Runnable d;

    public nf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f19124a = i10;
        this.f19125b = messagesStorage;
        this.f19126c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19124a) {
            case 0:
                this.f19125b.lambda$loadMessageAttachPaths$235(this.f19126c, this.d);
                return;
            case 1:
                this.f19125b.lambda$processAnchoredEphemeralMessages$203(this.f19126c, this.d);
                return;
            case 2:
                this.f19125b.lambda$processEphemeralMessages$201(this.f19126c, this.d);
                return;
            case 3:
                this.f19125b.lambda$checkLoadedRemoteFilters$69(this.f19126c, this.d);
                return;
            default:
                this.f19125b.lambda$processEphemeralEditedMessages$202(this.f19126c, this.d);
                return;
        }
    }
}
