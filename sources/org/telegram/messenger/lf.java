package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f18490a;
    public final MessagesStorage f18491b;
    public final ArrayList f18492c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18490a = i10;
        this.f18491b = messagesStorage;
        this.f18492c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18490a) {
            case 0:
                this.f18491b.lambda$loadMessageAttachPaths$235(this.f18492c, this.d);
                return;
            case 1:
                this.f18491b.lambda$processAnchoredEphemeralMessages$203(this.f18492c, this.d);
                return;
            case 2:
                this.f18491b.lambda$processEphemeralMessages$201(this.f18492c, this.d);
                return;
            case 3:
                this.f18491b.lambda$checkLoadedRemoteFilters$69(this.f18492c, this.d);
                return;
            default:
                this.f18491b.lambda$processEphemeralEditedMessages$202(this.f18492c, this.d);
                return;
        }
    }
}
