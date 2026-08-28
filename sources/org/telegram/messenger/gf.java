package org.telegram.messenger;

import java.util.ArrayList;
public final class gf implements Runnable {
    public final int f20397a;
    public final MessagesStorage f20398b;
    public final ArrayList f20399c;
    public final Runnable d;

    public gf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i9) {
        this.f20397a = i9;
        this.f20398b = messagesStorage;
        this.f20399c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20397a) {
            case 0:
                this.f20398b.lambda$loadMessageAttachPaths$235(this.f20399c, this.d);
                return;
            case 1:
                this.f20398b.lambda$processAnchoredEphemeralMessages$203(this.f20399c, this.d);
                return;
            case 2:
                this.f20398b.lambda$processEphemeralMessages$201(this.f20399c, this.d);
                return;
            case 3:
                this.f20398b.lambda$checkLoadedRemoteFilters$69(this.f20399c, this.d);
                return;
            default:
                this.f20398b.lambda$processEphemeralEditedMessages$202(this.f20399c, this.d);
                return;
        }
    }
}
