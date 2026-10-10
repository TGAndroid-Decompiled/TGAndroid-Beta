package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f17667a;
    public final MessagesStorage f17668b;
    public final ArrayList f17669c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17667a = i10;
        this.f17668b = messagesStorage;
        this.f17669c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17667a) {
            case 0:
                MessagesStorage.Q3(this.f17668b, this.f17669c, this.d);
                return;
            default:
                MessagesStorage.F(this.f17668b, this.f17669c, this.d);
                return;
        }
    }
}
