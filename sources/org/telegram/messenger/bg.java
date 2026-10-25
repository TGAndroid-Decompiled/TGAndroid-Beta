package org.telegram.messenger;

import java.util.ArrayList;
public final class bg implements Runnable {
    public final int f19715a;
    public final MessagesStorage f19716b;
    public final ArrayList f19717c;
    public final ArrayList d;

    public bg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f19715a = i10;
        this.f19716b = messagesStorage;
        this.f19717c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f19715a) {
            case 0:
                MessagesStorage.A1(this.f19716b, this.f19717c, this.d);
                return;
            default:
                MessagesStorage.K1(this.f19716b, this.f19717c, this.d);
                return;
        }
    }
}
