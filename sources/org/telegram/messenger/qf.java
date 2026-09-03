package org.telegram.messenger;

import java.util.ArrayList;
public final class qf implements Runnable {
    public final int f18195a;
    public final MessagesStorage f18196b;
    public final ArrayList f18197c;
    public final Runnable d;

    public qf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18195a = i10;
        this.f18196b = messagesStorage;
        this.f18197c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18195a) {
            case 0:
                this.f18196b.lambda$loadMessageAttachPaths$235(this.f18197c, this.d);
                return;
            case 1:
                this.f18196b.lambda$processAnchoredEphemeralMessages$203(this.f18197c, this.d);
                return;
            case 2:
                this.f18196b.lambda$processEphemeralMessages$201(this.f18197c, this.d);
                return;
            case 3:
                this.f18196b.lambda$checkLoadedRemoteFilters$69(this.f18197c, this.d);
                return;
            default:
                this.f18196b.lambda$processEphemeralEditedMessages$202(this.f18197c, this.d);
                return;
        }
    }
}
