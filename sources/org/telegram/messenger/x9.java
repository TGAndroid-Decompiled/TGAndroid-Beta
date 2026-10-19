package org.telegram.messenger;

import java.util.ArrayList;
public final class x9 implements Runnable {
    public final int f20062a;
    public final MessagesController f20063b;
    public final ArrayList f20064c;
    public final long d;

    public x9(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f20062a = i10;
        this.f20063b = messagesController;
        this.d = j10;
        this.f20064c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20062a) {
            case 0:
                this.f20063b.lambda$deleteMessagesByPush$368(this.f20064c, this.d);
                return;
            case 1:
                this.f20063b.lambda$markAllTopicsAsRead$7(this.f20064c, this.d);
                return;
            case 2:
                this.f20063b.lambda$getDifference$353(this.d, this.f20064c);
                return;
            case 3:
                this.f20063b.lambda$generateJoinMessage$367(this.d, this.f20064c);
                return;
            case 4:
                this.f20063b.lambda$processUpdateArray$421(this.d, this.f20064c);
                return;
            default:
                this.f20063b.lambda$getDifference$354(this.d, this.f20064c);
                return;
        }
    }

    public x9(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f20062a = i10;
        this.f20063b = messagesController;
        this.f20064c = arrayList;
        this.d = j10;
    }
}
