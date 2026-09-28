package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f16221a;
    public final MessagesStorage f16222b;
    public final ArrayList f16223c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f16221a = i10;
        this.f16222b = messagesStorage;
        this.f16223c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f16221a) {
            case 0:
                MessagesStorage.Q3(this.f16222b, this.f16223c, this.d);
                return;
            default:
                MessagesStorage.F(this.f16222b, this.f16223c, this.d);
                return;
        }
    }
}
