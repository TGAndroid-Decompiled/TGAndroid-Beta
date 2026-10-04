package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f17681a;
    public final MessagesStorage f17682b;
    public final ArrayList f17683c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17681a = i10;
        this.f17682b = messagesStorage;
        this.f17683c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17681a) {
            case 0:
                MessagesStorage.Q3(this.f17682b, this.f17683c, this.d);
                return;
            default:
                MessagesStorage.F(this.f17682b, this.f17683c, this.d);
                return;
        }
    }
}
