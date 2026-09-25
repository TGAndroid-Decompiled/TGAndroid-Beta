package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f16213a;
    public final MessagesStorage f16214b;
    public final ArrayList f16215c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f16213a = i10;
        this.f16214b = messagesStorage;
        this.f16215c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f16213a) {
            case 0:
                MessagesStorage.Q3(this.f16214b, this.f16215c, this.d);
                return;
            default:
                MessagesStorage.F(this.f16214b, this.f16215c, this.d);
                return;
        }
    }
}
