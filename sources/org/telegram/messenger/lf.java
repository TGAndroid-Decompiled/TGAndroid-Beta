package org.telegram.messenger;

import java.util.ArrayList;

public final class lf implements Runnable {

    public final int f20891a;

    public final MessagesStorage f20892b;

    public final ArrayList f20893c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f20891a = i10;
        this.f20892b = messagesStorage;
        this.f20893c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f20891a) {
            case 0:
                this.f20892b.lambda$loadMessageAttachPaths$235(this.f20893c, this.d);
                break;
            case 1:
                this.f20892b.lambda$processAnchoredEphemeralMessages$203(this.f20893c, this.d);
                break;
            case 2:
                this.f20892b.lambda$processEphemeralMessages$201(this.f20893c, this.d);
                break;
            case 3:
                this.f20892b.lambda$checkLoadedRemoteFilters$69(this.f20893c, this.d);
                break;
            default:
                this.f20892b.lambda$processEphemeralEditedMessages$202(this.f20893c, this.d);
                break;
        }
    }
}
