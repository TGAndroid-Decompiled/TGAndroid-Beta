package org.telegram.messenger;

import java.util.ArrayList;
public final class cc implements Runnable {
    public final int f19984a = 1;
    public final MessagesController f19985b;
    public final long f19986c;
    public final long d;
    public final ArrayList f19987e;

    public cc(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f19985b = messagesController;
        this.f19986c = j10;
        this.d = j11;
        this.f19987e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19984a) {
            case 0:
                ArrayList arrayList = this.f19987e;
                MessagesController.N7(this.f19985b, this.f19986c, this.d, arrayList);
                return;
            case 1:
                MessagesController.U2(this.f19985b, this.f19986c, this.d, this.f19987e);
                return;
            default:
                MessagesController.A0(this.f19985b, this.f19986c, this.d, this.f19987e);
                return;
        }
    }

    public cc(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f19985b = messagesController;
        this.f19986c = j10;
        this.f19987e = arrayList;
        this.d = j11;
    }

    public cc(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f19985b = messagesController;
        this.f19987e = arrayList;
        this.f19986c = j10;
        this.d = j11;
    }
}
