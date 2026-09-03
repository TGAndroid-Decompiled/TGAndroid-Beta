package org.telegram.messenger;

import java.util.ArrayList;
public final class ea implements Runnable {
    public final int f18563a;
    public final MessagesController f18564b;
    public final long f18565c;
    public final ArrayList d;

    public ea(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f18563a = i10;
        this.f18564b = messagesController;
        this.f18565c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18563a) {
            case 0:
                this.f18564b.lambda$markAllTopicsAsRead$7(this.d, this.f18565c);
                return;
            case 1:
                this.f18564b.lambda$generateJoinMessage$368(this.f18565c, this.d);
                return;
            case 2:
                this.f18564b.lambda$getDifference$354(this.f18565c, this.d);
                return;
            case 3:
                this.f18564b.lambda$processUpdateArray$418(this.f18565c, this.d);
                return;
            case 4:
                this.f18564b.lambda$deleteMessagesByPush$369(this.d, this.f18565c);
                return;
            default:
                this.f18564b.lambda$getDifference$355(this.f18565c, this.d);
                return;
        }
    }

    public ea(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f18563a = i10;
        this.f18564b = messagesController;
        this.d = arrayList;
        this.f18565c = j10;
    }
}
