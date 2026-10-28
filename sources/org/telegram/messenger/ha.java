package org.telegram.messenger;

import java.util.ArrayList;
public final class ha implements Runnable {
    public final int f20236a;
    public final MessagesController f20237b;
    public final ArrayList f20238c;
    public final long d;

    public ha(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f20236a = i10;
        this.f20237b = messagesController;
        this.d = j10;
        this.f20238c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20236a) {
            case 0:
                this.f20237b.lambda$markAllTopicsAsRead$7(this.f20238c, this.d);
                return;
            case 1:
                this.f20237b.lambda$deleteMessagesByPush$370(this.f20238c, this.d);
                return;
            case 2:
                this.f20237b.lambda$generateJoinMessage$369(this.d, this.f20238c);
                return;
            case 3:
                this.f20237b.lambda$getDifference$356(this.d, this.f20238c);
                return;
            case 4:
                this.f20237b.lambda$processUpdateArray$424(this.d, this.f20238c);
                return;
            default:
                this.f20237b.lambda$getDifference$355(this.d, this.f20238c);
                return;
        }
    }

    public ha(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f20236a = i10;
        this.f20237b = messagesController;
        this.f20238c = arrayList;
        this.d = j10;
    }
}
