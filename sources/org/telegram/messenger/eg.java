package org.telegram.messenger;

import java.util.ArrayList;
public final class eg implements Runnable {
    public final int f16056a;
    public final MessagesStorage f16057b;
    public final ArrayList f16058c;
    public final ArrayList d;

    public eg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f16056a = i10;
        this.f16057b = messagesStorage;
        this.f16058c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f16056a) {
            case 0:
                this.f16057b.lambda$setDialogsPinned$252(this.f16058c, this.d);
                return;
            default:
                this.f16057b.lambda$loadTopics$50(this.f16058c, this.d);
                return;
        }
    }
}
