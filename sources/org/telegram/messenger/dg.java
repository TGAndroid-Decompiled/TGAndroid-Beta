package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f18272a;
    public final MessagesStorage f18273b;
    public final ArrayList f18274c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f18272a = i10;
        this.f18273b = messagesStorage;
        this.f18274c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f18272a) {
            case 0:
                this.f18273b.lambda$setDialogsPinned$252(this.f18274c, this.d);
                return;
            default:
                this.f18273b.lambda$loadTopics$50(this.f18274c, this.d);
                return;
        }
    }
}
