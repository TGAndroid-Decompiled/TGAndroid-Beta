package org.telegram.messenger;

import java.util.ArrayList;

public final class ba implements Runnable {

    public final int f19787a;

    public final MessagesController f19788b;

    public final long f19789c;
    public final ArrayList d;

    public ba(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f19787a = i10;
        this.f19788b = messagesController;
        this.f19789c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19787a) {
            case 0:
                this.f19788b.lambda$markAllTopicsAsRead$7(this.d, this.f19789c);
                break;
            case 1:
                this.f19788b.lambda$generateJoinMessage$368(this.f19789c, this.d);
                break;
            case 2:
                this.f19788b.lambda$getDifference$354(this.f19789c, this.d);
                break;
            case 3:
                this.f19788b.lambda$processUpdateArray$418(this.f19789c, this.d);
                break;
            case 4:
                this.f19788b.lambda$deleteMessagesByPush$369(this.d, this.f19789c);
                break;
            default:
                this.f19788b.lambda$getDifference$355(this.f19789c, this.d);
                break;
        }
    }

    public ba(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f19787a = i10;
        this.f19788b = messagesController;
        this.d = arrayList;
        this.f19789c = j10;
    }
}
