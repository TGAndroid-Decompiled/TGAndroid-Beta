package org.telegram.messenger;

import java.util.ArrayList;
public final class x9 implements Runnable {
    public final int f22110a;
    public final MessagesController f22111b;
    public final long f22112c;
    public final ArrayList d;

    public x9(MessagesController messagesController, long j10, ArrayList arrayList, int i9) {
        this.f22110a = i9;
        this.f22111b = messagesController;
        this.f22112c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f22110a) {
            case 0:
                this.f22111b.lambda$markAllTopicsAsRead$7(this.d, this.f22112c);
                return;
            case 1:
                this.f22111b.lambda$generateJoinMessage$368(this.f22112c, this.d);
                return;
            case 2:
                this.f22111b.lambda$getDifference$354(this.f22112c, this.d);
                return;
            case 3:
                this.f22111b.lambda$processUpdateArray$418(this.f22112c, this.d);
                return;
            case 4:
                this.f22111b.lambda$deleteMessagesByPush$369(this.d, this.f22112c);
                return;
            default:
                this.f22111b.lambda$getDifference$355(this.f22112c, this.d);
                return;
        }
    }

    public x9(MessagesController messagesController, ArrayList arrayList, long j10, int i9) {
        this.f22110a = i9;
        this.f22111b = messagesController;
        this.d = arrayList;
        this.f22112c = j10;
    }
}
