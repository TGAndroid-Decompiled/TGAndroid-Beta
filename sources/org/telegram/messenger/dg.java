package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f16220a;
    public final MessagesStorage f16221b;
    public final ArrayList f16222c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f16220a = i10;
        this.f16221b = messagesStorage;
        this.f16222c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f16220a) {
            case 0:
                this.f16221b.lambda$setDialogsPinned$252(this.f16222c, this.d);
                return;
            default:
                this.f16221b.lambda$loadTopics$50(this.f16222c, this.d);
                return;
        }
    }
}
