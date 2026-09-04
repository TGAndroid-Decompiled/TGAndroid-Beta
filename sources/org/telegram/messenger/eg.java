package org.telegram.messenger;

import java.util.ArrayList;
public final class eg implements Runnable {
    public final int f17562a;
    public final MessagesStorage f17563b;
    public final ArrayList f17564c;
    public final ArrayList d;

    public eg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17562a = i10;
        this.f17563b = messagesStorage;
        this.f17564c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17562a) {
            case 0:
                this.f17563b.lambda$setDialogsPinned$252(this.f17564c, this.d);
                return;
            default:
                this.f17563b.lambda$loadTopics$50(this.f17564c, this.d);
                return;
        }
    }
}
