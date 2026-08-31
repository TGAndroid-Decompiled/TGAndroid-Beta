package org.telegram.messenger;

import java.util.ArrayList;
public final class fg implements Runnable {
    public final int f18684a;
    public final MessagesStorage f18685b;
    public final ArrayList f18686c;
    public final ArrayList d;

    public fg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f18684a = i10;
        this.f18685b = messagesStorage;
        this.f18686c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f18684a) {
            case 0:
                this.f18685b.lambda$setDialogsPinned$252(this.f18686c, this.d);
                return;
            default:
                this.f18685b.lambda$loadTopics$50(this.f18686c, this.d);
                return;
        }
    }
}
