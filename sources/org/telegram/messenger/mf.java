package org.telegram.messenger;

import java.util.ArrayList;
public final class mf implements Runnable {
    public final int f17018a;
    public final MessagesStorage f17019b;
    public final ArrayList f17020c;
    public final Runnable d;

    public mf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f17018a = i10;
        this.f17019b = messagesStorage;
        this.f17020c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17018a) {
            case 0:
                this.f17019b.lambda$loadMessageAttachPaths$235(this.f17020c, this.d);
                return;
            case 1:
                this.f17019b.lambda$processAnchoredEphemeralMessages$203(this.f17020c, this.d);
                return;
            case 2:
                this.f17019b.lambda$processEphemeralMessages$201(this.f17020c, this.d);
                return;
            case 3:
                this.f17019b.lambda$checkLoadedRemoteFilters$69(this.f17020c, this.d);
                return;
            default:
                this.f17019b.lambda$processEphemeralEditedMessages$202(this.f17020c, this.d);
                return;
        }
    }
}
