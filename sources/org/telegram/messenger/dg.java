package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f17515a;
    public final MessagesStorage f17516b;
    public final ArrayList f17517c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17515a = i10;
        this.f17516b = messagesStorage;
        this.f17517c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17515a) {
            case 0:
                MessagesStorage.Q3(this.f17516b, this.f17517c, this.d);
                return;
            default:
                MessagesStorage.F(this.f17516b, this.f17517c, this.d);
                return;
        }
    }
}
