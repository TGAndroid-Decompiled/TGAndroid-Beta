package org.telegram.messenger;

import java.util.ArrayList;
public final class ag implements Runnable {
    public final int f17880a;
    public final MessagesStorage f17881b;
    public final ArrayList f17882c;
    public final ArrayList d;

    public ag(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17880a = i10;
        this.f17881b = messagesStorage;
        this.f17882c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17880a) {
            case 0:
                MessagesStorage.Q3(this.f17881b, this.f17882c, this.d);
                return;
            default:
                MessagesStorage.F(this.f17881b, this.f17882c, this.d);
                return;
        }
    }
}
