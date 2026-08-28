package org.telegram.messenger;

import java.util.ArrayList;
public final class wf implements Runnable {
    public final int f22037a;
    public final MessagesStorage f22038b;
    public final ArrayList f22039c;
    public final ArrayList d;

    public wf(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i9) {
        this.f22037a = i9;
        this.f22038b = messagesStorage;
        this.f22039c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f22037a) {
            case 0:
                this.f22038b.lambda$setDialogsPinned$252(this.f22039c, this.d);
                return;
            default:
                this.f22038b.lambda$loadTopics$50(this.f22039c, this.d);
                return;
        }
    }
}
