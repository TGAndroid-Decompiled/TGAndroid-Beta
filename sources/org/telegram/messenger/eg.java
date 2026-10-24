package org.telegram.messenger;

import java.util.ArrayList;
public final class eg implements Runnable {
    public final int f18345a;
    public final MessagesStorage f18346b;
    public final ArrayList f18347c;
    public final ArrayList d;

    public eg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f18345a = i10;
        this.f18346b = messagesStorage;
        this.f18347c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f18345a) {
            case 0:
                this.f18346b.lambda$setDialogsPinned$252(this.f18347c, this.d);
                return;
            default:
                this.f18346b.lambda$loadTopics$50(this.f18347c, this.d);
                return;
        }
    }
}
