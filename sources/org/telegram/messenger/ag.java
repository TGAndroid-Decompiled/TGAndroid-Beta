package org.telegram.messenger;

import java.util.ArrayList;

public final class ag implements Runnable {

    public final int f19721a;

    public final MessagesStorage f19722b;

    public final ArrayList f19723c;
    public final ArrayList d;

    public ag(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f19721a = i10;
        this.f19722b = messagesStorage;
        this.f19723c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f19721a) {
            case 0:
                this.f19722b.lambda$setDialogsPinned$252(this.f19723c, this.d);
                break;
            default:
                this.f19722b.lambda$loadTopics$50(this.f19723c, this.d);
                break;
        }
    }
}
