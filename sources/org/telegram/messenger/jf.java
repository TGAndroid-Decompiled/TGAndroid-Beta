package org.telegram.messenger;

import java.util.ArrayList;
public final class jf implements Runnable {
    public final int f18705a;
    public final MessagesStorage f18706b;
    public final ArrayList f18707c;
    public final Runnable d;

    public jf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18705a = i10;
        this.f18706b = messagesStorage;
        this.f18707c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18705a) {
            case 0:
                this.f18706b.lambda$loadMessageAttachPaths$235(this.f18707c, this.d);
                return;
            case 1:
                this.f18706b.lambda$processAnchoredEphemeralMessages$203(this.f18707c, this.d);
                return;
            case 2:
                this.f18706b.lambda$processEphemeralMessages$201(this.f18707c, this.d);
                return;
            case 3:
                this.f18706b.lambda$checkLoadedRemoteFilters$69(this.f18707c, this.d);
                return;
            default:
                this.f18706b.lambda$processEphemeralEditedMessages$202(this.f18707c, this.d);
                return;
        }
    }
}
