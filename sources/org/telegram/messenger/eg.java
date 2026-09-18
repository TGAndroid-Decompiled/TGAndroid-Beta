package org.telegram.messenger;

import java.util.ArrayList;
public final class eg implements Runnable {
    public final int f16234a;
    public final MessagesStorage f16235b;
    public final ArrayList f16236c;
    public final ArrayList d;

    public eg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f16234a = i10;
        this.f16235b = messagesStorage;
        this.f16236c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f16234a) {
            case 0:
                this.f16235b.lambda$setDialogsPinned$252(this.f16236c, this.d);
                return;
            default:
                this.f16235b.lambda$loadTopics$50(this.f16236c, this.d);
                return;
        }
    }
}
