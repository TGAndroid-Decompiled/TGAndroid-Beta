package org.telegram.messenger;

import java.util.ArrayList;
public final class eg implements Runnable {
    public final int f17589a;
    public final MessagesStorage f17590b;
    public final ArrayList f17591c;
    public final ArrayList d;

    public eg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17589a = i10;
        this.f17590b = messagesStorage;
        this.f17591c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17589a) {
            case 0:
                this.f17590b.lambda$setDialogsPinned$252(this.f17591c, this.d);
                return;
            default:
                this.f17590b.lambda$loadTopics$50(this.f17591c, this.d);
                return;
        }
    }
}
