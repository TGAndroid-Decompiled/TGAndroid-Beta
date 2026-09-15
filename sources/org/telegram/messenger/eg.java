package org.telegram.messenger;

import java.util.ArrayList;
public final class eg implements Runnable {
    public final int f16047a;
    public final MessagesStorage f16048b;
    public final ArrayList f16049c;
    public final ArrayList d;

    public eg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f16047a = i10;
        this.f16048b = messagesStorage;
        this.f16049c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f16047a) {
            case 0:
                this.f16048b.lambda$setDialogsPinned$252(this.f16049c, this.d);
                return;
            default:
                this.f16048b.lambda$loadTopics$50(this.f16049c, this.d);
                return;
        }
    }
}
