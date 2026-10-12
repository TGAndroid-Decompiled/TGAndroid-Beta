package org.telegram.messenger;

import java.util.ArrayList;
public final class gg implements Runnable {
    public final int f17698a;
    public final MessagesStorage f17699b;
    public final ArrayList f17700c;
    public final ArrayList d;

    public gg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17698a = i10;
        this.f17699b = messagesStorage;
        this.f17700c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17698a) {
            case 0:
                this.f17699b.lambda$setDialogsPinned$252(this.f17700c, this.d);
                return;
            default:
                this.f17699b.lambda$loadTopics$50(this.f17700c, this.d);
                return;
        }
    }
}
