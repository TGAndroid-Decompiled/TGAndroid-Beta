package org.telegram.messenger;

import java.util.ArrayList;
public final class ea implements Runnable {
    public final int f17121a;
    public final MessagesController f17122b;
    public final long f17123c;
    public final ArrayList d;

    public ea(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f17121a = i10;
        this.f17122b = messagesController;
        this.f17123c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17121a) {
            case 0:
                this.f17122b.lambda$markAllTopicsAsRead$7(this.d, this.f17123c);
                return;
            case 1:
                this.f17122b.lambda$generateJoinMessage$368(this.f17123c, this.d);
                return;
            case 2:
                this.f17122b.lambda$getDifference$354(this.f17123c, this.d);
                return;
            case 3:
                this.f17122b.lambda$processUpdateArray$418(this.f17123c, this.d);
                return;
            case 4:
                this.f17122b.lambda$deleteMessagesByPush$369(this.d, this.f17123c);
                return;
            default:
                this.f17122b.lambda$getDifference$355(this.f17123c, this.d);
                return;
        }
    }

    public ea(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f17121a = i10;
        this.f17122b = messagesController;
        this.d = arrayList;
        this.f17123c = j10;
    }
}
