package org.telegram.messenger;

import java.util.ArrayList;
public final class ea implements Runnable {
    public final int f17106a;
    public final MessagesController f17107b;
    public final long f17108c;
    public final ArrayList d;

    public ea(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f17106a = i10;
        this.f17107b = messagesController;
        this.f17108c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17106a) {
            case 0:
                this.f17107b.lambda$markAllTopicsAsRead$7(this.d, this.f17108c);
                return;
            case 1:
                this.f17107b.lambda$generateJoinMessage$368(this.f17108c, this.d);
                return;
            case 2:
                this.f17107b.lambda$getDifference$354(this.f17108c, this.d);
                return;
            case 3:
                this.f17107b.lambda$processUpdateArray$418(this.f17108c, this.d);
                return;
            case 4:
                this.f17107b.lambda$deleteMessagesByPush$369(this.d, this.f17108c);
                return;
            default:
                this.f17107b.lambda$getDifference$355(this.f17108c, this.d);
                return;
        }
    }

    public ea(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f17106a = i10;
        this.f17107b = messagesController;
        this.d = arrayList;
        this.f17108c = j10;
    }
}
