package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f18208a;
    public final MessagesStorage f18209b;
    public final ArrayList f18210c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f18208a = i10;
        this.f18209b = messagesStorage;
        this.f18210c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f18208a) {
            case 0:
                this.f18209b.lambda$setDialogsPinned$252(this.f18210c, this.d);
                return;
            default:
                this.f18209b.lambda$loadTopics$50(this.f18210c, this.d);
                return;
        }
    }
}
