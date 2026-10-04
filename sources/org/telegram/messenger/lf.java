package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f18491a;
    public final MessagesStorage f18492b;
    public final ArrayList f18493c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18491a = i10;
        this.f18492b = messagesStorage;
        this.f18493c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18491a) {
            case 0:
                this.f18492b.lambda$loadMessageAttachPaths$235(this.f18493c, this.d);
                return;
            case 1:
                this.f18492b.lambda$processAnchoredEphemeralMessages$203(this.f18493c, this.d);
                return;
            case 2:
                this.f18492b.lambda$processEphemeralMessages$201(this.f18493c, this.d);
                return;
            case 3:
                this.f18492b.lambda$checkLoadedRemoteFilters$69(this.f18493c, this.d);
                return;
            default:
                this.f18492b.lambda$processEphemeralEditedMessages$202(this.f18493c, this.d);
                return;
        }
    }
}
