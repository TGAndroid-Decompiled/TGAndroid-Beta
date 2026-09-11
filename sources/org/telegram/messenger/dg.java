package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f17488a;
    public final MessagesStorage f17489b;
    public final ArrayList f17490c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17488a = i10;
        this.f17489b = messagesStorage;
        this.f17490c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17488a) {
            case 0:
                this.f17489b.lambda$setDialogsPinned$252(this.f17490c, this.d);
                return;
            default:
                this.f17489b.lambda$loadTopics$50(this.f17490c, this.d);
                return;
        }
    }
}
