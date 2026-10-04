package org.telegram.messenger;

import java.util.List;
public final class rj implements Runnable {
    public final int f19096a;
    public final SendMessagesHelper f19097b;
    public final String f19098c;
    public final List d;

    public rj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f19096a = i10;
        this.f19097b = sendMessagesHelper;
        this.f19098c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f19096a) {
            case 0:
                SendMessagesHelper.M0(this.f19097b, this.f19098c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f19097b, this.f19098c, this.d);
                return;
        }
    }
}
