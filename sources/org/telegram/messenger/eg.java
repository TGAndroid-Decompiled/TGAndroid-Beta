package org.telegram.messenger;

import java.util.ArrayList;
public final class eg implements Runnable {
    public final int f18281a;
    public final MessagesStorage f18282b;
    public final ArrayList f18283c;
    public final ArrayList d;

    public eg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f18281a = i10;
        this.f18282b = messagesStorage;
        this.f18283c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f18281a) {
            case 0:
                this.f18282b.lambda$setDialogsPinned$252(this.f18283c, this.d);
                return;
            default:
                this.f18282b.lambda$loadTopics$50(this.f18283c, this.d);
                return;
        }
    }
}
