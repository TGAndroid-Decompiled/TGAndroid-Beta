package org.telegram.messenger;

import java.util.ArrayList;
public final class da implements Runnable {
    public final int f20019a;
    public final MessagesController f20020b;
    public final long f20021c;
    public final ArrayList d;

    public da(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f20019a = i10;
        this.f20020b = messagesController;
        this.f20021c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20019a) {
            case 0:
                this.f20020b.lambda$markAllTopicsAsRead$7(this.d, this.f20021c);
                return;
            case 1:
                this.f20020b.lambda$generateJoinMessage$368(this.f20021c, this.d);
                return;
            case 2:
                this.f20020b.lambda$getDifference$354(this.f20021c, this.d);
                return;
            case 3:
                this.f20020b.lambda$processUpdateArray$418(this.f20021c, this.d);
                return;
            case 4:
                this.f20020b.lambda$deleteMessagesByPush$369(this.d, this.f20021c);
                return;
            default:
                this.f20020b.lambda$getDifference$355(this.f20021c, this.d);
                return;
        }
    }

    public da(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f20019a = i10;
        this.f20020b = messagesController;
        this.d = arrayList;
        this.f20021c = j10;
    }
}
