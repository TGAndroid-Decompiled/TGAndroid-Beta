package org.telegram.messenger;

import java.util.ArrayList;
public final class eg implements Runnable {
    public final int f16044a;
    public final MessagesStorage f16045b;
    public final ArrayList f16046c;
    public final ArrayList d;

    public eg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f16044a = i10;
        this.f16045b = messagesStorage;
        this.f16046c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f16044a) {
            case 0:
                this.f16045b.lambda$setDialogsPinned$252(this.f16046c, this.d);
                return;
            default:
                this.f16045b.lambda$loadTopics$50(this.f16046c, this.d);
                return;
        }
    }
}
