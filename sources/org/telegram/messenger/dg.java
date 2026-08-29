package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f20056a;
    public final MessagesStorage f20057b;
    public final ArrayList f20058c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f20056a = i10;
        this.f20057b = messagesStorage;
        this.f20058c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f20056a) {
            case 0:
                MessagesStorage.Q3(this.f20057b, this.f20058c, this.d);
                return;
            default:
                MessagesStorage.F(this.f20057b, this.f20058c, this.d);
                return;
        }
    }
}
