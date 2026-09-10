package org.telegram.messenger;

import java.util.ArrayList;
public final class ha implements Runnable {
    public final int f15357a;
    public final MessagesController f15358b;
    public final long f15359c;
    public final ArrayList d;

    public ha(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f15357a = i10;
        this.f15358b = messagesController;
        this.f15359c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15357a) {
            case 0:
                this.f15358b.lambda$markAllTopicsAsRead$7(this.d, this.f15359c);
                return;
            case 1:
                this.f15358b.lambda$generateJoinMessage$368(this.f15359c, this.d);
                return;
            case 2:
                this.f15358b.lambda$getDifference$354(this.f15359c, this.d);
                return;
            case 3:
                this.f15358b.lambda$processUpdateArray$418(this.f15359c, this.d);
                return;
            case 4:
                this.f15358b.lambda$deleteMessagesByPush$369(this.d, this.f15359c);
                return;
            default:
                this.f15358b.lambda$getDifference$355(this.f15359c, this.d);
                return;
        }
    }

    public ha(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f15357a = i10;
        this.f15358b = messagesController;
        this.d = arrayList;
        this.f15359c = j3;
    }
}
