package org.telegram.messenger;

import java.util.ArrayList;
public final class ea implements Runnable {
    public final int f18561a;
    public final MessagesController f18562b;
    public final long f18563c;
    public final ArrayList d;

    public ea(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f18561a = i10;
        this.f18562b = messagesController;
        this.f18563c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18561a) {
            case 0:
                this.f18562b.lambda$markAllTopicsAsRead$7(this.d, this.f18563c);
                return;
            case 1:
                this.f18562b.lambda$generateJoinMessage$368(this.f18563c, this.d);
                return;
            case 2:
                this.f18562b.lambda$getDifference$354(this.f18563c, this.d);
                return;
            case 3:
                this.f18562b.lambda$processUpdateArray$418(this.f18563c, this.d);
                return;
            case 4:
                this.f18562b.lambda$deleteMessagesByPush$369(this.d, this.f18563c);
                return;
            default:
                this.f18562b.lambda$getDifference$355(this.f18563c, this.d);
                return;
        }
    }

    public ea(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f18561a = i10;
        this.f18562b = messagesController;
        this.d = arrayList;
        this.f18563c = j10;
    }
}
