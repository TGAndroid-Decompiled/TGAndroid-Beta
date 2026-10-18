package org.telegram.messenger;

import java.util.ArrayList;
public final class w9 implements Runnable {
    public final int f19980a;
    public final MessagesController f19981b;
    public final ArrayList f19982c;
    public final long d;

    public w9(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f19980a = i10;
        this.f19981b = messagesController;
        this.d = j10;
        this.f19982c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19980a) {
            case 0:
                this.f19981b.lambda$deleteMessagesByPush$368(this.f19982c, this.d);
                return;
            case 1:
                this.f19981b.lambda$markAllTopicsAsRead$7(this.f19982c, this.d);
                return;
            case 2:
                this.f19981b.lambda$getDifference$353(this.d, this.f19982c);
                return;
            case 3:
                this.f19981b.lambda$generateJoinMessage$367(this.d, this.f19982c);
                return;
            case 4:
                this.f19981b.lambda$processUpdateArray$421(this.d, this.f19982c);
                return;
            default:
                this.f19981b.lambda$getDifference$354(this.d, this.f19982c);
                return;
        }
    }

    public w9(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f19980a = i10;
        this.f19981b = messagesController;
        this.f19982c = arrayList;
        this.d = j10;
    }
}
