package org.telegram.messenger;

import java.util.ArrayList;
public final class fg implements Runnable {
    public final int f18686a;
    public final MessagesStorage f18687b;
    public final ArrayList f18688c;
    public final ArrayList d;

    public fg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f18686a = i10;
        this.f18687b = messagesStorage;
        this.f18688c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f18686a) {
            case 0:
                this.f18687b.lambda$setDialogsPinned$252(this.f18688c, this.d);
                return;
            default:
                this.f18687b.lambda$loadTopics$50(this.f18688c, this.d);
                return;
        }
    }
}
