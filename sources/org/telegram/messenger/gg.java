package org.telegram.messenger;

import java.util.ArrayList;
public final class gg implements Runnable {
    public final int f17699a;
    public final MessagesStorage f17700b;
    public final ArrayList f17701c;
    public final ArrayList d;

    public gg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17699a = i10;
        this.f17700b = messagesStorage;
        this.f17701c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17699a) {
            case 0:
                this.f17700b.lambda$setDialogsPinned$252(this.f17701c, this.d);
                return;
            default:
                this.f17700b.lambda$loadTopics$50(this.f17701c, this.d);
                return;
        }
    }
}
