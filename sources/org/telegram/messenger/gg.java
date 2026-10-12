package org.telegram.messenger;

import java.util.ArrayList;
public final class gg implements Runnable {
    public final int f17332a;
    public final MessagesStorage f17333b;
    public final ArrayList f17334c;
    public final ArrayList d;

    public gg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17332a = i10;
        this.f17333b = messagesStorage;
        this.f17334c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17332a) {
            case 0:
                this.f17333b.lambda$setDialogsPinned$252(this.f17334c, this.d);
                return;
            default:
                this.f17333b.lambda$loadTopics$50(this.f17334c, this.d);
                return;
        }
    }
}
