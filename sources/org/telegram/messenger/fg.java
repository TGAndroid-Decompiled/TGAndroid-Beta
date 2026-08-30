package org.telegram.messenger;

import java.util.ArrayList;
public final class fg implements Runnable {
    public final int f17237a;
    public final MessagesStorage f17238b;
    public final ArrayList f17239c;
    public final ArrayList d;

    public fg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17237a = i10;
        this.f17238b = messagesStorage;
        this.f17239c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17237a) {
            case 0:
                this.f17238b.lambda$setDialogsPinned$252(this.f17239c, this.d);
                return;
            default:
                this.f17238b.lambda$loadTopics$50(this.f17239c, this.d);
                return;
        }
    }
}
