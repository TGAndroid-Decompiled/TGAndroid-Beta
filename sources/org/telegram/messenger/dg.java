package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f17686a;
    public final MessagesStorage f17687b;
    public final ArrayList f17688c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17686a = i10;
        this.f17687b = messagesStorage;
        this.f17688c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17686a) {
            case 0:
                MessagesStorage.Q3(this.f17687b, this.f17688c, this.d);
                return;
            default:
                MessagesStorage.F(this.f17687b, this.f17688c, this.d);
                return;
        }
    }
}
