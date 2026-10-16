package org.telegram.messenger;

import java.util.ArrayList;
public final class gg implements Runnable {
    public final int f17028a;
    public final MessagesStorage f17029b;
    public final ArrayList f17030c;
    public final ArrayList d;

    public gg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17028a = i10;
        this.f17029b = messagesStorage;
        this.f17030c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17028a) {
            case 0:
                this.f17029b.lambda$setDialogsPinned$252(this.f17030c, this.d);
                return;
            default:
                this.f17029b.lambda$loadTopics$50(this.f17030c, this.d);
                return;
        }
    }
}
