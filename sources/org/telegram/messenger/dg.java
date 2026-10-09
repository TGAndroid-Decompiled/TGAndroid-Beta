package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f17663a;
    public final MessagesStorage f17664b;
    public final ArrayList f17665c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17663a = i10;
        this.f17664b = messagesStorage;
        this.f17665c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17663a) {
            case 0:
                this.f17664b.lambda$setDialogsPinned$252(this.f17665c, this.d);
                return;
            default:
                this.f17664b.lambda$loadTopics$50(this.f17665c, this.d);
                return;
        }
    }
}
