package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f17682a;
    public final MessagesStorage f17683b;
    public final ArrayList f17684c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17682a = i10;
        this.f17683b = messagesStorage;
        this.f17684c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17682a) {
            case 0:
                MessagesStorage.Q3(this.f17683b, this.f17684c, this.d);
                return;
            default:
                MessagesStorage.F(this.f17683b, this.f17684c, this.d);
                return;
        }
    }
}
