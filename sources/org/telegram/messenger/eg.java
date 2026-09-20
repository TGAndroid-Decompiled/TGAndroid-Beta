package org.telegram.messenger;

import java.util.ArrayList;
public final class eg implements Runnable {
    public final int f16275a;
    public final MessagesStorage f16276b;
    public final ArrayList f16277c;
    public final ArrayList d;

    public eg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f16275a = i10;
        this.f16276b = messagesStorage;
        this.f16277c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f16275a) {
            case 0:
                this.f16276b.lambda$setDialogsPinned$252(this.f16277c, this.d);
                return;
            default:
                this.f16276b.lambda$loadTopics$50(this.f16277c, this.d);
                return;
        }
    }
}
