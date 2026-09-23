package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f15952a;
    public final MessagesStorage f15953b;
    public final ArrayList f15954c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f15952a = i10;
        this.f15953b = messagesStorage;
        this.f15954c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f15952a) {
            case 0:
                MessagesStorage.Q3(this.f15953b, this.f15954c, this.d);
                return;
            default:
                MessagesStorage.F(this.f15953b, this.f15954c, this.d);
                return;
        }
    }
}
