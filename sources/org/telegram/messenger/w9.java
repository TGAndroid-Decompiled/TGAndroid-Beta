package org.telegram.messenger;

import java.util.ArrayList;
public final class w9 implements Runnable {
    public final int f19681a;
    public final MessagesController f19682b;
    public final ArrayList f19683c;
    public final long d;

    public w9(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f19681a = i10;
        this.f19682b = messagesController;
        this.d = j3;
        this.f19683c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19681a) {
            case 0:
                this.f19682b.lambda$deleteMessagesByPush$368(this.f19683c, this.d);
                return;
            case 1:
                this.f19682b.lambda$markAllTopicsAsRead$7(this.f19683c, this.d);
                return;
            case 2:
                this.f19682b.lambda$getDifference$353(this.d, this.f19683c);
                return;
            case 3:
                this.f19682b.lambda$generateJoinMessage$367(this.d, this.f19683c);
                return;
            case 4:
                this.f19682b.lambda$processUpdateArray$421(this.d, this.f19683c);
                return;
            default:
                this.f19682b.lambda$getDifference$354(this.d, this.f19683c);
                return;
        }
    }

    public w9(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f19681a = i10;
        this.f19682b = messagesController;
        this.f19683c = arrayList;
        this.d = j3;
    }
}
