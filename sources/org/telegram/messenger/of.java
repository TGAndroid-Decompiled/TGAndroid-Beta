package org.telegram.messenger;

import java.util.ArrayList;
public final class of implements Runnable {
    public final int f20879a;
    public final MessagesStorage f20880b;
    public final ArrayList f20881c;
    public final Runnable d;

    public of(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f20879a = i10;
        this.f20880b = messagesStorage;
        this.f20881c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20879a) {
            case 0:
                this.f20880b.lambda$loadMessageAttachPaths$238(this.f20881c, this.d);
                return;
            case 1:
                this.f20880b.lambda$processAnchoredEphemeralMessages$206(this.f20881c, this.d);
                return;
            case 2:
                this.f20880b.lambda$processEphemeralMessages$204(this.f20881c, this.d);
                return;
            case 3:
                this.f20880b.lambda$checkLoadedRemoteFilters$72(this.f20881c, this.d);
                return;
            default:
                this.f20880b.lambda$processEphemeralEditedMessages$205(this.f20881c, this.d);
                return;
        }
    }
}
