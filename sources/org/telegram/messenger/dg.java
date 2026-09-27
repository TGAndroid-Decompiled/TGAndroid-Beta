package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f16207a;
    public final MessagesStorage f16208b;
    public final ArrayList f16209c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f16207a = i10;
        this.f16208b = messagesStorage;
        this.f16209c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f16207a) {
            case 0:
                MessagesStorage.Q3(this.f16208b, this.f16209c, this.d);
                return;
            default:
                MessagesStorage.F(this.f16208b, this.f16209c, this.d);
                return;
        }
    }
}
