package org.telegram.messenger;

import java.util.ArrayList;
public final class bg implements Runnable {
    public final int f17967a;
    public final MessagesStorage f17968b;
    public final ArrayList f17969c;
    public final ArrayList d;

    public bg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f17967a = i10;
        this.f17968b = messagesStorage;
        this.f17969c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f17967a) {
            case 0:
                MessagesStorage.Q3(this.f17968b, this.f17969c, this.d);
                return;
            default:
                MessagesStorage.F(this.f17968b, this.f17969c, this.d);
                return;
        }
    }
}
