package org.telegram.messenger;

import java.util.ArrayList;
public final class kf implements Runnable {
    public final int f18796a;
    public final MessagesStorage f18797b;
    public final ArrayList f18798c;
    public final Runnable d;

    public kf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18796a = i10;
        this.f18797b = messagesStorage;
        this.f18798c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18796a) {
            case 0:
                this.f18797b.lambda$loadMessageAttachPaths$235(this.f18798c, this.d);
                return;
            case 1:
                this.f18797b.lambda$processAnchoredEphemeralMessages$203(this.f18798c, this.d);
                return;
            case 2:
                this.f18797b.lambda$processEphemeralMessages$201(this.f18798c, this.d);
                return;
            case 3:
                this.f18797b.lambda$checkLoadedRemoteFilters$69(this.f18798c, this.d);
                return;
            default:
                this.f18797b.lambda$processEphemeralEditedMessages$202(this.f18798c, this.d);
                return;
        }
    }
}
