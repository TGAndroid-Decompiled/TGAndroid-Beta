package org.telegram.messenger;

import java.util.ArrayList;
public final class bg implements Runnable {
    public final int f19717a;
    public final MessagesStorage f19718b;
    public final ArrayList f19719c;
    public final ArrayList d;

    public bg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f19717a = i10;
        this.f19718b = messagesStorage;
        this.f19719c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f19717a) {
            case 0:
                MessagesStorage.y1(this.f19718b, this.f19719c, this.d);
                return;
            default:
                MessagesStorage.N0(this.f19718b, this.f19719c, this.d);
                return;
        }
    }
}
