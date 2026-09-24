package org.telegram.messenger;

import java.util.ArrayList;
public final class dg implements Runnable {
    public final int f16198a;
    public final MessagesStorage f16199b;
    public final ArrayList f16200c;
    public final ArrayList d;

    public dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f16198a = i10;
        this.f16199b = messagesStorage;
        this.f16200c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f16198a) {
            case 0:
                MessagesStorage.Q3(this.f16199b, this.f16200c, this.d);
                return;
            default:
                MessagesStorage.F(this.f16199b, this.f16200c, this.d);
                return;
        }
    }
}
