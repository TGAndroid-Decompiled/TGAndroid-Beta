package org.telegram.messenger;

import java.util.ArrayList;
public final class x9 implements Runnable {
    public final int f20059a;
    public final MessagesController f20060b;
    public final ArrayList f20061c;
    public final long d;

    public x9(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f20059a = i10;
        this.f20060b = messagesController;
        this.d = j10;
        this.f20061c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20059a) {
            case 0:
                this.f20060b.lambda$deleteMessagesByPush$368(this.f20061c, this.d);
                return;
            case 1:
                this.f20060b.lambda$markAllTopicsAsRead$7(this.f20061c, this.d);
                return;
            case 2:
                this.f20060b.lambda$getDifference$353(this.d, this.f20061c);
                return;
            case 3:
                this.f20060b.lambda$generateJoinMessage$367(this.d, this.f20061c);
                return;
            case 4:
                this.f20060b.lambda$processUpdateArray$421(this.d, this.f20061c);
                return;
            default:
                this.f20060b.lambda$getDifference$354(this.d, this.f20061c);
                return;
        }
    }

    public x9(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f20059a = i10;
        this.f20060b = messagesController;
        this.f20061c = arrayList;
        this.d = j10;
    }
}
