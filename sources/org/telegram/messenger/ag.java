package org.telegram.messenger;

import java.util.ArrayList;
public final class ag implements Runnable {
    public final int f17877a;
    public final MessagesStorage f17878b;
    public final ArrayList f17879c;
    public final ArrayList d;

    public ag(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17877a = i10;
        this.f17878b = messagesStorage;
        this.f17879c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17877a) {
            case 0:
                MessagesStorage.Q3(this.f17878b, this.f17879c, this.d);
                return;
            default:
                MessagesStorage.F(this.f17878b, this.f17879c, this.d);
                return;
        }
    }
}
