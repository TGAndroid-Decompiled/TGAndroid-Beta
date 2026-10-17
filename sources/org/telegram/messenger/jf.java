package org.telegram.messenger;

import java.util.ArrayList;
public final class jf implements Runnable {
    public final int f18702a;
    public final MessagesStorage f18703b;
    public final ArrayList f18704c;
    public final Runnable d;

    public jf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18702a = i10;
        this.f18703b = messagesStorage;
        this.f18704c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18702a) {
            case 0:
                this.f18703b.lambda$loadMessageAttachPaths$235(this.f18704c, this.d);
                return;
            case 1:
                this.f18703b.lambda$processAnchoredEphemeralMessages$203(this.f18704c, this.d);
                return;
            case 2:
                this.f18703b.lambda$processEphemeralMessages$201(this.f18704c, this.d);
                return;
            case 3:
                this.f18703b.lambda$checkLoadedRemoteFilters$69(this.f18704c, this.d);
                return;
            default:
                this.f18703b.lambda$processEphemeralEditedMessages$202(this.f18704c, this.d);
                return;
        }
    }
}
