package org.telegram.messenger;

import java.util.ArrayList;
public final class fg implements Runnable {
    public final int f17217a;
    public final MessagesStorage f17218b;
    public final ArrayList f17219c;
    public final ArrayList d;

    public fg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17217a = i10;
        this.f17218b = messagesStorage;
        this.f17219c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17217a) {
            case 0:
                this.f17218b.lambda$setDialogsPinned$252(this.f17219c, this.d);
                return;
            default:
                this.f17218b.lambda$loadTopics$50(this.f17219c, this.d);
                return;
        }
    }
}
