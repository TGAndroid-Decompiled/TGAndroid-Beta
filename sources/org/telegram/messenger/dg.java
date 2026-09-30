package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f16237a;
    public final MessagesStorage f16238b;
    public final ArrayList f16239c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f16237a = i10;
        this.f16238b = messagesStorage;
        this.f16239c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f16237a) {
            case 0:
                MessagesStorage.Q3(this.f16238b, this.f16239c, this.d);
                return;
            default:
                MessagesStorage.F(this.f16238b, this.f16239c, this.d);
                return;
        }
    }
}
