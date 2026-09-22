package org.telegram.messenger;

import java.util.ArrayList;
public final class eg implements Runnable {
    public final int f16290a;
    public final MessagesStorage f16291b;
    public final ArrayList f16292c;
    public final ArrayList d;

    public eg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f16290a = i10;
        this.f16291b = messagesStorage;
        this.f16292c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f16290a) {
            case 0:
                this.f16291b.lambda$setDialogsPinned$252(this.f16292c, this.d);
                return;
            default:
                this.f16291b.lambda$loadTopics$50(this.f16292c, this.d);
                return;
        }
    }
}
