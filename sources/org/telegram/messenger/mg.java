package org.telegram.messenger;

import java.util.ArrayList;
public final class mg implements Runnable {
    public final int f15788a;
    public final MessagesStorage f15789b;
    public final ArrayList f15790c;
    public final ArrayList d;

    public mg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f15788a = i10;
        this.f15789b = messagesStorage;
        this.f15790c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f15788a) {
            case 0:
                this.f15789b.lambda$setDialogsPinned$252(this.f15790c, this.d);
                return;
            default:
                this.f15789b.lambda$loadTopics$50(this.f15790c, this.d);
                return;
        }
    }
}
