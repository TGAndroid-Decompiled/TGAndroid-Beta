package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f17699a;
    public final MessagesStorage f17700b;
    public final ArrayList f17701c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17699a = i10;
        this.f17700b = messagesStorage;
        this.f17701c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17699a) {
            case 0:
                MessagesStorage.Q3(this.f17700b, this.f17701c, this.d);
                return;
            default:
                MessagesStorage.F(this.f17700b, this.f17701c, this.d);
                return;
        }
    }
}
