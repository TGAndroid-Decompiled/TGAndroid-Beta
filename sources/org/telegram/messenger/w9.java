package org.telegram.messenger;

import java.util.ArrayList;
public final class w9 implements Runnable {
    public final int f19684a;
    public final MessagesController f19685b;
    public final ArrayList f19686c;
    public final long d;

    public w9(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f19684a = i10;
        this.f19685b = messagesController;
        this.d = j3;
        this.f19686c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19684a) {
            case 0:
                this.f19685b.lambda$deleteMessagesByPush$368(this.f19686c, this.d);
                return;
            case 1:
                this.f19685b.lambda$markAllTopicsAsRead$7(this.f19686c, this.d);
                return;
            case 2:
                this.f19685b.lambda$getDifference$353(this.d, this.f19686c);
                return;
            case 3:
                this.f19685b.lambda$generateJoinMessage$367(this.d, this.f19686c);
                return;
            case 4:
                this.f19685b.lambda$processUpdateArray$421(this.d, this.f19686c);
                return;
            default:
                this.f19685b.lambda$getDifference$354(this.d, this.f19686c);
                return;
        }
    }

    public w9(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f19684a = i10;
        this.f19685b = messagesController;
        this.f19686c = arrayList;
        this.d = j3;
    }
}
